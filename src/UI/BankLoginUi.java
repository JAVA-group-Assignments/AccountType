package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankLoginUi extends JFrame implements ActionListener {
    public JLabel headerLabel, userPinLabel;
    public JTextField userPinField;
    public JButton loginButton;

    public BankLoginUi() {
        super("Welcome to our bank");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        headerLabel = new JLabel("Login pin");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 14));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(headerLabel, BorderLayout.NORTH);

        userPinLabel = new JLabel("PIN:");
        userPinLabel.setFont(new Font("Arial", Font.BOLD, 14));
        getContentPane().add(userPinLabel, BorderLayout.CENTER);

        userPinField = new JTextField(4);
        getContentPane().add(userPinField, BorderLayout.CENTER);

        loginButton = new JButton("Log In");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.addActionListener(this);
        getContentPane().add(loginButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String enteredPin = userPinField.getText();
        if (enteredPin.length() != 4) {
            JOptionPane.showMessageDialog(this, "PIN must be 4 digits.");
        } else if (!enteredPin.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "PIN must be numeric.");
        } else if (enteredPin.equals("3333")) {
            JOptionPane.showMessageDialog(this, "PIN cannot be '3333'.");
        } else if (enteredPin.contains("5") && !enteredPin.matches("^5+$")) {
            JOptionPane.showMessageDialog(this, "PIN can only be '5'.");
        } else {
            JOptionPane.showMessageDialog(this, "Logged in successfully!");
            AccountTypeUI accountTypeUI = new AccountTypeUI();
            accountTypeUI.accountTypeUI();
        }
    }

    public static void main(String[] args) {
        new BankLoginUi();
    }
}
