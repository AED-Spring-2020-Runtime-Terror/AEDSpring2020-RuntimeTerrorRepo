/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nived
 */
public class Fleet {
    
    private String fleetID;
    private String location;
    private int planesOnFleet;

    public String getFleetID() {
        return fleetID;
    }

    public void setFleetID(String fleetID) {
        this.fleetID = fleetID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPlanesOnFleet() {
        return planesOnFleet;
    }

    public void setPlanesOnFleet(int planesOnFleet) {
        this.planesOnFleet = planesOnFleet;
    }

    @Override
    public String toString() {
        return "Fleet{" + "fleetId=" + fleetID + ", location=" + location + ", planesOnFleet=" + planesOnFleet + '}';
    }
}
