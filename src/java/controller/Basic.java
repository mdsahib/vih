/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaBeans.Layout;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
@WebServlet(name = "Basic", urlPatterns = {"/Basic"})
public class Basic extends HttpServlet {
    
    public Layout layoutBean  = new Layout();
    
    /**
     * Combine the response 
     * Set the output of dynamic content in the static layout
     * 
     * @param output String to output in the layout
     */
    protected void sendResponse (String output , HttpServletRequest request, HttpServletResponse response) {
        ServletContext context = getServletContext();
        synchronized (this){
            layoutBean.setOutput(output);
            layoutBean.setWebappName(request.getContextPath());
            context.setAttribute("layoutBean", layoutBean);
            RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/views/layouts/login_layout.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(Basic.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Basic.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//end of setResponse
    
}//end of Basic Class
