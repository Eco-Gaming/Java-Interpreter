package main.gui;

import main.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class GUI {

    Frame frame;
    GridBagConstraints gbc;
    Label l1;
    Label l2;
    Label l3;
    Button b1;
    Button b2;
    Button b3;
    TextArea area1;
    TextArea area2;
    TextField t1;

    public GUI() {
        //
    }

    public void startGUI() {
        frame = new Frame("Java Interpreter 1.0-SNAPSHOT");

        // creating objects of textfield
        l1 = new Label("This is the CodeChecker");
        l2 = new Label("Enter code here:");
        l3 = new Label("All available tokens:");

        // creating buttons
        b1 = new Button("Clear");
        b2 = new Button("Parse code");
        b3 = new Button("Scan code");

        // creating TextArea (multiline TextField)
        area1 = new TextArea("");
        area2 = new TextArea(Main.instance.parser.getTokenList());
        area2.setEditable(false);
        area2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        // creating the smaller TextField
        t1 = new TextField("Tokenausgabe");
        t1.setEditable(false);

        // Set GridBagLayout
        frame.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();

        // setting constraints for l1
        gbc.gridx = 0; // column index
        gbc.gridy = 0; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(l1, gbc); // add label l1

        // setting constraints for l2
        gbc.gridx = 0; // column index
        gbc.gridy = 1; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        frame.add(l2, gbc); // add label l2

        // setting constraints for l3
        gbc.gridx = 1; // column index
        gbc.gridy = 1; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        frame.add(l3, gbc); // add label l3

        // setting constraints for area1
        gbc.gridx = 0; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.gridheight = 2; // occupy two columns
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(area1, gbc); // add text area area1

        // setting constraints for area2
        gbc.gridx = 1; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.gridheight = 2; // occupy two columns
        gbc.weightx = 1.0; // take up available horizontal space
        frame.add(area2, gbc); // add text area area2

        // setting constraints for b1
        gbc.gridx = 0; // column index
        gbc.gridy = 4; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 0; // take up available horizontal space
        frame.add(b1, gbc); // add button b2

        // setting constraints for b3
        gbc.gridx = 0; // column index
        gbc.gridy = 7; // row
        gbc.gridwidth = 1; // occupy two columns
        gbc.gridheight = 1; // occupy two columns
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
        frame.add(b2, gbc); // add button b3

        // setting constraints for b3
        gbc.gridx = 1; // column index
        gbc.gridy = 7; // row
        gbc.gridwidth = 1; // occupy two columns
        gbc.gridheight = 1; // occupy two columns
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
        frame.add(b3, gbc); // add button b3

        // setting constraints for t1
        gbc.gridx = 0; // column index
        gbc.gridy = 8; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.weightx = 1.0; // take up available horizontal space
        gbc.gridwidth = 3; // occupy two columns
        frame.add(t1, gbc); // add text field t1

        // setting size and location of frame
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

    public void scanCode() {
        //
    }

    public void parseCode() {
        //
    }

    public void clearCode() {
        area1.setText("");
    }
}
