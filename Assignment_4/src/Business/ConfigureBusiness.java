/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author srush
 */
public class ConfigureBusiness {

    public static TravelAgency configure() {
       TravelAgency travelAgency = TravelAgency.getInstance();
        
        AirlineDirectory airlineDirectory = new AirlineDirectory();
        
        Airliner airline = new Airliner();
        
        Fleet fleet = new Fleet();
        fleet.setId("F-01");
        fleet.setLocation("Boston-01");
        fleet.setPlanesOnFleet(15);
        
        airline.setFleet(fleet);
        airline.setAirlineName("United Airlines");
        
        FlightSchedule flightSchedule = new FlightSchedule();
        
        Flight flightForMaster = new Flight();
        Flight flightForMaster1 = new Flight();
 
        flightForMaster.setSeats(getSeatsForFlightInitially());

        
        flightForMaster.setArrivalTime(LocalDate.of(2019, Month.DECEMBER, 23) + " " + LocalTime.of(8, 10));
        
        flightForMaster.setDepartureTime(LocalDate.of(2019, Month.DECEMBER, 23) + " " + LocalTime.of(22, 10));

        flightForMaster.setDeparture("Logan Intl, Boston");
        flightForMaster.setDestination("NewYark Intl, Newark");
        flightForMaster.setNumber("US=091");
        
        flightForMaster1.setSeats(getSeatsForFlightInitially());
        
        flightForMaster1.setArrivalTime(LocalDate.of(2019, Month.NOVEMBER, 7) + " " + LocalTime.of(23, 10));
        
        flightForMaster1.setDepartureTime(LocalDate.of(2019, Month.NOVEMBER, 9) + " " + LocalTime.of(4, 10));
        flightForMaster1.setDeparture("Duabi Intl");
        flightForMaster1.setDestination("HydIntl, Hyd");
        flightForMaster1.setNumber("EMI-44");
        
        
        List<Flight> forFSch = new ArrayList<>();
        
        List<Flight> forFSch1 = new ArrayList<>();
        
        forFSch.add(flightForMaster);
        forFSch.add(flightForMaster1);
        
        forFSch1.add(flightForMaster);
        forFSch1.add(flightForMaster1);
        
       flightSchedule.setFlights(forFSch);
       
       
        airline.setFlightSchedule(flightSchedule); //Airline done
        
        List<Airliner> ailines = new ArrayList<>();
        ailines.add(airline);
        airlineDirectory.setAirlines(ailines);
        airlineDirectory.setCreateDate(new Date());
        airlineDirectory.setUpdateDate(new Date()); //airlineDirecriy done
        
        
        
        MasterSchedule masterSchedule = new MasterSchedule();
        masterSchedule.setFlights(forFSch1);
        
        
       CustomerDirectory customerDirectory= new CustomerDirectory();
        
        Customer customer = new Customer();
        customer.setAge(24);
        customer.setEmailId("bobba.r@husky.neu.edu");
        customer.setGender(Gender.MALE);
        customer.setMobileNumber("9440308998"); //need to check on mobile number as string
        customer.setName("Rahul Bobba");
        
        List<Customer> custs = new ArrayList<>();
        custs.add(customer);
        
        Ticket ticket = new Ticket();
        ticket.setBookingDate(LocalDate.now() + " " + LocalTime.now().getHour() + ":"+LocalTime.now().getMinute() );
        ticket.setPnr(getSaltString());
        ticket.setSeatNumber("2-F");
        
        List<Ticket> tkts = new ArrayList<>();
        tkts.add(ticket);
        
        Flight fTicket = new Flight();
        fTicket.setSeats(null);
        fTicket.setArrivalTime(LocalDate.of(2019, Month.DECEMBER, 23) + " " + LocalTime.of(8, 10));
        fTicket.setDeparture(flightForMaster.getDeparture());
        fTicket.setDestination(flightForMaster.getDestination());
        fTicket.setNumber(flightForMaster.getNumber());

        fTicket.setDepartureTime(LocalDate.of(2019, Month.DECEMBER, 23) + " " + LocalTime.of(22, 10));

               
        
        customer.setTickets(tkts);
        
        customerDirectory.setCustomers(custs);
        
        travelAgency.setAirlinerDirectory(airlineDirectory);
        travelAgency.setCustomerDirectory(customerDirectory);
        travelAgency.setMasterSchedule(masterSchedule);
        
        return travelAgency;

    }
    
    public static List<Seat> getSeatsForFlightInitially() {
        
        List<Seat> allSeat = new ArrayList<>(150);
        
        int count = 150;
        
        String[] stringS = {"A","B","C","D","E","F"};
        
        //Set seat ecoonomy and true
        while(count > 0){
            
            Seat seat = new Seat();
            seat.setIsAvailable(true);
            seat.setSeatType(SeatType.ECONOMY);
            allSeat.add(seat);
            count--;
        }
        
        //Prepare seat numebrs list
        List<String> seatNumbers = new ArrayList<>(150);
        for(int i=1; i<26; i++){
                for(String str : stringS){
                    seatNumbers.add(i+"-"+str);
                }
                    
        }
        int k=0;
        for(Seat s : allSeat){
            s.setSeatNumber(seatNumbers.get(k));
            k++;
        }
        return allSeat;
    }

    public static boolean isNullOrEmpty(String s) {

        if (s.length() == 0 || s == null) {
            return true;
        }
        return false;
    }

    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    } 
}
