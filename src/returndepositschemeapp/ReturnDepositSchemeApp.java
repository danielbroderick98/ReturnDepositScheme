/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package returndepositschemeapp;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
            Welcome gui = new Welcome();
            gui.setVisible(true);
        });
        System.out.print("");
    }
        
        

    public class AppInitializer {

        private static final String USER_FILE = "users.csv";

        public static void initializeCSV() {
            File file = new File(USER_FILE);
            if (!file.exists()) {
                try (FileWriter writer = new FileWriter(file)) {
                    // Write headers
                    writer.write("Name,Surname,Email,HomeAddress\n");
                } catch (IOException e) {
                    System.out.println("Error initializing CSV file: " + e.getMessage());
                }
            }
        }
    }
}
