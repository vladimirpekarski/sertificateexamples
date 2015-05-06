package jdbc.dbtransaction;

import jdbc.quering.Dbconnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTransaction {
    public static void main(String[] args) throws SQLException{
        Connection connection = Dbconnector.connectToDb();
        ResultSet resultSet1 = null;
        ResultSet resultSet2 = null;

        try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet1 = statement.executeQuery("SELECT * FROM familyGroup");
            resultSet1.moveToInsertRow();
            resultSet1.updateString("nickName", "Sam Uncle");
            resultSet1.insertRow();
            System.out.println("First table updated...");

            resultSet2 = statement.executeQuery("SELECT * FROM contact");
            resultSet2.moveToInsertRow();
            resultSet2.updateString("firstName", "Samuel");
//            resultSet2.updateString("firstName", "The great Samuel billionaire from Washington DC");
            resultSet2.updateString("lastName", "Uncle");
            resultSet2.updateString("phoneNo", "+119955331100");
            resultSet2.insertRow();

            System.out.println("Both tables updated, committing now.");
            connection.commit();

        } catch (SQLException sqle) {
            connection.rollback();
            sqle.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }

            if (resultSet1 != null) {
                resultSet1.close();
            }

            if (resultSet2 != null) {
                resultSet2.close();
            }
        }
    }
}
