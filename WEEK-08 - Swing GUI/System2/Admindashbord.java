import javax.swing.*;

public class Admindashbord {
    private JPanel panel1;
    private JButton userProfilesButton;
    private JButton coursesButton;
    private JButton noticesButton;
    private JButton logoutButton;
    private JButton timetablesButton;
    private JButton timetablesButton1;
    private JButton noticesButton1;
    private JButton coursesButton1;
    private JButton userProfilesButton1;
    private JButton button1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Admindashbord");
        frame.setContentPane(new Admindashbord().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(900,400);
    }
}
