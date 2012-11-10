package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RoadPermit extends Model{
    
    public RoadPermit () throws Exception{
        
        super ();
        
        
    }

    public boolean verifyID (HttpServletRequest request , HttpServletResponse response) {
        try {
            

            
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("SELECT * FROM road_permits WHERE id=?");
            stmt.setString(1,request.getParameter("permit_id"));
            
            
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
    
    
    
    
}