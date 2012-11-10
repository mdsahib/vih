package models;

import java.io.IOException;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import java.lang.Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;


public class Users extends Model{
    
    public Users () throws Exception{
        
        super ();
        
        
    }

    public boolean verifyAuth (HttpServletRequest request , HttpServletResponse response) {
        try {
            
                /**
                 * @todo remove this code
                 */
               this.response=response;
            
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            stmt.setString(1,request.getParameter("username"));
            stmt.setString(2,request.getParameter("username"));
            
            ResultSet rs= stmt.executeQuery();
            
            if (rs.next())
            {
                return true;
            }
            else return false;
        } //end of verifyAuth
        
       /* catch (Exception ex) {
            try {
                response.getWriter().println(ex.toString());
            } catch (IOException ex1) {
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }*/
        catch (SQLException ex) {
            return false;
        }
        //return false;
    }//end of verifyAuth
    
    
    
    
}//end of class