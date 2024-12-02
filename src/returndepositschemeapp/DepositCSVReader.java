/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import returndepositschemeapp.Deposit;

/**
 *
 * @author Seamus90
 * // class that reads data from the csv and store in ArrayList
 */
public class DepositCSVReader {

   private static final String FILE_PATH = "src/returndepositschemeapp/records/deposits.csv";


    // method to read all deposits from the CSV file
    public ArrayList<Deposit> readAllDeposits() {
        ArrayList<Deposit> deposits = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(FILE_PATH));
            while (scanner.hasNextLine()) {
                String depositRow = scanner.nextLine(); // reads in next line
                String[] depositData = depositRow.split(","); // splits row into seperate data based on commas

                // parse the deposit data
                int depositID = Integer.parseInt(depositData[0]);
                int customerID = Integer.parseInt(depositData[1]);
                LocalDate date = LocalDate.parse(depositData[2]);
                int numLargeBottles = Integer.parseInt(depositData[3]);
                int numSmallBottles = Integer.parseInt(depositData[4]);
                double depositValue = Double.parseDouble(depositData[5]);

                // create deposit object and add it to the list
                Deposit deposit = new Deposit(depositID, customerID, numLargeBottles, numSmallBottles);
                deposits.add(deposit);
            }
            scanner.close();
        } catch (IOException exception) {
            System.err.println("Error reading in deposits");
        }

        return deposits;
    }
    
    // method to read a selected user's deposits from the CSV
// method to read a selected user's deposits from the CSV
public ArrayList<Deposit> readUserDeposits(int currentUserID) {
    ArrayList<Deposit> userDeposits = new ArrayList<>();  // stores user's deposits

    try {
        Scanner scanner = new Scanner(new File(FILE_PATH));
        while (scanner.hasNextLine()) {
            String depositRow = scanner.nextLine(); 
            String[] depositData = depositRow.split(","); 

            // Parse deposit data
            int depositID = Integer.parseInt(depositData[0]);
            int userID = Integer.parseInt(depositData[1]);
            LocalDate date = LocalDate.parse(depositData[2]);
            int numLargeBottles = Integer.parseInt(depositData[3]);
            int numSmallBottles = Integer.parseInt(depositData[4]);
            double depositValue = Double.parseDouble(depositData[5]);

            // Create Deposit object and add to the list
            if (currentUserID == userID) {
                Deposit deposit = new Deposit(depositID, userID, numLargeBottles, numSmallBottles);
                userDeposits.add(deposit);
            }
        }
        scanner.close();
    } catch (IOException exception) {
        System.err.println("Error reading deposits");
    }

    return userDeposits;
}

}