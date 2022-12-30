package Sql;

/**
 * @ClassName Bill
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-28-11-31
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bill {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            //        1、加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//        2、获取连接
            String url = "jdbc:mysql:///db3?serverTimezone=UTC";
            String name = "root";
            String password = "admin12345";
            conn = DriverManager.getConnection(url, name, password);

//        开启手动事务
            conn.setAutoCommit(false);

//        张三账号  - 2000
            ps1 = conn.prepareStatement(" update account set money = money - 2000 where aname =  '张三' ");
            int row1 = ps1.executeUpdate();

//            int i =  3 / 0 ;

//        李四账号 + 2000
            ps2 = conn.prepareStatement(" update account set money = money + 2000 where aname =  '李四' ");
            int row2 = ps2.executeUpdate();

            if (row1 > 0 && row2 > 0 ){
                conn.commit();
                System.out.println("数据提交了");
            }else {
                conn.rollback();
                System.out.println("数据回滚了");
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
                System.out.println("数据回滚了");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }  finally {
            try {
                ps2.close();
                ps1.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        System.out.println("执行完毕");

    }
}
