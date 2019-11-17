package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Database_test {
    public static boolean signTest() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from signs");
            while (rs.next())
                infop = rs.getInt(1) + "  ";
            con.close();
            if (infop.isBlank()){
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }


    public static boolean customerTest() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customers");
            while (rs.next())
                infop = rs.getInt(1) + "  ";
            con.close();
            if (infop.isBlank()){
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
    public static boolean categoriesTest() {
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
                infop = rs.getInt(1) + "  ";
            con.close();
            if (infop.isBlank()){
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
    public static boolean languagesTest() {
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
                infop = rs.getInt(1) + "  ";
            con.close();
            if (infop.isBlank()){
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
    public static boolean statusesTest() {
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
                infop = rs.getInt(1) + "  ";
            con.close();
            if (infop.isBlank()){
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public static boolean reservationsTest() {
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
                infop = rs.getInt(1) + "  ";
            con.close();
            if (infop.isBlank()){
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }



}




