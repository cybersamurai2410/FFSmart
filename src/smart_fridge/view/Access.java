/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_fridge.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import smart_fridge.controller.Account;
import smart_fridge.model.Employee;

/**
 *
 * @author T0266882
 */
public class Access extends javax.swing.JFrame {
    
    //private static final String role = Account.userDetails[4];

    /**
     * Creates new form Access
     */
    public Access() {
        initComponents();
        
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
        this.setIconImage(icon.getImage());
        
        Account account = new Account();
        account.displayAccessTable(accessTable);
        accessBtn.hide();
        
//        if(!"Head Chef".equals(role)){
//            removeBtn.hide();
//        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accessTable = new javax.swing.JTable();
        accessBtn = new javax.swing.JToggleButton();
        backBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Manage Access");

        accessTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Access"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    accessTable.getTableHeader().setReorderingAllowed(false);
    accessTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            accessTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(accessTable);

    accessBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    accessBtn.setText("Access");
    accessBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            accessBtnActionPerformed(evt);
        }
    });

    backBtn.setText("Back");
    backBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backBtnActionPerformed(evt);
        }
    });

    refreshBtn.setText("Refresh");
    refreshBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshBtnActionPerformed(evt);
        }
    });

    removeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    removeBtn.setText("Remove User");
    removeBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeBtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(108, 108, 108)
                    .addComponent(removeBtn))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addComponent(accessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 74, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(backBtn)
                .addComponent(refreshBtn)
                .addComponent(removeBtn))
            .addGap(12, 12, 12)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(accessBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void accessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)accessTable.getModel();
        
        if(accessTable.getSelectedRowCount() == 1){
            String access = tblModel.getValueAt(accessTable.getSelectedRow(), 1).toString();
            boolean bAccess = Boolean.parseBoolean(access);  
            
            if(bAccess){
                bAccess = false;
                tblModel.setValueAt(String.valueOf(bAccess), accessTable.getSelectedRow(), 1);
                accessBtn.setText("Grant");
                accessBtn.setBackground(Color.green);
            }else{
                bAccess = true;
                tblModel.setValueAt(String.valueOf(bAccess), accessTable.getSelectedRow(), 1);
                accessBtn.setText("Revoke");
                accessBtn.setBackground(Color.red);
            }
            
            accessBtn.setSelected(false);
            Employee employee = new Employee();
            employee.setAccess(bAccess);
            employee.updateData(accessTable.getSelectedRow(), 5);
        }
    }//GEN-LAST:event_accessBtnActionPerformed

    private void accessTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accessTableMouseClicked
        // TODO add your handling code here:
        accessBtn.show();
        DefaultTableModel tblModel = (DefaultTableModel)accessTable.getModel();
        
        if(accessTable.getSelectedRowCount() == 1){
            String access = tblModel.getValueAt(accessTable.getSelectedRow(), 1).toString();
            boolean bAccess = Boolean.parseBoolean(access); 
            
            if(bAccess){
                accessBtn.setText("Revoke");
                accessBtn.setBackground(Color.red);
            }else{
                accessBtn.setText("Grant");
                accessBtn.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_accessTableMouseClicked

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        new Access().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)accessTable.getModel();
        if(accessTable.getSelectedRowCount() == 1){
            new Employee().deleteData(accessTable.getSelectedRow());
            tblModel.removeRow(accessTable.getSelectedRow());
        }
        
//        DefaultTableModel tblModel = (DefaultTableModel)inventoryTable.getModel();
//        if(inventoryTable.getSelectedRowCount() == 1){
//            new Item().deleteData(inventoryTable.getSelectedRow());
//            tblModel.removeRow(inventoryTable.getSelectedRow());
//        }
    }//GEN-LAST:event_removeBtnActionPerformed

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
//            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Access().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton accessBtn;
    private javax.swing.JTable accessTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}
