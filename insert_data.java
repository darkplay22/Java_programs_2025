import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class insert_data {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root";

        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("INSERT INTO stu VALUES(126, 'Ishaan Bhela', 410);");
            System.out.println("Update executed Successfully!");

            // Close resources
           
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

