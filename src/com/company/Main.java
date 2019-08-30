package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    JButton button;
    JFrame frame;
    public static void main(String[] args) {
        Main gui = new Main();
        gui.go();
    }

    public void go(){
         frame = new JFrame();
        button = new JButton("change colors");
        MyDrawPanel myDrawPanel = new MyDrawPanel();

        button.addActionListener(this);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent event){
        frame.repaint();
    }
}
