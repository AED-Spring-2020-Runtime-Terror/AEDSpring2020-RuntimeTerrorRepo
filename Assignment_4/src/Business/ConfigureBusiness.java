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

        AirlineDirectory airlineDirectory = new AirlineDirectory();

        Airliner airline = new Airliner();
        

        Fleet fleet = new Fleet();
        
        fleet.setId("F-01");
        fleet.setLocation("BOSTON-01");
        fleet.setPlanesOnFleet(15);

        airline.setFleet(fleet);
        airline.setAirlineName("United Airlines");

        FlightSchedule flightSchedule = new FlightSchedule();

        Flight flightForMaster = new Flight();
        Flight flightForMaster1 = new Flight();

        flightForMaster.setSeats(getSeatsForFlightInitially());

        flightForMaster.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(12, 10));

        flightForMaster.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(10, 10));

        flightForMaster.setDeparture("BOSTON");
        flightForMaster.setDestination("NEWARK");
        flightForMaster.setNumber("UA091");
        
        Fleet fleet1 = new Fleet();
        
        fleet1.setId("F-02");
        fleet1.setLocation("DUBAI-91");
        fleet1.setPlanesOnFleet(20);

        airline.setFleet(fleet1);
        airline.setAirlineName("United Emirates");

        flightForMaster1.setSeats(getSeatsForFlightInitially());

        flightForMaster1.setArrivalTime(LocalDate.of(2020, Month.MARCH, 19) + " " + LocalTime.of(11, 10));

        flightForMaster1.setDepartureTime(LocalDate.of(2020, Month.MARCH, 20) + " " + LocalTime.of(5, 10));
        flightForMaster1.setDeparture("NEW YORK");
        flightForMaster1.setDestination("DALLA");
        flightForMaster1.setNumber("UA897");
        
        flightForMaster1.setSeats(getSeatsForFlightInitially());

        flightForMaster1.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 26) + " " + LocalTime.of(23, 10));

        flightForMaster1.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 26) + " " + LocalTime.of(4, 10));
        flightForMaster1.setDeparture("DUBAI");
        flightForMaster1.setDestination("HYDERABAD");
        flightForMaster1.setNumber("UA786");

        List<Flight> forFSch = new ArrayList<>();

        List<Flight> forFSch1 = new ArrayList<>();

        forFSch.add(flightForMaster);
        forFSch.add(flightForMaster1);

        forFSch1.add(flightForMaster);
        forFSch1.add(flightForMaster1);

        flightSchedule.setFlights(forFSch);

        airline.setFlightSchedule(flightSchedule); 

        List<Airliner> ailines = new ArrayList<>();
        ailines.add(airline);
        airlineDirectory.setAirlines(ailines);
        airlineDirectory.setCreateDate(new Date());
        airlineDirectory.setUpdateDate(new Date()); 

        MasterSchedule masterSchedule = new MasterSchedule();
        masterSchedule.setFlights(forFSch1);

        CustomerDirectory customerDirectory = new CustomerDirectory();

        Customer customer = new Customer();
        customer.setAge(26);
        customer.setEmailId("dhamangaonkar.s@husky.neu.edu");
        customer.setGender(Gender.FEMALE);
        customer.setMobileNumber("9386353822"); 
        customer.setName("Srushti");

        List<Customer> custs = new ArrayList<>();
        custs.add(customer);

        Ticket ticket = new Ticket();
        ticket.setBookingDate(LocalDate.now() + " " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
        ticket.setPnr(getSaltString());
        ticket.setSeatNumber("2-F");

        List<Ticket> tkts = new ArrayList<>();
        tkts.add(ticket);

        Flight fTicket = new Flight();
        fTicket.setSeats(null);
        fTicket.setArrivalTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(10, 10));
        fTicket.setDeparture(flightForMaster.getDeparture());
        fTicket.setDestination(flightForMaster.getDestination());
        fTicket.setNumber(flightForMaster.getNumber());

        fTicket.setDepartureTime(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(12, 10));

        customer.setTickets(tkts);

        customerDirectory.setCustomers(custs);

        travelAgency.setAirlineDirectory(airlineDirectory);
        travelAgency.setCustomerDirectory(customerDirectory);
        travelAgency.setMasterSchedule(masterSchedule);

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
        TravelAgency t = configure();
        System.out.println(LocalDate.of(2020, Month.FEBRUARY, 22) + " " + LocalTime.of(22, 10));
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