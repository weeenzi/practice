package Conn;

import java.sql.*;

public class Conn {
    Connection con;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("qudong chengong");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql:"+
                    "//localhost:3306/test",
                    "wenzi","159753" );
            System.out.println("mysql chenggong");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
//        Conn c = new Conn();
//        Connection con = c.getConnection();
//        try{
//            Statement sql =con.createStatement();
//            ResultSet res = sql.executeQuery("select * from pets");
//            while(res.next()){
//                int id = res.getInt("pet_id");
//                String name =res.getString("pet_name");
//                String desc =res.getString("pet_desc");
//                Date birthday =res.getDate("pet_birthday");
//                System.out.println("编号："+id+" ，姓名："+name+" ，desc："+desc+" ，生日："+birthday);
//
//
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
    }
}
