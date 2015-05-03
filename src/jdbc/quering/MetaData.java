package jdbc.quering;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaData {
    public static void main(String[] args) {
        try (Connection connection = Dbconnector.connectToDb();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")) {
            int numOfColumn = resultSet.getMetaData().getColumnCount();

            System.out.println("Number of Column: " + numOfColumn);

            while (resultSet.next()) {
                for (int i = 1; i <= numOfColumn; i++) {
                    System.out.print(resultSet.getObject(i) + "\t");
                }

                System.out.println("");
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
