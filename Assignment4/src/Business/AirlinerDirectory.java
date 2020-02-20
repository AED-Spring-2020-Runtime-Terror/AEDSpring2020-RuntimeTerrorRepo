/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nived
 */
public class AirlinerDirectory {

    private List<Airliner> airliners;

    public List<Airliner> getAirliners() {
        return airliners;
    }

    public void setAirliners(List<Airliner> airliners) {
        this.airliners = airliners;
    }
    
    @Override
    public String toString() {
        return "AirlineDirectory{" + "airlines=" + airliners + '}';
    }
    
    
    public Airliner addAirline(){
        Airliner airline = new Airliner();
        Fleet fleet = new Fleet();
        airline.setFleet(fleet);
        airliners.add(airline);
        return airline;
    }
}
