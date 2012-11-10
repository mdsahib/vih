package models;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import java.lang.Exception;


public class Users extends Model{
    
    public Users () throws Exception{
        super ();
    }

    public boolean verifyAuth (HttpServletRequest request) {
        try {
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            stmt.setInt(1,Integer.parseInt(request.getParameter("username")));
            stmt.setString(2,request.getParameter("username"));
            ResultSet rs= stmt.executeQuery();
            if (rs.next())
            {
                return true;
            }
            else return false;
        } //end of verifyAuth
        
        catch (SQLException ex) {
            return false;
        }
        
    }//end of verifyAuth
    
    
    
    
}//end of class