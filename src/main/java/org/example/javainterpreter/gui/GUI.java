package org.example.javainterpreter.gui;

import org.example.javainterpreter.JavaInterpreter;
import org.example.javainterpreter.gui.listeners.ClearCodeActionListener;
import org.example.javainterpreter.gui.listeners.ParseCodeActionListener;
import org.example.javainterpreter.gui.listeners.ScanCodeActionListener;
import org.example.javainterpreter.gui.listeners.TextChangedListener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class GUI {

    JavaInterpreter javaInterpreter;

    Frame frame;
    GridBagConstraints gbc;
    Label l1;
    Label l2;
    Label l3;
    Label l4;
    Button b1;
    Button b2;
    Button b3;
    TextArea area1;
    TextArea area2;
    TextField t1;

    boolean scanned;
    String input;

    public GUI(JavaInterpreter javaInterpreter) {
        this.javaInterpreter = javaInterpreter;
        scanned = false;
    }

    public void startGUI() {
        frame = new Frame("Java Interpreter 1.0.0");

        // creating objects of textField
        l1 = new Label("This is the CodeChecker");
        l2 = new Label("Enter code here:");
        l3 = new Label("All available tokens:");
        l4 = new Label("Token output:");

        // creating buttons
        b1 = new Button("Clear");
        b1.addActionListener(new ClearCodeActionListener());
        b2 = new Button("Scan code");
        b2.addActionListener(new ScanCodeActionListener());
        b3 = new Button("Parse code");
        b3.addActionListener(new ParseCodeActionListener());

        Font monospaceFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);

        // creating TextArea (multiline TextField)
        area1 = new TextArea("");
        area1.addTextListener(new TextChangedListener());
        area1.setFont(monospaceFont);
        area2 = new TextArea(javaInterpreter.parser.getTokenList());
        area2.setEditable(false);
        area2.setFont(monospaceFont);

        // creating the smaller TextField
        t1 = new TextField("");
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

        // setting constraints for l4
        gbc.gridx = 0; // column index
        gbc.gridy = 6; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        frame.add(l4, gbc); // add label l4

        // setting constraints for area1
        gbc.gridx = 0; // column index
        gbc.gridy = 2; // row index
        gbc.fill = GridBagConstraints.HORIZONTAL; // allow horizontal resizing
        gbc.gridheight = 2; // occupy two columns
        gbc.weightx = 0; // take up available horizontal space
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
        gbc.weightx = 1; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
        frame.add(b1, gbc); // add button b2

        // setting constraints for b2
        gbc.gridx = 1; // column index
        gbc.gridy = 5; // row
        gbc.gridwidth = 1; // occupy two columns
        gbc.gridheight = 1; // occupy two columns
        gbc.weightx = 1; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
        frame.add(b2, gbc); // add button b2

        // setting constraints for b3
        gbc.gridx = 1; // column index
        gbc.gridy = 6; // row
        gbc.gridwidth = 1; // occupy two columns
        gbc.gridheight = 1; // occupy two columns
        gbc.weightx = 0; // take up available horizontal space
        gbc.weighty = 0; // take up available horizontal space
        frame.add(b3, gbc); // add button b3

        // setting constraints for t1
        gbc.gridx = 0; // column index
        gbc.gridy = 7; // row index
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
        input = area1.getText();

        javaInterpreter.parser.setInput(input);
        javaInterpreter.parser.init();

        t1.setText(javaInterpreter.parser.getTokenString());
        scanned = true;
    }

    public void codeChanged() {
        if (!area1.getText().equals(input)) {
            t1.setText("");
            scanned = false;
        }
    }

    public void parseCode() {
        if (!scanned) {
            JOptionPane.showMessageDialog(frame, "The code must be scanned before parsing!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        javaInterpreter.parser.parse();
        if (javaInterpreter.parser.isValid()) {
            JOptionPane.showMessageDialog(frame, "Code parsed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int state = JOptionPane.showConfirmDialog(frame, "Failed parsing code! Show error(s)?", "Failed", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            if (state == 0) showErrors();
        }
    }

    public void clearCode() {
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to clear the code field?", "Confirm", JOptionPane.OK_CANCEL_OPTION) < 1) {
            area1.setText("");
            scanned = false;
        }
    }

    private void showErrors() {
        // Convert the error list to a single string with line breaks
        String errorText = String.join("\n", javaInterpreter.parser.getErrors());

        // Show the error dialog
        JOptionPane.showMessageDialog(frame, errorText, "Error List", JOptionPane.ERROR_MESSAGE);
    }
}
