/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;

/**
 *
 * @author nived
 */
public class Airliner {
    
    private Fleet fleet;
    private String airlinerName;

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlineName) {
        this.airlinerName = airlineName;
    }
    
}
