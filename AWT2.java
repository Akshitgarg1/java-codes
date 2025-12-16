import java.awt.*;
import java.awt.event.*;

class AWT2 extends Frame implements ActionListener {
    Label label1;
    TextField tf1;
    Button b1;
    Button b2;
    List list1;

    AWT2() {
        setSize(500, 500);
        setLayout(new FlowLayout());

        label1 = new Label("Enter City");
        tf1 = new TextField(10);
        b1 = new Button("ADD");
        b2 = new Button("REMOVE");

        b1.addActionListener(this);
        b2.addActionListener(this);

        list1 = new List();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        add(label1);
        add(tf1);
        add(b1);
        add(b2);
        add(list1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String ans = ae.getActionCommand();
        if (ans.equals("ADD")) {
            if (!tf1.getText().equals("")) {
                list1.add(tf1.getText());
                tf1.setText("");
            }
        } else if (ans.equals("REMOVE")) {
            int selectedIndex = list1.getSelectedIndex();
            if (selectedIndex >= 0) {
                list1.remove(selectedIndex);
            }
        }
    }

    public static void main(String args[]) {
        new AWT2();
    }
}
