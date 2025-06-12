import java.sql.Connection;

public class dm2 {
    public static void main(String[] args) {
        db2 db2 =new db2();
        Connection Connection = db2.getConnection();

        if (Connection != null) {
            System.out.println("Database connection established successfully");
        }
        else {
            System.out.println("Database connection could not be established");
        }
    }
}
