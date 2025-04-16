import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Logform {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;

    public Logform() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = textField1.getText();
                String password = String.valueOf(passwordField1.getPassword());

               try {
                   Dbconnector db = new Dbconnector();
                   Connection con = db.getConnection();

                   String query ="select  * from user where First_Name=? and password=?";
                   PreparedStatement ps = con.prepareStatement(query);
                   ps.setString(1, username);
                   ps.setString(2, password);
                   ResultSet rs = ps.executeQuery();

                   if (rs.next()) {
                       JOptionPane.showMessageDialog(null,"login successful");
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"login failed");
                   }

                   con.close();





               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null,"error"+ex.getMessage());
               }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Logform");
        frame.setContentPane(new Logform().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,400);

    }
}
