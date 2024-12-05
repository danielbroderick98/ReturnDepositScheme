/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.util.ArrayList;

/**
 *
 * @author Seamus90
 */
public class DepositLeaderBoard {    
    private ArrayList<String> uniqueUserEmails;  // stores a list of all unqique emails        
    private ArrayList<Integer> totalBottlesByUser; // stores the total bottles collected of each user
    private ArrayList<Deposit> allDeposits;   // stores all the deposits
 
    // constuctor
    public DepositLeaderBoard(ArrayList<Deposit> allDeposits) {
        this.allDeposits = allDeposits;
        this.uniqueUserEmails = getUniqueEmails();
        this.totalBottlesByUser =  getUserBottleTotals();       
    }
    
    // method to get unique user emails
    public ArrayList<String> getUniqueEmails() {
        // create arrayList to hold unique emails
        ArrayList<String> uniqueEmails = new ArrayList();
        // loop through the email of all the deposits
        for (Deposit deposit : allDeposits) {
            String email = deposit.getUserEmail();
            // if the unique email list doesnt have an email, add it to the list
            if (uniqueEmails.contains(email) == false) {
                uniqueEmails.add(email);
            }
        }
        return uniqueEmails;
    }
    
    // method to calculature the total bottles collected by each user
    public ArrayList<Integer> getUserBottleTotals() {
        ArrayList<Integer> userBottleTotals = new ArrayList();  
        
        // loop through unique emails 
        for (String email : uniqueUserEmails) {
            int totalBottles = 0;  // initialise to zero for each iteration
            // loop through all the deposits
            for (Deposit deposit : allDeposits) {
                // add up the bottle totals for this email
                if (deposit.getUserEmail().equals(email)) {
                    int total = 0;
                    int largeBottles = deposit.getNumLargeBottles(); 
                    int smallBottles = deposit.getNumSmallBottles();
                    total = largeBottles + smallBottles;
                    totalBottles += total;
                }
                                        
            }
            // add the users total to the totalBottles list
            userBottleTotals.add(totalBottles);
        }
        return userBottleTotals;
    }
    
    // method to sort emails and bottle totals in order of bottle totals, attempt at a bubble sort
    public void sortBottleTotals() {
        int numUsers = uniqueUserEmails.size();
        
        // outer loop for passes
        for (int i = 0; i < numUsers - 1; i++) {
            // inner loop compares bottles totals next to each other in array
            for (int j = 0; j < numUsers -1; j++) {
                // get the current bottle total of a user, and the user total that is next to them
                int currentBottleTotal = totalBottlesByUser.get(j);
                int nextBottleTotal = totalBottlesByUser.get(j+1);
                
                // if the current total is less than the next, then swap emails and totals
                if (currentBottleTotal < nextBottleTotal) {
                    // swap the currentbottletotal and nextbottletotals
                    totalBottlesByUser.set(j, nextBottleTotal);
                    totalBottlesByUser.set(j + 1, currentBottleTotal);
                    
                    // create varaible for current and next email
                    String currentUniqueEmail= uniqueUserEmails.get(j);
                    String nextUniqueEmail = uniqueUserEmails.get(j + 1);
                    // swap as well so email is matches to corresponding bottle amount                uniqueUserEmails.set(j, nextEmail);
                    uniqueUserEmails.set(j, nextUniqueEmail);
                    uniqueUserEmails.set(j + 1, currentUniqueEmail);
                }
                
            }
        }
    }
    
    // method to display leaderboard in a string
    public String displayLeaderBoard() {
        StringBuilder stringBuilder = new StringBuilder();
        
        // loop through each row and append corresponding email and bottles
        for (int i = 0; i < uniqueUserEmails.size(); i ++) {
            stringBuilder.append("Rank " + (i + 1) + " \t" + uniqueUserEmails.get(i) + " \t Total Bottles = " + totalBottlesByUser.get(i) + "\n");
        }
        return stringBuilder.toString();
    }
}
