/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;

import returndepositschemeapp.DepositMachines;
import returndepositschemeapp.DepositMenuFrame;
import returndepositschemeapp.FeedbackGUI;
import returndepositschemeapp.HomepageGUI;
import returndepositschemeapp.ProfileGUI;

/**
 *
 * @author dbrod
 */
public class DepositMachineLocatorGUI extends javax.swing.JFrame {
    //Retrieving instance and assigning it to machineFinderVariable
    FindClosestMachine machineFinder = FindClosestMachine.getInstanceFCM();
    
    /**
     * Creates new form DepositMachineLocatorGUI
     */
    //passing machineFinder instance through constructor parameter
    public DepositMachineLocatorGUI(FindClosestMachine machineFinder) {
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

        jPanel2 = new javax.swing.JPanel();
        entEirTxtField = new javax.swing.JTextField();
        entLatTxtField = new javax.swing.JTextField();
        entLongTxtField = new javax.swing.JTextField();
        entLocationBtn = new javax.swing.JButton();
        entEirLbl = new javax.swing.JLabel();
        entLonLat = new javax.swing.JLabel();
        entLatLbl = new javax.swing.JLabel();
        nearestLocLbl = new javax.swing.JLabel();
        viewDepMachBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
        depositBTN = new javax.swing.JButton();
        machineLocatorBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        entEirTxtField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        entEirTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entEirTxtFieldActionPerformed(evt);
            }
        });

        entLatTxtField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        entLatTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entLatTxtFieldActionPerformed(evt);
            }
        });

        entLongTxtField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        entLongTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entLongTxtFieldActionPerformed(evt);
            }
        });

        entLocationBtn.setText("ENTER");
        entLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entLocationBtnActionPerformed(evt);
            }
        });

        entEirLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entEirLbl.setForeground(new java.awt.Color(255, 255, 255));
        entEirLbl.setText("ENTER EIRCODE");

        entLonLat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entLonLat.setForeground(new java.awt.Color(255, 255, 255));
        entLonLat.setText("ENTER LONGITUDE");

        entLatLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entLatLbl.setForeground(new java.awt.Color(255, 255, 255));
        entLatLbl.setText("ENTER LATITUDE");

        nearestLocLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nearestLocLbl.setForeground(new java.awt.Color(255, 255, 255));

        viewDepMachBtn.setText("View All Deposit Machines");
        viewDepMachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDepMachBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nearestLocLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entLatLbl)
                                    .addComponent(entEirLbl))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(entLonLat)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entLongTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entLatTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entEirTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(entLocationBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(viewDepMachBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entEirTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entEirLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entLatTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entLatLbl))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entLongTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entLonLat))
                .addGap(18, 18, 18)
                .addComponent(entLocationBtn)
                .addGap(18, 18, 18)
                .addComponent(nearestLocLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDepMachBtn)
                .addGap(23, 23, 23))
        );

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

        machineLocatorBtn.setBackground(new java.awt.Color(51, 51, 51));
        machineLocatorBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        machineLocatorBtn.setForeground(new java.awt.Color(255, 255, 255));
        machineLocatorBtn.setText("Machine Locator");
        machineLocatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machineLocatorBtnActionPerformed(evt);
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
                .addComponent(machineLocatorBtn)
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
                    .addComponent(machineLocatorBtn)
                    .addComponent(profileBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        //Setting the profile visible
        ProfileGUI profile = new ProfileGUI();
        profile.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void machineLocatorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machineLocatorBtnActionPerformed
        //Setting Deposit Machine Gui visible
        DepositMachineLocatorGUI machines = new DepositMachineLocatorGUI(machineFinder);
        machines.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_machineLocatorBtnActionPerformed

    private void depositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBTNActionPerformed
        //Setting Deposit Frame visible
        DepositMenuFrame deposit = new DepositMenuFrame();
        deposit.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_depositBTNActionPerformed

    private void feedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackBtnActionPerformed
        //Setting FeedbackGUI visible
        FeedbackGUI feedback = new FeedbackGUI();
        feedback.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_feedbackBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //Setting hompeage visible
        HomepageGUI home = new HomepageGUI();
        home.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void viewDepMachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDepMachBtnActionPerformed
        //Creating and displaying the DepositMachines form
        DepositMachines depositMachinesForm = new DepositMachines(machineFinder);

        //Setting the visibility of deposit machine gui to be not visible
        depositMachinesForm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_viewDepMachBtnActionPerformed

    private void entLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entLocationBtnActionPerformed
        try {
            //Retrieving and parsing the text from the text fields
            double latitude = Double.parseDouble(entLatTxtField.getText());
            double longitude = Double.parseDouble(entLongTxtField.getText());
            String eir = entEirTxtField.getText();

            //Creating a UserLocation object
            //Passing throught the values from the text field
            UserLocation userLoc = new UserLocation(latitude, longitude, eir);
            DepositLocation closestMachine = machineFinder.findClosestMachine(userLoc);

            //Displaying the closest machine
            if (closestMachine != null) {
                nearestLocLbl.setText("Latitude: " + closestMachine.latitude + " Longitude: " + closestMachine.longitude + " Eircode: " + closestMachine.eircode + " is the nearest location.");
            } else {
                nearestLocLbl.setText("No deposit locations available.");
            }
        }
        catch (NumberFormatException e) {
            //Handling invalid input
            nearestLocLbl.setText("Invalid input: Please enter valid numeric values for latitude, longitude, and eircode.");
        }
    }//GEN-LAST:event_entLocationBtnActionPerformed

    private void entLongTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entLongTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entLongTxtFieldActionPerformed

    private void entLatTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entLatTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entLatTxtFieldActionPerformed

    private void entEirTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entEirTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entEirTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositBTN;
    private javax.swing.JLabel entEirLbl;
    private javax.swing.JTextField entEirTxtField;
    private javax.swing.JLabel entLatLbl;
    private javax.swing.JTextField entLatTxtField;
    private javax.swing.JButton entLocationBtn;
    private javax.swing.JLabel entLonLat;
    private javax.swing.JTextField entLongTxtField;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton machineLocatorBtn;
    private javax.swing.JLabel nearestLocLbl;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton viewDepMachBtn;
    // End of variables declaration//GEN-END:variables
}
