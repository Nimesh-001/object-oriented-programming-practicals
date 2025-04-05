import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divideform {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton devideButton;
    private JTextField textField3;

    public Divideform() {
        devideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());

                if (num2==0){
                    JOptionPane.showMessageDialog(null, "you can not enter 0 for second number..");
                }
                else {
                    Double num3 = num1/num2;
                    textField3.setText(String.valueOf(num3));
                }

            }
        });
    }

    public static void main(String[] args) {
        Divideform divideform = new Divideform();
        JFrame frame = new JFrame();
        frame.setContentPane(divideform.panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,200);

    }
}
