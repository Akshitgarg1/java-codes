import java.awt.*;
import java.awt.event.*;

class First extends Frame {
    First() {
        Button b = new Button("CLICK ME");
        add(b);
        
        // Set the layout on the current instance
        setLayout(new FlowLayout());
        
        // Set the frame size
        setSize(300, 200);
        
        setVisible(true);
        
        // Add a window listener to handle the close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        First f = new First();
    }
}
