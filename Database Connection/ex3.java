import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnector {
    private String url="jdbc:mysql://localhost:3306/test";
    private String user="root";
    private String password="1234";

    private Connection connection=null;

    public dbconnector() {
        registerconnection();

        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");

        }


    }

    public void registerconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load JDBC driver. " + e.getMessage());

        }
        
    }

    public Connection getConnection(){
        return connection;
    }
}
