package DB_Connections;


import utilities.Genaric;

import java.sql.*;

public class DataBaseConnections {

//https://www.javatpoint.com/example-to-connect-to-the-mysql-database

    public static void main(String arg []) throws SQLException {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // URL, USERNAME,PAssword

            con = DriverManager.getConnection(Genaric.getVal("dbUrl"), Genaric.getVal("dbUser"), Genaric.getVal("dbPassword"));
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO Employee  VALUES ('1211','Naina', 'sinicop', 'Hubli','Bangalore','java Fulstack');";

            stmt.executeUpdate(sql);

            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee ;");
            rs.next();
            while (rs.next())

                System.out.println(
                        rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(6));

        } catch (Exception e) {

        } finally {
            con.close();
        }







}


}
