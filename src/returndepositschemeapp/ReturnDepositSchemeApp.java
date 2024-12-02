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
 * @author dbrod
 */
public class ReturnDepositSchemeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD

        // Call method to load users when app starts
        UserManager.loadUsersFromCSV();

        // Initialize CSV file for users
        AppInitializer.initializeCSV(); 

        //Initialising the Gui for DepositMachineLocatorGUI
=======
        //Creating an instance of FindClosestMachine class
        FindClosestMachine machineFinder = new FindClosestMachine();
        
        //Executing initializeLocations method in the instance machineFinder
        machineFinder.initializeLocations();
        
        //Initialising the Gui
>>>>>>> ffddd85f86d249873209cfb61a844dfe8d0544b0
        SwingUtilities.invokeLater(() -> {
            //Initialiasing Welcome Gui
            Welcome gui = new Welcome();
<<<<<<< HEAD
            gui.setVisible(true);
        });
        System.out.print("");
=======
            //Setting it visible
            gui.setVisible(false);
            
            //Initialising dmlg and passing through machineFinderInstance
            DepositMachineLocatorGUI dmlg = new DepositMachineLocatorGUI(machineFinder);
            dmlg.setVisible(true);
            
            //Initialising dm and passing through machineFinderInstance
            DepositMachines dm = new DepositMachines(machineFinder);
            dm.setVisible(false);
        });  
>>>>>>> ffddd85f86d249873209cfb61a844dfe8d0544b0
    }
}