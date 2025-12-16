import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A extends JFrame {
    A() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField f1 = new JTextField(5);
        add(f1);
        
        JTextField f2 = new JTextField(5);
        add(f2);
        
        JButton b1 = new JButton("+");
        add(b1);
        
        JLabel l1 = new JLabel("Output");
        add(l1);
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s1 = f1.getText();
                    String s2 = f2.getText();
                    int a = Integer.parseInt(s1);
                    int b = Integer.parseInt(s2);
                    Integer ans = a + b;
                    l1.setText(ans.toString());
                } catch (NumberFormatException ex) {
                    l1.setText("Invalid input");
                }
            }
        };
        b1.addActionListener(al);
    }
}

public class Swing11 {
    public static void main(String[] args) {
        new A();
    }
}
