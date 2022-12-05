package com.senac.banco;

import java.sql.*;

/**
 *
 * @author cassioatrindade
 */
public class MySQLConection {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/senac", "root", "senha");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Cliente");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) );
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
