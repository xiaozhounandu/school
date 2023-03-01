//package ltd.jie;
//
//import java.sql.*;
//
///**
// * @author wei zhijie
// * @version 1.0
// * @date 2022/9/7
// */
//public class TestJdbc {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//                //配置信息
//                //useUnicode=true&characterEncoding=utf-8 解决中文乱码
//                String url="jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
//                String username = "root";
//                String password = "245960";
//
//                //1.加载驱动
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                //2.连接数据库,代表数据库
//                Connection connection = null;
//                try {
//                    connection = DriverManager.getConnection(url, username, password);
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//                //3.向数据库发送SQL的对象Statement,PreparedStatement : CRUD
//                Statement statement = null;
//                try {
//                    statement = connection.createStatement();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//
//        //4.编写SQL
//                //String sql = "select * from users";
////                String sql = "delete from student where id = 4";
//        String sql1 ="insert into student( `id`,`name`,`password`,`email`,`birthday`) VALUES ('11','11','111','11','11')";
//
//                //受影响的行数,增删改都是用executeUpdate即可
//                //int i = statement.executeUpdate(sql);
//
//                //5.执行查询SQL，返回一个 ResultSet  ： 结果集
//                ResultSet rs = statement.executeQuery(sql1);
//
//                while (rs.next()){
//                    System.out.println("id="+rs.getObject("id"));
//                    System.out.println("name="+rs.getObject("name"));
//                    System.out.println("password="+rs.getObject("password"));
//                    System.out.println("email="+rs.getObject("email"));
//                    System.out.println("birthday="+rs.getObject("birthday"));
//                }
//
//                //6.关闭连接，释放资源（一定要做） 先开后关
//                rs.close();
//                statement.close();
//                connection.close();
//    }
//}
//
//
//
