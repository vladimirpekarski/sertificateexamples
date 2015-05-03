package jdbc.quering;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQuery {
    public static void main(String[] args) {
        try (Connection connection = Dbconnector.connectToDb();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")) {
            System.out.println("ID \tfName \tlName \temail \t\tphoneNo");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t"
                + resultSet.getString("firstName") + "\t"
                + resultSet.getString("lastName") + "\t"
                + resultSet.getString("email") + "\t"
                +resultSet.getString("phoneNo"));
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
