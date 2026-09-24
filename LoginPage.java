// This file is only for practicing the codes

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "1234";

    public LoginPage() {
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(titleLabel, gbc);

        JLabel usernameLabel = new JLabel("Username:");
        gbc.gridwidth = 1; gbc.gridx = 0; gbc.gridy = 1;
        panel.add(usernameLabel, gbc);

        usernameField = new JTextField(15);
        gbc.gridx = 1; gbc.gridy = 1;
        panel.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        passwordField = new JPasswordField(15);
        gbc.gridx = 1; gbc.gridy = 2;
        panel.add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, gbc);

        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        panel.add(messageLabel, gbc);

        add(panel);

        loginButton.addActionListener(e -> handleLogin());
        passwordField.addActionListener(e -> handleLogin());
    }

    private void handleLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setForeground(Color.RED);
            messageLabel.setText("Please fill in both fields.");
        } else if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            messageLabel.setForeground(new Color(0, 128, 0));
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setForeground(Color.RED);
            messageLabel.setText("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
        });
    }
}
