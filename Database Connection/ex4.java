import java.sql.Connection;

public class demo {
    public static void main(String[] args) {
        dbconnector dbconnector = new dbconnector();
        Connection connection= dbconnector.getConnection();

        if (connection != null) {
            System.out.println("Connected to database successfully");
        }
        else {
            System.out.println("Connection Failed");
        }
    }
}
