/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Users;

/**
 *
 * @author Home
 */
@WebServlet(name = "Authenticate", urlPatterns = {"/Authenticate"})
public class Authenticate extends Basic {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            
            Users user = new Users ();
            
            if (user.verifyAuth(request,response)) {
                
                
            }else {
                
                super.service(request, response);
                //response.sendRedirect();
            }//end of else
        } catch (Exception ex) {
            
        }
        
        
    }//service
*/
    
}//end of Authenticate Class
