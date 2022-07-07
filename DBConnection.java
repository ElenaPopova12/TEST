import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static DBConnection instance;
    private final Connection dbConnection;
    private final String dbUser;


    private DBConnection(String url, String dbUser, String dbPassword) throws SQLException {
        this.dbConnection = DriverManager.getConnection(url, dbUser, dbPassword);
        this.dbUser = dbUser;

    }

    public static DBConnection getInstance(String url, String dbUser, String dbPassword)
            throws SQLException {
        if (instance == null) {
            instance = new DBConnection(url, dbUser, dbPassword);
        } else if (!instance.dbUser.equals(dbUser)) {

        }
        return instance;
    }

    public Connection getConnection() {
        return this.dbConnection;
    }
}
