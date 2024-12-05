/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;
import java.util.ArrayList;
/**
 *
 * @author Seamus90
 * gui that allows users to select a deposit id and then update it based on bottle amounts enter in fields
 */
public class UpdateDepostFrame extends javax.swing.JFrame {
    private UserDeposits userDeposits;
    private DepositCsvManager depositCsvManager;

    //This allows all the access of FindClosestMachine
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();
    
    /**
     * Creates new form UpdateDepostForm
     */
    public UpdateDepostFrame() {
        initComponents();
        // get current user
        User currentUser = UserManager.getCurrentUser();
        String currentUserEmail = currentUser.getEmail();
        // initialising depositcsvmanager object 
        this.depositCsvManager = new DepositCsvManager();
        
        // get users deposits from csv
        ArrayList<Deposit> userDepositsList = this.depositCsvManager.readUserDeposits(currentUserEmail);
        
        // initialise userdeposits
        this.userDeposits = new UserDeposits(currentUserEmail, userDepositsList);
        
        // clear defaul combobox items
        depositIdComboBox.removeAllItems();
        
        // populate dropdown
        populateDepositComboBox();
    }
    // populate the combobox with depositIDS
    public void populateDepositComboBox() {
         depositIdComboBox.removeAllItems();
        
        // get the ids of all the items in arraylist
        ArrayList<Integer> depositIDsList = userDeposits.getDepositIds();
        
        // populate dropdown
        for (Integer depositID : depositIDsList) {
            depositIdComboBox.addItem(String.valueOf(depositID));
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
        homeBtn = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
        depositBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        smallContainersLbl = new javax.swing.JLabel();
        smallContainerField = new javax.swing.JTextField();
        largeContainerLbl = new javax.swing.JLabel();
        largeContainerField = new javax.swing.JTextField();
        updatePageHeaderLbl = new javax.swing.JLabel();
        depositIdComboBox = new javax.swing.JComboBox<>();
        selectDepositIdLbl = new javax.swing.JLabel();
        upDateDepositBtn = new javax.swing.JButton();
        backToDepositMenuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBtn)
                    .addComponent(feedbackBtn)
                    .addComponent(jButton1)
                    .addComponent(profileBtn)
                    .addComponent(depositBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        smallContainersLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        smallContainersLbl.setForeground(new java.awt.Color(255, 255, 255));
        smallContainersLbl.setText("Small Containers (150ml to 500ml)");

        smallContainerField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));

        largeContainerLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        largeContainerLbl.setForeground(new java.awt.Color(255, 255, 255));
        largeContainerLbl.setText("Large Containers (Over 500ml to 3L)");

        largeContainerField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));

        updatePageHeaderLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatePageHeaderLbl.setForeground(new java.awt.Color(255, 255, 255));
        updatePageHeaderLbl.setText("Update Deposit");

        depositIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectDepositIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectDepositIdLbl.setForeground(new java.awt.Color(255, 255, 255));
        selectDepositIdLbl.setText("Select Deposit ID");

        upDateDepositBtn.setBackground(new java.awt.Color(240, 240, 240));
        upDateDepositBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        upDateDepositBtn.setText("Update");
        upDateDepositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upDateDepositBtnActionPerformed(evt);
            }
        });

        backToDepositMenuBtn.setBackground(new java.awt.Color(240, 240, 240));
        backToDepositMenuBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        backToDepositMenuBtn.setText("Back");
        backToDepositMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDepositMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(largeContainerLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(smallContainersLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(smallContainerField)
                    .addComponent(largeContainerField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(depositIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(upDateDepositBtn)
                        .addGap(18, 18, 18)
                        .addComponent(backToDepositMenuBtn)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatePageHeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectDepositIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(232, 232, 232))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(updatePageHeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectDepositIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(depositIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(smallContainersLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smallContainerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(largeContainerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(largeContainerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upDateDepositBtn)
                    .addComponent(backToDepositMenuBtn))
                .addGap(21, 21, 21))
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
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Setting DepositMachineLocator Gui visible
        DepositMachineLocatorGUI dmlg = new DepositMachineLocatorGUI(machineFinder);
        dmlg.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        //Setting the profile visible
        ProfileGUI profile = new ProfileGUI();
        profile.setVisible(true);

        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

    // updates a deposit with the new bottle number inside the input fields when btn is clicked
    private void upDateDepositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upDateDepositBtnActionPerformed
        // TODO add your handling code here:
        //initialise bottle counts to 0
        int numSmallBottles = 0;
        int numLargeBottles = 0;
        
        // get input from text fields
        String numSmallBottlesString = smallContainerField.getText();
        String numLargeBottlesString = largeContainerField.getText();
        
        // pull in drop down id number selected and convert to int
        String selectedDepositIdString = (String) depositIdComboBox.getSelectedItem();
        int selectedDepositId = Integer.parseInt(selectedDepositIdString);
        
        // get the selected deposit
        Deposit selectedDeposit = userDeposits.getDepositById(selectedDepositId);
        
        // check if either field is empty, if so get the current bottle count, otherwise take the input amount
        if (numSmallBottlesString.isEmpty() == false) {
            numSmallBottles = Integer.parseInt(numSmallBottlesString);
        } else {
            numSmallBottles = selectedDeposit.getNumSmallBottles();
        }
        
        if (numLargeBottlesString.isEmpty() == false) {
            numLargeBottles = Integer.parseInt(numLargeBottlesString);
        } else {
            numLargeBottles = selectedDeposit.getNumLargeBottles();
        }
        

        // pass in id and numbers to be updated
        userDeposits.updateDeposit(selectedDepositId, numLargeBottles, numSmallBottles);
     
        // update csv
        depositCsvManager.updateDepositCsv(selectedDeposit);
        
        // reset fields
        smallContainerField.setText("");
        largeContainerField.setText("");
        
        // succesful updates message
        javax.swing.JOptionPane.showMessageDialog(this, "Deposit successfully updated!");
        
    }//GEN-LAST:event_upDateDepositBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDepostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDepostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDepostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDepostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDepostFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToDepositMenuBtn;
    private javax.swing.JButton depositBTN;
    private javax.swing.JComboBox<String> depositIdComboBox;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField largeContainerField;
    private javax.swing.JLabel largeContainerLbl;
    private javax.swing.JButton profileBtn;
    private javax.swing.JLabel selectDepositIdLbl;
    private javax.swing.JTextField smallContainerField;
    private javax.swing.JLabel smallContainersLbl;
    private javax.swing.JButton upDateDepositBtn;
    private javax.swing.JLabel updatePageHeaderLbl;
    // End of variables declaration//GEN-END:variables
}
