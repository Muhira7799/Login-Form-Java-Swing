import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    JTextField username;
    JPasswordField password;
    JButton login;

    LoginForm() {
        setTitle("Login Form");
        setLayout(new FlowLayout());

        add(new JLabel("Username:"));
        username = new JTextField(15);
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField(15);
        add(password);

        login = new JButton("Login");
        add(login);

        login.addActionListener(this);

        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = username.getText();
        String pass = new String(password.getPassword());

        if (user.equals("admin") && pass.equals("1234")) {
            JOptionPane.showMessageDialog(
                this, "Login successful!"
            );
        } else {
            JOptionPane.showMessageDialog(
                this, "Invalid username or password."
            );
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}