import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
     JTextField displayField;
     JPanel buttonPanel;
     double firstNumber = 0;
     String operator = "";

    public CalculatorFrame() {
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);

        // Create components
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Add buttons to the panel
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        // Set layout and add components
        setLayout(new BorderLayout());
        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                displayField.setText(displayField.getText() + command);
            } else if (command.equals("C")) {
                displayField.setText("");
                firstNumber = 0;
                operator = "";
            } else if (command.equals("=")) {
                double secondNumber = Double.parseDouble(displayField.getText());
                switch (operator) {
                    case "+":
                        displayField.setText(String.valueOf(firstNumber + secondNumber));
                        break;
                    case "-":
                        displayField.setText(String.valueOf(firstNumber - secondNumber));
                        break;
                    case "*":
                        displayField.setText(String.valueOf(firstNumber * secondNumber));
                        break;
                    case "/":
                        displayField.setText(String.valueOf(firstNumber / secondNumber));
                        break;
                }
            } else {
                firstNumber = Double.parseDouble(displayField.getText());
                displayField.setText("");
                operator = command;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }
}
