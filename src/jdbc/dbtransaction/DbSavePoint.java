package jdbc.dbtransaction;

import jdbc.quering.Dbconnector;

import java.sql.*;

public class DbSavePoint {
    public static void main(String[] args) throws SQLException{
        Connection connection = Dbconnector.connectToDb();
        ResultSet resultSet = null;
        try {
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery("SELECT * FROM familyGroup");

            System.out.println("Printing the contents of the table before inserting");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                + resultSet.getString("nickName"));
            }

            System.out.println("Starting to insert rows");

            resultSet.moveToInsertRow();
            resultSet.updateString("nickName", "Tom");
            resultSet.insertRow();
            System.out.println("Inserted row for Tom");
            Savepoint firstSavepoint = connection.setSavepoint();

            resultSet.moveToInsertRow();
            resultSet.updateString("nickName", "Dick");
            resultSet.insertRow();
            System.out.println("Inserted for Dick");
            Savepoint secondSavepoint = connection.setSavepoint("SavepointForDick");

            resultSet.moveToInsertRow();
            resultSet.updateString("nickName", "Harry");
            resultSet.insertRow();
            System.out.println("Inserted row for Harry");
            Savepoint thirdSavepoint = connection.setSavepoint("ForHarry");
            System.out.println("Table updated complete...");

            System.out.println("Rolling back to the state where Tom and Dick were inserted");
            connection.rollback(secondSavepoint);

            connection.commit();

            System.out.println("Printing the contents of the table after commit");
            resultSet = statement.executeQuery("SELECT * FROM familyGroup");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("nickName"));
            }
        } catch (SQLException e) {
            System.out.println("Something gone wrong, couldn't add a contact in family group");
            connection.rollback();
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
}
