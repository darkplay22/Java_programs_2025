import java.sql.*;

public class TestMySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student"; // your DB name
        String user = "root"; // your username
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
