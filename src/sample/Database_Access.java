package sample;

import javafx.scene.control.Alert;

import java.sql.*;
import java.util.Scanner;

public class Database_Access extends Database_test{

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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
    /**
     *
     * @return
     */
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
    /**
     *
     * @return
     */
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
    /**
     *
     * @return
     */
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
    /**
     *
     * @return
     */
    public static void addToDataBase(String name, String activity){
        Connection conn = null;
        Statement stmt = null;
      //  Scanner scan = new Scanner(System.in);
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to the selected database...");
            conn = DriverManager.getConnection("jdbc:mysql://cleanearthsoftware.com:3306/4236paulgarlandclean_cims1",
                    "cims_user1",
                    "CSC4610-01");
            System.out.println("Connected database successfully...");

            stmt = conn.createStatement();
            String sql = " INSERT INTO Customers(name, isActive)" +
                    " VALUES (?,?)";


            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            System.out.println("What is the Customers ID?");
//            String entry0 = scan.nextLine();
          // preparedStatement.setString(1, entry0);
          //  System.out.println("What is the customers name?");

           // String entry1 = scan.nextLine();
            preparedStatement.setString(1, name);
       //     System.out.println("Is this customer active? 1 for yes, 0 for no");
          //  String entry2 = scan.nextLine();
            preparedStatement.setString(2, activity);
            preparedStatement.executeUpdate();
    //        System.out.println("You have successfully added " +  name + activity + "to the database!");

        } catch(Exception se){
            //Handle errors for JDBC
            se.printStackTrace();
        }//Handle errors for Class.forName
        finally{
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
        System.out.println("Goodbye!");

    }


    public static boolean removeFromDatabase(String name){
        Connection conn = null;
        Statement stmt = null;

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
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("");
            alert.setHeaderText("Are you sure you want to remove " + name + " from the data base??");
            alert.setContentText("Click the red X for yes, or yes for yes, or cancel for yes!");

            alert.showAndWait();
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();


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
        //DIALOGUE BOX
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("");
        alert.setHeaderText("Congratulations, " + name + "has been removed!!");
        alert.setContentText("i hope you're not looking for a refund!");

        alert.showAndWait();
        return true;
    }
}
