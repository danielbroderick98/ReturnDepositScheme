/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.time.LocalDate;
/**
 *
 * 
 * Represents a deposit
 */
public class Deposit {
    // attributes
    private int depositID;
    private int userID;
    private LocalDate depositDate;
    private int numLargeBottles;
    private int numSmallBottles;
    private double depositValue;
    //deposit value per bottle type
    private static final double LARGE_BOTTLE_VALUE = 0.25;
    private static final double SMALL_BOTTLE_VALUE = 0.15;
    
    // Deposit Constructor
    public Deposit(int depositID, int userID, int numLargeBottles, int numSmallBottles) {
        this.depositID = depositID;
        this.userID = userID;
        this.depositDate = LocalDate.now();
        this.numLargeBottles = numLargeBottles;
        this.numSmallBottles = numSmallBottles;
        this.depositValue = calculateDepositValue();
    }
    
    // setters
    public int setNumLargeBottles(int newLargeBottlesAmount) {
        return this.numLargeBottles = newLargeBottlesAmount;
    }
    
    public int setNumSmallBottles(int newSmallBottleAmount) {
        return this.numSmallBottles = newSmallBottleAmount;
    }
    
    // method to calculate the deposit value
    private double calculateDepositValue() {
        double largeBottleDepositValue = LARGE_BOTTLE_VALUE * numLargeBottles;
        double smallBottleDepositValue = SMALL_BOTTLE_VALUE * numSmallBottles;
        double result = Math.round((largeBottleDepositValue+ smallBottleDepositValue) * 100) /100.0;
        return result;
        
    } 
    
    // method to update the depositvalue 
    public void updateDepositValue()  {
        this.depositValue = calculateDepositValue();
    }
    
    // getters
    public int getDepositID() {
        return depositID;
    }
    
    public int getUserID() {
        return userID;
    }
    
    public LocalDate getDepositDate() {
        return depositDate;
    }
    
    public int getNumLargeBottles() {
        return numLargeBottles;
    }
    
    public int getNumSmallBottles() {
        return numSmallBottles;
    }
    
    public double getDepositValue() {
        return depositValue;
    }
    
    // override the toString() method
    @Override
    public String toString() {
        return "DepositID: " + depositID + 
                ", CustomerID: " + userID + 
                ", DepositDate: " + depositDate + 
                ", Large Bottles: " + numLargeBottles + 
                ", Small Bottles: " + numSmallBottles + 
                ", DepositValue: " + depositValue;
    }
    
}
