package com.Lou;

import javax.swing.*;
import java.awt.*;

public class Example extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl= new JLabel("窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(1920,1080);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example().CreateJFrame("不知名窗口");
    }

}
