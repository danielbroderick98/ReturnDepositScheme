/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;
import java.util.ArrayList;

/**
 *
 * @author Seamus90
 */
public class DeleteDepositFrame extends javax.swing.JFrame {
    private UserDeposits userDeposits;
    
    //This allows all the access of FindClosestMachine
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();

    /**
     * Creates new form DeleteDepositFrame
     */
    public DeleteDepositFrame() {
        initComponents();
        int currentUserID = 1;
        
        // create depositcsvreader instance
        DepositCSVReader deposit_csv_reader = new DepositCSVReader();
        
        // get users deposits from csv
        ArrayList<Deposit> userDepositsList = deposit_csv_reader.readUserDeposits(currentUserID);
        
        // initialise userdeposits
        this.userDeposits = new UserDeposits(currentUserID, userDepositsList);
        
        // clear defaul combobox items
        jComboBox1.removeAllItems();
        
        // populate dropdown
        populateDepositComboBox();
    }
    
    // populate the combobox with depositIDS
    public void populateDepositComboBox() {
         jComboBox1.removeAllItems();
        
        // get the ids of all the items in arraylist
        ArrayList<Integer> depositIDsList = userDeposits.getDepositIDs();
        
        // populate dropdown
        for (Integer depositID : depositIDsList) {
            jComboBox1.addItem(String.valueOf(depositID));
        }
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
        entEirLbl = new javax.swing.JLabel();
        entEirLbl1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
        depositBTN = new javax.swing.JButton();
        machineLocatorBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        entEirLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entEirLbl.setForeground(new java.awt.Color(255, 255, 255));
        entEirLbl.setText("Select Deposit ID");

        entEirLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entEirLbl1.setForeground(new java.awt.Color(255, 255, 255));
        entEirLbl1.setText("Delete Deposit");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entEirLbl)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(241, 241, 241)
                    .addComponent(entEirLbl1)
                    .addContainerGap(280, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(entEirLbl)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(entEirLbl1)
                    .addContainerGap(262, Short.MAX_VALUE)))
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

        depositBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void machineLocatorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machineLocatorBtnActionPerformed
        //Setting DepositMachineLocator Gui visible
        DepositMachineLocatorGUI dmlg = new DepositMachineLocatorGUI(machineFinder);
        dmlg.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_machineLocatorBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        //Setting the profile visible
        ProfileGUI profile = new ProfileGUI();
        profile.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // take in drop down item and convert to int
        String selectedItem = (String) jComboBox1.getSelectedItem();
        // for testing purposes
        System.out.println("deposit id: " + selectedItem);

        int depositIDToBeDeleted = Integer.parseInt((String) jComboBox1.getSelectedItem());
        
        // delete deposit
        userDeposits.deleteDeposit(depositIDToBeDeleted);
        
        // create instance of depositwriter and delete in deposit file
        DepositCSVWriter depositCSVWriter = new DepositCSVWriter();
        depositCSVWriter.deleteDepositCSV(depositIDToBeDeleted);
        
        // refresh dropdown
        populateDepositComboBox();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteDepositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDepositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDepositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDepositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDepositFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositBTN;
    private javax.swing.JLabel entEirLbl;
    private javax.swing.JLabel entEirLbl1;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton machineLocatorBtn;
    private javax.swing.JButton profileBtn;
    // End of variables declaration//GEN-END:variables
}