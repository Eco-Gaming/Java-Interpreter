
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Label;

public class GUI {
    public static void startGUI() {
        Frame frame = new Frame("Application");
        Button b = new Button("Test Code for Errors");
        b.setBounds(400, 200, 120, 30);
        // creating objects of textfield
        Label l1 = new Label("Enter code here:");
        Label l2  = new Label("This is the CodeChecker");

        l1.setBounds(100,250,120,220);
        l2.setBounds(100,100,200,50);
        TextArea area = new TextArea("");
        area.setBounds(120, 200, 250, 100);



        // adding the components to frame
        frame.add(l2);
        frame.add(area);
        frame.add(b);
        frame.add(l1);

        frame.setSize(720, 480);
        frame.setLocationRelativeTo(null); // Centers the window

        //layout
        frame.setLayout(new GridLayout(3,3));

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Releases native screen resources
            }
        });
        frame.setVisible(true);
    }
}