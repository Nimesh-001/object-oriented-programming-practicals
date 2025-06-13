import java.sql.Connection;

public class dm1 {
    public static void main(String[] args) {
        db1 db1 = new db1();
        Connection conn = db1.getConnection();

        if (conn != null) {
            System.out.println("Connected to database successfully");
        }
        else {
            System.out.println("Connection Failed");
        }

        insert3 insert3 = new insert3();
        insert3.insert("sunil",25);
    }
}
