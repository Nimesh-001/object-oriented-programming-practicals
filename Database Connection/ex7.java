import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db2 {
    private String url="jdbc:mysql://localhost:3306/test";
    private String username="root";
    private String password="1234";

    private Connection conn = null;

    public db2() {
        registerconnection();
        try {
            conn= DriverManager.getConnection(url,username,password);
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
            System.out.println("Could not load JDBC driver");

        }
    }

    public Connection getConnection(){
        return conn;
    }
}
