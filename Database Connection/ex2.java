import java.sql.Connection;

public class demo {
    public static void main(String[] args) {
        dbconnector dbconnector = new dbconnector();
        Connection connection= dbconnector.getConnection();
    }
}
