/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCA.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ankitjain
 */
public class DBConnection {
    //final static String DB_URL="jdbc:oracle:thin:@OracleDB2_high?TNS_ADMIN=/Users/Neel_Esh/Downloads/Wallet_OracleDB2";
    final static String DB_URL="jdbc:oracle:thin:@OracleDB2_high?TNS_ADMIN=/Users/Oracle_Files/Wallet_OracleDB2";
    //neelesh
   final static String DB_USER_NAME="sca";
   final static String DB_PASS="Ankitjain1995";
   private static Connection conn=null;
   
   

    public static Connection getConnection() {
        return conn;
    }

    public static void setConnection(Connection conn) {
        DBConnection.conn = conn;
    }
   static 
   {
       try
       {
           Class.forName("oracle.jdbc.OracleDriver");
           conn=DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PASS);
           System.out.println("Connect Open succesfully");
       }
       catch(SQLException ex)
       {
           ex.printStackTrace();
           System.out.println("Error in DBConnection :- ");
       }
       catch(ClassNotFoundException ex)
       {
           ex.printStackTrace();
           System.out.println("Error in DBConnection :- ");
       }
   }
   
   public static void closeConnection()
    {
        if (conn!=null)
        {

            try
            {
                conn.close();
                System.out.println("conn close successfully");
            }
            catch (SQLException e)
            {
                e.printStackTrace();

            }
        }
    }
   
}

class test{
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
    }
}