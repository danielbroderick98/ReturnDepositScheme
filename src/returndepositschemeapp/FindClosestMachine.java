/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package returndepositschemeapp;
//Importing ArrayList
import java.util.ArrayList;
//Importing File handler
import java.io.*;

/**
 *
 * @author dbrod
 */
public class FindClosestMachine {
    //Constructor
    FindClosestMachine(){
        
    }
    
    //Creating a private variable of type FindClosestMachine
    private static FindClosestMachine instanceFCM;
    //Array List for deposit locations From the DepositLocation class
    ArrayList<DepositLocation> depositlocation = new ArrayList();
    
    //Getter for other classes to acces FindClosestMachine instance
    public static FindClosestMachine getInstanceFCM() {
        //Checking to see if instance is created
        if (instanceFCM == null) {
            //Creates instance if null
            instanceFCM = new FindClosestMachine();
        }
        return instanceFCM;
    }
    
    //Method for adding deposit location
    //passing through the the parameters then adding to the depositlocation ArrayList
    public void addDepositLocation(DepositLocation dLocation){
        depositlocation.add(dLocation);
    }
    
    //Method to find the closest machine to the user
    //Passing the user location through the parameters
    public DepositLocation findClosestMachine(UserLocation userlocation){
        //closestMachine variable will be returned
        DepositLocation closestMachine = null;
        //minDistance will store the shortest distance
        //Setting minDistance as max double value as a placeholder
        double minDistance = Double.MAX_VALUE;

        //For loop will iterate through all deposit locations
        for (DepositLocation dLocation : depositlocation) {
            // Calculate the distance to the user location
            double distance = calculateDistance(userlocation, dLocation);

            // Update closestMachine if this distance is smaller than the current minimum
            if (distance < minDistance) {
                minDistance = distance;
                closestMachine = dLocation;
            }
        }

        return closestMachine;
    }
    
    //Method to calculate the distance between two locations
    //calculateDistance will be used in findClosestMachine method
    private double calculateDistance(UserLocation user, DepositLocation deposit) {
        // Using Euclidean distance
        //Storing the distance in latDiff and lonDiff
        double latDiff = user.latitude - deposit.latitude;
        double lonDiff = user.longitude - deposit.longitude;
        return Math.sqrt(latDiff * latDiff + lonDiff * lonDiff);
    }
    
    
    
    
    //Saving the depositlocation list to a file
    public void saveLocationsToFile() {
        //Try, to create a file writer to write to locations.txt
        try (FileWriter writer = new FileWriter("locations.txt")) {
            //Iterating through each DepositLocation on the list
            for (DepositLocation location : depositlocation) {
                writer.write(location.latitude + "," + location.longitude + "," + location.eircode + "\n");
            }
        } 
        //Printing the stack trace for debugging if an I/O exception happens
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Loading the depositlocation list from a file
    public void loadLocationsFromFile() {
        //Clearning the current list of deposit locations to avoid any duplicates
        depositlocation.clear();
        //Try, to open a buffer reader to read the locations.txt file
        try (BufferedReader reader = new BufferedReader(new FileReader("locations.txt"))) {
            String line;
            //Using a while loop to read the file Line by Line
            while ((line = reader.readLine()) != null) {
                //Splitting the line into parts using a comma
                String[] parts = line.split(",");
                //Parsing the latitude and longitude
                double latitude = Double.parseDouble(parts[0]);
                double longitude = Double.parseDouble(parts[1]);
                //Extracting the eircode as a string
                String eircode = parts[2];
                //Creating a new DepositLocation as an object and adding it to the file
                depositlocation.add(new DepositLocation(latitude, longitude, eircode));
            }
        } 
        //Printing the stack trace for debugging if an I/O exception happens
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Method to initialize the DepositLocations
    //Will be called in main method
    public void initializeLocations() {
        //Creating a file object and passing through locations.txt file
        File fileLocation = new File("locations.txt");
        //Checking if the file exists with an if
        if (fileLocation.exists()) {
            //If it exists it will load existing files
            loadLocationsFromFile();
            //Checking to see if the file is empty
            if (depositlocation.isEmpty()) {
                System.out.println("File exists but no locations found. Adding default locations.");
                //If it is empty it will call the addDefaultLocations method
                //Then it will save the default locations to the file
                addDefaultLocations();
                saveLocationsToFile();
            }
        } 
        //If the file does not exist it will add default deposit locations to the file
        else {
            System.out.println("File not found. Creating default locations.");
            addDefaultLocations();
            saveLocationsToFile();
        }
    }

    //A list of the default locations that will be added to the file through initializeLocations()
    private void addDefaultLocations() {
        addDepositLocation(new DepositLocation(53.3498, -6.2603, "D01XYZ")); //Dublin City Centre
        addDepositLocation(new DepositLocation(53.3891, -6.1396, "D13H5R6")); //Bayside
        addDepositLocation(new DepositLocation(53.3942, -6.1623, "D13R3D1")); //Donaghmede
        addDepositLocation(new DepositLocation(53.3884, -6.0721, "D13CH92")); //Howth
        addDepositLocation(new DepositLocation(53.3136, -6.3243, "D12T4R3")); //Crumlin
        addDepositLocation(new DepositLocation(53.3298, -6.2162, "D04KKX5")); //Sandymount
        addDepositLocation(new DepositLocation(53.3881, -6.1556, "D05P6H4")); //Kilbarrack
        addDepositLocation(new DepositLocation(53.4522, -6.1541, "K36VW34")); //Malahide
        addDepositLocation(new DepositLocation(53.3193, -6.3906, "D22FW14")); //Clondalkin
        addDepositLocation(new DepositLocation(53.3823, -6.3789, "D15W34E")); //Blanchardstown
        addDepositLocation(new DepositLocation(53.3849, -6.2941, "D11WP37E")); //Finglas
        addDepositLocation(new DepositLocation(53.2749, -6.1069, "A96X4E5")); //Dalkey
        addDepositLocation(new DepositLocation(53.7204, -6.3408, "A92H7R9")); // Louth
        addDepositLocation(new DepositLocation(54.2766, -8.4761, "F91YH01")); //Sligo
        addDepositLocation(new DepositLocation(52.6538, -7.2476, "R95D327")); //Kilkenny
        addDepositLocation(new DepositLocation(51.8985, -8.4756, "T12KX99")); //Cork
        addDepositLocation(new DepositLocation(53.2707, -9.0568, "H91V3Y8")); //Galway
        addDepositLocation(new DepositLocation(52.3369, -7.6139, "X91H4E8")); //Waterford
        addDepositLocation(new DepositLocation(54.3424, -6.6527, "BT618H9")); //Armagh
        addDepositLocation(new DepositLocation(55.0069, -7.3183, "F93KX72")); //Donegal
        addDepositLocation(new DepositLocation(52.6680, -8.6305, "V94HPX4")); //Limerick
        addDepositLocation(new DepositLocation(53.3460, -7.4619, "N37XP52")); //Offaly
        addDepositLocation(new DepositLocation(53.7125, -7.1119, "C15K6W4")); //Meath
        addDepositLocation(new DepositLocation(53.2063, -6.6660, "W12K8H5")); //Kildare
        addDepositLocation(new DepositLocation(54.2697, -6.9583, "BT60AZ1")); //Tyrone
        addDepositLocation(new DepositLocation(53.3721, -8.2201, "H62W3K7")); //Roscommon
        addDepositLocation(new DepositLocation(53.8506, -9.2985, "F23YW8H")); //Mayo
        addDepositLocation(new DepositLocation(52.3964, -6.9369, "Y35YR6E")); //Wexford
        addDepositLocation(new DepositLocation(54.7167, -7.7959, "BT81W7X")); //Fermanagh
        addDepositLocation(new DepositLocation(52.1420, -9.5168, "V92W8H5")); //Kerry
        addDepositLocation(new DepositLocation(53.0353, -7.2997, "R32FP62")); //Laois
        addDepositLocation(new DepositLocation(53.9934, -6.4169, "A81RY84")); //Monaghan
        addDepositLocation(new DepositLocation(53.2258, -7.5499, "R42X9T8")); //Westmeath
        addDepositLocation(new DepositLocation(52.8417, -8.9806, "R51HX92")); //Clare
        addDepositLocation(new DepositLocation(53.0148, -7.8058, "R32T6K8")); //Longford
        addDepositLocation(new DepositLocation(54.6004, -5.9301, "BT13QX4")); //Antrim
        addDepositLocation(new DepositLocation(53.1291, -6.0657, "A63WX92")); //Wicklow
        addDepositLocation(new DepositLocation(54.2103, -7.9484, "H14XP93")); //Cavan
        addDepositLocation(new DepositLocation(54.5039, -6.0457, "BT62HX7")); //Down
        addDepositLocation(new DepositLocation(53.1400, -7.1974, "R45PX82")); //Tipperary
        addDepositLocation(new DepositLocation(52.7208, -6.8879, "R95KP94")); //Carlow
        addDepositLocation(new DepositLocation(53.6278, -6.8263, "N39YW5R")); //Leitrim
    }

}
