

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package SCA.Dao;
import SCA.DbUtil.DBConnection;
import SCA.POJO.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aftab
 */
public class UserDao {
     public static String validateUser(User user) throws SQLException{
        Connection conn = DBConnection.getConnection();
        String qry = "Select user_name from Users where login_id=? and password=?";

        PreparedStatement ps=conn.prepareStatement(qry);
        System.out.println("Inside dao");
        System.out.println("Password-"+user.getPassword());
        System.out.println("UserId-"+user.getUserId());
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ResultSet rs=ps.executeQuery();
        String username =null;
        if(rs.next()){
            username=rs.getString(1);
            System.out.println("from user dao"+username);
        }
        return username;
    }
     
     
     public static boolean deleteUser(String userName) throws SQLException{
         Connection conn = DBConnection.getConnection();
        String qry = "delete from Users where user_name=?";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,userName);
        int rs=ps.executeUpdate();
        return rs != 0;
    }
    
}
