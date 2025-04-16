import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnector {

    public Connection getConnection() {

        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/tecmis";
            String user = "root";
            String password = "1234";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("connect to database failed");
            System.out.println(e.getMessage());
        }

        return conn;
    }




}
