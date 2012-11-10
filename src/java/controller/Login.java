/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Model;
import models.Users;
import utilities.BufferedHttpResponseWrapper;

/**
 *
 * @author Home
 */
public class Login extends Basic {



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
        response.setContentType("text/html;charset=UTF-8");
        BufferedHttpResponseWrapper wrapper = new BufferedHttpResponseWrapper(response);
        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
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
        try {
            
            
            
                models.Users user = new models.Users ();
           
            response.getWriter().write("I will be verified");
            
            if (user.verifyAuth(request, response)) {
                response.getWriter().write("I will be verified");
                try {
                    user.close();
                }
                catch (Exception ex) {}
                
                response.sendRedirect(request.getContextPath()+"/Homepage");
            }
            else response.sendRedirect( request.getContextPath()+"/Login");
        } catch (Exception ex) {
            response.getWriter().write(ex.toString());
        }
      
        //sendResponse(null, request, response);
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
