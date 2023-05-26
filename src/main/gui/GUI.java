package main.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
    public static void startGUI() {
        Frame frame = new Frame("Application");

        // creating objects of buttons
        Button b1 = new Button("Clear");
        Button b2 = new Button("Parse code");
        Button b3 = new Button("Scan code");

        // creating objects of labels
        Label l2 = new Label("Enter code here:");
        Label l1 = new Label("This is the CodeChecker");

        // creating objects of test areas
        TextArea area1 = new TextArea("");
        TextArea area2 = new TextArea("");

        // creating objects of textfields
        TextField t1 = new TextField("Tokenausgabe");


        // Set GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        //add labels
        gbc.gridx = 0; // column index
        gbc.gridy = 0; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(l1, gbc); // add label l2

        gbc.gridx = 0; // column index
        gbc.gridy = 1; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        frame.add(l2, gbc); // add label l1


        //add text areas
        gbc.gridx = 0; // column index
        gbc.gridy = 4; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.gridheight = 2; // occupy two columns
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(area1, gbc); // add text area area1

        gbc.gridx = 1; // column index
        gbc.gridy = 4; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.gridheight = 2; // occupy two columns
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(area2, gbc); // add text area area2


        //add buttons
        gbc.gridx = 0; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 0; // take up available horizontal space
        frame.add(b1, gbc); // add button b2

        gbc.gridx = 0; // column index
        gbc.gridy = 7; // row
        gbc.gridwidth = 1; // occupy two columns
        gbc.gridheight = 1; // occupy two columns
        gbc.weightx = 1; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
        frame.add(b2, gbc); // add button b3

        gbc.gridx = 1; // column index
        gbc.gridy = 7; // row
        gbc.gridwidth = 1; // occupy two columns
        gbc.gridheight = 1; // occupy two columns
        gbc.weightx = 0; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
        frame.add(b3, gbc); // add button b3


        //add textfield
        gbc.gridx = 0; // column index
        gbc.gridy = 8; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        gbc.gridwidth = 3; // occupy two columns
        frame.add(t1, gbc); // add text field t1


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

}
