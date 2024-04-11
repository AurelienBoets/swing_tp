package org.example.controller;

import org.example.view.employee_view.FormComponent;

import javax.swing.*;

public class EmployeeController extends JFrame {
    private FormComponent formComponent;

    public EmployeeController(){
        formComponent=new FormComponent(this);
        setSize(1000,1000);
        add(formComponent);
        setVisible(true);
    }
}
