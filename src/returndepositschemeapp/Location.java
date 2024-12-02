/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;

/**
 *
 * @author dbrod
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
    
    //***-Start of Getters & Setters-***
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

    // Setters
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }
    //***-End of Getters & Setters-***
}
