import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cal {
    private JPanel mainpanel;
    private JPanel toppannel;
    private JPanel bottempannel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton addButton;
    private JButton enterButton;
    private JButton clearButton;

    public cal() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double answer =  num1 + num2;
                    textField3.setText(String.valueOf(answer));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric value");
                }


            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double answer =  num1 + num2;
                    textField3.setText(String.valueOf(answer));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric value");

                }

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("cal");
        frame.setContentPane(new cal().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,400);
    }
}
