import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton divideButton;
    private JLabel result;

    public form1() {
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());

                if (num2 == 0) {
                   JOptionPane.showMessageDialog(null, "you can't divide by zero");
                }

                double answer = num1/num2;
                result.setText(Double.toString(answer));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("form1");
        frame.setContentPane(new form1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);

    }
}
