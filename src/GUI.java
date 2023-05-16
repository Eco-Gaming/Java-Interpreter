import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
    public static void main(String[] args) {
        Frame frame = new Frame("Application");

        Button b = new Button("Click Here");
        b.setBounds(400,200,80,30);

        // creating objects of textfield
        TextField t1, t2;

        // instantiating the textfield objects
        // setting the location of those objects in the frame
        t1 = new TextField("Test");
        t1.setBounds(40, 100, 200, 30);
        t2 = new TextField("Code hier Eingeben:");
        t2.setBounds(40, 150, 200, 30);
        // adding the components to frame
        frame.add(t1);
        frame.add(t2);
        frame.add(b);
        frame.add(new Label("Hello!"));
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
