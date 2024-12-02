/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.util.Scanner;
import java.io.*;
import returndepositschemeapp.Deposit;

/**
 *
 * @author Seamus90
 * class writes, updates, deletions and adds deposits to the csv
 */
public class DepositCSVWriter {
    // path to location of deposits csv
    private static final String FILE_PATH = "src/returndepositschemeapp/records/deposits.csv";
    
    // method to add a new deposit to the deposits csv file
    public void addDepositCSV(Deposit deposit) {
        try {
            File depositCsvFile = new File(FILE_PATH);
            FileWriter fileWriter = new FileWriter(depositCsvFile, true);
            
            // creates row representing a single deposit
            StringBuilder depositRow = new StringBuilder();
            depositRow.append(deposit.getDepositID()).append(","); 
            depositRow.append(deposit.getUserID()).append(","); 
            depositRow.append(deposit.getDepositDate()).append(",");
            depositRow.append(deposit.getNumLargeBottles()).append(",");
            depositRow.append(deposit.getNumSmallBottles()).append(",");
            depositRow.append(deposit.getDepositValue());
            depositRow.append("\n");  // adds a new line
            
            // add the row to the deposit csv
            fileWriter.write(depositRow.toString()); 
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Error writing to CSV file:");
        }
    }
    
    
    // update deposit from the csv file
    public void updateDepositCSV(Deposit updatedDeposit) {
        try {
            File depositCsvFile = new File(FILE_PATH);
            Scanner scanner = new Scanner(depositCsvFile);
            StringBuilder updatedDeposits = new StringBuilder(); // stores the updated file content

            // read row by row and replace the updated row
            while (scanner.hasNextLine()) {
                String currentRow = scanner.nextLine();
                String[] depositData = currentRow.split(",");
                int currentDepositID = Integer.parseInt(depositData[0]);  
                
                // row that needs who data needs changing
                if (currentDepositID == updatedDeposit.getDepositID()) {
                    StringBuilder updatedRow = new StringBuilder();
                    updatedRow.append(updatedDeposit.getDepositID()).append(",");
                    updatedRow.append(updatedDeposit.getUserID()).append(",");
                    updatedRow.append(updatedDeposit.getDepositDate()).append(",");
                    updatedRow.append(updatedDeposit.getNumLargeBottles()).append(",");
                    updatedRow.append(updatedDeposit.getNumSmallBottles()).append(",");
                    updatedRow.append(updatedDeposit.getDepositValue());
                    updatedDeposits.append(updatedRow).append("\n");
                } else {
                    // rows that dont need updating
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
    
    // update deposit from the csv file
    public void deleteDepositCSV(int deleteDepositID) {
        try {
            File depositCsvFile = new File(FILE_PATH);
            Scanner scanner = new Scanner(depositCsvFile);
            StringBuilder updatedDeposits = new StringBuilder(); // stores the updated file content

            // read row by row and replace the updated row
            while (scanner.hasNextLine()) {
                String currentRow = scanner.nextLine();
                String[] depositData = currentRow.split(",");
                int currentDepositID = Integer.parseInt(depositData[0]);  
                
                // only update if the append if it isnt the id to be deleted
                if (currentDepositID != deleteDepositID) {
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
