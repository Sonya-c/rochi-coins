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
        nicknameWalletNotFound = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nicknameExist = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        poorInformationPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchIdTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        searchNicknameTxt = new javax.swing.JTextField();
        walletsUserBtn = new javax.swing.JButton();
        walletsPanel = new javax.swing.JPanel();

        walletNotFoundPanel.setBackground(new java.awt.Color(255, 255, 255));
        walletNotFoundPanel.setMaximumSize(new java.awt.Dimension(281, 92));
        walletNotFoundPanel.setMinimumSize(new java.awt.Dimension(281, 92));
        walletNotFoundPanel.setPreferredSize(new java.awt.Dimension(281, 92));
        walletNotFoundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("No se encontraron billeteras :(");
        walletNotFoundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        walletCreationSuccesfull.setBackground(new java.awt.Color(192, 82, 153));
        walletCreationSuccesfull.setMaximumSize(new java.awt.Dimension(300, 100));
        walletCreationSuccesfull.setMinimumSize(new java.awt.Dimension(300, 100));
        walletCreationSuccesfull.setPreferredSize(new java.awt.Dimension(300, 100));
        walletCreationSuccesfull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¡¡Nueva billetera creada exitosamente!!");
        walletCreationSuccesfull.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 20));

        nicknameWalletNotFound.setBackground(new java.awt.Color(192, 82, 153));
        nicknameWalletNotFound.setMaximumSize(new java.awt.Dimension(300, 100));
        nicknameWalletNotFound.setMinimumSize(new java.awt.Dimension(300, 100));
        nicknameWalletNotFound.setPreferredSize(new java.awt.Dimension(300, 100));
        nicknameWalletNotFound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¡¡Ingresa el nickname de tu billetera!!");
        nicknameWalletNotFound.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 20));

        nicknameExist.setBackground(new java.awt.Color(192, 82, 153));
        nicknameExist.setMaximumSize(new java.awt.Dimension(300, 100));
        nicknameExist.setMinimumSize(new java.awt.Dimension(300, 100));
        nicknameExist.setPreferredSize(new java.awt.Dimension(300, 100));
        nicknameExist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¡¡Ya posee una billetera con ese nickname!!");
        nicknameExist.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 20));

        poorInformationPanel.setBackground(new java.awt.Color(192, 82, 153));
        poorInformationPanel.setMaximumSize(new java.awt.Dimension(300, 100));
        poorInformationPanel.setMinimumSize(new java.awt.Dimension(300, 100));
        poorInformationPanel.setPreferredSize(new java.awt.Dimension(300, 100));
        poorInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("¡¡Datos insuficientes para busqueda!!");
        poorInformationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 20));

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(10, 36, 99));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 209, 102));
        jLabel2.setText("Id de la billetera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 92, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        searchIdTxt.setBackground(new java.awt.Color(62, 146, 204));
        searchIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        searchIdTxt.setForeground(new java.awt.Color(255, 255, 255));
        searchIdTxt.setToolTipText("");
        searchIdTxt.setMinimumSize(new java.awt.Dimension(100, 23));
        searchIdTxt.setPreferredSize(new java.awt.Dimension(100, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 4, 0, 0);
        jPanel1.add(searchIdTxt, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 209, 102));
        jLabel1.setText("Apodo de la billetera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        searchBtn.setBackground(new java.awt.Color(216, 49, 91));
        searchBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Buscar");
        searchBtn.setBorderPainted(false);
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.setFocusPainted(false);
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 6, 9, 0);
        jPanel1.add(searchBtn, gridBagConstraints);

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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 6, 9, 0);
        jPanel1.add(addBtn, gridBagConstraints);

        searchNicknameTxt.setBackground(new java.awt.Color(62, 146, 204));
        searchNicknameTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        searchNicknameTxt.setForeground(new java.awt.Color(255, 255, 255));
        searchNicknameTxt.setToolTipText("");
        searchNicknameTxt.setMinimumSize(new java.awt.Dimension(100, 23));
        searchNicknameTxt.setPreferredSize(new java.awt.Dimension(100, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 0, 0);
        jPanel1.add(searchNicknameTxt, gridBagConstraints);

        walletsUserBtn.setBackground(new java.awt.Color(216, 49, 91));
        walletsUserBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        walletsUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        walletsUserBtn.setText("Mis wallets");
        walletsUserBtn.setBorderPainted(false);
        walletsUserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walletsUserBtn.setFocusPainted(false);
        walletsUserBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                walletsUserBtnMouseClicked(evt);
            }
        });
        walletsUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletsUserBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 108, 9, 0);
        jPanel1.add(walletsUserBtn, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        walletsPanel.setLayout(new javax.swing.BoxLayout(walletsPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(walletsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void walletsUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletsUserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_walletsUserBtnActionPerformed

    private void walletsUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walletsUserBtnMouseClicked
        
        List<Wallet> wallets = account.getWallets();
        loadWallets(wallets);
        
    }//GEN-LAST:event_walletsUserBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

    }//GEN-LAST:event_addBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        if (!searchNicknameTxt.getText().isEmpty()) {
            String nickname = searchNicknameTxt.getText();
            if (!searchNickname(nickname)){
                Wallet wallet = new Wallet(account.getUserName() + account.getWallets().getSize(),
                    0d, nickname);
                account.addWallet(wallet);
                Modal modal = new Modal(parent, "Billetera creada", true, walletCreationSuccesfull);
            } else {
                Modal modal = new Modal(parent, "Nickname existente", true, nicknameExist);
            }
        } else {
            Modal modal = new Modal(parent, "Billetera no creada", true, nicknameWalletNotFound);
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String id = searchIdTxt.getText().trim();
        String nickname = searchNicknameTxt.getText().trim();

        List<Wallet> wallets = account.getWallets();

        if (id.isEmpty() && nickname.isEmpty()) {
            Modal moda = new Modal(parent, "Información insuficiente", true, poorInformationPanel);
        } else {

            List<Wallet> foundWallets = new List<>();

            for (Wallet wallet : wallets) {
                if (wallet.getID().equals(id) || wallet.getNickname().equals(nickname)) {
                    foundWallets.add(wallet);
                }
            }

            if (foundWallets.getSize() == 0) {
                Modal modal = new Modal(parent, "Wallet no encontrada", true, walletNotFoundPanel);
            } else {
                loadWallets(foundWallets);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnMouseClicked

    private boolean searchNickname(String nickname){
          List<Wallet> foundWallets = new List<>();
          boolean sw = false;
        for (Wallet wallet : account.getWallets()) {
            if (wallet.getNickname().equals(nickname)){
                foundWallets.add(wallet);
                sw = true;
            }
        }
        if (sw == true){
            loadWallets(foundWallets);
        }
        return sw;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel nicknameExist;
    private javax.swing.JPanel nicknameWalletNotFound;
    private javax.swing.JPanel poorInformationPanel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JTextField searchNicknameTxt;
    private javax.swing.JPanel walletCreationSuccesfull;
    private javax.swing.JPanel walletNotFoundPanel;
    private javax.swing.JPanel walletsPanel;
    private javax.swing.JButton walletsUserBtn;
    // End of variables declaration//GEN-END:variables
}
