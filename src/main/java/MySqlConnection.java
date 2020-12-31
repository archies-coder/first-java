import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    public static Connection connect() {
        Connection con;
        String url = "jdbc:mysql://localhost:3306/zoo";
        String username = "archis";
        String password = "Archi@123321";

        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            if (con == null) {
                System.out.println("Connection cannot be established");
            }

            return con;
//            String sql = "INSERT INTO dogs(name, speed) VALUES(\"Tuffy\", 38)";
//
//            Statement statement = con.prepareStatement(sql);
//
//            int rows = statement.executeUpdate(sql);
//            if (rows > 0) {
//                System.out.println("Added in Database");
//            }
//
//            statement.close();
//            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
