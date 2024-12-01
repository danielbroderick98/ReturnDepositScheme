package returndepositschemeapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserManager {

    private static final String USER_FILE = "users.csv"; // File to store users
    static final ArrayList<User> users = new ArrayList<>();
    private static User currentUser;

    // Add user to the list
    public static void addUser(User user) {
        users.add(user);
        appendUserToCSV(user);
    }

    // Method to save users to CSV file
    public static void saveUsersToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE))) {
            // Loop through
            for (User user : users) {
                // Write users data
                writer.write(user.getName() + ","
                        + user.getSurname() + ","
                        + user.getEmail() + ","
                        + user.getHomeAddress() + ","
                        + user.getPassword());
                // Move to next time for another user
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }

    // Method to load users from CSV file
    public static void loadUsersFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            // Read each line from CSV
            while ((line = reader.readLine()) != null) {
                String[] part = line.split(",");
                // Set user properties
                User user = new User(part[2], part[4]);
                user.setName(part[0]);
                user.setSurname(part[1]);
                user.setHomeAddress(part[3]);
                //Then add to list of users
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // append user data to CSV 
    private static void appendUserToCSV(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            // Write users data to CSV
            writer.write(user.getName() + ","
                    + user.getSurname() + ","
                    + user.getEmail() + ","
                    + user.getHomeAddress() + ","
                    + user.getPassword());
            // New line
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    // Check if user exists
    public static boolean isUserExist(String email) {
        // Loop through CSV
        for (User user : users) {
            // Some validation
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    // Authenticate user 
    public static boolean authenticate(String email, String password) {
        // Loop through users from CSV file
        for (User user : users) {
            // Some validation
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                // if match, set as current user
                setCurrentUser(user);
                // If successful, return true
                return true;
            }
        }
        return false;
    }

    // Get current user
    public static User getCurrentUser() {
        return currentUser;
    }

    // Set current user
    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    // Update current user information
    public static void updateCurrentUser(String name, String surname, String homeAddress, String email) {
        currentUser.setName(name);
        currentUser.setSurname(surname);
        currentUser.setHomeAddress(homeAddress);
        currentUser.setEmail(email);

    }
}
