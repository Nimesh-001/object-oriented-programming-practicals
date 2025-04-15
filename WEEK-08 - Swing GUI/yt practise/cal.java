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

            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
