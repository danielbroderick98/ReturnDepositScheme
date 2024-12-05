/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Darren
 */
<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
public class FeedbackGUI extends javax.swing.JFrame {

=======
public class Feedback extends javax.swing.JFrame {
    //This allows all the access of FindClosestMachine
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();
    
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
    
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
        feedbackPanel = new javax.swing.JPanel();
        userFeedbackInput = new java.awt.TextArea();
        sendFeedbackBtn = new java.awt.Button();
        viewAllFeedbackBtn = new java.awt.Button();
        deleteFeedbackBtn = new java.awt.Button();
        searchFeedbackBtn = new java.awt.Button();

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

        feedbackPanel.setBackground(new java.awt.Color(153, 153, 153));
        feedbackPanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                feedbackPanelComponentAdded(evt);
            }
        });

        userFeedbackInput.setMaximumSize(new java.awt.Dimension(100, 80));
        userFeedbackInput.setText("Please Enter Your Feedback...");

<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
        sendFeedbackBtn.setLabel("SEND");
        sendFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
=======
        sendFeedback.setLabel("SEND");
        sendFeedback.setMaximumSize(new java.awt.Dimension(49, 24));
        sendFeedback.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendFeedbackBtnActionPerformed(evt);
            }
        });

<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
        viewAllFeedbackBtn.setLabel("View All Feedback");
        viewAllFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
=======
        viewAllFeedback.setLabel("View All Feedback");
        viewAllFeedback.setMaximumSize(new java.awt.Dimension(113, 24));
        viewAllFeedback.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllFeedbackBtnActionPerformed(evt);
            }
        });

<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
        deleteFeedbackBtn.setLabel("Delete Feedback");
        deleteFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
=======
        deleteFeedback.setLabel("Delete Feedback");
        deleteFeedback.setMaximumSize(new java.awt.Dimension(107, 24));
        deleteFeedback.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFeedbackBtnActionPerformed(evt);
            }
        });

<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
        searchFeedbackBtn.setLabel("Search Feedback");
        searchFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
=======
        searchFeedback.setLabel("Search Feedback");
        searchFeedback.setMaximumSize(new java.awt.Dimension(110, 24));
        searchFeedback.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFeedbackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout feedbackPanelLayout = new javax.swing.GroupLayout(feedbackPanel);
        feedbackPanel.setLayout(feedbackPanelLayout);
        feedbackPanelLayout.setHorizontalGroup(
            feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackPanelLayout.createSequentialGroup()
                .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(userFeedbackInput, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(feedbackPanelLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(sendFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(feedbackPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(searchFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(deleteFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
                        .addComponent(viewAllFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
=======
                        .addComponent(viewAllFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
        );
        feedbackPanelLayout.setVerticalGroup(
            feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbackPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(userFeedbackInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewAllFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(feedbackPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(feedbackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method to send FeedbackGUI
    private void sendFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendFeedbackBtnActionPerformed
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
    }//GEN-LAST:event_sendFeedbackBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // Setting hompeage visible
        HomepageGUI home = new HomepageGUI();
        home.setVisible(true);
        // Setting FeedbackGUI invisible
        setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void feedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackBtnActionPerformed
        // Setting FeedbackGUI visible
        FeedbackGUI feedback = new FeedbackGUI();
        feedback.setVisible(true);
        // Setting FeedbackGUI invisible
        setVisible(false);
    }//GEN-LAST:event_feedbackBtnActionPerformed

    private void depositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBTNActionPerformed
        // Setting Deposit visible
        DepositMenuFrame deposit = new DepositMenuFrame();
        deposit.setVisible(true);
        // Setting FeedbackGUI invisible
        setVisible(false);
    }//GEN-LAST:event_depositBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
<<<<<<< HEAD:src/returndepositschemeapp/FeedbackGUI.java
        // Setting Locator visible
       // DepositMachineLocatorGUI machines = new DepositMachineLocatorGUI();
        //machines.setVisible(true);
        // Setting FeedbackGUI invisible
        //Collapsing current form
        //setVisible(false);
=======
        //Setting DepositMachineLocator Gui visible
        DepositMachineLocatorGUI dmlg = new DepositMachineLocatorGUI(machineFinder);
        dmlg.setVisible(true);
        
        setVisible(false);
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Feedback.java
    }//GEN-LAST:event_jButton1ActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // Setting profile visible
        ProfileGUI profile = new ProfileGUI();
        profile.setVisible(true);
        // Setting FeedbackGUI invisible
        setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void feedbackPanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_feedbackPanelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackPanelComponentAdded

    //Method to view all FeedbackGUI
    private void viewAllFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllFeedbackBtnActionPerformed
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
    }//GEN-LAST:event_viewAllFeedbackBtnActionPerformed

    // Method to delete FeedbackGUI
    private void deleteFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFeedbackBtnActionPerformed
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
    }//GEN-LAST:event_deleteFeedbackBtnActionPerformed

    // Method to Search FeedbackGUI
    private void searchFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFeedbackBtnActionPerformed
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
    }//GEN-LAST:event_searchFeedbackBtnActionPerformed

    // Method to save FeedbackGUI to CSV
    private void saveFeedbackToCSV(String userEmail, String feedback) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("feedback.csv", true))) {
            // Was displaying all feedback poorly, added logic to improve formatting
            writer.write(userEmail + "," + feedback);
            // Move to next line for next piece of FeedbackGUI
            writer.newLine();
        } catch (IOException e) { // Shows an error if issue saving feeback
            JOptionPane.showMessageDialog(this, "Error saving feedback: " + e.getMessage());
        }
    }

    // Method to search FeedbackGUI in CSV file
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
    private java.awt.Button deleteFeedbackBtn;
    private javax.swing.JButton depositBTN;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JPanel feedbackPanel;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileBtn;
    private java.awt.Button searchFeedbackBtn;
    private java.awt.Button sendFeedbackBtn;
    private java.awt.TextArea userFeedbackInput;
    private java.awt.Button viewAllFeedbackBtn;
    // End of variables declaration//GEN-END:variables
}
