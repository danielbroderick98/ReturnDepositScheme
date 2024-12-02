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
 * this class will keep track of deposit IDs
 */
public class DepositIDManager {
    private static final String DEPOSIT_ID_FILE_PATH = "src/returndepositschemeapp/records/depositID.txt";
    
    
    public static int getDepositID() {
        int currentID = 0;
        int nextID;
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
        saveDepositID(nextID);
        // return the id
        return currentID;
    }
    
    // methid to save the depositID to file
    public static void saveDepositID(int nextID) {
        try {
            File idTextFile = new File(DEPOSIT_ID_FILE_PATH);
            FileWriter fileWriter = new FileWriter(idTextFile, false);
            // save new deposit id to text file
            fileWriter.write(String.valueOf(nextID));
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Error writing to text file:");
        }
        
    }
    
}
