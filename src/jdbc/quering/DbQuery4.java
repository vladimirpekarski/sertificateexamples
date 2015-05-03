package jdbc.quering;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQuery4 {
    public static void main(String[] args) {
        try (Connection connection = Dbconnector.connectToDb();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT firstName," +
                        "email FROM contact WHERE firstName = \"Michael\"")) {

            System.out.println("fName \temail");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstName") + "\t"
                        + resultSet.getString("email"));
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
