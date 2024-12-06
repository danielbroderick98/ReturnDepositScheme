/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Seamus90
 * this class will get the current id from text file, and then overwrite it with the next id
 */
public class DepositIdManager {
    // file path
    private static final String DEPOSIT_ID_FILE_PATH = "src/returndepositschemeapp/records/depositID.txt";
    
    // method to get the current id from csv file
    public static int getDepositId() {
        int currentID = 0;  // holds current id
        int nextID;  // hold next id
        try {
            Scanner scanner = new Scanner(new File(DEPOSIT_ID_FILE_PATH));
            if (scanner.hasNextLine()) {
                currentID = Integer.parseInt(scanner.nextLine());  // read id in from text file
                scanner.close();
            }
        } catch (IOException exception) {
            System.err.println("Error loading the deposit id from text file");
        }
        
        
        // increment id and save to text file
        nextID = currentID+=1;
        // save nextID to file
        saveDepositId(nextID);
        // return the id
        return currentID;
    }
    
    // method to save the next id to the csv file
    public static void saveDepositId(int nextID) {
        try {
            File idTextFile = new File(DEPOSIT_ID_FILE_PATH);
            FileWriter fileWriter = new FileWriter(idTextFile, false);  // will overwite existing id
            // save new deposit id to text file
            fileWriter.write(String.valueOf(nextID));
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Error writing to text file:");
        }
        
    }
    
}
