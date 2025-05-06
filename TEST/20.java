import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnector {

    String url="jdbc:mysql://localhost:3306/ict";
    String user="root";
    String password="1234";

    public Connection getConnection(){

        Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Connection error");
        }
        /*
        finally {
            try {
                con.close();
                System.out.println("connection closed");
            } catch (SQLException e) {
                System.out.println("Connection error");
            }
        }

         */

        return con;
    }

}
