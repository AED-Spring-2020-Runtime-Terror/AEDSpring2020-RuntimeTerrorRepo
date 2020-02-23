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
 * @author srush
 */
public class TravelAgency {

    private static TravelAgency travelAgency;

    public static TravelAgency getInstance() {
        if (travelAgency == null) {
            travelAgency = new TravelAgency();
        }
        return travelAgency;
    }

    private CustomerDirectory customerDirectory;
    private AirlineDirectory airlineDirectory;
    private MasterSchedule masterSchedule;

    public TravelAgency() {
        customerDirectory = new CustomerDirectory();
        airlineDirectory = new AirlineDirectory();
        masterSchedule = new MasterSchedule();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public AirlineDirectory getAirlineDirectory() {
        return airlineDirectory;
    }

    public void setAirlineDirectory(AirlineDirectory airlineDirectory) {
        this.airlineDirectory = airlineDirectory;
    }

    public MasterSchedule getMasterSchedule() {
        return masterSchedule;
    }

    public void setMasterSchedule(MasterSchedule masterSchedule) {
        this.masterSchedule = masterSchedule;
    }

    @Override
    public String toString() {
        return "TravelAgency{" + "customerDirectory=" + customerDirectory + ", airlineDirectory=" + airlineDirectory + ", masterSchedule=" + masterSchedule + '}';

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
        airlineDirectory.getAirlines().add(airline);
        return airline;
    }

    public Flight searchFlightOnFlightNumber(String text) {

        Flight retFli = null;
        for (Flight f : travelAgency.getMasterSchedule().getFlights()) {
            if (text.equalsIgnoreCase(f.getNumber())) {
                retFli = f;
                break;
            }
        }
        return retFli;
    }

  


    public List<Flight> searchFlightOnDepLocation(String text) {
        List<Flight> listFlight = null;
        for (Flight f : travelAgency.getMasterSchedule().getFlights()) {
            if (text.equalsIgnoreCase(f.getDeparture())) {
                if (listFlight == null) {
                    listFlight = new ArrayList<>();
                }
                listFlight.add(f);

            }
        }
        return listFlight;
    }

    public List<Flight> searchFlightOnArrLocation(String text) {
        List<Flight> listFlight = null;
        for (Flight f : travelAgency.getMasterSchedule().getFlights()) {
            if (text.equalsIgnoreCase(f.getDestination())) {
                if (listFlight == null) {
                    listFlight = new ArrayList<>();
                }
                listFlight.add(f);
            }
        }
        return listFlight;
    }

        airlinerDirectory.getAirlines().add(airline);
        return airline;
    }

}
