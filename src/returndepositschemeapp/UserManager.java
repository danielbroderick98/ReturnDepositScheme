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

    public static void saveUsersToCSV() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.csv"))) {
        for (User user : users) {
            writer.write(user.getName() + "," + user.getSurname() + "," +
                         user.getEmail() + "," + "," +
                         user.getHomeAddress() + "," + user.getPassword());
            writer.newLine();
        }
    } catch (IOException e) {
    }
}

public static void loadUsersFromCSV() {
    try (BufferedReader reader = new BufferedReader(new FileReader("users.csv"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 6) {
                User user = new User(parts[2], parts[5]); // email and password
                user.setName(parts[0]);
                user.setSurname(parts[1]);
                user.setHomeAddress(parts[4]);
                addUser(user); // Add user to memory
            }
        }
    } catch (IOException e) {
    }
}
    
    private static void appendUserToCSV(User user) {
        try (FileWriter writer = new FileWriter(USER_FILE, true)) {
            writer.write(user.getName() + ","
                    + user.getSurname() + ","
                    + user.getEmail() + ","
                    + user.getHomeAddress() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    // Check if a user with the given email exists
    public static boolean isUserExist(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    // Authenticate user with email and password
    public static boolean authenticate(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                setCurrentUser(user); // Set the authenticated user as current user
                return true;
            }
        }
        return false;
    }

    // Retrieve the current user
    public static User getCurrentUser() {
        return currentUser;
    }

    // Set the current user
    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    // Update current user information
    public static void updateCurrentUser(String name, String surname, String homeAddress, String email) {
        if (currentUser != null) {
            currentUser.setName(name);
            currentUser.setSurname(surname);
            currentUser.setHomeAddress(homeAddress);
            currentUser.setEmail(email);
        }
    }
}
