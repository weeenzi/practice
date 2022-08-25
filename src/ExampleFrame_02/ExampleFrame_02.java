package ExampleFrame_02;

import javax.swing.*;
import java.awt.*;

public class ExampleFrame_02 extends JFrame {
    /*public static void main(String[]args){
        ExampleFrame_02 frame = new ExampleFrame_02();
        frame.setVisible(true);
    }*/
    public ExampleFrame_02(String[][] tableValues){
        super();
        setTitle("数据库表格");
        setBounds(100,100,240,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columnName={"pet_id","pet_name","pet_desc","pet_birthday"};
        /*String[][]tableValues={{"A1","B1","C1","D1"},{"A2","B2","C2","D2"},
                {"A3","B3","C3","D3"},{"A4","B4","C4","D4"}};*/
        JTable table = new JTable(tableValues,columnName);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane,BorderLayout.CENTER);

    }
    int a =1;



}
