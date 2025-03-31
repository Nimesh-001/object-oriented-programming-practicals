import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class cal {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;


    public cal() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());

                if (a == 0 && b == 0) {
                    JOptionPane.showMessageDialog(null,"result = 0");
                }
                else {
                    JOptionPane.showMessageDialog(null,"your answer is: "+(a+b));
                }
            }
        });

    }

    public static void main(String[] args) {
        cal cal = new cal();
        JFrame frame = new JFrame();
        frame.setContentPane(cal.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
