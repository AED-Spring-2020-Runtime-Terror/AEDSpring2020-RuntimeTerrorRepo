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
public class ConfigureBusiness {

    public static TravelAgency configure() {
        return null;

    }

    public static boolean isNullOrEmpty(String s) {

        if (s.length() == 0 || s == null) {
            return true;
        }
        return false;
    }

}