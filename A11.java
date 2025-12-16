import javax.swing.*;
import java.awt.*;
public class A11 extends Canvas {
    public static void main(String[] args) {
        A11 a = new A11();
        JFrame j = new JFrame();
        j.add(a);
        j.setSize(500, 500);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public A11() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(50,50,200,200);
        g.drawOval(90,100,40,20);
        g.drawOval(170,100,40,20);
        g.fillOval(105,110,10,10);
        g.fillOval(185,110,10,10);
        g.drawLine(150,120,150,160);
        g.drawOval(120,180,60,20);
        g.drawRect(30,120,20,40);
        g.drawRect(250,120,20,40);
    }
    
}
