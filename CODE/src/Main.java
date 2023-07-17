
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        iadd = new javax.swing.JButton();
        iupdate = new javax.swing.JButton();
        idel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        eadd = new javax.swing.JButton();
        eupdate = new javax.swing.JButton();
        edel = new javax.swing.JButton();
        mainpane = new javax.swing.JDesktopPane();
        LOGOUT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setPreferredSize(new java.awt.Dimension(550, 470));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setToolTipText("HOME");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ITEM", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        iadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iadd.setText("ADD");
        iadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iaddActionPerformed(evt);
            }
        });

        iupdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iupdate.setText("UPDATE");
        iupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iupdateActionPerformed(evt);
            }
        });

        idel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idel.setText("DELETE");
        idel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iadd)
                .addGap(18, 18, 18)
                .addComponent(iupdate)
                .addGap(18, 18, 18)
                .addComponent(idel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMPLOYEE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        eadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eadd.setText("ADD");
        eadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaddActionPerformed(evt);
            }
        });

        eupdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eupdate.setText("UPDATE");
        eupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eupdateActionPerformed(evt);
            }
        });

        edel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edel.setText("DELETE");
        edel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eadd)
                .addGap(18, 18, 18)
                .addComponent(eupdate)
                .addGap(18, 18, 18)
                .addComponent(edel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 370));

        javax.swing.GroupLayout mainpaneLayout = new javax.swing.GroupLayout(mainpane);
        mainpane.setLayout(mainpaneLayout);
        mainpaneLayout.setHorizontalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        mainpaneLayout.setVerticalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel1.add(mainpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 350, 370));

        LOGOUT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LOGOUT.setText("LOGOUT");
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });
        jPanel1.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iaddActionPerformed
        mainpane.removeAll();
        ItemAdd obj = new ItemAdd();
        mainpane.add(obj).setVisible(true);
    }//GEN-LAST:event_iaddActionPerformed

    private void eaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaddActionPerformed
        mainpane.removeAll();
        EmployeeAdd obj = new EmployeeAdd();
        mainpane.add(obj).setVisible(true);
    }//GEN-LAST:event_eaddActionPerformed

    private void iupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iupdateActionPerformed
        mainpane.removeAll();
        ItemUp obj = new ItemUp();
        mainpane.add(obj).setVisible(true);
    }//GEN-LAST:event_iupdateActionPerformed

    private void idelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idelActionPerformed
        mainpane.removeAll();
        ItemDel obj = new ItemDel();
        mainpane.add(obj).setVisible(true);
    }//GEN-LAST:event_idelActionPerformed

    private void eupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eupdateActionPerformed
        mainpane.removeAll();
        EmployeeUp obj = new EmployeeUp();
        mainpane.add(obj).setVisible(true);
    }//GEN-LAST:event_eupdateActionPerformed

    private void edelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edelActionPerformed
        mainpane.removeAll();
        EmployeeDel obj = new EmployeeDel();
        mainpane.add(obj).setVisible(true);
    }//GEN-LAST:event_edelActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to log out?");
        if(x==0)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_LOGOUTActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton eadd;
    private javax.swing.JButton edel;
    private javax.swing.JButton eupdate;
    private javax.swing.JButton iadd;
    private javax.swing.JButton idel;
    private javax.swing.JButton iupdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JDesktopPane mainpane;
    // End of variables declaration//GEN-END:variables
}
