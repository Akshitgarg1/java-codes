import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {
    // Declare components
    private JTextField display;
    private JButton[] digitButtons;
    private JButton addButton, subButton, mulButton, divButton, equButton, clrButton;

    private String operator;
    private double num1, num2, result;

    public Calculator() {
        // Set frame properties
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize components
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].addActionListener(this);
            panel.add(digitButtons[i]);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clrButton = new JButton("C");

        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(equButton);
        panel.add(clrButton);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
        clrButton.addActionListener(this);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.equals("+")) {
            operator = "+";
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        } else if (command.equals("-")) {
            operator = "-";
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        } else if (command.equals("*")) {
            operator = "*";
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        } else if (command.equals("/")) {
            operator = "/";
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}
