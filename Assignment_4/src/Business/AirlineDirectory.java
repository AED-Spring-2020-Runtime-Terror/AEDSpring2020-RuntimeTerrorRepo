/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author srush
 */
public class AirlineDirectory {

    private List<Airliner> airlines;
     private Date createDate;
    private Date updateDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<Airliner> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airliner> airlines) {
        this.airlines = airlines;
    }
    
   
//    public Airliner addAirline(){
//     Airliner airline = new Airliner();
//     Fleet fleet = new Fleet();
//     airline.setFleet(fleet);
//     airlines.add(airline);
//     return airline;
//   }
}
