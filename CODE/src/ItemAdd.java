
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aruni
 */
public class ItemAdd extends javax.swing.JInternalFrame {
    
    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ItemAdd() {
        initComponents();
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/kisok", "root", "Itt/1718013");
        //tableload();
        autoID();
        }
        catch (SQLException e)
        {}
    }

    /*private void tableload() throws SQLException 
    {
        String query = "SELECT * FROM item";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        //itable.setModel(DbUtils.resultSetToTableModel(rs));
    }*/
private void autoID() throws SQLException
{
try {
    Statement s = con.createStatement();
    ResultSet res = s.executeQuery("SELECT Max(ITEM_CODE) FROM item");
    res.next();
    
    res.getString("Max(ITEM_CODE)");
    
    if(res.getString("Max(ITEM_CODE)")==null)
    {
    iid.setText("I001");
    }
    else
    {
    Long id = Long.parseLong(res.getString("Max(ITEM_CODE)").substring(2,res.getString("Max(ITEM_CODE)").length()));
            id++;
            iid.setText("I0" + String.format("%02d", id));
            }
   
}catch(SQLException ex) {
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        iid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        iname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        iprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        imgad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        showpic = new javax.swing.JLabel();
        showimg = new javax.swing.JLabel();

        setTitle("ITEM ADD");
        setPreferredSize(new java.awt.Dimension(350, 370));

        jLabel2.setText("ITEM_ID");

        jLabel4.setText("NAME");

        iname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inameActionPerformed(evt);
            }
        });

        jLabel5.setText("PRICE");

        jLabel8.setText("PICTURE");

        imgad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgadActionPerformed(evt);
            }
        });

        jButton1.setText("BROWSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iid, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iprice, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(showimg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100)
                .addComponent(showpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showpic, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(iid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(iprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(imgad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showimg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inameActionPerformed

    }//GEN-LAST:event_inameActionPerformed

    private void imgadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String itid = iid.getText();
        String itname = iname.getText();
        String itprice = iprice.getText();
        String img = imgad.getText();
        img = img.replace("\\","\\\\");
        //System.out.println(imgad);
        try{
            String sql = "INSERT INTO item VALUES ('"+itid+"','"+itname+"','"+itprice+"','"+img+"')";
            con = DriverManager.getConnection("jdbc:mysql://localhost/kisok", "root", "Itt/1718013");
            pst=con.prepareStatement(sql);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY ADDED");
            
            //tableload();
            autoID();
            
        }catch(HeadlessException | SQLException ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //tableload();
        try {
    Statement s = con.createStatement();
    ResultSet res = s.executeQuery("SELECT Max(ITEM_CODE) FROM item");
    res.next();
    
    res.getString("Max(ITEM_CODE)");
    
    
    Long id = Long.parseLong(res.getString("Max(ITEM_CODE)").substring(2,res.getString("Max(ITEM_CODE)").length()));
            id++;
            iid.setText("I0" + String.format("%01d", id));
            
   
    }catch(SQLException ex) {
    }
        //eid.setText("");
        iname.setText("");
        iprice.setText("");
        imgad.setText("");
        showimg.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        /*FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        chooser.addChoosableFileFilter(fnwf);
        int load = chooser.showOpenDialog(null);
        
        if(load==chooser.APPROVE_OPTION)
        {
         f= chooser.getSelectedFile()
        }*/
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String fileName = f.getAbsolutePath();
        imgad.setText(fileName);
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(fileName);
        //Image image = icon.getImage().getScaledInstance(showpic.getWidth(),showpic.getHeight(), Image.SCALE_SMOOTH);
        Image image = icon.getImage().getScaledInstance(300,190, Image.SCALE_SMOOTH);
        showimg.setIcon(icon);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iid;
    private javax.swing.JTextField imgad;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField iprice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel showimg;
    private javax.swing.JLabel showpic;
    // End of variables declaration//GEN-END:variables
}
