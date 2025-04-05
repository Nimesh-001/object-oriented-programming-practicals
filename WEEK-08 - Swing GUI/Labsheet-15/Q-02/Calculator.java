import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private double total1=0.0;
    private double total2=0.0;


    private JPanel panel1;
    private JTextField textField1;
    private JButton cButton;
    private JButton a7Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a4Button;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button11;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button14;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;


    public Calculator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textField1.getText()+a0Button.getText();
                textField1.setText(a);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b = textField1.getText()+a1Button.getText();
                textField1.setText(b);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c = textField1.getText()+a2Button.getText();
                textField1.setText(c);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String d = textField1.getText()+a3Button.getText();
                textField1.setText(d);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = textField1.getText()+a4Button.getText();
                textField1.setText(f);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g = textField1.getText()+a5Button.getText();
                textField1.setText(g);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String h = textField1.getText()+a6Button.getText();
                textField1.setText(h);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i = textField1.getText()+a7Button.getText();
                textField1.setText(i);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String j = textField1.getText()+a8Button.getText();
                textField1.setText(j);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String k = textField1.getText()+a9Button.getText();
                textField1.setText(k);
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1=total1+Double.parseDouble(textField1.getText());
                textField1.setText("");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=total1+Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(total2));
                total1=0;


            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                textField1.setText("");
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0.");
                } else if (textField1.getText().contains(".")) {
                    button18.setEnabled(false);
                }
                else {
                    String aa = textField1.getText() + button18.getText();
                    textField1.setText(aa);
                }
                button18.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
