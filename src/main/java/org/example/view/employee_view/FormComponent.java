package org.example.view.employee_view;

import com.toedter.calendar.JDateChooser;
import org.example.entity.enums.Gender;
import org.example.entity.enums.Qualification;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FormComponent extends JPanel {
    private JTextField idInput;
    private JTextField nameInput;
    private ButtonGroup genderInput;
    private JTextField yearInput;
    private JTextField bloodInput;
    private JTextField contactInput;
    private JComboBox<String> qualifInput;
    private JDateChooser calendarInput;
    private JTextArea addressInput;
    private JTextField imageInput;

    public FormComponent(JFrame frame){
        setLayout(new GridBagLayout());
        Border border=new LineBorder(Color.BLACK);
        setBorder(border);

        JLabel idLabel=new JLabel("EmployeeID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel yearLabel = new JLabel("Age:");
        JLabel bloodLabel = new JLabel("Blood Group:");
        JLabel contactLabel = new JLabel("Contact No:");
        JLabel qualifLabel = new JLabel("Qualification:");
        JLabel calendarLabel = new JLabel("Start Date:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel imageLabel = new JLabel("Image Path:");
        JLabel displayImage=new JLabel();

        idInput=new JTextField(20);
        idInput.setEnabled(false);
        nameInput=new JTextField(20);
        genderInput=new ButtonGroup();
        yearInput=new JTextField(20);
        bloodInput=new JTextField(20);
        contactInput=new JTextField(20);
        qualifInput=new JComboBox<>();
        calendarInput=new JDateChooser();
        addressInput=new JTextArea();
        imageInput=new JTextField(20);
        
        JPanel genderPanel=new JPanel(new FlowLayout());
        for(Gender gender:Gender.values()){
            JRadioButton radioButton=new JRadioButton(gender.toString());
            genderInput.add(radioButton);
            genderPanel.add(radioButton);
        }

        for(Qualification qualif:Qualification.values()){
            qualifInput.addItem(qualif.toString());
        }

        JButton uploadButton = getUploadButton(frame, displayImage);

        GridBagConstraints constraints=new GridBagConstraints();
        constraints.anchor=GridBagConstraints.CENTER;
        constraints.gridx=0;
        constraints.gridy=0;
        add(idLabel,constraints);
        constraints.gridy++;
        add(nameLabel,constraints);
        constraints.gridy++;
        add(genderLabel,constraints);
        constraints.gridy++;
        add(yearLabel,constraints);
        constraints.gridy++;
        add(bloodLabel,constraints);
        constraints.gridy++;
        add(contactLabel,constraints);
        constraints.gridy++;
        add(qualifLabel,constraints);
        constraints.gridy++;
        add(calendarLabel,constraints);
        constraints.gridx++;
        add(calendarInput,constraints);
        constraints.gridy--;
        add(qualifInput,constraints);
        constraints.gridy--;
        add(contactInput,constraints);
        constraints.gridy--;
        add(bloodInput,constraints);
        constraints.gridy--;
        add(yearInput,constraints);
        constraints.gridy--;
        add(genderPanel,constraints);
        constraints.gridy--;
        add(nameInput,constraints);
        constraints.gridy--;
        add(idInput,constraints);
        constraints.gridx++;
        add(addressLabel,constraints);
        constraints.gridy=8;
        add(imageLabel,constraints);
        constraints.gridx++;
        add(imageInput,constraints);
        constraints.gridy--;
        add(uploadButton,constraints);
        constraints.gridy=0;
        constraints.gridheight=6;
        add(addressInput,constraints);
        constraints.gridx++;
        constraints.gridheight=8;
        add(displayImage,constraints);

    }

    private JButton getUploadButton(JFrame frame, JLabel displayImage) {
        JButton uploadButton=new JButton("Upload Image");
        uploadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                    displayImage.setIcon(imageIcon);
                    displayImage.setHorizontalAlignment(JLabel.CENTER);
                }
            }
        });
        return uploadButton;
    }


}
