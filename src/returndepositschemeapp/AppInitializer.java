/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Darren
 */

public class AppInitializer {
  
        // Final name for my CSV file
  private static final String USER_FILE = "users.csv";

    // Method to initialize users.csv file if it doesn't exist
    public static void initializeCSV() {
        //Create object file
        File file = new File(USER_FILE);
        // Create file if doesn't exist
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                //Shows error if any error during creation
            } catch (IOException e) {
                System.out.println("Error initializing CSV file: " + e.getMessage());
            }
        }
    }
}
