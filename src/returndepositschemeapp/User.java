/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;

/**
 *
 * @author Darren
 */
//variables
public class User {

    private String username;
    private String password;
    private String name;
    private String surname;
    private String homeAddress;
    private String email;

    // Constructor for email and password
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters and setters for all requested fields
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHomeAddress() {  
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {  
        this.homeAddress = homeAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
