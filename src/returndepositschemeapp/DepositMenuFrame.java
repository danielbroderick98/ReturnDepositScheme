/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package returndepositschemeapp;

import returndepositschemeapp.FeedbackGUI;
import returndepositschemeapp.HomepageGUI;
import returndepositschemeapp.MakeDepositFrame;
import returndepositschemeapp.ProfileGUI;

/**
 *
 * @author 
 * acts as home page for deposits, allows navigation to other pages
 */
public class DepositMenuFrame extends javax.swing.JFrame {
<<<<<<< HEAD
=======
    //This allows all the access of FindClosestMachine
    DepositLocationManager machineFinder = DepositLocationManager.getInstanceFCM();
>>>>>>> 07465ba732993a9b5b6e1c3688aaaa14e3991090
    
    /**
     * Creates new form DepositFrameMenu
     */
    public DepositMenuFrame() {
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
        toAddDepositFrameBtn = new javax.swing.JButton();
        toDepositLeaderBoardFrame = new javax.swing.JButton();
        toDeleteDepositFrameBtn = new javax.swing.JButton();
        toUpdateDepositFrameBtn = new javax.swing.JButton();
        toDepositHistoryFrameBtn = new javax.swing.JButton();
        toHomeBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
        depositBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        toAddDepositFrameBtn.setBackground(new java.awt.Color(240, 240, 240));
        toAddDepositFrameBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        toAddDepositFrameBtn.setText("Make Deposit");
        toAddDepositFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAddDepositFrameBtnActionPerformed(evt);
            }
        });

        toDepositLeaderBoardFrame.setBackground(new java.awt.Color(240, 240, 240));
        toDepositLeaderBoardFrame.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        toDepositLeaderBoardFrame.setText("LeaderBoard");
        toDepositLeaderBoardFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDepositLeaderBoardFrameActionPerformed(evt);
            }
        });

        toDeleteDepositFrameBtn.setBackground(new java.awt.Color(240, 240, 240));
        toDeleteDepositFrameBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        toDeleteDepositFrameBtn.setText("Delete Deposit");
        toDeleteDepositFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDeleteDepositFrameBtnActionPerformed(evt);
            }
        });

        toUpdateDepositFrameBtn.setBackground(new java.awt.Color(240, 240, 240));
        toUpdateDepositFrameBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        toUpdateDepositFrameBtn.setText("Update Deposit");
        toUpdateDepositFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUpdateDepositFrameBtnActionPerformed(evt);
            }
        });

        toDepositHistoryFrameBtn.setBackground(new java.awt.Color(240, 240, 240));
        toDepositHistoryFrameBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        toDepositHistoryFrameBtn.setText("Deposit History");
        toDepositHistoryFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDepositHistoryFrameBtnActionPerformed(evt);
            }
        });

        toHomeBtn.setBackground(new java.awt.Color(240, 240, 240));
        toHomeBtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        toHomeBtn.setText("Home");
        toHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toHomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toDepositHistoryFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(toDepositLeaderBoardFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(toAddDepositFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(toDeleteDepositFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(toUpdateDepositFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(toHomeBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toAddDepositFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDeleteDepositFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toUpdateDepositFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toDepositLeaderBoardFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDepositHistoryFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(toHomeBtn)
                .addContainerGap(41, Short.MAX_VALUE))
        );

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
                    .addComponent(depositBTN)
                    .addComponent(jButton1)
                    .addComponent(profileBtn))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    // opens addepositframe gui
    private void toAddDepositFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toAddDepositFrameBtnActionPerformed
        // TODO add your handling code here:
        new MakeDepositFrame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_toAddDepositFrameBtnActionPerformed

    // opens depositleaderboardframe gui
    private void toDepositLeaderBoardFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDepositLeaderBoardFrameActionPerformed
        // TODO add your handling code here:
        DepositLeaderBoardFrame depositLeaderBoard = new DepositLeaderBoardFrame();
        depositLeaderBoard.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_toDepositLeaderBoardFrameActionPerformed

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

        
        //Collapsing current form
        setVisible(false); 
    }//GEN-LAST:event_profileBtnActionPerformed

    // opens deletedepostframe gui
    private void toDeleteDepositFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDeleteDepositFrameBtnActionPerformed
        // TODO add your handling code here:#
        DeleteDepositFrame deleteDepositForm = new DeleteDepositFrame();
        deleteDepositForm.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_toDeleteDepositFrameBtnActionPerformed

    // opens updatedepostframe gui
    private void toUpdateDepositFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUpdateDepositFrameBtnActionPerformed
        // TODO add your handling code here:#
        UpdateDepostFrame updateDepostFrame = new UpdateDepostFrame();
        updateDepostFrame.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_toUpdateDepositFrameBtnActionPerformed

    // opens depostHistoryframe gui
    private void toDepositHistoryFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDepositHistoryFrameBtnActionPerformed
        // TODO add your handling code here:
        DepositHistoryFrame depositHistoryFrame = new DepositHistoryFrame();
        depositHistoryFrame.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_toDepositHistoryFrameBtnActionPerformed

    // goes back to the home page
    private void toHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toHomeBtnActionPerformed
        // TODO add your handling code here:
        Homepage homepage = new Homepage();
        homepage.setVisible(true);
        
        //Collapsing current form
        setVisible(false);
    }//GEN-LAST:event_toHomeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DepositMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositBTN;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton toAddDepositFrameBtn;
    private javax.swing.JButton toDeleteDepositFrameBtn;
    private javax.swing.JButton toDepositHistoryFrameBtn;
    private javax.swing.JButton toDepositLeaderBoardFrame;
    private javax.swing.JButton toHomeBtn;
    private javax.swing.JButton toUpdateDepositFrameBtn;
    // End of variables declaration//GEN-END:variables
}
