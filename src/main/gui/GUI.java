package main.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
    public static void startGUI() {
        Frame frame = new Frame("Application");
        Button b1 = new Button("AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        Button b2 = new Button("Clear");
        Button b3 = new Button("Test code");

        // creating objects of textfield
        Label l1 = new Label("Enter code here:");
        Label l2 = new Label("This is the CodeChecker");
        Label l3 = new Label("This is the CodeChecker");

        TextArea area1 = new TextArea("");
        area1.setBounds(120, 200, 250, 100);
        TextArea area2 = new TextArea("");
        area2.setBounds(120, 200, 250, 100);

        TextField t1 = new TextField("Tokenausgabe");
        t1.setBounds(50, 100, 200, 30);

        // Set GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0; // column index
        gbc.gridy = 0; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(l2, gbc); // add label l2

        gbc.gridx = 0; // column index
        gbc.gridy = 1; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        frame.add(l1, gbc); // add label l1

        gbc.gridx = 1; // column index
        gbc.gridy = 1; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        frame.add(l3, gbc); // add label l1



        gbc.gridx = 2; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 3; // take up available horizontal space
        frame.add(b3, gbc); // add button b3

        gbc.gridx = 0; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(area1, gbc); // add text area area1

        gbc.gridx = 1; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(area2, gbc); // add text area area2

        gbc.gridx = 2; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        frame.add(b2, gbc); // add button b2

        gbc.gridx = 0; // column index
        gbc.gridy = 3; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        gbc.gridwidth = 3; // occupy two columns
        frame.add(t1, gbc); // add text field t1

        gbc.gridx = 0; // column index
        gbc.gridy = 4; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        gbc.weighty = 2.0; // take up available horizontal space
        gbc.gridwidth = 3; // occupy three columns
        gbc.gridheight = 2;
        frame.add(b1, gbc); // add button b1

        frame.setSize(720, 480);
        frame.setLocationRelativeTo(null); // Centers the window

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Releases native screen resources
            }
        });
        frame.setVisible(true);
    }

    //public static void main(String[] args) {
    //    startGUI();
    //}
}
