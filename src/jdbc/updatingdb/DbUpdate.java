package jdbc.updatingdb;

import jdbc.quering.Dbconnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUpdate {
    public static void main(String[] args) {
        try (Connection connection = Dbconnector.connectToDb();
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact" +
                    " WHERE firstName=\"Michael\"")) {

            System.out.println("Before the update");
            System.out.println("id \tfName \tlName \temail \t\tphoneNo");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t"
                + resultSet.getString("firstName") + "\t"
                + resultSet.getString("lastName") + "\t"
                + resultSet.getString("email") + "\t"
                + resultSet.getString("phoneNo"));
            }

            resultSet.absolute(1);
            resultSet.updateString("phoneNo", "+5555555");
            resultSet.updateRow();

            System.out.println("After update");
            System.out.println("id \tfName \tlName \temail \t\tphoneNo");
            resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t"
                        + resultSet.getString("firstName") + "\t"
                        + resultSet.getString("lastName") + "\t"
                        + resultSet.getString("email") + "\t"
                        + resultSet.getString("phoneNo"));
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
            System.exit(-1);
        }
    }
}
