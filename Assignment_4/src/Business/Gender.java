/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author bobba
 */
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE"),
    OTHER("OTHER");

    private String genderValue;

    public String getAction() {
        return this.genderValue;
    }

    private Gender(String gendeString) {
        this.genderValue = gendeString;
    }

}
