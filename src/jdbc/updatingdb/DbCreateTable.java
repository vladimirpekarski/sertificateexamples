package jdbc.updatingdb;

import jdbc.quering.Dbconnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCreateTable {
    public static void main(String[] args) {
        try (Connection connection = Dbconnector.connectToDb();
            Statement statement = connection.createStatement()) {

            int result = statement.executeUpdate("CREATE TABLE familyGroup (id INT NOT NULL auto_increment," +
                    " nickName VARCHAR (30) NOT NULL, PRIMARY KEY (id))");
            System.out.println("Table created successfully");

        } catch (SQLException sql) {
            sql.printStackTrace();
        }
    }
}
