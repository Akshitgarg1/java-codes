import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JTextArea messageArea;
    private JButton submitButton;

    public ContactForm() {
        setTitle("Contact Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel messageLabel = new JLabel("Message:");
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        messageArea = new JTextArea(5, 20);
        submitButton = new JButton("Submit");

        // Set up layout
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(messageLabel);
        inputPanel.add(new JScrollPane(messageArea));
        add(inputPanel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        // Add action listener to submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String message = messageArea.getText();
                JOptionPane.showMessageDialog(ContactForm.this,
                        "Name: " + name + "\nEmail: " + email + "\nMessage: " + message,
                        "Contact Info",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContactForm().setVisible(true);
            }
        });
    }
}
