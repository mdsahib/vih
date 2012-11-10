/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBeans;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Home
 */
public class Layout implements Serializable {

    private PropertyChangeSupport propertySupport;
    private String output;
    private String webappName;
    

    /**
     * Get the value of output
     *
     * @return the value of output
     */
    public String getOutput() {
        return output;
    }

    /**
     * Set the value of output
     *
     * @param output new value of output
     */
    public void setOutput(String output) {
        this.output = output;
    }



    /**
     * @return the webappName
     */
    public String getWebappName() {
        return webappName;
    }

    /**
     * @param webappName the webappName to set
     */
    public void setWebappName(String webappName) {
        this.webappName = webappName;
    }
}
