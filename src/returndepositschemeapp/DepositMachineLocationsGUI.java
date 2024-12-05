/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;

import returndepositschemeapp.DepositMenuFrame;
import returndepositschemeapp.FeedbackGUI;
import returndepositschemeapp.HomepageGUI;
import returndepositschemeapp.ProfileGUI;


//Importing DefaultListModel
import javax.swing.DefaultListModel;
//Importing JOptionPane
import javax.swing.JOptionPane;
/**
 *
 * @author danielbroderick
 */
public class DepositMachineLocationsGUI extends javax.swing.JFrame {
    //Retrieving instance and assigning it to machineFinderVariable
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();
    
    /**
     * Creates new form DepositMachines
     */
    //passing machineFinder instance through constructor parameter
    public DepositMachineLocationsGUI(DepositLocationManager machineFinder) {
        this.machineFinder = machineFinder;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
        depositBTN = new javax.swing.JButton();
        machinLocatorBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        allLocBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        allLocList = new javax.swing.JList<>();
        deleteLocBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        searchLocBtn = new javax.swing.JButton();
        addLocBtn = new javax.swing.JButton();
        eircodeTxtSearch = new javax.swing.JTextField();
        latTxtSearch = new javax.swing.JTextField();
        longTxtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setForeground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        homeBtn.setBackground(new java.awt.Color(51, 51, 51));
        homeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Homepage");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        feedbackBtn.setBackground(new java.awt.Color(51, 51, 51));
        feedbackBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        feedbackBtn.setForeground(new java.awt.Color(255, 255, 255));
        feedbackBtn.setText("Feedback");
        feedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackBtnActionPerformed(evt);
            }
        });

        depositBTN.setBackground(new java.awt.Color(51, 51, 51));
        depositBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        depositBTN.setForeground(new java.awt.Color(255, 255, 255));
        depositBTN.setText("Deposit");
        depositBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBTNActionPerformed(evt);
            }
        });

        machinLocatorBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        machinLocatorBtn.setText("Machine Locator");
        machinLocatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machinLocatorBtnActionPerformed(evt);
            }
        });

        profileBtn.setBackground(new java.awt.Color(51, 51, 51));
        profileBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(255, 255, 255));
        profileBtn.setText("Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(machinLocatorBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBtn)
                    .addComponent(feedbackBtn)
                    .addComponent(depositBTN)
                    .addComponent(machinLocatorBtn)
                    .addComponent(profileBtn))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        allLocBtn.setText("Display All Locations");
        allLocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allLocBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(allLocList);

        deleteLocBtn.setText("Delete Location");
        deleteLocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLocBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(deleteLocBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(allLocBtn)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allLocBtn)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteLocBtn)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        searchLocBtn.setText("Search Location");
        searchLocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLocBtnActionPerformed(evt);
            }
        });

        addLocBtn.setText("Add Location");
        addLocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocBtnActionPerformed(evt);
            }
        });

        eircodeTxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eircodeTxtSearchActionPerformed(evt);
            }
        });

        latTxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latTxtSearchActionPerformed(evt);
            }
        });

        longTxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longTxtSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eircode");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Latitude");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Longitude");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchLocBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addLocBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(longTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eircodeTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(latTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eircodeTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(longTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLocBtn)
                    .addComponent(addLocBtn))
                .addGap(105, 105, 105))
        );

        searchLocBtn.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //Setting hompeage visible
        HomepageGUI home = new HomepageGUI();
        home.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void allLocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allLocBtnActionPerformed
        //Creating an instance of DefaultListModel called listModel
        //Will manage the data displayed in JList
        DefaultListModel<String> listModel = new DefaultListModel<>();

        //Iterating through the deposit locations and add them to the list model
        for (DepositLocation location : machineFinder.depositlocation) {
            String displayText = "Eircode: " + location.eircode + 
                                 ", Latitude: " + location.latitude + 
                                 ", Longitude: " + location.longitude;
            listModel.addElement(displayText);
        }

        //Setiing the allLocList to the listModel
        allLocList.setModel(listModel);
    }//GEN-LAST:event_allLocBtnActionPerformed

    private void feedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackBtnActionPerformed
        //Setting FeedbackGUI visible
        FeedbackGUI feedback = new FeedbackGUI();
        feedback.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_feedbackBtnActionPerformed

    private void depositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBTNActionPerformed
        //Setting Deposit Frame visible
        DepositMenuFrame deposit = new DepositMenuFrame();
        deposit.setVisible(true);
        
        //Collapsing current form
        setVisible(false); 
    }//GEN-LAST:event_depositBTNActionPerformed

    private void machinLocatorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machinLocatorBtnActionPerformed
        //Setting DepositMachineLocator Gui visible
        DepositMachineLocatorGUI machines = new DepositMachineLocatorGUI(machineFinder);
        machines.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_machinLocatorBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        //Setting the profile visible
        ProfileGUI profile = new ProfileGUI();
        profile.setVisible(true);
        
        //Collapsing current form
        setVisible(false); 
    }//GEN-LAST:event_profileBtnActionPerformed

    private void searchLocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLocBtnActionPerformed
        //Retrieving the text from the search fields
        String eircode = eircodeTxtSearch.getText().trim();
        String latText = latTxtSearch.getText().trim();
        String longText = longTxtSearch.getText().trim();

        //Flaging to indicate if a matching location was found
        boolean locationFound = false;
        
        //Using if statement to check is latText & long text not empty
        if (!locationFound && !latText.isEmpty() && !longText.isEmpty()) {
                //If it is not empty it will try parse the texts to a double
                try {
                    double latitude = Double.parseDouble(latText);
                    double longitude = Double.parseDouble(longText);

                    //Searching for matching location by latitude and longitude using a for loop
                    //By iterating over objects in machine finder.depositlocation
                    for (DepositLocation location : machineFinder.depositlocation) {
                        if (location.latitude == latitude && location.longitude == longitude) {
                            //Location found, displaying it
                            JOptionPane.showMessageDialog(this, "Location found is valid");
                            locationFound = true;
                            //Exit loop once a match is found
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    //If latitude or longitude is invalid, showing an error message
                    JOptionPane.showMessageDialog(this, "Invalid latitude or longitude input.");
                }
            }

            //If no location was found, displaying a message
            if (!locationFound) {
                JOptionPane.showMessageDialog(this, "No matching location found.");
            }
    }//GEN-LAST:event_searchLocBtnActionPerformed

    private void addLocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLocBtnActionPerformed
        //Retrieving the text from the text fields
       String eircode = eircodeTxtSearch.getText();
       String latText = latTxtSearch.getText();
       String longText = longTxtSearch.getText();

       //Validating the latitude and longitude inputs
       try {
           //Parsing latitude and longitude to doubles
           double latitude = Double.parseDouble(latText);
           double longitude = Double.parseDouble(longText);

           //Creating a new DepositLocation object using the entered data
           DepositLocation newLocation = new DepositLocation(latitude, longitude, eircode);

           //Adding the new location to the FindClosestMachine
           machineFinder.addDepositLocation(newLocation);

           //Saving the updated locations list to locations.txt
           machineFinder.saveLocationsToFile();

           //Clearing the text fields after adding the location
           eircodeTxtSearch.setText("");
           latTxtSearch.setText("");
           longTxtSearch.setText("");

           //Confirmation message
           JOptionPane.showMessageDialog(this, "Location added successfully!");

       } catch (NumberFormatException e) {
           //Showing an error message if latitude or longitude is invalid
           JOptionPane.showMessageDialog(this, "Please enter valid numeric values for latitude and longitude.");
       }
    }//GEN-LAST:event_addLocBtnActionPerformed

    private void eircodeTxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eircodeTxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eircodeTxtSearchActionPerformed

    private void deleteLocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLocBtnActionPerformed
        //Creating a variable to retrieve the selected index from allLocList
        int selectedIndex = allLocList.getSelectedIndex();

        //If statement to check if user removed an item
        if (selectedIndex != -1) {
            //Removing from DefaultListModel
            DefaultListModel<String> listModel = (DefaultListModel<String>) allLocList.getModel();
            listModel.remove(selectedIndex);

            //Removing from machineFinder.depositlocation
            machineFinder.depositlocation.remove(selectedIndex);
            
            //Saving the updated list to the file after removing it
            machineFinder.saveLocationsToFile();
        } else {
            //Displaying a message if user clicks button but doesnt choose item
            JOptionPane.showMessageDialog(this, "Please select an item to delete.");
        }
    }//GEN-LAST:event_deleteLocBtnActionPerformed

    private void latTxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latTxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latTxtSearchActionPerformed

    private void longTxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longTxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longTxtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLocBtn;
    private javax.swing.JButton allLocBtn;
    private javax.swing.JList<String> allLocList;
    private javax.swing.JButton deleteLocBtn;
    private javax.swing.JButton depositBTN;
    private javax.swing.JTextField eircodeTxtSearch;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latTxtSearch;
    private javax.swing.JTextField longTxtSearch;
    private javax.swing.JButton machinLocatorBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton searchLocBtn;
    // End of variables declaration//GEN-END:variables
}