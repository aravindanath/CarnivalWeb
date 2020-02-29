package DB_Connections;

import java.sql.*;

public class DataBaseConnections {



    public static void main(String arg []) throws SQLException {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // URL, USERNAME,PAssword
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoBD", "root", "admin123");
            Statement stmt = con.createStatement();
            int random = (int) (Math.random() * 9999);
            System.out.println(random);

            String sql = "INSERT INTO Employee  VALUES (" + random
                    + ", 'jyothi', 'reddy', 'Hubli','Bangalore','java Fulstack');";

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
