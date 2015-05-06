package jdbc.dbtransaction;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class DbQuery5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/addressBook";
        String userName = "root";
        String password = "";
        try {
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
            rowSet.setUrl(url);
            rowSet.setUsername(userName);
            rowSet.setPassword(password);
            rowSet.setCommand("SELECT * FROM contact");
            rowSet.execute();
            while (rowSet.next()) {
                System.out.println(rowSet.getInt("id") + "\t"
                + rowSet.getString("firstName") + "\t"
                + rowSet.getString("lastName") + "\t"
                + rowSet.getString("email") + "\t"
                + rowSet.getString("phoneNo"));
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
    }
}
