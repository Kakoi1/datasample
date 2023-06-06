/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiinternal;

import config.dbconnect;
import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import myapp.adtransaction;
import myapp.printPage;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author College-PC
 */
public class soldProduct extends javax.swing.JInternalFrame {

    /**
     * Creates new form soldProduct
     */
    public soldProduct() {
        initComponents();
        displaydata();
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
         BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
         bi.setNorthPane(null);
           table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           
            table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(headcolor);
        table.getTableHeader().setForeground(Color.BLACK);
        table.setRowHeight(25);
        
          TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
           
    }

       Color bodycolor = new Color(153,204,255);
    Color headcolor = new Color(255,153,153);
    Color hover = new Color(0,153,204);
    
    public String report;
   public String status="";
    
      public void displaydata(){
        try{
     dbconnect db = new dbconnect();
     
     ResultSet rs = db.getData("SELECT tbl_soldproduct.sp_id, "
             + "tbl_fish.f_code,"
             + " tbl_fish.f_name,"
             + " tbl_fish.f_price,"            
             + " tbl_user.u_id, tbl_user.u_name, tbl_user.u_address, tbl_soldproduct.sp_date,tbl_soldproduct.sp_status FROM tbl_soldproduct "
             + "LEFT JOIN tbl_fish ON tbl_soldproduct.f_code = tbl_fish.f_code "
             + "LEFT JOIN tbl_user ON tbl_soldproduct.u_id = tbl_user.u_id");
     
     table.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
        }catch(SQLException ex){
            
            System.out.println("Error"+ex);
        } 
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        update = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        discard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        printer = new javax.swing.JPanel();
        Print = new javax.swing.JLabel();
        printer1 = new javax.swing.JPanel();
        Print1 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setBackground(new java.awt.Color(255, 153, 153));
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edit");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, 30));

        discard.setBackground(new java.awt.Color(255, 153, 153));
        discard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        discard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        discard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                discardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                discardMouseExited(evt);
            }
        });
        discard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search");
        discard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(discard, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 70, 30));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4);
        jPanel4.setBounds(660, 0, 120, 60);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Transactions");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 10, 290, 30);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, 790, 280));

        delete1.setBackground(new java.awt.Color(255, 153, 153));
        delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete1MouseExited(evt);
            }
        });
        delete1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delete");
        delete1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 70, 30));

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
        printer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Print.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        Print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Print.setText("Print");
        printer.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel2.add(printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 70, 30));

        printer1.setBackground(new java.awt.Color(255, 153, 153));
        printer1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printer1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printer1MouseExited(evt);
            }
        });
        printer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Print1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        Print1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Print1.setText("Print Table");
        printer1.add(Print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel2.add(printer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 80, 30));

        add.setBackground(new java.awt.Color(255, 153, 153));
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 30));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        int rowIndex = table.getSelectedRow();
        if (rowIndex<0){

            JOptionPane.showMessageDialog(null, "Plese select an item");

        }
       
        else{
            
         
            TableModel model = table.getModel();
            adtransaction up = new adtransaction();
            up.id.setText(""+model.getValueAt(rowIndex, 0));
            up.fid.setText(""+model.getValueAt(rowIndex, 1));
            up.name.setText(""+model.getValueAt(rowIndex, 2));
            up.fip.setText(""+model.getValueAt(rowIndex, 3));
            up.bid.setText(""+model.getValueAt(rowIndex, 4));
            up.bna.setText(""+model.getValueAt(rowIndex, 5));
               up.bad.setText(""+model.getValueAt(rowIndex, 6));
               up.date.setText(""+model.getValueAt(rowIndex, 7));
               up.jComboBox1.setSelectedItem(""+model.getValueAt(rowIndex, 8).toString());
               up.klee = (""+model.getValueAt(rowIndex, 8));

               
            JFrame mainJFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
            mainJFrame.dispose();
            up.setVisible(true);
              up.unm = report;
            up.actions = "Update";
            up.save1.setText("Edit");
            up.setVisible(true);
            
            if(!report.equals("admin")){
                up.jComboBox1.setVisible(false);
                up.jLabel14.setVisible(false);
                
            
            }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(bodycolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void discardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseClicked
      java.util.Date date = jDateChooser1.getDate();
   try{
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String df = format.format(date);
    
          DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> obj  = new TableRowSorter<>(model);
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(df));
   } catch (Exception ex) {
            // Code to handle any other exception
           JOptionPane.showMessageDialog(null, "nothing to search");
        }

     
    }//GEN-LAST:event_discardMouseClicked

    private void discardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseEntered
        discard.setBackground(bodycolor);
    }//GEN-LAST:event_discardMouseEntered

    private void discardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardMouseExited
        discard.setBackground(headcolor);
    }//GEN-LAST:event_discardMouseExited

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        int rowIndex = table.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a data first");
        }else{
            TableModel model = table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a=JOptionPane.showConfirmDialog(null,"Are you sure to delete id "+id);
            if(a==JOptionPane.YES_OPTION){
                dbconnect dbc = new dbconnect();
                int c_id = Integer.parseInt(id);
                dbc.deleteData(c_id,"tbl_soldProduct","sp_id");
                displaydata();

            }

        }
    }//GEN-LAST:event_delete1MouseClicked

    private void delete1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseEntered
        delete1.setBackground(bodycolor);
    }//GEN-LAST:event_delete1MouseEntered

    private void delete1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseExited
        delete1.setBackground(headcolor);
    }//GEN-LAST:event_delete1MouseExited

    private void printerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseClicked
            int rowIndex = table.getSelectedRow();
        if (rowIndex<0){

            JOptionPane.showMessageDialog(null, "Plese select an item");
        }
        
        else{
            TableModel model = table.getModel();
            printPage up = new printPage();
            up.transid.setText(""+model.getValueAt(rowIndex, 0));
            up.fid.setText(""+model.getValueAt(rowIndex, 1));
            up.fname.setText(""+model.getValueAt(rowIndex, 2));
            up.price.setText(""+model.getValueAt(rowIndex, 3));
            up.user.setText(""+model.getValueAt(rowIndex, 4));
            up.uname.setText(""+model.getValueAt(rowIndex, 5));
             up.u_add.setText(""+model.getValueAt(rowIndex, 6));
              up.date.setText(""+model.getValueAt(rowIndex, 7));
              up.stat.setText(""+model.getValueAt(rowIndex, 8));
            
            JFrame mainJFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
            mainJFrame.dispose();
            up.setVisible(true);
            up.nnm = report;

        }
    }//GEN-LAST:event_printerMouseClicked

    private void printerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseEntered
        printer.setBackground(bodycolor);
    }//GEN-LAST:event_printerMouseEntered

    private void printerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerMouseExited
      printer.setBackground(headcolor);
    }//GEN-LAST:event_printerMouseExited

    private void printer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printer1MouseClicked
        MessageFormat header = new MessageFormat("db_fish");
        MessageFormat footer = new MessageFormat("db_fish");
        try{
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null, "Cannot be print!"+e.getMessage());
        }
    }//GEN-LAST:event_printer1MouseClicked

    private void printer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printer1MouseEntered
        printer1.setBackground(bodycolor);
    }//GEN-LAST:event_printer1MouseEntered

    private void printer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printer1MouseExited
     printer1.setBackground(headcolor);
    }//GEN-LAST:event_printer1MouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      
            JFrame mainJFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
            mainJFrame.dispose();
            adtransaction up = new adtransaction();
            up.setVisible(true);
            up.unm = report;
             up.actions = "Add";
              up.save1.setText("Save");
              if(!report.equals("admin")){
                up.jComboBox1.setVisible(false);
                up.jLabel14.setVisible(false);
                
            }
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
         add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
         add.setBackground(headcolor);
    }//GEN-LAST:event_addMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Print;
    private javax.swing.JLabel Print1;
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete1;
    private javax.swing.JPanel discard;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel printer;
    private javax.swing.JPanel printer1;
    private javax.swing.JTable table;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
