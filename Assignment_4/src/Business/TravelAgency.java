/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author srush
 */
public class TravelAgency {

    private AirlineDirectory airlinerDirectory;

    public AirlineDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlineDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public Airliner addAirline() {

        Airliner airline = new Airliner();
        Fleet f = new Fleet();
        airline.setFleet(f);
        airlinerDirectory.getAirlines().add(airline);
        return airline;
    }
}
