import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class EmployeeUp extends javax.swing.JInternalFrame {
    
    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public EmployeeUp() {
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
        
        emptable.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empdel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        epw = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        showeid = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        empsrc3 = new javax.swing.JTextField();

        setTitle("EMPLOYEE UPDATE");
        setPreferredSize(new java.awt.Dimension(350, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empdel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empdel.setText("UPDATE");
        empdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empdelActionPerformed(evt);
            }
        });
        getContentPane().add(empdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 113, -1, -1));

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
        emptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emptable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 330, 315));

        jLabel2.setText("EMPLOYEE ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });
        getContentPane().add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 32, 90, -1));

        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));
        getContentPane().add(epw, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 58, 90, -1));

        jLabel8.setText("EMPLOYEE TYPE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPE", "CASHIER", "STAFF" }));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 84, -1, -1));

        showeid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showeid.setText("EMP_ID");
        getContentPane().add(showeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 11, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH HERE"));

        empsrc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsrc3ActionPerformed(evt);
            }
        });
        empsrc3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empsrc3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empsrc3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empsrc3)
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empdelActionPerformed
        String empid = showeid.getText();
        String empname = ename.getText();
        String emppw = epw.getText();
        String emptype = type.getSelectedItem().toString();
        int x = JOptionPane.showConfirmDialog(null, "Do you want to update?");
        if(x==0)
        {
            try {           
                String query = "UPDATE employee SET EMP_NAME = '"+empname+"', PASSWORD = '"+emppw+"',EMP_TYPE = '"+emptype+"'WHERE EMP_ID = '"+empid+"'";
                pst = con.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY UPDATED");
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
    }//GEN-LAST:event_empdelActionPerformed

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed

    }//GEN-LAST:event_enameActionPerformed

    private void emptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptableMouseClicked
        int r = emptable.getSelectedRow();

        String eid = emptable.getValueAt(r, 0).toString();
        String epname = emptable.getValueAt(r, 1).toString();
        String eppw = emptable.getValueAt(r, 2).toString();
        String eptype = emptable.getValueAt(r, 3).toString();
        
        showeid.setText(eid);
        ename.setText(epname);
        epw.setText(eppw);
        type.setSelectedItem(eptype);
    }//GEN-LAST:event_emptableMouseClicked

    private void empsrc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsrc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empsrc3ActionPerformed

    private void empsrc3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empsrc3KeyReleased
        searchmethod();
    }//GEN-LAST:event_empsrc3KeyReleased

   public void searchmethod()
{
String srch = empsrc3.getText();
        
        try{
        String sql = "SELECT * FROM employee WHERE EMP_ID LIKE '%"+srch+"%' OR EMP_NAME LIKE '%"+srch+"%'";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        emptable.setModel(DbUtils.resultSetToTableModel(rs));
}catch(SQLException ex) {}
        
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empdel;
    private javax.swing.JTextField empsrc3;
    private javax.swing.JTable emptable;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField epw;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel showeid;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
