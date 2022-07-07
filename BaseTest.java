import java.sql.Connection;
import java.sql.SQLException;


public class BaseTest {
    public static final String dbAdderss = "jdbc:postgresql://localhost:5432/postgres";
    public static final String dbUser = "postgres";
    public static final String dbPassword = "120480elena";


    protected Connection getConnection() throws SQLException {
        Connection connection = DBConnection.getInstance(dbAdderss, dbUser, dbPassword).getConnection();
        return connection;
    }
}



