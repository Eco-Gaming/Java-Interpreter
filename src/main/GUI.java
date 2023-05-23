package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Label;

public class GUI {
    public static void startGUI() {
        Frame frame = new Frame("Application");
        Button b1 = new Button("AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        Button b2 = new Button("Clear");
        Button b3 = new Button("Test code");

        TextField t1;

        // creating objects of textfield
        Label l1 = new Label("Enter code here:");
        l1.setBounds(100,250,120,220);
        Label l2  = new Label("This is the CodeChecker");
        l2.setBounds(100,100,200,50);

        TextArea area1 = new TextArea("");
        area1.setBounds(120, 200, 250, 100);
        TextArea area2 = new TextArea("");
        area2.setBounds(120, 200, 250, 100);

        t1 = new TextField("Tokenausgabe");
        t1.setBounds(50, 100, 200, 30);
        //layout
        frame.setLayout(new GridLayout(3,3));

        // adding the components to frame
        frame.setSize(720, 480);
        frame.setLocationRelativeTo(null); // Centers the window

        // adding the components to frame
        frame.add(l2);
        frame.add(l1);
        frame.add(b3);
        frame.add(area1);
        frame.add(area2);
        frame.add(b2);
        frame.add(t1);
        frame.add(b1);



        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Releases native screen resources
            }
        });
        frame.setVisible(true);
    }
}