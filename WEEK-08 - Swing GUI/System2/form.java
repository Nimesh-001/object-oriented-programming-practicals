import javax.swing.*;

public class form {
    private JPanel panel1;
    private JTextField EXBNSTextField;
    private JPasswordField passwordField1;
    private JButton LOGINButton;
    private JButton CLEARButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("form");
        frame.setContentPane(new form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Login form");
        frame.setResizable(false);

    }
}
