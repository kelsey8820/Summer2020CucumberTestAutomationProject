package Day2;

import java.sql.*;

public class DisplayingAllDataFromAllColumns {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@34.207.107.126:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection conn = DriverManager.getConnection(connectionStr, username, password);

        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmnt.executeQuery("SELECT * FROM EMPLOYEES");

        // print out the entire first row of Emoloyee table from above query
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // print out column name in the begining row, then print first row
        for (int colNum = 1; colNum <= columnCount; colNum++) {
            System.out.print(rsmd.getColumnLabel(colNum) + "\t");
        }
        System.out.println("---------------------------------------");
        rs.next();

        for (int colNum = 1; colNum <= columnCount; colNum++) {
            System.out.print(rs.getString(colNum) + "\t");

        }
        // now how do you get all the rows if you know how to get one row
        // I want to go from the first row until the last row and print all columns

        rs.beforeFirst();
        while (rs.next()) {
            for (int colNum = 1; colNum <= columnCount; colNum++) {
                System.out.print(rs.getString(colNum) + "\t");
            }
            System.out.println();
        }
        rs.close();
        stmnt.close();
        conn.close();
    }
}
