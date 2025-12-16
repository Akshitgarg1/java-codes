import java.awt.*;

public class Q3 extends Frame {

    public Q3() {
        // Set the title of the frame
        super("Smiley Face");
        
        // Set the size of the frame
        setSize(400, 400);
        
        // Make the frame visible
        setVisible(true);
        
        // Add a window listener to handle the close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // Draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 200, 200);

        // Draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(150, 150, 20, 20);
        g.fillOval(230, 150, 20, 20);

        // Draw the mouth
        g.drawArc(150, 200, 100, 50, 0, -180);
    }

    public static void main(String[] args) {
        new SmileyFace();
    }
}
