package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_Access extends Database_test{

    public static String sign() {
        String infop = " ";
        if (Database_test.signTest()) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                        "cims_user1",
                        "CSC4610-01");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from signs");
                while (rs.next())
                    infop = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6)+" " + rs.getString(7)+" " + rs.getInt(8)+" " + rs.getInt(9)+" " + rs.getString(10)+" " + rs.getString(11);
                con.close();
                return infop;
            } catch (Exception e) {
                System.out.println(e);
            }
            return infop;
        }
        return infop;
    }
    public static String customer() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customer");
            while (rs.next())
                infop = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6);
            con.close();
            return infop;
        } catch (Exception e) {
            System.out.println(e);
        }
        return infop;
    }

    public static String categories() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from categories");
            while (rs.next())
                infop = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6);
            con.close();
            return infop;
        } catch (Exception e) {
            System.out.println(e);
        }
        return infop;
    }
    public static String statuses() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from statuses");
            while (rs.next())
                infop = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6);
            con.close();
            return infop;
        } catch (Exception e) {
            System.out.println(e);
        }
        return infop;
    }
    public static String reservations() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from reservations");
            while (rs.next())
                infop = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6);
            con.close();
            return infop;
        } catch (Exception e) {
            System.out.println(e);
        }
        return infop;
    }

    public static String languages() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from languages");
            while (rs.next())
                infop = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6);
            con.close();
            return infop;
        } catch (Exception e) {
            System.out.println(e);
        }
        return infop;
    }
}
