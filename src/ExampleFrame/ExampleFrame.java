package ExampleFrame;

import javax.swing.*;
import java.awt.*;


public class ExampleFrame extends JFrame {
    public static void main(String[] args) {
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
