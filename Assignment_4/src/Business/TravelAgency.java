/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;

/**
 *
 * @author srush
 */
public class TravelAgency {
    private static TravelAgency travelAgency;

    public static TravelAgency getInstance(){
        if (travelAgency == null){
            travelAgency = new TravelAgency();
        }
        return travelAgency;
    }
    
    
    private AirlineDirectory airlinerDirectory;
    private CustomerDirectory customerDirectory;
    private MasterSchedule masterSchedule;

    public MasterSchedule getMasterSchedule() {
        return masterSchedule;
    }

    public void setMasterSchedule(MasterSchedule masterSchedule) {
        this.masterSchedule = masterSchedule;
    }

    public TravelAgency() {
        airlinerDirectory = new AirlineDirectory();
         masterSchedule = new MasterSchedule();
    }
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

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
    
    public Flight searchFlightOnFlightNumber(String text) {
        
        Flight retFli = null;
        for(Flight f : travelAgency.getMasterSchedule().getFlights()){
            if(text.equalsIgnoreCase(f.getNumber())){
                retFli = f;
                break;
            }
        }
        return retFli;
    }
    
    public List<Flight> searchFlightOnArrLocation(String text) {
        List<Flight> retFli = null;
        for(Flight f : travelAgency.getMasterSchedule().getFlights()){
            if(text.equalsIgnoreCase(f.getDestination())){
                retFli.add(f);
            }
        }
        return retFli; //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Flight> searchFlightOnDepLocation(String text) {
        List<Flight> retFli = null;
        for(Flight f : travelAgency.getMasterSchedule().getFlights()){
            if(text.equalsIgnoreCase(f.getDeparture())){
                retFli.add(f);
            }
        }
        return retFli;//To change body of generated methods, choose Tools | Templates.
    }

    
     public Customer createNewCustomer() {            
        Customer cust = new Customer();
//        Ticket ti = new Ticket();
//        List<Ticket> tks = new ArrayList<>();
//        tks.add(ti);
//        cust.setTickets(tks);        
        this.getCustomerDirectory().getCustomers().add(cust);
        
        //Check whether custoer present earlier
        return cust;
    }
     
      public Customer searchCustomerByMail(String mailId) {
          Customer cust = null;
        for(Customer c : this.getCustomerDirectory().getCustomers()){
            if(c.getEmailId().equalsIgnoreCase(mailId)){
                cust = c;
               break;
            }
        }
        
        return cust;
    }
}
