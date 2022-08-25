package ExampleFrame_02;

import java.sql.*;

public class Conn {
    Connection con;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql:"+
                    "//127.0.0.1:3306/test"
            ,"wenzi","159753");
            System.out.println("数据库连接成功");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }

    /*public static void main(String[] args) {
        Conn c =new Conn();
        c.getConnection();
    }*/
}
