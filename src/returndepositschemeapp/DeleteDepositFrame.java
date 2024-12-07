/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;
import java.util.ArrayList;
import returndepositschemeapp.UserManager;

/**
 *
 * @author Seamus McMenamy
 * that allows user to select a deposit id and then delete deposit based on that id
 */
public class DeleteDepositFrame extends javax.swing.JFrame {
    private UserDeposits userDeposits;

    private DepositCsvManager depositCsvManager;

    //This allows all the access of FindClosestMachine
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();


    /**
     * Creates new form DeleteDepositFrame
     */
    public DeleteDepositFrame() {
        initComponents();
        // get current user that is logged in
        User currentUser = UserManager.getCurrentUser();
        // store current users email
        String currentUserEmail = currentUser.getEmail();

        // initialising depositcsvmanager
        this.depositCsvManager = new DepositCsvManager();

        // get users deposits from csv
        ArrayList<Deposit> userDepositsList = this.depositCsvManager.readUserDeposits(currentUserEmail);

        // initialise userdeposits
        this.userDeposits = new UserDeposits(currentUserEmail, userDepositsList);

        // clear default drop down items
        jComboBox1.removeAllItems();

        // populate dropdon
        populateDepositComboBox();
    }

    // merhod to populate the combobox with depositIdS
    public void populateDepositComboBox() {
         jComboBox1.removeAllItems();

        // get the ids of all the items in arraylist
        ArrayList<Integer> depositIdsList = userDeposits.getDepositIds();

        // populate dropdown with IDs
        for (Integer depositId : depositIdsList) {
            jComboBox1.addItem(String.valueOf(depositId));
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
        deleteDepositBtn = new javax.swing.JButton();
        backToDepositMenuBtn = new javax.swing.JButton();
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

        deleteDepositBtn.setText("Delete");
        deleteDepositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDepositBtnActionPerformed(evt);
            }
        });

        backToDepositMenuBtn.setText("Back");
        backToDepositMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDepositMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(deleteDepositBtn)
                .addGap(29, 29, 29)
                .addComponent(backToDepositMenuBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(entEirLbl)
                            .addGap(246, 246, 246))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(entEirLbl1)
                            .addGap(254, 254, 254)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(entEirLbl1)
                .addGap(18, 18, 18)
                .addComponent(entEirLbl)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteDepositBtn)
                    .addComponent(backToDepositMenuBtn))
                .addContainerGap(118, Short.MAX_VALUE))
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
        //Setting Feedback visible
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

    // method to delete deposit when button is clicked
    private void deleteDepositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDepositBtnActionPerformed
        // TODO add your handling code here:
        // take in drop down item
        String selectedItem = (String) jComboBox1.getSelectedItem();

        // convert the string id to an int
        int depositIdToBeDeleted = Integer.parseInt((String) jComboBox1.getSelectedItem());

        // delete deposit in userdeposits based on id
        userDeposits.deleteDeposit(depositIdToBeDeleted);

        // delete deposit from csv based on id
        depositCsvManager.deleteDepositCsv(depositIdToBeDeleted);

        // refresh dropdown
        populateDepositComboBox();
        // message on successful deletion
        javax.swing.JOptionPane.showMessageDialog(this, "Deposit Successfully deleted!");

    }//GEN-LAST:event_deleteDepositBtnActionPerformed

    // bring user back to depositmenu
    private void backToDepositMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToDepositMenuBtnActionPerformed
        // TODO add your handling code here:
        DepositMenuFrame depositMenu = new DepositMenuFrame();
        depositMenu.setVisible(true);
        // collapse current form
        setVisible(false);
    }//GEN-LAST:event_backToDepositMenuBtnActionPerformed

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
    private javax.swing.JButton backToDepositMenuBtn;
    private javax.swing.JButton deleteDepositBtn;
    private javax.swing.JButton depositBTN;
    private javax.swing.JLabel entEirLbl;
    private javax.swing.JLabel entEirLbl1;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton machineLocatorBtn;
    private javax.swing.JButton profileBtn;
    // End of variables declaration//GEN-END:variables
}
