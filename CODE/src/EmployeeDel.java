import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class EmployeeDel extends javax.swing.JInternalFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public EmployeeDel() {
        try {
            initComponents();
            con = DriverManager.getConnection("jdbc:mysql://localhost/kisok", "root", "Itt/1718013");
            tableload();
        } catch (SQLException ex) {
           
        }
    }

     private void tableload() throws SQLException 
    {
        String query = "SELECT * FROM employee";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        emptable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        staffsrcht2 = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        epw = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        empadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        edel = new javax.swing.JButton();
        type1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ename1 = new javax.swing.JTextField();
        epw1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        emptable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        empsrc = new javax.swing.JTextField();
        showeid = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH HERE"));

        staffsrcht2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffsrcht2ActionPerformed(evt);
            }
        });
        staffsrcht2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                staffsrcht2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffsrcht2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffsrcht2)
                .addGap(13, 13, 13))
        );

        setBackground(new java.awt.Color(255, 255, 204));
        setTitle("EMPLOYEE DELETE");
        setPreferredSize(new java.awt.Dimension(350, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setTitle("EMPLOYEE ADD");
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(350, 370));

        jLabel2.setText("EMPLOYEE ID");

        jLabel4.setText("NAME");

        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });

        jLabel5.setText("PASSWORD");

        jLabel8.setText("EMPLOYEE TYPE");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPE", "CASHIER", "STAFF" }));

        empadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empadd.setText("ADD");
        empadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empaddActionPerformed(evt);
            }
        });

        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(emptable);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ename, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(epw)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empadd)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(epw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(empadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 267, 0, 0));

        edel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edel.setText("DELETE");
        edel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edelActionPerformed(evt);
            }
        });
        getContentPane().add(edel, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 110, -1, -1));

        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPE", "CASHIER", "STAFF" }));
        getContentPane().add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 84, -1, -1));

        jLabel9.setText("EMPLOYEE TYPE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, -1, -1));

        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, -1, -1));

        jLabel7.setText("NAME");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 35, -1, -1));

        jLabel3.setText("EMPLOYEE ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        ename1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ename1ActionPerformed(evt);
            }
        });
        getContentPane().add(ename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 32, 90, -1));
        getContentPane().add(epw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 58, 90, -1));

        emptable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        emptable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(emptable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 334, 315));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH HERE"));

        empsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsrcActionPerformed(evt);
            }
        });
        empsrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empsrcKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empsrc)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empsrc)
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 11, 127, -1));

        showeid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showeid.setText("EMP_ID");
        getContentPane().add(showeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed

    }//GEN-LAST:event_enameActionPerformed

    private void empaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empaddActionPerformed
       
    }//GEN-LAST:event_empaddActionPerformed

    private void edelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edelActionPerformed
    String empid = showeid.getText();
       
        int x = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        if(x==0)
        {
            try {           
                String query = "DELETE FROM employee WHERE EMP_ID = '"+empid+"'";
                pst = con.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY DELETED");
            } catch (SQLException ex) {
                
            }
        }
        try {
            tableload();
        } catch (SQLException ex) {
            
        }
                    
       showeid.setText("");
        ename.setText("");
        epw.setText("");
        type.setSelectedItem("TYPE");        
    }//GEN-LAST:event_edelActionPerformed

    public void searchmethod()
{
String srch = empsrc.getText();
        
        try{
        String sql = "SELECT * FROM employee WHERE EMP_ID LIKE '%"+srch+"%' OR EMP_NAME LIKE '%"+srch+"%'";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        emptable1.setModel(DbUtils.resultSetToTableModel(rs));
}catch(SQLException ex) {}
        
}
    
    private void ename1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ename1ActionPerformed

    }//GEN-LAST:event_ename1ActionPerformed

    private void staffsrcht2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffsrcht2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffsrcht2ActionPerformed

    private void staffsrcht2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffsrcht2KeyReleased
      
    }//GEN-LAST:event_staffsrcht2KeyReleased

    private void empsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empsrcActionPerformed

    private void empsrcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empsrcKeyReleased
        searchmethod();
    }//GEN-LAST:event_empsrcKeyReleased

    private void emptable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptable1MouseClicked
        int r = emptable1.getSelectedRow();

        String epid = emptable1.getValueAt(r, 0).toString();
        String epname = emptable1.getValueAt(r, 1).toString();
        String eppw = emptable1.getValueAt(r, 2).toString();
        String etype = emptable1.getValueAt(r, 3).toString();

        showeid.setText(epid);
        ename1.setText(epname);
        epw1.setText(eppw);
        type1.setSelectedItem(etype);
    }//GEN-LAST:event_emptable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edel;
    private javax.swing.JTextField eid;
    private javax.swing.JButton empadd;
    private javax.swing.JTextField empsrc;
    private javax.swing.JTable emptable;
    private javax.swing.JTable emptable1;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField ename1;
    private javax.swing.JTextField epw;
    private javax.swing.JTextField epw1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel showeid;
    private javax.swing.JTextField staffsrcht2;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> type1;
    // End of variables declaration//GEN-END:variables
}
