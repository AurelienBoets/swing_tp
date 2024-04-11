package org.example;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import org.example.controller.EmployeeController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        new EmployeeController();


//        JLabel label = new JLabel("Selected Date: ");
//        label.setBounds(50, 270, 150, 25);
//        frame.add(label);

//        JDateChooser dateChooser = new JDateChooser();
//        dateChooser.setBounds(50, 310, 200, 25);
//
//        frame.add(dateChooser);


//         create a JButton to get the selected date
//        JButton button1 = new JButton("Get Selected Date");
//        button1.setBounds(50, 360, 200, 25);
//        frame.add(button1);
//        button1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(dateChooser.getDate());
//            }
//        });

//        JButton button2 = new JButton("Set to Current Date");
//        button2.setBounds(270, 360, 200, 25);
//        frame.add(button2);
//        button2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                calendar.setDate(Calendar.getInstance().getTime());
//            }
//        });
//
//        JButton button3 = new JButton("Set to Current Date");
//        button3.setBounds(270, 310, 200, 25);
//        frame.add(button3);
//        button3.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                dateChooser.setDate(Calendar.getInstance().getTime());
//            }
//        });
//
//        JButton button4 = new JButton("Clear Selected Date");
//        button4.setBounds(270, 410, 200, 25);
//        frame.add(button4);
//        button4.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                calendar.setDate(null);
//                dateChooser.setDate(null);
//                label.setText("Selected Date: ");
//            }
//        });

//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}