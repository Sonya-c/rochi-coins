/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layouts;

import controller.AccountController;
import java.awt.Component;
import javax.swing.JFrame;
import model.list.List;
import model.system.Account;
import model.system.Wallet;
import view.includes.Modal;
import view.includes.WalletCard;

/**
 *
 * @author sonya
 */
public class WalletsView extends javax.swing.JPanel {

    private final Account account;
    private final JFrame parent;
    private final AccountController accountController;

    /**
     * Creates new form WalletsView
     *
     * @param parent
     * @param account
     * @param accountController
     */
    public WalletsView(JFrame parent, Account account, AccountController accountController) {
        this.account = account;
        this.parent = parent;
        this.accountController = accountController;
        initComponents();
    }

    private void loadWallets() {
        walletsPanel.removeAll();

        List<Wallet> wallets = account.getWallets();

        for (Wallet wallet : wallets) {
            walletsPanel.add(new WalletCard(wallet, parent, accountController, account));
        }

        walletsPanel.validate();
        walletsPanel.repaint();
    }

    private void loadWallets(List<Wallet> wallets) {
        walletsPanel.removeAll();

        for (Wallet wallet : wallets) {
            walletsPanel.add(new WalletCard(wallet, parent, accountController, account));
        }

        walletsPanel.validate();
        walletsPanel.repaint();
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

        walletNotFoundPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        walletCreationSuccesfull = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        createWalletPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        createWalletNicknameTxt = new javax.swing.JTextField();
        createWalletBtn = new javax.swing.JButton();
        nicknameExist = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        notEnoughtDataPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        activityBarPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        walletsUser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        walletsPanel = new javax.swing.JPanel();
        walletsPanel1 = new javax.swing.JPanel();

        walletNotFoundPanel.setBackground(new java.awt.Color(255, 255, 255));
        walletNotFoundPanel.setMaximumSize(new java.awt.Dimension(350, 95));
        walletNotFoundPanel.setMinimumSize(new java.awt.Dimension(350, 95));
        walletNotFoundPanel.setName(""); // NOI18N
        walletNotFoundPanel.setPreferredSize(new java.awt.Dimension(350, 95));
        walletNotFoundPanel.setRequestFocusEnabled(false);
        walletNotFoundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("No se encontraron billeteras :(");
        walletNotFoundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        walletCreationSuccesfull.setBackground(new java.awt.Color(255, 255, 255));
        walletCreationSuccesfull.setMaximumSize(new java.awt.Dimension(350, 95));
        walletCreationSuccesfull.setMinimumSize(new java.awt.Dimension(350, 95));
        walletCreationSuccesfull.setPreferredSize(new java.awt.Dimension(350, 95));
        walletCreationSuccesfull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("¡Nueva billetera creada exitosamente!");
        walletCreationSuccesfull.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 300, 20));

        createWalletPanel.setBackground(new java.awt.Color(255, 255, 255));
        createWalletPanel.setMaximumSize(new java.awt.Dimension(400, 150));
        createWalletPanel.setMinimumSize(new java.awt.Dimension(400, 150));
        createWalletPanel.setPreferredSize(new java.awt.Dimension(400, 150));
        createWalletPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Nickname:");
        createWalletPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 20));

        createWalletNicknameTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        createWalletPanel.add(createWalletNicknameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 230, -1));

        createWalletBtn.setBackground(new java.awt.Color(151, 58, 168));
        createWalletBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        createWalletBtn.setForeground(new java.awt.Color(255, 255, 255));
        createWalletBtn.setText("Crear");
        createWalletBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createWalletBtnActionPerformed(evt);
            }
        });
        createWalletPanel.add(createWalletBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        nicknameExist.setBackground(new java.awt.Color(255, 255, 255));
        nicknameExist.setMaximumSize(new java.awt.Dimension(380, 95));
        nicknameExist.setMinimumSize(new java.awt.Dimension(380, 95));
        nicknameExist.setPreferredSize(new java.awt.Dimension(380, 95));
        nicknameExist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("¡Ya posee una billetera con ese nickname!");
        nicknameExist.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 310, 20));

        notEnoughtDataPanel.setBackground(new java.awt.Color(255, 255, 255));
        notEnoughtDataPanel.setMaximumSize(new java.awt.Dimension(380, 95));
        notEnoughtDataPanel.setMinimumSize(new java.awt.Dimension(380, 95));
        notEnoughtDataPanel.setPreferredSize(new java.awt.Dimension(380, 95));
        notEnoughtDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setText("¡No hay suficientes datos para la busqueda!");
        notEnoughtDataPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 310, 20));

        setLayout(new java.awt.BorderLayout());

        headerPanel.setBackground(new java.awt.Color(71, 18, 107));
        headerPanel.setLayout(new java.awt.BorderLayout());

        activityBarPanel.setBackground(new java.awt.Color(71, 18, 107));
        activityBarPanel.setLayout(new java.awt.GridBagLayout());

        addBtn.setBackground(new java.awt.Color(216, 49, 91));
        addBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Añadir");
        addBtn.setBorderPainted(false);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setFocusPainted(false);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 234, 11, 0);
        activityBarPanel.add(addBtn, gridBagConstraints);

        walletsUser.setBackground(new java.awt.Color(216, 49, 91));
        walletsUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        walletsUser.setForeground(new java.awt.Color(255, 255, 255));
        walletsUser.setText("Mostrar mis wallets");
        walletsUser.setBorderPainted(false);
        walletsUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walletsUser.setFocusPainted(false);
        walletsUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletsUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 340, 11, 0);
        activityBarPanel.add(walletsUser, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 209, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mis Wallets");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 736;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        activityBarPanel.add(jLabel6, gridBagConstraints);

        headerPanel.add(activityBarPanel, java.awt.BorderLayout.CENTER);

        add(headerPanel, java.awt.BorderLayout.PAGE_START);

        walletsPanel1.setBackground(new java.awt.Color(255, 255, 255));
        walletsPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));
        walletsPanel.add(walletsPanel1);

        add(walletsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

        
    private void walletsUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walletsUserBtnMouseClicked
        
    }//GEN-LAST:event_walletsUserBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

    }//GEN-LAST:event_addBtnActionPerformed

    private void createWalletBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createWalletBtnActionPerformed
        String nickname = createWalletNicknameTxt.getText().trim();
        String id = "" + account.getUserName() + account.getWallets().getSize();
        
        boolean sw = true;
        for (Wallet w : account.getWallets()) {
            if (w.getNickname() == null ? nickname == null : w.getNickname().equals(nickname)) {
                Modal modal = new Modal(parent, "Wallet no creada", true, nicknameExist);
                sw = false;
                
                break;
            }
        }
        
        if (sw) {
            Wallet wallet = new Wallet(id, 0, nickname);
            account.addWallet(wallet);
            Modal modal = new Modal(parent, "Wallet creada", true, walletCreationSuccesfull);
            loadWallets();
        }
        
    }//GEN-LAST:event_createWalletBtnActionPerformed

    private void walletsUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletsUserActionPerformed
        
        loadWallets();
        
    }//GEN-LAST:event_walletsUserActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
      
        Modal modal = new Modal(parent, "Nueva wallet", true, createWalletPanel);
        
    }//GEN-LAST:event_addBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activityBarPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton createWalletBtn;
    private javax.swing.JTextField createWalletNicknameTxt;
    private javax.swing.JPanel createWalletPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel nicknameExist;
    private javax.swing.JPanel notEnoughtDataPanel;
    private javax.swing.JPanel walletCreationSuccesfull;
    private javax.swing.JPanel walletNotFoundPanel;
    private javax.swing.JPanel walletsPanel;
    private javax.swing.JPanel walletsPanel1;
    private javax.swing.JButton walletsUser;
    // End of variables declaration//GEN-END:variables
}
