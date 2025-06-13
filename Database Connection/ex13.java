import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert3 {
    public void insert(String name,int age){
        dbconnector dbconnector = new dbconnector();
        Connection Connection = dbconnector.getConnection();

        String query = "insert into students (name,age) values (?,?)";

        try {
            PreparedStatement preparedStatement = Connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("insert into students error");
        }
    }
}
