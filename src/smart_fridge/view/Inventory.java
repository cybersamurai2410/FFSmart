/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_fridge.view;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import smart_fridge.controller.Account;
import smart_fridge.controller.InventoryManager;
import smart_fridge.controller.RecordHistory;
import smart_fridge.model.Item;

/**
 *
 * @author T0266882
 */
public class Inventory extends javax.swing.JFrame {
    
    private static final String[] userDetails = Account.userDetails;
    private final String role = userDetails[4];
    private final boolean access = Boolean.parseBoolean(userDetails[5]);

    /**
     * Creates new form Inventory
     */
    public Inventory() {
        initComponents();
        
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
        this.setIconImage(icon.getImage());
        
        if(!"Head Chef".equals(role)){
            deleteBtn.hide();
        }
        
        try {
            InventoryManager invManager = new InventoryManager();
            invManager.displayInventoryTable(inventoryTable);
            invManager.checkExpiry(inventoryTable);
        } catch (IOException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void recordtohistory(String action, Item item){
        
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
        String dt = today.format(formatter);
        String[] date_time = dt.split("\\s+");
        
        RecordHistory record = new RecordHistory(action, date_time[0], date_time[1], userDetails, item);
        record.storeData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        orderBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Expiry Date"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    inventoryTable.getTableHeader().setReorderingAllowed(false);
    inventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            inventoryTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(inventoryTable);

    orderBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    orderBtn.setText("Order");
    orderBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            orderBtnActionPerformed(evt);
        }
    });

    deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    deleteBtn.setText("Delete Item");
    deleteBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteBtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(265, 265, 265)
                            .addComponent(orderBtn)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deleteBtn)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(orderBtn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
            .addComponent(deleteBtn)
            .addContainerGap())
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
    jLabel1.setText("Inventory");

    removeBtn.setText("Remove");
    removeBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeBtnActionPerformed(evt);
        }
    });

    backBtn.setText("Back");
    backBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backBtnActionPerformed(evt);
        }
    });

    insertBtn.setText("Insert");
    insertBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            insertBtnActionPerformed(evt);
        }
    });

    refreshBtn.setText("Refresh");
    refreshBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshBtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(refreshBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(113, 113, 113)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(removeBtn)
                    .addComponent(insertBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(refreshBtn)))
            .addGap(18, 18, 18)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        if(!access){
           JOptionPane.showMessageDialog(this, "Access revoked; contact head chef to be granted."); 
        }else{
            new Order().setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_orderBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)inventoryTable.getModel();
        
        if(!access){
           JOptionPane.showMessageDialog(this, "Access revoked; contact head chef to be granted."); 
        }
        else{
            if(inventoryTable.getSelectedRowCount() == 1){
                String name = tblModel.getValueAt(inventoryTable.getSelectedRow(), 0).toString();
                String date = tblModel.getValueAt(inventoryTable.getSelectedRow(), 2).toString();

                Object tblQuantity = tblModel.getValueAt(inventoryTable.getSelectedRow(), 1);
                int quantity = Integer.parseInt(tblQuantity.toString());

                if(quantity > 0){
                    --quantity;
                    tblModel.setValueAt(quantity, inventoryTable.getSelectedRow(), 1);

                    Item item = new Item(name, quantity, date);
                    item.updateData(inventoryTable.getSelectedRow(), 1);
                    recordtohistory("remove", item);
                }else{
                    JOptionPane.showMessageDialog(this, "Empty Stock!");
                }
            }
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void inventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTableMouseClicked
        // TODO add your handling code here: 
    }//GEN-LAST:event_inventoryTableMouseClicked

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)inventoryTable.getModel();
        
        if(!access){
           JOptionPane.showMessageDialog(this, "Access revoked; contact head chef to be granted."); 
        }
        else{
            if(inventoryTable.getSelectedRowCount() == 1){
                String name = tblModel.getValueAt(inventoryTable.getSelectedRow(), 0).toString();
                String date = tblModel.getValueAt(inventoryTable.getSelectedRow(), 2).toString();

                Object tblQuantity = tblModel.getValueAt(inventoryTable.getSelectedRow(), 1);
                int quantity = Integer.parseInt(tblQuantity.toString());
                ++quantity;
                tblModel.setValueAt(quantity, inventoryTable.getSelectedRow(), 1);

                Item item = new Item(name, quantity, date);
                item.updateData(inventoryTable.getSelectedRow(), 1);
                recordtohistory("insert", item);
            }
        }
    }//GEN-LAST:event_insertBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        new Inventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)inventoryTable.getModel();
        if(inventoryTable.getSelectedRowCount() == 1){
            new Item().deleteData(inventoryTable.getSelectedRow());
            tblModel.removeRow(inventoryTable.getSelectedRow());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Inventory().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}