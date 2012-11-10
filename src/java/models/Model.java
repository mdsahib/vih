package models;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


public class Model {
    
    protected Connection conn = null;
    protected Statement stmt = null;
    protected InitialContext initCtx;
    protected Context ctx = null;
    protected DataSource ds = null;
    protected HttpServletResponse response;

    public Model() throws Exception {
        
        /*
         * Create a JNDI Initial context to be able to
         *  lookup  the DataSource
         */
        
        initCtx = new InitialContext();

         /*
          * Lookup the DataSource, which will be backed by a pool
          * that the application server provides.
          */
        
        ctx = (Context) initCtx.lookup("java:comp/env");

        ds =(DataSource)ctx.lookup("vih");
        
        conn = null;
        

        try {
            
            conn = ds.getConnection();
            
        } 
        catch (SQLException ex ) {ex.printStackTrace() ; }
        finally {
            
        }//end of finally
    
    }//end of doSomething
    
    
   
    
    
    public void close () {
        
        try {
            stmt.close();
            stmt = null;

            conn.close();
            conn = null;
        } catch (SQLException ex) {
            
        } finally {
            /*
             * close any jdbc instances here that weren't
             * explicitly closed during normal code path, so
             * that we don't 'leak' resources...
             */

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlex) {
                    // ignore, as we can't do anything about it here
                }

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlex) {
                    // ignore, as we can't do anything about it here
                }

                conn = null;
            }
        }//end of finally
        
    }//end of close
    
}//end of class