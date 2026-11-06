
import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "Scsvmv123*"
            );

            System.out.println("Connected to MySQL!");
            System.out.println("Database: " + con.getCatalog());

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("ID\tName\tAge");
            System.out.println("----------------------");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("age")
                );
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
