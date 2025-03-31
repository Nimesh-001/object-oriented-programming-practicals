import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginform {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loggingButton;

    public Loginform() {
        loggingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(passwordField1.getPassword());

                if(username.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(panel1,"Please enter username and password");
                }
                else{
                JOptionPane.showMessageDialog(null, "Welcome " + username);
            }}
        });
    }
    public static void main(String[] args) {
        Loginform loginform = new Loginform();
        JFrame frame = new JFrame();
        frame.setContentPane(loginform.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);



    }


}
