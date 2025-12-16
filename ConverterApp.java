import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConverterApp extends JFrame implements ActionListener {
    private JLabel infoLabel, resultLabel;
    private JTextField inputField;
    private JButton cmToFeetButton, feetToCmButton;

    public ConverterApp() {
        setTitle("Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        infoLabel = new JLabel("cm to feet and feet to cm Converter [1 cm = 0.0328 feet and 1 feet = 30.48 cm]");
        resultLabel = new JLabel("Result");
        inputField = new JTextField(10);
        cmToFeetButton = new JButton("cm to feet");
        feetToCmButton = new JButton("feet to cm");

        cmToFeetButton.addActionListener(this);
        feetToCmButton.addActionListener(this);

        setLayout(new GridLayout(5, 1));  // Set 5 rows to accommodate all components
        add(infoLabel);
        add(inputField);
        add(cmToFeetButton);
        add(feetToCmButton);
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double inputValue = Double.parseDouble(inputField.getText());
            if (e.getSource() == cmToFeetButton) {
                double feet = inputValue * 0.0328;
                resultLabel.setText(String.format("%.2f cm = %.2f feet", inputValue, feet));
            } else if (e.getSource() == feetToCmButton) {
                double cm = inputValue * 30.48;
                resultLabel.setText(String.format("%.2f feet = %.2f cm", inputValue, cm));
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }

    public static void main(String[] args) {
        new ConverterApp();
    }
}
