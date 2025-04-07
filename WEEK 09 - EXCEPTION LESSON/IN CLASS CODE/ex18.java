import java.sql.*;

public class Basicdbtest {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from basicdata");

            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+", "+resultSet.getString(2)+", "+resultSet.getString(3));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("driver not found"+e.getMessage());
            //throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("database error.."+e.getMessage());
            //throw new RuntimeException(e);
        }

    }
}
