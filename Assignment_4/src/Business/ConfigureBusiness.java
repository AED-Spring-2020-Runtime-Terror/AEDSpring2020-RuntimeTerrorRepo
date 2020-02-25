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
import java.util.Calendar;
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

        Fleet fleet = new Fleet();
        
        fleet.setId("F-01");
        fleet.setLocation("Atlanta");
        fleet.setPlanesOnFleet(15);

        Airliner airline = new Airliner();
        
        airline.setFleet(fleet);
        airline.setAirlineName("Delta");

        Flight flightForMaster = new Flight();
        Flight flightForMaster1 = new Flight();
        Flight flightForMaster4 = new Flight();

        flightForMaster.setSeats(getSeatsForFlightInitially());
        flightForMaster.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(07, 45));
        flightForMaster.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(10, 10));
        flightForMaster.setDeparture("Boston");
        flightForMaster.setDestination("Newark");
        flightForMaster.setNumber("D091");
        
        flightForMaster1.setSeats(getSeatsForFlightInitially());
        flightForMaster1.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 23) + " " + LocalTime.of(14, 16));
        flightForMaster1.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 23) + " " + LocalTime.of(16, 00));
        flightForMaster1.setDeparture("Detroit");
        flightForMaster1.setDestination("Phoenix");
        flightForMaster1.setNumber("D077");
        
        flightForMaster4.setSeats(getSeatsForFlightInitially());
        flightForMaster4.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 24) + " " + LocalTime.of(6, 30));
        flightForMaster4.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 24) + " " + LocalTime.of(11, 00));
        flightForMaster4.setDeparture("Burlington");
        flightForMaster4.setDestination("Portland");
        flightForMaster4.setNumber("D054");
        
        Fleet fleet1 = new Fleet();
        
        Airliner airline1 = new Airliner();
        
        fleet1.setId("F-02");
        fleet1.setLocation("Long Island City");
        fleet1.setPlanesOnFleet(60);
        
        airline1.setAirlineName("JetBlue");
        airline1.setFleet(fleet1);
                        
        Flight flightForMaster2 = new Flight();
        Flight flightForMaster3 = new Flight();
        Flight flightForMaster5 = new Flight();
        
        flightForMaster2.setSeats(getSeatsForFlightInitially());
        flightForMaster2.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 24) + " " + LocalTime.of(9, 45));
        flightForMaster2.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 24) + " " + LocalTime.of(15, 50));
        flightForMaster2.setDeparture("Boston");
        flightForMaster2.setDestination("Richmond");
        flightForMaster2.setNumber("JB897");
        
        flightForMaster3.setSeats(getSeatsForFlightInitially());
        flightForMaster3.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 23) + " " + LocalTime.of(10, 10));
        flightForMaster3.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 23) + " " + LocalTime.of(16, 00));
        flightForMaster3.setDeparture("Boston");
        flightForMaster3.setDestination("Charlotte");
        flightForMaster3.setNumber("JB786");
        
        flightForMaster5.setSeats(getSeatsForFlightInitially());
        flightForMaster5.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 23) + " " + LocalTime.of(3, 10));
        flightForMaster5.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 23) + " " + LocalTime.of(7, 00));
        flightForMaster5.setDeparture("Detroit");
        flightForMaster5.setDestination("Seattle");
        flightForMaster5.setNumber("JB543");

        List<Flight> delta = new ArrayList<>();
        List<Flight> jetBlue = new ArrayList<>();
        List<Flight> master = new ArrayList<>();
        
        //Airliner Delta flights
        delta.add(flightForMaster);
        delta.add(flightForMaster1);
        delta.add(flightForMaster4);
        
        //Airliner JetBlue flights
        jetBlue.add(flightForMaster2);
        jetBlue.add(flightForMaster3);
        jetBlue.add(flightForMaster5);
        
        //master list
        master.add(flightForMaster2);
        master.add(flightForMaster3);
        master.add(flightForMaster5);
        master.add(flightForMaster);
        master.add(flightForMaster1);
        master.add(flightForMaster4);

        FlightSchedule flightSchedule = new FlightSchedule();
        FlightSchedule flightSchedule1 = new FlightSchedule();
        FlightSchedule flightSchedule2 = new FlightSchedule();
        
        flightSchedule.setFlights(delta);
        flightSchedule1.setFlights(jetBlue);
        flightSchedule2.setFlights(master);

        airline.setFlightSchedule(flightSchedule); 
//        airline.setFlightSchedule(flightSchedule1); 
//        airline1.setFlightSchedule(flightSchedule);
        airline1.setFlightSchedule(flightSchedule1);
        
        List<Airliner> airlines = new ArrayList<>();
        airlines.add(airline);
        airlines.add(airline1);
        
        AirlineDirectory airlineDirectory = new AirlineDirectory();
        
        airlineDirectory.setAirlines(airlines);
        airlineDirectory.setCreateDate(new Date());
        airlineDirectory.setUpdateDate(new Date()); 
        
        MasterSchedule masterSchedule = new MasterSchedule();
        masterSchedule.setFlights(delta);
        MasterSchedule masterSchedule1 = new MasterSchedule();
        masterSchedule1.setFlights(jetBlue);
        MasterSchedule masterSchedule2 = new MasterSchedule();
        masterSchedule2.setFlights(master);

//        CustomerDirectory customerDirectory = new CustomerDirectory();
//
//        Customer customer = new Customer();
//        customer.setAge(26);
//        customer.setEmailId("dhamangaonkar.s@husky.neu.edu");
//        customer.setGender(Gender.FEMALE);
//        customer.setMobileNumber("9386353822"); 
//        customer.setName("Srushti");
//
//        List<Customer> custs = new ArrayList<>();
//        custs.add(customer);
//
//        Ticket ticket = new Ticket();
//        ticket.setBookingDate(LocalDate.now() + " " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
//        ticket.setPnr(getSaltString());
//        ticket.setSeatNumber("2-F");
//
//        List<Ticket> tkts = new ArrayList<>();
//        tkts.add(ticket);
//
//        Flight fTicket = new Flight();
//        
//        fTicket.setSeats(null);
//        fTicket.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(10, 10));
//        fTicket.setDeparture(flightForMaster.getDeparture());
//        fTicket.setDestination(flightForMaster.getDestination());
//        fTicket.setNumber(flightForMaster.getNumber());
//        fTicket.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(12, 10));
//
//        customer.setTickets(tkts);
//
//        customerDirectory.setCustomers(custs);

        travelAgency.setAirlineDirectory(airlineDirectory);
//        travelAgency.setCustomerDirectory(customerDirectory);
        travelAgency.setMasterSchedule(masterSchedule);
        travelAgency.setMasterSchedule(masterSchedule1);
        travelAgency.setMasterSchedule(masterSchedule2);

        return travelAgency;
    }
    
    public void loadTable(){
        
    }

    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { 
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static List<Seat> getSeatsForFlightInitially() {

        List<Seat> allSeat = new ArrayList<>(150);

        int count = 150;

        String[] stringS = {"A", "B", "C", "D", "E", "F"};


        while (count > 0) {

            Seat seat = new Seat();
            seat.setIsAvailable(true);
            seat.setSeatType(SeatType.ECONOMY);
            allSeat.add(seat);
            count--;
        }


        List<String> seatNumbers = new ArrayList<>(150);
        for (int i = 1; i < 26; i++) {
            for (String str : stringS) {
                seatNumbers.add(i + "-" + str);
            }

        }
        int k = 0;
        for (Seat s : allSeat) {
            s.setSeatNumber(seatNumbers.get(k));
            k++;
        }
        return allSeat;
    }

    public static void main(String[] args) {
         configure();
       // System.out.println(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(22, 10));
    }

    static LocalTime getDate() {

        LocalDate localDate = LocalDate.of(2020, Month.FEBRUARY, 22);
        LocalTime localTime = LocalTime.of(22, 10);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 17);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return localTime;

    }

    public static boolean isNullOrEmpty(String s) {
        if (s.length() == 0 || s == null) {
            return true;
        }
        return false;
    }
}