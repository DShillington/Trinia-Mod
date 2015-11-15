package com.trinia.cursor;

import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CustomImageCursor extends JFrame
{
    public CustomImageCursor()
    {
        createAndShowGUI();
    }
   
    private void createAndShowGUI()
    {
        setTitle("Image Cursor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
       
        add(new JButton("Button"));
        add(new JCheckBox("Checkbox"));
       
        try
        {
        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("mycursor1.png").getImage(),new Point(0,0),"custom cursor"));
        }catch(Exception e){}
       
        setSize(400,400);
        setVisible(true);
    }
   
    public static void init()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new CustomImageCursor();
            }
        });
    }
}