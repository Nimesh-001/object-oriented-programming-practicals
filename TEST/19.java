import java.sql.Connection;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {
        Dbconnector db = new Dbconnector();
        Connection con = db.getConnection();

        if (con != null) {
            System.out.println("Connected to database");
            try {
                con.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                System.out.println("Error closing connection");
            }

        }
        else{
            System.out.println("Connection failed");
        }


    }
}
