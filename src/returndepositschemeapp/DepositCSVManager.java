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
 * @author Seamus Mc Menamy
 * class that manages csv interaction with app, it reads and writes to and from csv
 * handles delete, additions and updates to file
 */
public class DepositCsvManager {
    // path to csv
    private static final String FILE_PATH = "src/returndepositschemeapp/records/deposits.csv";


    // method to read all deposits from the CSV file
    public ArrayList<Deposit> readAllDeposits() {
        // stores deposits
        ArrayList<Deposit> deposits = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(FILE_PATH));
            // go through file line by line
            while (scanner.hasNextLine()) {
                String depositRow = scanner.nextLine(); // reads in next line
                String[] depositData = depositRow.split(","); // splits row into seperate data based on commas

                // set the split items to their corrispondint deposit class attributes
                int depositId = Integer.parseInt(depositData[0]);
                String userEmail = depositData[1];
                LocalDate date = LocalDate.parse(depositData[2]);
                int numLargeBottles = Integer.parseInt(depositData[3]);
                int numSmallBottles = Integer.parseInt(depositData[4]);
                double depositValue = Double.parseDouble(depositData[5]);

                // create deposit object and add it to the list
                Deposit deposit = new Deposit(depositId, userEmail, date, numLargeBottles, numSmallBottles);
                deposits.add(deposit);
            }
            scanner.close();
        } catch (IOException exception) {
            System.err.println("Error reading in deposits");
        }

        return deposits;
    }
    
    
    // method to read a selected users deposits from a file
    public ArrayList<Deposit> readUserDeposits(String currentUserEmail) {
        ArrayList<Deposit> userDeposits = new ArrayList<>();  // stores users deposits

        try {
            // open csv to read file
            Scanner scanner = new Scanner(new File(FILE_PATH));
            // go through file line by line
            while (scanner.hasNextLine()) {
                String depositRow = scanner.nextLine(); 
                String[] depositData = depositRow.split(","); 

                // set the split items to their corrispondint deposit class attributes
                int depositId = Integer.parseInt(depositData[0]);
                String userEmail = depositData[1];
                LocalDate date = LocalDate.parse(depositData[2]);
                int numLargeBottles = Integer.parseInt(depositData[3]);
                int numSmallBottles = Integer.parseInt(depositData[4]);
                double depositValue = Double.parseDouble(depositData[5]);

                // check if a row belongs to a specific users email, if it does, add deposit to the list
                if (currentUserEmail.equals(userEmail) ) {
                    Deposit deposit = new Deposit(depositId, userEmail, date, numLargeBottles, numSmallBottles);
                    userDeposits.add(deposit);
                }
            }
            scanner.close();
        } catch (IOException exception) {
            System.err.println("Error reading deposits");
        }

        return userDeposits;
    }
    
    // method to add deposit to csv 
    public void addDepositCsv(Deposit deposit) {
        try {
            File depositCsvFile = new File(FILE_PATH);
            FileWriter fileWriter = new FileWriter(depositCsvFile, true);
            
            // creates row representing a single deposit
            StringBuilder depositRow = new StringBuilder();
            depositRow.append(deposit.getDepositId()).append(","); 
            depositRow.append(deposit.getUserEmail()).append(","); 
            depositRow.append(deposit.getDepositDate()).append(",");
            depositRow.append(deposit.getNumLargeBottles()).append(",");
            depositRow.append(deposit.getNumSmallBottles()).append(",");
            depositRow.append(deposit.getDepositValue());
            depositRow.append("\n");  // adds a new line
            
            // write the row to the deposit csv
            fileWriter.write(depositRow.toString()); 
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Error writing to CSV file:");
        }
    }
    
    // loops through csv and updates the row that has to be changed
    public void updateDepositCsv(Deposit updatedDeposit) {
        try {
            File depositCsvFile = new File(FILE_PATH);
            Scanner scanner = new Scanner(depositCsvFile);
            StringBuilder updatedDeposits = new StringBuilder(); // stores the updated file content

            // read row by row and replace the updated row
            while (scanner.hasNextLine()) {
                String currentRow = scanner.nextLine();  // read current row
                String[] depositData = currentRow.split(",");  // split current row into deposit attributes
                int currentDepositId = Integer.parseInt(depositData[0]);  
                
                // if current deposit id in the csv matches the deposit id to be updated, add updated data and append to replace data
                if (currentDepositId == updatedDeposit.getDepositId()) {
                    StringBuilder updatedRow = new StringBuilder();
                    updatedRow.append(updatedDeposit.getDepositId()).append(",");
                    updatedRow.append(updatedDeposit.getUserEmail()).append(",");
                    updatedRow.append(updatedDeposit.getDepositDate()).append(",");
                    updatedRow.append(updatedDeposit.getNumLargeBottles()).append(",");
                    updatedRow.append(updatedDeposit.getNumSmallBottles()).append(",");
                    updatedRow.append(updatedDeposit.getDepositValue());
                    updatedDeposits.append(updatedRow).append("\n");
                } else {
                    // append  rows that dont need updating as normal
                    updatedDeposits.append(currentRow).append("\n");
                }
            }
            scanner.close();

            // write updated content back to file
            FileWriter fileWriter = new FileWriter(depositCsvFile); 
            fileWriter.write(updatedDeposits.toString());
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Error updating deposit in CSV file");
        }
    }
    
    // method to delete a deposit row from the csv
    public void deleteDepositCsv(int deleteDepositId) {
        try {
            File depositCsvFile = new File(FILE_PATH);
            Scanner scanner = new Scanner(depositCsvFile);
            StringBuilder updatedDeposits = new StringBuilder(); // stores the updated file content

            // read row by row and only append if id doesnt match
            while (scanner.hasNextLine()) {
                String currentRow = scanner.nextLine();
                String[] depositData = currentRow.split(",");
                int currentDepositId = Integer.parseInt(depositData[0]);  
                
                // only append a row if the depositId isnt the one to be deleted
                if (currentDepositId != deleteDepositId) {
                    updatedDeposits.append(currentRow).append("\n");
                } 
            }
            scanner.close();

            // write updated content back to file
            FileWriter fileWriter = new FileWriter(depositCsvFile); 
            fileWriter.write(updatedDeposits.toString());
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Error deleting deposit in CSV file");
        }
    }
}
