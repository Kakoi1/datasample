/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import config.PasswordHasher;
import config.dbconnect;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author College-PC
 */
public class changeacc extends javax.swing.JFrame {

    /**
     * Creates new form changeacc
     */
    public changeacc() {
        initComponents();
        uname.disable();
        uname.setBackground(Color.WHITE);
        retype.disable();
          retype.setBackground(Color.WHITE);
        retype.disable();
          retype.setBackground(Color.WHITE);
          save.setVisible(false);
    }

       Color bodycolor = new Color(153,204,255);
    Color headcolor = new Color(255,153,153);
    Color hover = new Color(0,153,204);
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        save1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        delete2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        retype = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("New Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, 30));

        uname.setBackground(new java.awt.Color(204, 204, 204));
        uname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("New Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 90, 30));

        num.setBackground(new java.awt.Color(204, 204, 204));
        num.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numFocusLost(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });
        jPanel2.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("type your Account's Phone no.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 30));

        save.setBackground(new java.awt.Color(255, 153, 153));
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        save1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save1.setText("Save");
        save.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 70, 30));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Fish Details");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 10, 290, 30);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 60));

        delete2.setBackground(new java.awt.Color(255, 153, 153));
        delete2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete2MouseExited(evt);
            }
        });
        delete2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cancel");
        delete2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 70, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Retype Password");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 110, 30));

        retype.setBackground(new java.awt.Color(204, 204, 204));
        retype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        retype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypeActionPerformed(evt);
            }
        });
        jPanel2.add(retype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 160, 30));

        pass.setBackground(new java.awt.Color(204, 204, 204));
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        try {
            dbconnect dbc = new dbconnect();
            
            ResultSet rs = dbc.getData("SELECT * FROM `tbl_costumer` WHERE `c_username`='"+uname.getText()+"'");
            
            if(!pass.getText().equals(retype.getText())){
                
                JOptionPane.showMessageDialog(null, "Password Doesn't Match... Try Again!!!");
                
            }else if(rs.next()){
                JOptionPane.showMessageDialog(null, "Username already exist or \nUsername Cannot be your old Username...\nTry Again!!!");
            }
            
            
            else{
                
                try {
                    
                    
                    String password;
                    
                    password = PasswordHasher.hashPassword(pass.getText());
                    int res = dbc.updateData("UPDATE `tbl_costumer` SET `c_username`='"+uname.getText()+"',`c_password`='"+password+"' WHERE `c_contact_no.`='"+num.getText()+"'");
                    
                    if(res==1){
                        
                        JOptionPane.showMessageDialog(null, "Account Successfully Retrieve");
                        login li = new login();
                        li.setVisible(true);
                        this.dispose();
                    }} catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(changeacc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
            }   } catch (SQLException ex) {
            Logger.getLogger(changeacc.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(bodycolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(headcolor);
    }//GEN-LAST:event_saveMouseExited

    private void delete2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseClicked
         login li = new login();
         li.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_delete2MouseClicked

    private void delete2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseEntered
        delete2.setBackground(bodycolor);
    }//GEN-LAST:event_delete2MouseEntered

    private void delete2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseExited
        delete2.setBackground(headcolor);
    }//GEN-LAST:event_delete2MouseExited

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
    
    }//GEN-LAST:event_numKeyTyped

    private void numFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusLost
     
  
        
    }//GEN-LAST:event_numFocusLost

    private void numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyPressed
    
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
                  dbconnect db = new dbconnect();
        try {
            ResultSet rs = db.getData("SELECT * FROM `tbl_costumer` WHERE `c_contact_no.`='"+num.getText()+"'");
            if(rs.next()){
                uname.enable(true);
                uname.setBackground(new Color(204,204,204));
                retype.enable(true);
                 retype.setBackground(new Color(204,204,204));
                retype.enable(true);
                 retype.setBackground(new Color(204,204,204));
                 save.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "No Data found From this Phone no. "+num.getText()+"");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(changeacc.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    }//GEN-LAST:event_numKeyPressed

    private void retypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retypeActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(changeacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeacc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel delete2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField num;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField retype;
    private javax.swing.JPanel save;
    public javax.swing.JLabel save1;
    public javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
