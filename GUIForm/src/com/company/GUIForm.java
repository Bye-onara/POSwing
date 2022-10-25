package com.company;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm {
    private double a;
    private double b;
    private JTextField TF1;
    private JButton B1;
    private JButton B2;
    private JPanel JPanel1;
    private JTextField PODAJTEMPERATURETextField;
    private JTextField wynik;
    private JTextField WYNIKTextField;

    public static void main(String[] args) {
        GUIForm Example1 = new GUIForm();
    }
    public GUIForm()
    {
        JFrame frame = new JFrame("Przelicznik stopni");
        frame.setContentPane(this.JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600,300);
        frame.setLocation(50,50);
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               a = Double.parseDouble(TF1.getText());
               b = ((a-32)/2*1.1);
               b = Math.round(b);
               wynik.setText("Temperatura w stopniach Celsjusza: " +(String.valueOf(b)));

            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TF1.getText());
                b = ((a*0.9)*2)+32;
                b = Math.round(b);
                wynik.setText("Temperatura w stopniach Fahrenheita: " +(String.valueOf(b)));

            }
        });
    }
}