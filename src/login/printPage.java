/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import config.dbconnect;
import guiinternal.add;
import guiinternal.soldProduct;
import static java.awt.AWTEventMulticaster.add;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author College-PC
 */
public class printPage extends javax.swing.JFrame {

    /**
     * Creates new form delete
     */
    public printPage() {
        initComponents();
//        displaydata();
        seticon();

    }
    Color bodycolor = new Color(153, 204, 255);
    Color headcolor = new Color(255, 153, 153);
    Color hover = new Color(0, 153, 204);

    public void close() {

        this.dispose();
        main m = new main();
        m.setVisible(true);      
        soldProduct up = new soldProduct();        
        m.despane.add(up).setVisible(true);

    }

    public void printing() {

       String trans_id = t_id.getText();
        String fid =fish.getText();
       String fname= f_name.getText();
        String price = f_p.getText();
       String user = u_id.getText();
       String uname = u_n.getText();
       String u_add = u_ad.getText();
       String stat = t_stat.getText();
       
        textField.setText(
                "\t             Transaction details \n\n"
                + "Transaction ID: " + trans_id + "\n\n"
                + "Fish Code: " + fid + "\n\n"
                + "Fish Name: " + fname + "\n\n"
                + "Price :" + price + "\n\n"
                + "Buyer/User ID: " + user + "\n\n"
                + "Name; " + uname + "\n\n"
                + "Address: " + u_add + "\n\n"
                + "Transaction Status: " + stat + ""
               
         
       
       );
       
    }

//      
//       private void displaydata(){
//        try{
//     dbconnect db = new dbconnect();
//     
//     ResultSet rs = db.getData("SELECT * FROM tbl_fish");
//     
//     table.setModel(DbUtils.resultSetToTableModel(rs));
//        
//        }catch(SQLException ex){
//            
//            System.out.println("Error"+ex);
//        } 
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fish = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t_stat = new javax.swing.JTextField();
        f_p = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        printer = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        u_id = new javax.swing.JTextField();
        u_n = new javax.swing.JTextField();
        u_ad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Transaction id :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fish code :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 90, 30));

        fish.setBackground(new java.awt.Color(204, 204, 204));
        fish.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fish.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(fish, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Transaction status :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Fish name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 30));

        t_stat.setBackground(new java.awt.Color(204, 204, 204));
        t_stat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_stat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_stat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(t_stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 160, 30));

        f_p.setBackground(new java.awt.Color(204, 204, 204));
        f_p.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        f_p.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f_p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(f_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fish price :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 90, 30));

        t_id.setEditable(false);
        t_id.setBackground(new java.awt.Color(204, 204, 204));
        t_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, 30));

        printer.setBackground(new java.awt.Color(255, 153, 153));
        printer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printerMouseExited(evt);
            }
        });

        text.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Print");

        javax.swing.GroupLayout printerLayout = new javax.swing.GroupLayout(printer);
        printer.setLayout(printerLayout);
        printerLayout.setHorizontalGroup(
            printerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        printerLayout.setVerticalGroup(
            printerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printerLayout.createSequentialGroup()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 70, 30));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Add Fish Details");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 10, 290, 30);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 817, 60));

        f_name.setBackground(new java.awt.Color(204, 204, 204));
        f_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        f_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 160, 30));

        cancel.setBackground(new java.awt.Color(255, 153, 153));
        cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cancel");
        cancel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 70, 30));

        u_id.setBackground(new java.awt.Color(204, 204, 204));
        u_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        u_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        u_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, 30));

        u_n.setBackground(new java.awt.Color(204, 204, 204));
        u_n.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        u_n.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        u_n.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(u_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, 30));

        u_ad.setBackground(new java.awt.Color(204, 204, 204));
        u_ad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        u_ad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        u_ad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(u_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Buyer/User id :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("User Name :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 90, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("User Address :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 90, 30));

        textField.setEditable(false);
        textField.setColumns(20);
        textField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textField.setForeground(new java.awt.Color(51, 51, 51));
        textField.setRows(5);
        textField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textFieldMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(textField);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 440, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseClicked
       
        
        try {
            boolean klee = textField.print();
            if(klee){
                JOptionPane.showMessageDialog(null, "Print Succesfully!!");
            }else{
                JOptionPane.showMessageDialog(null, "Printing canceled");
            }
            
        } catch (PrinterException ex) {
            Logger.getLogger(printPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_printerMouseClicked

    private void printerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseEntered
        printer.setBackground(bodycolor);
    }//GEN-LAST:event_printerMouseEntered

    private void printerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseExited
        printer.setBackground(headcolor);
    }//GEN-LAST:event_printerMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        close();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(bodycolor);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(headcolor);
    }//GEN-LAST:event_cancelMouseExited

    private void textFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldMouseEntered
    printing();
    }//GEN-LAST:event_textFieldMouseEntered

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
            java.util.logging.Logger.getLogger(printPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    public javax.swing.JTextField f_name;
    public javax.swing.JTextField f_p;
    public javax.swing.JTextField fish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel printer;
    public javax.swing.JTextField t_id;
    public javax.swing.JTextField t_stat;
    private javax.swing.JLabel text;
    private javax.swing.JTextArea textField;
    public javax.swing.JTextField u_ad;
    public javax.swing.JTextField u_id;
    public javax.swing.JTextField u_n;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/fish.png")));
        setTitle("Aqua Life");
    }
}
