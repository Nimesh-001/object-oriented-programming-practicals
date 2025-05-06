import java.sql.*;
import java.util.Arrays;

public class Test {

    private String regno;
    private double quiz1;
    private double quiz2;
    private double quiz3;
    private double quiz4;

    Dbconnector db = new Dbconnector();
    Connection con = db.getConnection();




    public double bestaverage(String regno){
        double best = 0.0;

        String sql = "select Quiz01,Quiz02,Quiz03,Quiz04 from marks where Reg_no  = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, regno);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                quiz1 = rs.getDouble(1);
                quiz2 = rs.getDouble(2);
                quiz3 = rs.getDouble(3);
                quiz4 = rs.getDouble(4);

                double[] quizes = {quiz1, quiz2, quiz3, quiz4};
                Arrays.sort(quizes);
                best = (quizes[1]+quizes[2]+quizes[3])/3;

            }

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }


        return best;
    }

    public static void main(String[] args) {
        Test t = new Test();
        String regno ="ICT001";
        System.out.println("average of "+ regno+" :" +t.bestaverage(regno) );
    }

}
