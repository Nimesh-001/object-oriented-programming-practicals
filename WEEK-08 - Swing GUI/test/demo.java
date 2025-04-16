import java.sql.Connection;

public class demo {
    public static void main(String[] args) {
        Dbconnector dbc = new Dbconnector();
        Connection con = dbc.getConnection();

    }
}
