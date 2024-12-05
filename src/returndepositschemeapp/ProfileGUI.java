/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;

import javax.swing.JOptionPane;

/**
 * @author Darren
 */
<<<<<<< HEAD:src/returndepositschemeapp/ProfileGUI.java
public class ProfileGUI extends javax.swing.JFrame {

=======
public class Profile extends javax.swing.JFrame {
    //This allows all the access of FindClosestMachine
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();
>>>>>>> 62f7eaf61e5dcc46d84e51c41e341dde331afe61:src/returndepositschemeapp/Profile.java
    
    /**
     * Creates new form Profile
     */
    public ProfileGUI() {
        initComponents();
        // Calls method
        loadUserProfile();
    }

    // Populates users information in 'ProfileGUI' window
    private void loadUserProfile() {
        User currentUser = UserManager.getCurrentUser();
        profileNameInput.setText(currentUser.getName());
        profileSurnameInput.setText(currentUser.getSurname());
        profileHomeInput.setText(currentUser.getHomeAddress());
        profileEmailInput.setText(currentUser.getEmail());
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
        profilePanel = new javax.swing.JPanel();
        saveProfileBtn = new java.awt.Button();
        profileEmailInput = new java.awt.TextField();
        profileNameInput = new java.awt.TextField();
        profileHomeInput = new java.awt.TextField();
        profileHomeLbl = new java.awt.Label();
        profileEmailLbl = new java.awt.Label();
        profileSurnameLbl = new java.awt.Label();
        profileNameLbl = new java.awt.Label();
        profileSurnameInput = new java.awt.TextField();

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

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Machine Locator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        profileBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
                    .addComponent(jButton1)
                    .addComponent(profileBtn))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        profilePanel.setBackground(new java.awt.Color(153, 153, 153));

        saveProfileBtn.setLabel("SAVE");
        saveProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProfileBtnActionPerformed(evt);
            }
        });

        profileEmailInput.setText("Enter Your Email Address...");

        profileNameInput.setText("Enter Your Name...");

        profileHomeInput.setText("Enter Your Home Address...");

        profileHomeLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileHomeLbl.setForeground(new java.awt.Color(255, 255, 255));
        profileHomeLbl.setText("Home Address");

        profileEmailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileEmailLbl.setForeground(new java.awt.Color(255, 255, 255));
        profileEmailLbl.setText("Email Address");

        profileSurnameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileSurnameLbl.setForeground(new java.awt.Color(255, 255, 255));
        profileSurnameLbl.setText("Surname");

        profileNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        profileNameLbl.setText("Name");

        profileSurnameInput.setText("Enter your Surname...");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileEmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profileHomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profileSurnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profileNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(profileNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profileSurnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profileHomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(profileEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileSurnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileSurnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileHomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileHomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileEmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProfileBtnActionPerformed
        // TODO add your handling code here:
        // Save updated profile information
        String name = profileNameInput.getText();
        String surname = profileSurnameInput.getText();
        String homeAddress = profileHomeInput.getText();
        String email = profileEmailInput.getText();

        // Validate input
        // Will add more
        if (name.isEmpty() || surname.isEmpty() || homeAddress.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.");
            return;
        }

        // Update current user details
        UserManager.updateCurrentUser(name, surname, homeAddress, email);
        // Call saveUsersToCSV method to update details
        UserManager.saveUsersToCSV();
        // Update message
        JOptionPane.showMessageDialog(this, "Profile updated");
        // Show HomepageGUI
        new HomepageGUI().setVisible(true);
        // Close ProfileGUI page
        this.setVisible(false);
    }//GEN-LAST:event_saveProfileBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //Setting hompeage visible
        HomepageGUI home = new HomepageGUI();
        home.setVisible(true);

        // Set invisible
        setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void feedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackBtnActionPerformed
        //Setting FeedbackGUI visible
        FeedbackGUI feedback = new FeedbackGUI();
        feedback.setVisible(true);

        // Set invisible
        setVisible(false);
    }//GEN-LAST:event_feedbackBtnActionPerformed

    private void depositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBTNActionPerformed
        //Setting Deposit page visible
        DepositMenuFrame deposit = new DepositMenuFrame();
        deposit.setVisible(true);

        // Set invisible
        setVisible(false);
    }//GEN-LAST:event_depositBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Setting DepositMachineLocator Gui visible
        DepositMachineLocatorGUI dmlg = new DepositMachineLocatorGUI(machineFinder);
        dmlg.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        //Setting profile visible
        ProfileGUI profile = new ProfileGUI();
        profile.setVisible(true);

        // Set invisible
        setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositBTN;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileBtn;
    private java.awt.TextField profileEmailInput;
    private java.awt.Label profileEmailLbl;
    private java.awt.TextField profileHomeInput;
    private java.awt.Label profileHomeLbl;
    private java.awt.TextField profileNameInput;
    private java.awt.Label profileNameLbl;
    private javax.swing.JPanel profilePanel;
    private java.awt.TextField profileSurnameInput;
    private java.awt.Label profileSurnameLbl;
    private java.awt.Button saveProfileBtn;
    // End of variables declaration//GEN-END:variables
}