import java.awt.*;
import java.awt.event.*;

public class AWTForm extends Frame implements ActionListener {
    // Components of the Form
    private Label nameLabel, emailLabel, phoneLabel, messageLabel;
    private TextField nameTextField, emailTextField, phoneTextField;
    private Button submitButton;

    public AWTForm() {
        // Set the layout of the frame
        setLayout(new FlowLayout());

        // Create the components
        nameLabel = new Label("Name:");
        nameTextField = new TextField(20);

        emailLabel = new Label("Email:");
        emailTextField = new TextField(20);

        phoneLabel = new Label("Phone:");
        phoneTextField = new TextField(20);

        submitButton = new Button("Submit");
        messageLabel = new Label("");

        // Add components to the frame
        add(nameLabel);
        add(nameTextField);

        add(emailLabel);
        add(emailTextField);

        add(phoneLabel);
        add(phoneTextField);

        add(submitButton);
        add(messageLabel);

        // Add action listener for the button
        submitButton.addActionListener(this);

        // Set frame properties
        setTitle("AWT Form Example");
        setSize(300, 300);
        setVisible(true);

        // Add window listener to handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Implement actionPerformed method to handle button click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String phone = phoneTextField.getText();

            // Create a dialog to show the entered details
            Dialog dialog = new Dialog(this, "Submitted Details", true);
            dialog.setLayout(new FlowLayout());
            dialog.setSize(300, 200);
            
            Label detailsLabel = new Label("Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
            dialog.add(detailsLabel);
            
            Button okButton = new Button("OK");
            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    dialog.setVisible(false);
                }
            });
            
            dialog.add(okButton);
            dialog.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new AWTForm();
    }
}
