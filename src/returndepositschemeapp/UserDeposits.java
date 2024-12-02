/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.util.ArrayList;
import returndepositschemeapp.Deposit;
/**
 *
 * @author Seamus90
 * stores the deposits of a particular user in an ArrayList
 */
public class UserDeposits {
    // attributes
    private ArrayList<Deposit> deposits;     // arraylist of current users deposits
    private int userID;
    private int nextDepositID;
    
    // Constructor
    public UserDeposits(int userID, ArrayList<Deposit> deposits) {
        this.userID = userID;
        this.deposits = deposits;
        this.nextDepositID = 1;
    }
    
    // getter
    public ArrayList<Deposit> getUserDeposits() {
        return deposits;
    }
    
    // method to add a new deposit to users deposits
    public void addDeposit(int numLargeBottles, int numSmallBottles) {
        int depositID = nextDepositID++;
        
        // create a deposit and add to deposits
         Deposit newDeposit = new Deposit(depositID, userID, numLargeBottles, numSmallBottles);
         deposits.add(newDeposit);
    }
    
    // method to get the last elelement in the array of deposits 
    public Deposit getLatestDeposit() {
        return deposits.get(deposits.size() - 1);
    }
    
    // method to update the number of bottles deposited
    public void updateDeposit(int depositID, int newLargeBottleAmount, int newSmallBottleAmount) {
        int depositIndex = 0;
        
        // loop through all customer deposits
        while (depositIndex < deposits.size()) {
            // if the depositIDs match, update the amounts and change deposit value
            if(deposits.get(depositIndex).getDepositID() == depositID) {
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
    public void deleteDeposit(int depositID) {
        int depositIndex = 0;
        
        // loop through deposits to find matching entry
        while (depositIndex < deposits.size()) {
            if (deposits.get(depositIndex).getDepositID() == depositID) {
                deposits.remove(depositIndex);
                break; // quit method after deleting 
            }
            depositIndex += 1;
        }
    }
    
    // method for printing all a users deposits
    public void displayUserDeposits() {
        if (deposits.isEmpty()) {
            System.out.println("You have not made any deposits yet");
        } else {
            for (Deposit deposit : deposits) {
                 System.out.println(deposit);
            }
        }
    }
}