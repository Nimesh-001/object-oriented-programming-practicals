import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnector {
    private String url =  "jdbc:mysql://localhost:3308/test";
    private String username="root";
    private String password= "1234";

    private Connection connection=null;

    public dbconnector(){

    }

    public void regconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load JDBC driver");
        }

    }

    public Connection getConnection(){
        regconnection();

        try {
            connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Unable to connect to database");

        }
        return connection;
    }
}
