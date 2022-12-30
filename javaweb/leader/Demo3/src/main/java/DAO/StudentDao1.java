package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Student;

public class StudentDao1 {
	public ArrayList queryAllStudents() throws Exception{
        Connection conn = null;
        ArrayList students = new ArrayList();
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	String url= "jdbc:mysql://localhost:3307/info?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        	 String username = "root";
        	 String password = "admin12345";
        	 conn=DriverManager.getConnection(url,username,password);
        	 Statement stat = conn.createStatement();
            String sql ="select userID,userName from userinfo";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                Student student = new Student();
                student.setStuno(rs.getString("userID"));
                student.setStuname(rs.getString("userName"));
                students.add(student);
            }
            rs.close();
            stat.close();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if(conn != null){
                    conn.close();

                }
            }catch (Exception ex){

            }
        }
        return students;
    }
}
