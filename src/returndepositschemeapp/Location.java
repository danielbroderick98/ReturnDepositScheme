/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;

/**
 *
 * @author danielbroderick
 */

//Location class is an Abstract class
public abstract class Location {
    //Variables
    double latitude;
    double longitude;
    String eircode;
    
    
    //Constructor
    Location(double latitude, double longitude, String eircode){
        this.latitude = latitude;
        this.longitude = longitude;
        this.eircode = eircode;
    }
    
    //***-Start of Getters-***
    // Getters
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getEircode() {
        return eircode;
    }

    //***-End of Getters-***
}
