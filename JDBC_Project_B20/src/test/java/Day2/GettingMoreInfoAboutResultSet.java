package Day2;

import java.sql.*;

public class GettingMoreInfoAboutResultSet {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@34.207.107.126:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;

        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM EMPLOYEES") ;

        // metadata is a date about the data
        // ResultSetMetaData --> data about the ResultSet object that contain our resulting rows and columns
        // Example: column names, column count, and more....
        // This is how we get the ResultSetMetaData object:

        // ResultSetMetaData itself does not contain any raw data
        // it only has information about the columns
        ResultSetMetaData rsmd = rs.getMetaData();
        // we only need two methods from this to get column count and column name / label
         int colCount = rsmd.getColumnCount();
        System.out.println("colCount " + colCount);
        // this is how we get column label / name using index
        // get first column name
        System.out.println("First column name is " + rsmd.getColumnLabel(1));
        System.out.println("Second column name is " + rsmd.getColumnLabel(2));

        // now print out all the column names:

        for(int colNum = 1; colNum <= colCount; colNum++){
            System.out.println("Column name: " + rsmd.getColumnLabel(colCount));
        }
        rs.close();
        conn.close();
        stmnt.close();
    }


}

