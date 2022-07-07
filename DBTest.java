import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest extends BaseTest {

    @Test
    public void testConnectionToBD() throws SQLException {


        String sqlPattern = "SELECT * FROM family ";
        PreparedStatement preparedStatement = getConnection().prepareStatement(sqlPattern);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String first_name = resultSet.getString(2);
            String last_name = resultSet.getString(3);

            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2)
                    + " " +
                    resultSet.getString(3));
        }
        preparedStatement.close();
    }

    @Test
    public void testConnectionToBDInsert() throws SQLException {

        String sqlPattern1 = "INSERT INTO family VALUES(?,?,?)";
        PreparedStatement preparedStatement1 = getConnection().prepareStatement(sqlPattern1);
        preparedStatement1.setInt(1, 3);
        preparedStatement1.setString(2, "Ivan");
        preparedStatement1.setString(3, "Sidorov");
        preparedStatement1.execute();
        preparedStatement1.close();
    }

    @Test
    public void testConnectionToBDUpdate() throws SQLException {
        PreparedStatement preparedStatement2 = getConnection().prepareStatement("UPDATE family SET last_name='Petrov' WHERE id='3'");
        preparedStatement2.executeUpdate();
        preparedStatement2.close();
    }


    @Test
    public void testConnectionToBDDelete() throws SQLException {
        PreparedStatement preparedStatement3 = getConnection().prepareStatement
                ("DELETE FROM family WHERE id='3'");
        preparedStatement3.execute();
        preparedStatement3.close();
    }
}


