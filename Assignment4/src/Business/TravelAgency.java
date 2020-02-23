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
public class TravelAgency {
    
    private static TravelAgency travelAgency;

    public static TravelAgency getInstance(){
        if (travelAgency == null){
            travelAgency = new TravelAgency();
        }
        return travelAgency;
    }
    
    private AirlinerDirectory airlinerDirectory;
    
    public TravelAgency() {
       
        airlinerDirectory = new AirlinerDirectory();
        
    }

    public AirlinerDirectory getAirlineDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlineDirectory) {
        this.airlinerDirectory = airlineDirectory;
    }

    @Override
    public String toString() {
        return "TravelAgency{" + ", airlineDirectory=" + airlinerDirectory + '}';
    }

    public Airliner addAirline() {

        Airliner airliner = new Airliner();
        Fleet f = new Fleet();
        airliner.setFleet(f);
        airlinerDirectory.getAirliners().add(airliner);
        return airliner;
    } 
    
    
}
