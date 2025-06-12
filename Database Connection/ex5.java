import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db1 {
    private String url = "jdbc:mysql://localhost:3306/test";
    private String user = "root";
    private String password = "1234";
    private Connection conn=null;

    public db1() {
        registerconnection();

        try {
            conn= DriverManager.getConnection(url,user,password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Connection Failed");

        }

    }

    public void registerconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
        } catch (ClassNotFoundException e) {
            System.out.println("Connection Failed");

        }
    }

    public Connection getConnection(){
        return conn;
    }
}
