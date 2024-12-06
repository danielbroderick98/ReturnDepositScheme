/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;

/**
 *
 * @author danielbroderick
 */

//UserLocation inherits from Location
public class UserLocation extends Location{
    //Constructor
    UserLocation(double latitude, double longitude, String eircode){
        //Calling the parent class constructor
        super(latitude, longitude, eircode);
    }
}
