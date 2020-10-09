/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author austinm
 */
public class twoPlayersSelect extends javax.swing.JFrame {

    /**
     * Creates new form twoPlayersSelect
     */
    public twoPlayersSelect() {
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

        playerOneButtonGroup = new javax.swing.ButtonGroup();
        playerTwoButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        xSelect = new javax.swing.JRadioButton();
        oSelect = new javax.swing.JRadioButton();
        to2PlayerGame = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        xSelect1 = new javax.swing.JRadioButton();
        oSelect1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Player One Select: ");

        playerOneButtonGroup.add(xSelect);
        xSelect.setText("X's");
        xSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xSelectActionPerformed(evt);
            }
        });

        playerOneButtonGroup.add(oSelect);
        oSelect.setText("O's");
        oSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oSelectActionPerformed(evt);
            }
        });

        to2PlayerGame.setText("Continue");
        to2PlayerGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to2PlayerGameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Player Two Select: ");

        playerTwoButtonGroup.add(xSelect1);
        xSelect1.setText("X's");
        xSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xSelect1ActionPerformed(evt);
            }
        });

        playerTwoButtonGroup.add(oSelect1);
        oSelect1.setText("O's");
        oSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oSelect1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(to2PlayerGame))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(oSelect1)
                                .addComponent(xSelect1)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(oSelect)
                                .addComponent(xSelect)))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xSelect)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oSelect)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xSelect1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oSelect1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(to2PlayerGame)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void to2PlayerGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to2PlayerGameActionPerformed
        // TODO add your handling code here:
        int p1 = 0;
        int p2 = 0;
        if(xSelect.isSelected())
            p1 = 2;
        else if(oSelect.isSelected())
            p1 = 1;
        if(xSelect1.isSelected())
            p2 = 2;
        else if(oSelect1.isSelected())
            p2 = 1;
        
        if(p1 == 0 || p2 == 0)
            return;
        
        twoPlayerGame p = new twoPlayerGame(p1,p2);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_to2PlayerGameActionPerformed

    private void xSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xSelectActionPerformed
        // TODO add your handling code here:
        oSelect1.setSelected(true);
    }//GEN-LAST:event_xSelectActionPerformed

    private void oSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oSelectActionPerformed
        // TODO add your handling code here:
        xSelect1.setSelected(true);
    }//GEN-LAST:event_oSelectActionPerformed

    private void xSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xSelect1ActionPerformed
        // TODO add your handling code here:
        oSelect.setSelected(true);
    }//GEN-LAST:event_xSelect1ActionPerformed

    private void oSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oSelect1ActionPerformed
        // TODO add your handling code here:
        xSelect.setSelected(true);
    }//GEN-LAST:event_oSelect1ActionPerformed

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
            java.util.logging.Logger.getLogger(twoPlayersSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(twoPlayersSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(twoPlayersSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(twoPlayersSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new twoPlayersSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton oSelect;
    private javax.swing.JRadioButton oSelect1;
    private javax.swing.ButtonGroup playerOneButtonGroup;
    private javax.swing.ButtonGroup playerTwoButtonGroup;
    private javax.swing.JButton to2PlayerGame;
    private javax.swing.JRadioButton xSelect;
    private javax.swing.JRadioButton xSelect1;
    // End of variables declaration//GEN-END:variables
}
