package jdbc.updatingdb;

import jdbc.quering.Dbconnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDelete {
    public static void main(String[] args) {
        try (Connection connection = Dbconnector.connectToDb();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                     ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet1 = statement.executeQuery("SELECT * FROM contact WHERE firstName = \"John\"")) {

            if (resultSet1.next()) {
                resultSet1.deleteRow();
            }

            resultSet1.close();


            try (ResultSet resultSet2 = statement.executeQuery("SELECT * FROM contact")){
                System.out.println("After deletion");
                System.out.println("id \tfName \tlName \temail \t\tphoneNo");
                resultSet2.beforeFirst();
                while (resultSet2.next()) {
                    System.out.println(resultSet2.getInt("id") + "\t"
                            + resultSet2.getString("firstName") + "\t"
                            + resultSet2.getString("lastName") + "\t"
                            + resultSet2.getString("email") + "\t"
                            + resultSet2.getString("phoneNo"));
                }

            }

        } catch (SQLException sql) {
            sql.printStackTrace();
        }
    }
}
