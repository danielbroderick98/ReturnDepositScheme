/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
import java.time.LocalDate;
/**
 *
 * author: Seamus McMenamy
 * Represents a deposit
 */
public class Deposit {
    // attributes
    private int depositId;
    private String userEmail;
    private LocalDate depositDate;
    private int numLargeBottles;
    private int numSmallBottles;
    private double depositValue;
    //deposit value per bottle type
    private static final double LARGE_BOTTLE_VALUE = 0.25;
    private static final double SMALL_BOTTLE_VALUE = 0.15;
    
    // Deposit Constructor
    public Deposit(int depositId, String userEmail, int numLargeBottles, int numSmallBottles) {
        this.depositId = depositId;
        this.userEmail = userEmail;
        this.depositDate = LocalDate.now();
        this.numLargeBottles = numLargeBottles;
        this.numSmallBottles = numSmallBottles;
        this.depositValue = calculateDepositValue();
    }
    
    // overloaded deposit constructor to take in a date
    public Deposit(int depositId, String userEmail, LocalDate depositDate, int numLargeBottles, int numSmallBottles) {
        this.depositId = depositId;
        this.userEmail = userEmail;
        this.depositDate = depositDate;
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
    public int getDepositId() {
        return depositId;
    }
    
    public String getUserEmail() {
        return userEmail;
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
        return "DepositID: " + depositId + 
                ", CustomerID: " + userEmail + 
                ", DepositDate: " + depositDate + 
                ", Large Bottles: " + numLargeBottles + 
                ", Small Bottles: " + numSmallBottles + 
                ", DepositValue: " + depositValue;
    }
    
}
