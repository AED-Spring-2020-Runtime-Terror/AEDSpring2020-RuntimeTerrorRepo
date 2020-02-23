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
    }

    public Airliner addAirline() {

        Airliner airline = new Airliner();
        Fleet f = new Fleet();
        airline.setFleet(f);
        airlineDirectory.getAirlines().add(airline);
        return airline;
    }

    public Flight searchFlightOnFlightNumber(String text) {

        Flight flight = null;
        for (Flight f : travelAgency.getMasterSchedule().getFlights()) {
            if (text.equalsIgnoreCase(f.getNumber())) {
                flight = f;
                break;
            }
        }
        return flight;
    }

    public Flight addFlightInAirline(Airliner airline) {

        List<Airliner> flight = travelAgency.getAirlineDirectory().getAirlines();
        Flight newFlight = new Flight();
        for (Airliner a : flight) {

            if (a.getAirlineName().equalsIgnoreCase(airline.getAirlineName())) {

                if (a.getFlightSchedule() == null) {
                    List<Flight> fli = new ArrayList<>();
                    fli.add(newFlight);
                    FlightSchedule fs = new FlightSchedule();
                    fs.setFlights(fli);

                    a.setFlightSchedule(fs);

                } else {
                    a.getFlightSchedule().getFlights().add(newFlight);
                }

                break;
            } else {

            }
        }
        return newFlight;

    }

    public Customer createNewCustomer() {

        Customer cust = new Customer();
        travelAgency.getCustomerDirectory().getCustomers().add(cust);
        return cust;

    }

    public Customer searchCustomerByMail(String mailId) {
        Customer cust = null;
        for (Customer c : travelAgency.getCustomerDirectory().getCustomers()) {
            if (c.getEmailId().equalsIgnoreCase(mailId)) {
                cust = c;
                break;
            }
        }

        return cust;

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
}
