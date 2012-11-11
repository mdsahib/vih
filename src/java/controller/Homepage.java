/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaBeans.VerificationBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.*;
import utilities.BufferedHttpResponseWrapper;
import javaBeans.VerificationBean;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Home
 */
public class Homepage extends Authenticate {
    
    public VerificationBean verificationBean = new VerificationBean();

   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              try {
            HttpSession session = request.getSession();
            
            if (session.getAttribute("loggedin") == null){ 
               response.sendRedirect( request.getContextPath()+"/Login");
               return;
            }
               
      
               
           // }
        } catch (Exception ex) {response.getWriter().println(ex.toString());};
        response.setContentType("text/html;charset=UTF-8");
        BufferedHttpResponseWrapper wrapper = new BufferedHttpResponseWrapper(response);
        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Homepage.jsp");
            dispatcher.include(request, wrapper);
            String output = wrapper.getOutput();
            sendResponse(output, request, response);

        } finally {            
            
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            ServletContext context = getServletContext();
        
       try {
            HttpSession session = request.getSession();
            
            if (session.getAttribute("loggedin") == null){ 
               response.sendRedirect( request.getContextPath()+"/Login");
            }
        } catch (Exception ex) {};
        
        
        try {
            
            
            synchronized (this ) {
            
                boolean value;
                DrivingLisence drivingLisence = new DrivingLisence();
                value=drivingLisence.verifyID(request, response);
                verificationBean.setDriving(value);

                RegistrationPaper registrationPaper = new RegistrationPaper();
                value=registrationPaper.verifyID(request, response);
                verificationBean.setRegistration(value);

                FitnessPaper fitnessPaper = new FitnessPaper();
                value=fitnessPaper.verifyID(request, response);
                verificationBean.setFitness(value);


                RoadPermit roadPermit = new RoadPermit();
                value=roadPermit.verifyID(request, response);
                verificationBean.setRoadPermit(value);
                
                context.setAttribute("vb", verificationBean);
                
                doGet(request, response);
                
            }//end of synchronized block
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
