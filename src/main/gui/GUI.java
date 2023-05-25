package main.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
    public static void startGUI() {
        Frame frame = new Frame("Application");

        Button b2 = new Button("Clear");
        Button b3 = new Button("Test code");

        // creating objects of textfield
        Label l1 = new Label("Enter code here:");
        Label l2 = new Label("This is the CodeChecker");
        Label l3 = new Label("This is the CodeChecker");

        TextArea area1 = new TextArea("");
        TextArea area2 = new TextArea("");

        TextField t1 = new TextField("Tokenausgabe");
        TextField t2 = new TextField("Tokenausgabe");

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



        gbc.gridx = 2; // column index
        gbc.gridy = 2; // row
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridwidth = 1; // occupy two columns
        gbc.weightx = 0; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
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

        gbc.gridx = 1; // column index
        gbc.gridy = 1; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 0; // take up available horizontal space
        frame.add(b2, gbc); // add button b2

        gbc.gridx = 0; // column index
        gbc.gridy = 3; // row index
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
