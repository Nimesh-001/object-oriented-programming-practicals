import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal {
    private JPanel panel1;
    private JTextField textField1;
    private JButton b0;
    private JButton b4;
    private JButton b8;
    private JButton multy;
    private JButton rest;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b9;
    private JButton plus;
    private JButton minus;
    private JButton div;
    private JButton o_bracket;
    private JButton c_bracket;
    private JButton clear;
    private JButton del;
    private JButton equal;


    public Cal() {
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"0");
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"4");

            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"5");

            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"6");

            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"7");

            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"8");

            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"9");

            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"+");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"-");

            }
        });
        multy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"*");

            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"/");

            }
        });
        o_bracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"(");

            }
        });
        c_bracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+")");

            }
        });
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"%");

            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");

            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+".");

            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = textField1.getText().trim();

                // Check for division by zero
                if (expression.contains("/") && expression.contains("0")) {
                    textField1.setText("Error: Divide by 0");
                    return;
                }

                // Evaluate expression
                if (expression.contains("+")) {
                    String[] parts = expression.split("\\+");
                    double num1 = Double.parseDouble(parts[0].trim());
                    double num2 = Double.parseDouble(parts[1].trim());
                    textField1.setText(String.valueOf(num1 + num2));
                } else if (expression.contains("-")) {
                    String[] parts = expression.split("-");
                    double num1 = Double.parseDouble(parts[0].trim());
                    double num2 = Double.parseDouble(parts[1].trim());
                    textField1.setText(String.valueOf(num1 - num2));
                } else if (expression.contains("*")) {
                    String[] parts = expression.split("\\*");
                    double num1 = Double.parseDouble(parts[0].trim());
                    double num2 = Double.parseDouble(parts[1].trim());
                    textField1.setText(String.valueOf(num1 * num2));
                } else if (expression.contains("/")) {
                    String[] parts = expression.split("/");
                    double num1 = Double.parseDouble(parts[0].trim());
                    double num2 = Double.parseDouble(parts[1].trim());
                    if (num2 == 0) {
                        textField1.setText("Error: Divide by 0");
                    } else {
                        textField1.setText(String.valueOf(num1 / num2));
                    }
                } else if (expression.contains("%")) {
                    String[] parts = expression.split("%");
                    double num1 = Double.parseDouble(parts[0].trim());
                    textField1.setText(String.valueOf(num1 * 0.01));
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cal");
        frame.setContentPane(new Cal().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);
        frame.setSize(300,300);

    }
}
