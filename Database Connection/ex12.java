import java.sql.Connection;

public class dm3 {
    public static void main(String[] args) {
        dbconnector dbconnector = new dbconnector();
        Connection Connection = dbconnector.getConnection();

        insert1 insert1 = new insert1();
        insert1.insert("lucky",20);
    }
}
