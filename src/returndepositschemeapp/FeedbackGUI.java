/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;


import returndepositschemeapp.HomepageGUI;
import returndepositschemeapp.ProfileGUI;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Darren
 */
public class FeedbackGUI extends javax.swing.JFrame {
    //This allows all the access of FindClosestMachine
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();
    
    
    /**
     * Creates new form Feedback
     */
    public FeedbackGUI() {
        initComponents();
        // Call method that ensures we have a CSV file on start up
        createCSVIfNotExist();
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
        jButton1 = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        userFeedbackInput = new java.awt.TextArea();
        sendFeedback = new java.awt.Button();
        viewAllFeedback = new java.awt.Button();
        deleteFeedback = new java.awt.Button();
        searchFeedback = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        feedbackBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Machine Locator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton1)
                    .addComponent(profileBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel2ComponentAdded(evt);
            }
        });

        userFeedbackInput.setMaximumSize(new java.awt.Dimension(100, 80));
        userFeedbackInput.setText("Please Enter Your Feedback...");

        sendFeedback.setLabel("SEND");
        sendFeedback.setMaximumSize(new java.awt.Dimension(49, 24));
        sendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendFeedbackActionPerformed(evt);
            }
        });

        viewAllFeedback.setLabel("View All Feedback");
        viewAllFeedback.setMaximumSize(new java.awt.Dimension(113, 24));
        viewAllFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllFeedbackActionPerformed(evt);
            }
        });

        deleteFeedback.setLabel("Delete Feedback");
        deleteFeedback.setMaximumSize(new java.awt.Dimension(107, 24));
        deleteFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFeedbackActionPerformed(evt);
            }
        });

        searchFeedback.setLabel("Search Feedback");
        searchFeedback.setMaximumSize(new java.awt.Dimension(110, 24));
        searchFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(userFeedbackInput, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(sendFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(searchFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(deleteFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(viewAllFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(userFeedbackInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewAllFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method to send Feedback
    private void sendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendFeedbackActionPerformed
        // TODO add your handling code here:
        // Get users feedback from field
        String feedback = userFeedbackInput.getText();
        // Ensure feedback is not empty
        if (!feedback.isEmpty()) {
            // If feedback is not empty, request user email address
            String userEmail = JOptionPane.showInputDialog(this, "Enter your email: ");
            if (!userEmail.isEmpty()) {
                saveFeedbackToCSV(userEmail, feedback);
                JOptionPane.showMessageDialog(this, "Feedback saved!");
                //Setting text to nothing, however considering adding text
                userFeedbackInput.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a Valid email");
            }
        }
    }//GEN-LAST:event_sendFeedbackActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // Setting hompeage visible
        HomepageGUI home = new HomepageGUI();
        home.setVisible(true);
        // Setting Feedback invisible
        setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void feedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackBtnActionPerformed
        // Setting Feedback visible
        FeedbackGUI feedback = new FeedbackGUI();
        feedback.setVisible(true);
        // Setting Feedback invisible
        setVisible(false);
    }//GEN-LAST:event_feedbackBtnActionPerformed

    private void depositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBTNActionPerformed
        // Setting Deposit visible
        DepositMenuFrame deposit = new DepositMenuFrame();
        deposit.setVisible(true);
        // Setting Feedback invisible
        setVisible(false);
    }//GEN-LAST:event_depositBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Setting DepositMachineLocator Gui visible
        DepositMachineLocatorGUI dmlg = new DepositMachineLocatorGUI(machineFinder);
        dmlg.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // Setting profile visible
        ProfileGUI profile = new ProfileGUI();
        profile.setVisible(true);
        // Setting Feedback invisible
        setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void jPanel2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2ComponentAdded

    //Method to view all Feedback
    private void viewAllFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllFeedbackActionPerformed
        // TODO add your handling code here:
        // Assign variable to the list
        List<String> feedbackList = getAllFeedbackFromCSV();
        // Check for entires
        if (!feedbackList.isEmpty()) {
            // Added for outputting format
            StringBuilder formattedFeedback = new StringBuilder();
            // Iterate through CSV
            for (String feedback : feedbackList) {
                // Split into 2 parts - email and feedback
                String[] part = feedback.split(",", 2);
                // Append in both parts to the string
                formattedFeedback.append(part[0]).append(": ").append(part[1]).append("\n\n");
            }
            // Impliment toString method and print in JOption
            JOptionPane.showMessageDialog(this, formattedFeedback.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No feedback available.");
        }
    }//GEN-LAST:event_viewAllFeedbackActionPerformed

    // Method to delete Feedback
    private void deleteFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFeedbackActionPerformed
        // TODO add your handling code here:
        // Ask user for a specific feedback they wish to delete
        String feedbackDelete = JOptionPane.showInputDialog(this, "Enter feedback to delete:");
        // Give some validation requirments
        if (feedbackDelete != null && !feedbackDelete.isEmpty()) {
            // If validation is fulfulled, call method
            deleteFeedbackFromCSV(feedbackDelete);
        } else { // If above is not fulfilled, display feedback request again
            JOptionPane.showMessageDialog(this, "Please enter feedback to delete.");
        }
    }//GEN-LAST:event_deleteFeedbackActionPerformed

    // Method to Search Feedback
    private void searchFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFeedbackActionPerformed
        // TODO add your handling code here:
        // Request user to enter a query
        String searchQuery = JOptionPane.showInputDialog(this, "Enter search query:");
        // Make sure query is not null and not empty
        if (searchQuery != null && !searchQuery.isEmpty()) {
            // Call method to search CSV
            searchFeedbackInCSV(searchQuery);
        } else {
            // Tell user to put in valid quey
            JOptionPane.showMessageDialog(this, "Please enter a valid search query.");
        }
    }//GEN-LAST:event_searchFeedbackActionPerformed

    // Method to save Feedback to CSV
    private void saveFeedbackToCSV(String userEmail, String feedback) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("feedback.csv", true))) {
            // Was displaying all feedback poorly, added logic to improve formatting
            writer.write(userEmail + "," + feedback);
            // Move to next line for next piece of Feedback
            writer.newLine();
        } catch (IOException e) { // Shows an error if issue saving feeback
            JOptionPane.showMessageDialog(this, "Error saving feedback: " + e.getMessage());
        }
    }

    // Method to search Feedback in CSV file
    private void searchFeedbackInCSV(String searchQuery) {
        try (BufferedReader reader = new BufferedReader(new FileReader("feedback.csv"))) {
            // Assign variable 
            String line;
            // Assign variable
            boolean found = false;
            // While loop which will view each line in CSV file
            while ((line = reader.readLine()) != null) {
                // If found, show
                if (line.contains(searchQuery)) {
                    JOptionPane.showMessageDialog(this, "Feedback found: " + line);
                    // Change variable status if found
                    found = true;
                    // Stop loop
                    break;
                }
            }
            // Show message is no feedback was found
            if (!found) {
                JOptionPane.showMessageDialog(this, "No feedback found matching the search query.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error searching feedback: " + e.getMessage());
        }
    }

    private void deleteFeedbackFromCSV(String feedbackDelete) {

        try (BufferedReader reader = new BufferedReader(new FileReader("feedback.csv")); BufferedWriter writer = new BufferedWriter(new FileWriter("feedback_temp.csv"))) {
            String line;
            // Assign variable
            boolean feedbackFound = false;
            // Read file
            while ((line = reader.readLine()) != null) {
                // Write the line to the temp file only if it doesn't match the feedback to delete
                if (!line.contains(feedbackDelete)) {
                    writer.write(line);
                    writer.newLine();
                } else {
                    // Change Variable if found
                    feedbackFound = true;
                }
            }
            // Notify user of result
            if (feedbackFound) {
                JOptionPane.showMessageDialog(this, "Feedback deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Feedback not found.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error deleting feedback: " + e.getMessage());
        }
        // Delete the original file
        new File("feedback.csv").delete();
        // Rename the temp file
        new File("feedback_temp.csv").renameTo(new File("feedback.csv"));
    }

    private void createCSVIfNotExist() {
        File file = new File("feedback.csv");
        // Check if file exists
        if (!file.exists()) {
            try {
                // Create new file
                file.createNewFile();
                System.out.println("CSV file created: feedback.csv");
            } catch (IOException e) {
                // Show error if creation fails
                JOptionPane.showMessageDialog(this, "Error creating CSV file: " + e.getMessage());
            }
        }
    }

    // Get feedback from CSV
    private List<String> getAllFeedbackFromCSV() {
        // List to store feedback
        List<String> feedbackList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("feedback.csv"))) {
            // Assign Variable
            String line;
            // Add each line of fedback to the ArrayList
            while ((line = reader.readLine()) != null) {
                feedbackList.add(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading feedback: " + e.getMessage());
        }
        // Show list
        return feedbackList;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FeedbackGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button deleteFeedback;
    private javax.swing.JButton depositBTN;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton profileBtn;
    private java.awt.Button searchFeedback;
    private java.awt.Button sendFeedback;
    private java.awt.TextArea userFeedbackInput;
    private java.awt.Button viewAllFeedback;
    // End of variables declaration//GEN-END:variables
}
