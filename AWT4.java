import java.awt.*;
import java.awt.event.*;

class AWT4 extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;

    AWT4() {
        l1 = new Label("Enter Value");
        l2 = new Label("Next Value");
        l3 = new Label("Prev Value");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t2.setEditable(false);
        t3.setEditable(false);
        b1 = new Button("OK");
        b2 = new Button("EXIT");

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);

        setSize(500, 500);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String input = t1.getText();
            try {
                int n = Integer.parseInt(input);
                t2.setText(String.valueOf(n + 1));
                t3.setText(String.valueOf(n - 1));
            } catch (NumberFormatException e) {
                t2.setText("Invalid input");
                t3.setText("Invalid input");
            }
        } else if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new AWT4();
    }
}
