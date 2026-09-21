import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class FetchDataFromMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root";

        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement stmt = conn.createStatement();

            // Write and execute your SQL query
            String sql = "SELECT * FROM stu";
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                String id = rs.getString("ID");              // Column name
                String name = rs.getString("NAME");
                String marks = rs.getString("MARKS");

                System.out.println("ID: " + id + ", Name: " + name + ", Mark: " + marks);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

