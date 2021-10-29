/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layouts;

import controller.AccountController;
import javax.swing.JFrame;
import model.list.List;
import model.system.Account;
import model.system.Transaction;
import model.system.Wallet;
import view.includes.Modal;
import view.includes.TransactionCard;

/**
 *
 * @author sonya
 */
public class TransactionInformationView extends javax.swing.JPanel {

    private final Account account;
    private final JFrame parent;
    private final AccountController accountController;

    /**
     * Creates new form DataView
     *
     * @param account
     * @param accountController
     * @param parent
     */
    public TransactionInformationView(Account account, AccountController accountController, JFrame parent) {
        this.account = account;
        this.accountController = accountController;
        this.parent = parent;
        initComponents();
        loadWalletsUser();
    }

    private void loadTransactions(List<Transaction> transactions) {
        infoPanel.removeAll();

        for (Transaction transaction : transactions) {
            infoPanel.add(new TransactionCard(transaction));
        }

        infoPanel.validate();
        infoPanel.repaint();
    }
    
    private void loadWalletsUser(){
        for (Wallet wallet : account.getWallets()) {
            walletsUser.addItem(wallet.getID());
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
        java.awt.GridBagConstraints gridBagConstraints;

        titlePanel = new javax.swing.JPanel();
        idEmptyPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        transactionWalletNotFoundPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userWalletsNoTransactionsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        transactionByIdBtn = new javax.swing.JButton();
        walletsUser = new javax.swing.JComboBox<>();
        infoPanel = new javax.swing.JPanel();

        titlePanel.setBackground(new java.awt.Color(102, 204, 255));
        titlePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 20, 100), 1, true));
        titlePanel.setLayout(new java.awt.GridBagLayout());

        idEmptyPanel.setBackground(new java.awt.Color(192, 82, 153));
        idEmptyPanel.setMaximumSize(new java.awt.Dimension(300, 100));
        idEmptyPanel.setMinimumSize(new java.awt.Dimension(300, 100));
        idEmptyPanel.setPreferredSize(new java.awt.Dimension(300, 100));
        idEmptyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¡¡No hay transacciones de billetera que buscar!!");
        idEmptyPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 20));

        transactionWalletNotFoundPanel.setBackground(new java.awt.Color(255, 255, 255));
        transactionWalletNotFoundPanel.setMaximumSize(new java.awt.Dimension(281, 92));
        transactionWalletNotFoundPanel.setMinimumSize(new java.awt.Dimension(281, 92));
        transactionWalletNotFoundPanel.setPreferredSize(new java.awt.Dimension(281, 92));
        transactionWalletNotFoundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("¡¡No se encontraron transacctiones en las que participe esta billetera!!");
        transactionWalletNotFoundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        userWalletsNoTransactionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        userWalletsNoTransactionsPanel.setMaximumSize(new java.awt.Dimension(281, 92));
        userWalletsNoTransactionsPanel.setMinimumSize(new java.awt.Dimension(281, 92));
        userWalletsNoTransactionsPanel.setPreferredSize(new java.awt.Dimension(281, 92));
        userWalletsNoTransactionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("¡¡No se encontraron transacctiones en las que participe esta billetera!!");
        userWalletsNoTransactionsPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        bodyPanel.setBackground(new java.awt.Color(27, 20, 100));
        bodyPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 209, 102));
        jLabel2.setText("Id de la billetera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 151, 0, 0);
        bodyPanel.add(jLabel2, gridBagConstraints);

        transactionByIdBtn.setBackground(new java.awt.Color(216, 49, 91));
        transactionByIdBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        transactionByIdBtn.setForeground(new java.awt.Color(255, 255, 255));
        transactionByIdBtn.setText("Buscar");
        transactionByIdBtn.setBorderPainted(false);
        transactionByIdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transactionByIdBtn.setFocusPainted(false);
        transactionByIdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionByIdBtnMouseClicked(evt);
            }
        });
        transactionByIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionByIdBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 4, 242);
        bodyPanel.add(transactionByIdBtn, gridBagConstraints);

        walletsUser.setBackground(new java.awt.Color(151, 58, 168));
        walletsUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        walletsUser.setForeground(new java.awt.Color(255, 255, 255));
        walletsUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletsUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 121;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        bodyPanel.add(walletsUser, gridBagConstraints);

        infoPanel.setLayout(new javax.swing.BoxLayout(infoPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transactionByIdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionByIdBtnMouseClicked
        
            Wallet wallet = accountController.getWallet((String)walletsUser.getSelectedItem());
            List<Transaction> transactionByWallet = accountController.getHistorial(wallet);
            if (transactionByWallet.getSize() != 0) {
                loadTransactions(transactionByWallet);
            } else {
                Modal modal = new Modal(parent, "Sin transacciones", true, transactionWalletNotFoundPanel);
            }
    }//GEN-LAST:event_transactionByIdBtnMouseClicked

    private void transactionByIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionByIdBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionByIdBtnActionPerformed

    private void walletsUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletsUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_walletsUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel idEmptyPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton transactionByIdBtn;
    private javax.swing.JPanel transactionWalletNotFoundPanel;
    private javax.swing.JPanel userWalletsNoTransactionsPanel;
    private javax.swing.JComboBox<String> walletsUser;
    // End of variables declaration//GEN-END:variables
}
