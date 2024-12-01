/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package returndepositschemeapp;

import javax.swing.*;

/**
 *
 * @author dbrod
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

        //Initialising the Gui for DepositMachineLocatorGUI
        SwingUtilities.invokeLater(() -> {
            Welcome gui = new Welcome();
            gui.setVisible(true);
        });
        System.out.print("");
    }
}