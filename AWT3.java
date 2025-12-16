import java.awt.*;
import java.awt.event.*;

class AWT3 extends Frame implements ActionListener {
    Button b1, b2, b3;
    Label l1;

    AWT3() {
        b1 = new Button("YES");
        b2 = new Button("NO");
        b3 = new Button("EXIT");
        l1 = new Label();
        
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        
        add(b1);
        add(b2);
        add(b3);
        add(l1);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            l1.setText("\nYES BUTTON IS PRESSED");
        } else if (ae.getSource() == b2) {
            l1.setText("\nNO BUTTON IS PRESSED");
        } else if (ae.getSource() == b3) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new AWT3();
    }
}
