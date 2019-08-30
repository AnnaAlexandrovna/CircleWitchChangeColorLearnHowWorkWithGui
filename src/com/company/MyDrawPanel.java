package com.company;

import com.sun.prism.paint.Gradient;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g){
        //g.setColor(Color.blue);
        //g.fillRect(20,50,100,100);
        //Image image = new ImageIcon("rick-and-morty.jpg").getImage();
        //g.drawImage(image,3,4,this);
        //g.fillRect(0,0 , this.getWidth(),this.getHeight());
        Graphics2D graphics2D = (Graphics2D) g;
        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);

        Color startColor = new Color(red, green, blue);
        red = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(70,70, startColor,150,150, endColor);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70,70,100,100);
    }
}
