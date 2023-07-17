import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ItemDel extends javax.swing.JInternalFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ItemDel() {
        try {
            initComponents();
            con = DriverManager.getConnection("jdbc:mysql://localhost/kisok", "root", "Itt/1718013");
            tableload();
        } catch (SQLException ex) {
           
        }
    }

    private void tableload() throws SQLException 
    {
        String query = "SELECT * FROM item";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        itable.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        isrch = new javax.swing.JTextField();
        showID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        iprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        imgad = new javax.swing.JTextField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sign_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setTitle("ITEM DELETE");
        setPreferredSize(new java.awt.Dimension(350, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idel.setText("DELETE");
        idel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idelActionPerformed(evt);
            }
        });
        getContentPane().add(idel, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 84, -1, -1));

        jLabel2.setText("ITEM_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        itable.setModel(new javax.swing.table.DefaultTableModel(
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
        itable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 323, 170));

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH HERE"));

        isrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isrchActionPerformed(evt);
            }
        });
        isrch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                isrchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isrch, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isrch)
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 11, -1, 70));

        showID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showID.setText("ITEM ID");
        getContentPane().add(showID, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 11, -1, -1));

        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        iname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inameActionPerformed(evt);
            }
        });
        getContentPane().add(iname, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 32, 105, -1));

        jLabel5.setText("PRICE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));
        getContentPane().add(iprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 58, 105, -1));

        jLabel8.setText("PICTURE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, -1));

        imgad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgadActionPerformed(evt);
            }
        });
        getContentPane().add(imgad, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 85, 104, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idelActionPerformed
        String iid = showID.getText();
       
        int x = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        if(x==0)
        {
            try {           
                String query = "DELETE FROM item WHERE ITEM_CODE = '"+iid+"'";
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
                    
       showID.setText("");
        iname.setText("");
        iprice.setText("");
        imgad.setText("");  
    }//GEN-LAST:event_idelActionPerformed

    private void itableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itableMouseClicked
        int r = itable.getSelectedRow();

        String itid = itable.getValueAt(r, 0).toString();
        String itname = itable.getValueAt(r, 1).toString();
        String itprice = itable.getValueAt(r, 2).toString();
        String itpic = itable.getValueAt(r, 3).toString();

        showID.setText(itid);
        iname.setText(itname);
        iprice.setText(itprice);
        imgad.setText(itpic);
    }//GEN-LAST:event_itableMouseClicked

    private void isrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isrchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isrchActionPerformed

    private void isrchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isrchKeyReleased
        searchmethod();
    }//GEN-LAST:event_isrchKeyReleased

    private void inameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inameActionPerformed

    }//GEN-LAST:event_inameActionPerformed

    private void imgadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgadActionPerformed
public void searchmethod()
{
String srch = isrch.getText();
        
        try{
        String sql = "SELECT * FROM item WHERE ITEM_CODE LIKE '%"+srch+"%' OR ITEM_NAME LIKE '%"+srch+"%'";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        itable.setModel(DbUtils.resultSetToTableModel(rs));
}catch(SQLException ex) {}
        
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton idel;
    private javax.swing.JTextField imgad;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField iprice;
    private javax.swing.JTextField isrch;
    private javax.swing.JTable itable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel showID;
    // End of variables declaration//GEN-END:variables
}
