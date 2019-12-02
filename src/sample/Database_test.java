package sample;

import java.sql.*;
import java.util.Scanner;


public class Database_test {
    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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


    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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
    /**
     *
     * @return
     */
    public static boolean UsersTest() {
        String infop=" ";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Users");
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



    /**
     *
     * @return
     */
    public static void addToDataBase() {
        Connection conn = null;
        Statement stmt = null;
        Scanner scan = new Scanner(System.in);
        try {

            Class.forName("com.mysql.jdbc.Driver");


            System.out.println("Connecting to the selected database...");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            System.out.println("Connected database successfully...");

            stmt = conn.createStatement();
            String sql = " INSERT INTO Customers(ID, name, isActive)" +
                    " VALUES (?,?,?)";


            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            System.out.println("What is the Customers ID?");
            String entry0 = scan.nextLine();
            preparedStatement.setString(1, entry0);
            System.out.println("What is the customers name?");
            String entry1 = scan.nextLine();
            preparedStatement.setString(2, entry1);
            System.out.println("Is this customer active? 1 for yes, 0 for no");
            String entry2 = scan.nextLine();
            preparedStatement.setString(3, entry2);
            preparedStatement.executeUpdate();
            System.out.println("You have successfully added " + entry0 + entry1 + entry2 + "to the database!");


        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try

    }

    /**
     *
     * @return
     */
    public static void removeFromDatabase(){
        Connection conn = null;
        Statement stmt = null;
        Scanner scan = new Scanner(System.in);
        try{

            Class.forName("com.mysql.jdbc.Driver");


            System.out.println("Connecting to the selected database...");
            conn = DriverManager.getConnection(
            "jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            System.out.println("Connected database successfully...");

            stmt = conn.createStatement();
            String sql = " DELETE FROM Customers where name = ?";


            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            System.out.println("What is the Customers name?");
            String entry0 = scan.nextLine();
            preparedStatement.setString(1, entry0);
            preparedStatement.executeUpdate();
            System.out.println("You have successfully removed " + entry0 +  "from the database!");

        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
    }
}




