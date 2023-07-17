
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class EmployeeAdd extends javax.swing.JInternalFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public EmployeeAdd() {
        initComponents();
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/kisok", "root", "Itt/1718013");
        tableload();
        autoID();
        }
        catch (SQLException e)
        {}
    }

        private void tableload() throws SQLException 
    {
        String query = "SELECT * FROM employee";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        emptable.setModel(DbUtils.resultSetToTableModel(rs));
    }
private void autoID() throws SQLException
{
try {
    Statement s = con.createStatement();
    ResultSet res = s.executeQuery("SELECT Max(EMP_ID) FROM employee");
    res.next();
    
    res.getString("Max(EMP_ID)");
    
    if(res.getString("Max(EMP_ID)")==null)
    {
    eid.setText("A0001");
    }
    else
    {
    Long id = Long.parseLong(res.getString("Max(EMP_ID)").substring(2,res.getString("Max(EMP_ID)").length()));
            id++;
            eid.setText("E0" + String.format("%03d", id));
            }
   
}catch(SQLException ex) {
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setBackground(new java.awt.Color(255, 255, 204));
        setTitle("EMPLOYEE ADD");
        setPreferredSize(new java.awt.Dimension(350, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("EMPLOYEE ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        getContentPane().add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 11, 65, -1));

        jLabel4.setText("NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });
        getContentPane().add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 37, 200, -1));

        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));
        getContentPane().add(epw, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 63, 200, -1));

        jLabel8.setText("EMPLOYEE TYPE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, -1, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPE", "CASHIER", "STAFF", "ADMIN" }));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 89, -1, -1));

        empadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empadd.setText("ADD");
        empadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empaddActionPerformed(evt);
            }
        });
        getContentPane().add(empadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 118, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 147, 324, 315));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed

    }//GEN-LAST:event_enameActionPerformed

    private void empaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empaddActionPerformed
        try{

            String empid = eid.getText();
            String empname = ename.getText();
            String emppw = epw.getText();
            String emptype = type.getSelectedItem().toString();

            
            try{
                String sql = "INSERT INTO employee VALUES ('"+empid+"','"+empname+"','"+emptype+"','"+emppw+"')";
                con = DriverManager.getConnection("jdbc:mysql://localhost/kisok", "root", "Itt/1718013");
                pst=con.prepareStatement(sql);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY ADDED");
                
                tableload();
                autoID();

            }catch(HeadlessException | SQLException ex){

                JOptionPane.showMessageDialog(null, ex);
            }

            tableload();
        }catch(SQLException ex){

            
        }
        try {
    Statement s = con.createStatement();
    ResultSet res = s.executeQuery("SELECT Max(EMP_ID) FROM employee");
    res.next();
    
    res.getString("Max(EMP_ID)");
    
    
    Long id = Long.parseLong(res.getString("Max(EMP_ID)").substring(2,res.getString("Max(EMP_ID)").length()));
            id++;
            eid.setText("E0" + String.format("%03d", id));
            
   
}catch(SQLException ex) {
}
        //eid.setText("");
        ename.setText("");
        epw.setText("");
        type.setSelectedItem("TYPE");
    }//GEN-LAST:event_empaddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eid;
    private javax.swing.JButton empadd;
    private javax.swing.JTable emptable;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField epw;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
