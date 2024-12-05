/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.util.ArrayList;
import java.time.LocalDate;
import returndepositschemeapp.Deposit;
/**
 *
 * @author Seamus90
 * stores the deposits of a particular user in an ArrayList
 */
public class UserDeposits {
    // attributes
    private ArrayList<Deposit> deposits;     // arraylist of current users deposits
    private String userEmail;
    
    // Constructor
    public UserDeposits(String userEmail, ArrayList<Deposit> deposits) {
        this.userEmail = userEmail;
        this.deposits = deposits;
    }
    
    // getter
    public ArrayList<Deposit> getUserDeposits() {
        return deposits;
    }
    
    // get a deposit by its ID
    public Deposit getDepositById(int depositId) {
        for (Deposit deposit : deposits) {
            if (deposit.getDepositId() == depositId) {
                return deposit;
            }
        }
        return null;
    }
    
    // method to add a new deposit to users deposits
    public void addDeposit(int numLargeBottles, int numSmallBottles) {
        int depositId = DepositIdManager.getDepositId(); // calls depositIdmanager class to get id
        
        // create a deposit and add to deposits
         Deposit newDeposit = new Deposit(depositId, userEmail, numLargeBottles, numSmallBottles);
         deposits.add(newDeposit);
    }
    
    // method to get the last elelement in the array of deposits 
    public Deposit getLatestDeposit() {
        return deposits.get(deposits.size() - 1);
    }
    
    // method to create a list of all the depositIDs
    public ArrayList<Integer> getDepositIds() {
        ArrayList<Integer> depositIdsList = new ArrayList<>();
        for (Deposit deposit : deposits) {
            depositIdsList.add(deposit.getDepositId());
        }
        return depositIdsList;
    }
    
    // method to update the number of bottles deposited
    public void updateDeposit(int depositId, int newLargeBottleAmount, int newSmallBottleAmount) {
        int depositIndex = 0;
        
        // loop through all customer deposits to find user with matching id
        while (depositIndex < deposits.size()) {
            // if the depositIDs match, update the amounts and change deposit value
            if(deposits.get(depositIndex).getDepositId() == depositId) {
                Deposit deposit = deposits.get(depositIndex);
                deposit.setNumLargeBottles(newLargeBottleAmount);
                deposit.setNumSmallBottles(newSmallBottleAmount);
                deposit.updateDepositValue();
                return; // quit method after updating
            }
            depositIndex += 1;
        }
    }
    
    // method to delete a deposit from the arraylist
    public void deleteDeposit(int depositId) {
        int depositIndex = 0;
        
        // loop through deposits to find matching entry
        while (depositIndex < deposits.size()) {
            if (deposits.get(depositIndex).getDepositId() == depositId) {
                deposits.remove(depositIndex);
                break; // quit method after deleting 
            }
            depositIndex += 1;
        }
    }
    
    // takes in a deposit and returns its details as a string
    private String getDepositDetailsAsString(Deposit deposit) {
        return "Deposit ID: " + deposit.getDepositId() + "\n" +
                "Date: " + deposit.getDepositDate() + "\n" +
                "Num Large Bottles: " + deposit.getNumLargeBottles() + "\n" +
                "Num Small Bottles: " + deposit.getNumSmallBottles() + "\n" +
                "Amount: " + deposit.getDepositValue() + "\n\n";
    }
    
    // method to create a stringbuffer of items in a deposit
    public String getAllDepositDetails() {
        // initialise a stringbuilder to create string of deposit details
        StringBuilder stringBuilder = new StringBuilder();
        
        // output for if deposits are empty
        if (deposits.isEmpty()) {
            stringBuilder.append("***You have not made any deposits yet***");
            return stringBuilder.toString();
        }
        
        // loop through deposits starting from most recently deposited
        for(int i = deposits.size() -1; i >= 0; i--) {
            // get the current deposits
            Deposit deposit = deposits.get(i);
            // call method and append current deposit details to stringbuilder
            stringBuilder.append(getDepositDetailsAsString(deposit));
         }
        return stringBuilder.toString();
    }
    
    // filter deposit details by from date and to date 
    public String getDepositDetailsFilterBoth(LocalDate fromDate,LocalDate toDate) {
        // initialise a stringbuilder to create string of deposit details
        StringBuilder stringBuilder = new StringBuilder();
        // output for if deposits are empty
        if (deposits.isEmpty()) {
            stringBuilder.append("\t\t***You have not made any deposits yet***");
            return stringBuilder.toString();
        }
        for(int i = deposits.size() -1; i >= 0; i--) {
            // get the current deposits
            Deposit deposit = deposits.get(i);
            // get the date of the current deposit
            LocalDate currentDepositDate = deposit.getDepositDate();
            // check to see of if it is on or after fromdate, and on or before todate, if so append
            if((currentDepositDate.isEqual(fromDate) == true || currentDepositDate.isAfter(fromDate) == true) &&
                    (currentDepositDate.isEqual(toDate) == true || currentDepositDate.isBefore(toDate) == true)){
                stringBuilder.append(getDepositDetailsAsString(deposit));
            }
        }
        return stringBuilder.toString();    
    }
    
   
    // filter deposit details by from date
    public String getDepositDetailsFilterFromDate(LocalDate fromDate) {
        // initialise a stringbuilder to create string of deposit details
        StringBuilder stringBuilder = new StringBuilder();
        // output for if deposits are empty
        if (deposits.isEmpty()) {
            stringBuilder.append("\t\t***You have not made any deposits yet***");
            return stringBuilder.toString();
        }
        for(int i = deposits.size() -1; i >= 0; i--) {
            // get the current deposits
            Deposit deposit = deposits.get(i);
            // get the date of the current deposit
            LocalDate currentDepositDate = deposit.getDepositDate();
            // check to see if it is on or after from date
            if(currentDepositDate.isEqual(fromDate) == true || currentDepositDate.isAfter(fromDate) == true) {
                stringBuilder.append(getDepositDetailsAsString(deposit));
            }
        }
        return stringBuilder.toString();
    }
    
   
    // filter deposit details by to date 
    public String getDepositDetailsFilterToDate(LocalDate toDate) {
        // initialise a stringbuilder to create string of deposit details
        StringBuilder stringBuilder = new StringBuilder();
        // output for if deposits are empty
        if (deposits.isEmpty()) {
            stringBuilder.append("\t\t***You have not made any deposits yet***");
            return stringBuilder.toString();
        }
        for(int i = deposits.size() -1; i >= 0; i--) {
            // get the current deposits
            Deposit deposit = deposits.get(i);
            // get the date of the current deposit
            LocalDate currentDepositDate = deposit.getDepositDate();
            // check to see if current deposit is before or after to date
            if(currentDepositDate.isEqual(toDate) == true || currentDepositDate.isBefore(toDate) == true){
                // returns defaul output if there is nothing there
                stringBuilder.append(getDepositDetailsAsString(deposit));
            }
        }
        return stringBuilder.toString();
    }
}