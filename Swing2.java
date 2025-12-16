import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
class Swing2 extends JFrame {
    JTextField t1,t2;
    public Swing2(){
        setTitle("Login Frame");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(3,2));
        p.add(new JLabel("username:"));
        t1=new JTextField();
        p.add(t1);
        p.add(new JLabel("id:"));
        t2=new JTextField();
        p.add(t2);
        JButton b=new JButton("Login");
        p.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String a = t1.getText();
                String b = t2.getText();
                System.out.println("username:"+a+" "+"id:"+b);
            }
        });
        add(p);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Swing2 frame = new Swing2();
                frame.setVisible(true);

            }
        });
    }
}