/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;

/**
 *
 * @author danielbroderick
 */

//DepositLocation inherits from Location
public class DepositLocation extends Location {
    //Constructor
    DepositLocation(double latitude, double longitude, String eircode){
        //Calling the parent class constructor
        super(latitude, longitude, eircode);
    }
}
