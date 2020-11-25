package Day2;

import java.sql.*;

public class Review {

    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@34.207.107.126:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;

        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM JOBS") ;

        // I want to read the first row
        rs.next();
        System.out.println("First column value in Jobs " + rs.getString(1));
        System.out.println("Second column value in Jobs " + rs.getString(2));

        // move to row number 7 and get above 2 columns values
        rs.absolute(7);
        System.out.println("First column value in row 7 " + rs.getString(1));
        System.out.println("Second column value in row 7 " + rs.getString(2));

        rs.last();
        System.out.println("First column value in Jobs in last row  " + rs.getString(1));
        System.out.println("Second column value in Jobs in last row  " + rs.getString(2));

        rs.previous();
        System.out.println("First column value in Jobs in 2nd row from last " + rs.getString(1));
        System.out.println("Second column value in Jobs in 2nd row from last " + rs.getString(2));

        System.out.println(" -------- Loop from top to bottom print JOB_ID -------- ");

        rs.beforeFirst();

        while( rs.next()){
            System.out.println("Loop first column "+ rs.getString("JOB_ID"));


        }

        System.out.println("----Loop from last row until first row get MIN_SALARY column as number----");
        // We are currently at after last location
        // if you really want to maje sure and explicitly say so
        // we can do below

        rs.afterLast();
        while(rs.previous()) {
            // nothing wrong with getting it as string, just for the sake of demo we are getting it as a double
            System.out.println(" Min salary column as number $" + rs.getDouble("MIN_SALARY"));

        }

        // clean up the connection, statement and resultSet object after usage
        rs.close();
        stmnt.close();
        conn.close();










    }
}
