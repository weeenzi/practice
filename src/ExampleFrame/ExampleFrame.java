package ExampleFrame;

import javax.swing.*;
import java.awt.*;


public class ExampleFrame extends JFrame {
    public static void main(String[] args) {
//        Conn c = new Conn();
//        Connection con = c.getConnection();
//        String[][] tableValues = {{"A1","B1","C1","D1"},{"A2","B2","C2","D2"},
//                {"A3","B3","C3","D3"},{"A4","B4","C4","D4"},{"A2","B2","C2","D2"}
//                ,{"A2","B2","C2","D2"},{"A2","B2","C2","D2"}};
//        try{
//            Statement sql =con.createStatement();
//            ResultSet res = sql.executeQuery("select * from pets");
//
//            for(int i=0; i<6; i++){
//                res.next();
//                int id = res.getInt("pet_id");
//                String name =res.getString("pet_name");
//                String desc =res.getString("pet_desc");
//                Date birthday =res.getDate("pet_birthday");
//                tableValues[i][0] = String.valueOf(id);
//                tableValues[i][1] = name;
//                tableValues[i][2] = desc;
//                tableValues[i][3] = birthday.toString();
//                System.out.println("编号："+id+" ，姓名："+name+" ，desc："+desc+" ，生日："+birthday);
//            }
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        ExampleFrame frame =new ExampleFrame(tableValues);
//        frame.setVisible(true);
    }
    public ExampleFrame(String[][] tableValues){
        super();
        setTitle("创建可以滚动的表格");
        setBounds(100,100,240,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columnNames={"Pet ID","Pet name","Pet desc","Pet Birthday"};
        JTable table = new JTable(tableValues,columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane, BorderLayout.CENTER);

    }
}
