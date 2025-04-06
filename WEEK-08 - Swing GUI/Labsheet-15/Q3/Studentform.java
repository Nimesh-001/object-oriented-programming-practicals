import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Studentform {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JTextField textField6;
    private JTextField textField7;
    private JComboBox comboBox1;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JButton SUBMITButton;

    public Studentform() {
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String field1 = textField1.getText().trim();
                String field2 = textField2.getText().trim();
                String field3 = textField3.getText().trim();
                String field4 = textField4.getText().trim();
                String field5 = textField5.getText().trim();
                String field6 = textField6.getText().trim();
                String field7 = textField7.getText().trim();
                String field8 = textField8.getText().trim();
                String field9 = textField9.getText().trim();
                String field10 = textField10.getText().trim();
                String selectedYear = (String) comboBox1.getSelectedItem();

                // Check if any field is empty
                if (field1.isEmpty() || field2.isEmpty() || field3.isEmpty() || field4.isEmpty() ||
                        field5.isEmpty() || field6.isEmpty() || field7.isEmpty() || field8.isEmpty() ||
                        field9.isEmpty() || field10.isEmpty() || selectedYear == null ||
                        (!maleRadioButton.isSelected() && !femaleRadioButton.isSelected() && !otherRadioButton.isSelected())) {

                    JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Missing Info", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Get selected gender
                    String gender = "";
                    if (maleRadioButton.isSelected()) gender = "Male";
                    else if (femaleRadioButton.isSelected()) gender = "Female";
                    else if (otherRadioButton.isSelected()) gender = "Other";

                    // Display all details
                    String result = "Field1: " + field1 +
                            "\nField2: " + field2 +
                            "\nField3: " + field3 +
                            "\nField4: " + field4 +
                            "\nField5: " + field5 +
                            "\nGender: " + gender +
                            "\nField6: " + field6 +
                            "\nField7: " + field7 +
                            "\nYear: " + selectedYear +
                            "\nField8: " + field8 +
                            "\nField9: " + field9 +
                            "\nField10: " + field10;

                    JOptionPane.showMessageDialog(null, result, "Student Details", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Studentform");
        frame.setContentPane(new Studentform().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,400);
    }
}
