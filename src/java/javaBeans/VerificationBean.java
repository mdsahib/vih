/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBeans;

/**
 *
 * @author Home
 */
public class VerificationBean {
    
    private boolean driving =false;
    private boolean fitness =false;
    private boolean registration =false;
    private boolean roadPermit =false;
    private String trueVal= "Verified";
    private String falseVal= "Invalid";

    /**
     * @return the driving
     */
    public String getDriving() {
        if (driving)
            return trueVal;
        else return falseVal;
    }

    /**
     * @param driving the driving to set
     */
    public void setDriving(boolean driving) {
        this.driving = driving;
    }

    /**
     * @return the fitness
     */
    public String getFitness() {
        if (fitness)
            return trueVal;
        else return falseVal;
    }

    /**
     * @param fitness the fitness to set
     */
    public void setFitness(boolean fitness) {
        this.fitness = fitness;
    }

    /**
     * @return the registration
     */
    public String getRegistration() {
        if (registration)
            return trueVal;
        else return falseVal;
    }

    /**
     * @param registration the registration to set
     */
    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    /**
     * @return the roadPermit
     */
    public String getRoadPermit() {
        if (roadPermit)
            return trueVal;
        else return falseVal;
    }

    /**
     * @param roadPermit the roadPermit to set
     */
    public void setRoadPermit(boolean roadPermit) {
        this.roadPermit = roadPermit;
    }
    
}
