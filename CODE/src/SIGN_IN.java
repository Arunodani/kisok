
//import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aruni
 */
public class SIGN_IN extends javax.swing.JFrame {

    /*public Connection con = null; 
    public PreparedStatement pst = null;
    public PreparedStatement pst1 = null;*/
    
    public SIGN_IN() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LOGIN_B = new javax.swing.JButton();
        SIGN_UP_B = new javax.swing.JButton();
        USER_ID_T = new javax.swing.JTextField();
        PWORD_T = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        LOGIN_B1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("USER ID");

        jLabel2.setText("PASSWORD");

        LOGIN_B.setText("LOGIN");
        LOGIN_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_BActionPerformed(evt);
            }
        });

        SIGN_UP_B.setText("SIGN UP");
        SIGN_UP_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGN_UP_BActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN IN");
        setPreferredSize(new java.awt.Dimension(500, 281));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 70, 90, 21);

        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        getContentPane().add(userid);
        userid.setBounds(190, 60, 204, 30);

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        getContentPane().add(pw);
        pw.setBounds(190, 120, 204, 30);

        LOGIN_B1.setText("LOGIN");
        LOGIN_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_B1ActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN_B1);
        LOGIN_B1.setBounds(310, 180, 80, 30);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 120, 100, 21);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sign_1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 500, 260);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGIN_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_BActionPerformed

      

    }//GEN-LAST:event_LOGIN_BActionPerformed

    private void SIGN_UP_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGN_UP_BActionPerformed
        
    }//GEN-LAST:event_SIGN_UP_BActionPerformed

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void LOGIN_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_B1ActionPerformed
        //STORE USER NAME AND PASSWORD
        String username;
        String password;

        username = userid.getText();
        password = pw.getText();

        //Both fields are blank
        if(username.equals("S0001")&&password.equals("1234"))
        {
            Main objmain = new Main();
                 objmain.setVisible(true);
                        this.dispose();
        }
        //Only entered UserName
        else
        {
            JOptionPane.showMessageDialog(this, "Your username or password is incorrect");
            userid.setText("");
                        pw.setText("");
        }
                   
           

       
    }//GEN-LAST:event_LOGIN_B1ActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

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
            java.util.logging.Logger.getLogger(SIGN_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGN_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGN_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGN_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGN_IN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN_B;
    private javax.swing.JButton LOGIN_B1;
    private javax.swing.JPasswordField PWORD_T;
    private javax.swing.JButton SIGN_UP_B;
    private javax.swing.JTextField USER_ID_T;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
