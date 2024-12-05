/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package returndepositschemeapp;
//Importing Java Swing
import javax.swing.*;
//Importing File handler
import java.io.*;

/**
 *
 * @author danielbroderick, darrenwalsh & seamusmcmenamy
 */
public class ReturnDepositSchemeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Call method to load users when app starts
        UserManager.loadUsersFromCSV();

        // Initialize CSV file for users
        AppInitializer.initializeCSV(); 

        //Creating an instance of DepositLocationManager class
        DepositLocationManager machineFinder = new DepositLocationManager();
        
        //Executing initializeLocations method in the instance machineFinder
        machineFinder.initializeLocations();
        
        //Allowing all gui classes to access DepositLocationManager
        DepositLocationManager.getInstanceFCM().initializeLocations();
        
        //Initialising the Gui
        SwingUtilities.invokeLater(() -> {
<<<<<<< HEAD
            //Initialiasing WelcomeGUI Gui
            WelcomeGUI gui = new WelcomeGUI();
=======
            //Initialiasing Welcome Gui
            Welcome gui = new Welcome();
            gui.setVisible(true);
            
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61
            //Initialising dmlg and passing through machineFinderInstance
            DepositMachineLocatorGUI dmlg = new DepositMachineLocatorGUI(machineFinder);
            dmlg.setVisible(false);
            
            //Initialising dm and passing through machineFinderInstance
            DepositMachineLocationsGUI dm = new DepositMachineLocationsGUI(machineFinder);
            dm.setVisible(false);

            //Initialising home and passing through machineFinderInstance
            Homepage home = new Homepage();
            home.setVisible(false);
        });
        System.out.print("");
            
 
    }
}