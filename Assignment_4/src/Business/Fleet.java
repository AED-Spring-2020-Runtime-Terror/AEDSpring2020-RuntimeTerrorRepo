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
public class Fleet {

    private String id;
    private String location;
    private int planesOnFleet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Fleet{" + "id=" + id + ", location=" + location + ", planesOnFleet=" + planesOnFleet + '}';
    }

}
