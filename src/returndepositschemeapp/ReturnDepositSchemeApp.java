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
        //Initialising the Gui for DepositMachineLocatorGUI
        SwingUtilities.invokeLater(() -> {
            DepositMachineLocatorGUI gui = new DepositMachineLocatorGUI();
            gui.setVisible(true);
        });
      
    }
}