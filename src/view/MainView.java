package view;

import controller.AccountController;
import java.awt.Color;
import view.layouts.IndexView;
import view.layouts.ProfileView;
import view.layouts.WalletsView;
import view.layouts.DataView;
import model.system.Account;
import model.list.List;

/**
 *
 * @author sonya
 */
public class MainView extends javax.swing.JFrame {
    private final Account account;
    private final AccountController accountController;
    
    private final List<javax.swing.JButton> buttons;
    // VIEW
    private final IndexView indexView;
    private final ProfileView profileView;
    private final WalletsView walletsView;
    private final DataView dataView;
    
    public MainView(Account account, AccountController accountController) {
        this.indexView = new IndexView(this, account, accountController);
        this.profileView = new ProfileView(account);
        this.walletsView = new WalletsView(account);
        this.dataView = new DataView(account);
        
        this.account = account;
        this.accountController = accountController;
        
        initComponents();
        
        bodyPanel.add(indexView);
        
        buttons = new List<>();
        
        buttons.add(profileBtn);
        buttons.add(indexBtn);
        buttons.add(walletsBtn);
        buttons.add(dataBtn);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarPanel = new javax.swing.JPanel();
        mainMenuOptionsPanel = new javax.swing.JPanel();
        profileBtn = new javax.swing.JButton();
        indexBtn = new javax.swing.JButton();
        walletsBtn = new javax.swing.JButton();
        dataBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Block Pay | Home");
        setExtendedState(6);
        setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("Block Pay main Panel"); // NOI18N

        menuBarPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuBarPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 226, 244), 1, true));
        menuBarPanel.setMinimumSize(new java.awt.Dimension(60, 302));
        menuBarPanel.setPreferredSize(new java.awt.Dimension(60, 500));
        menuBarPanel.setLayout(new java.awt.BorderLayout());

        mainMenuOptionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainMenuOptionsPanel.setLayout(new javax.swing.BoxLayout(mainMenuOptionsPanel, javax.swing.BoxLayout.Y_AXIS));

        profileBtn.setBackground(new java.awt.Color(255, 255, 255));
        profileBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-icon.png"))); // NOI18N
        profileBtn.setToolTipText("Perfil");
        profileBtn.setAlignmentY(0.0F);
        profileBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        profileBtn.setContentAreaFilled(false);
        profileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileBtn.setFocusPainted(false);
        profileBtn.setFocusable(false);
        profileBtn.setIconTextGap(0);
        profileBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        profileBtn.setMaximumSize(new java.awt.Dimension(60, 60));
        profileBtn.setMinimumSize(new java.awt.Dimension(60, 60));
        profileBtn.setOpaque(true);
        profileBtn.setPreferredSize(new java.awt.Dimension(60, 60));
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        mainMenuOptionsPanel.add(profileBtn);

        indexBtn.setBackground(new java.awt.Color(255, 255, 255));
        indexBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        indexBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-icon.png"))); // NOI18N
        indexBtn.setToolTipText("Inicio");
        indexBtn.setAlignmentY(0.0F);
        indexBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 0, 140), 2));
        indexBtn.setContentAreaFilled(false);
        indexBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indexBtn.setFocusPainted(false);
        indexBtn.setFocusable(false);
        indexBtn.setMaximumSize(new java.awt.Dimension(60, 60));
        indexBtn.setMinimumSize(new java.awt.Dimension(60, 60));
        indexBtn.setOpaque(true);
        indexBtn.setPreferredSize(new java.awt.Dimension(60, 60));
        indexBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexBtnActionPerformed(evt);
            }
        });
        mainMenuOptionsPanel.add(indexBtn);

        walletsBtn.setBackground(new java.awt.Color(255, 255, 255));
        walletsBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        walletsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallet-icon.png"))); // NOI18N
        walletsBtn.setToolTipText("Wallets");
        walletsBtn.setAlignmentY(0.0F);
        walletsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        walletsBtn.setContentAreaFilled(false);
        walletsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        walletsBtn.setFocusPainted(false);
        walletsBtn.setFocusable(false);
        walletsBtn.setMaximumSize(new java.awt.Dimension(60, 60));
        walletsBtn.setMinimumSize(new java.awt.Dimension(60, 60));
        walletsBtn.setOpaque(true);
        walletsBtn.setPreferredSize(new java.awt.Dimension(60, 60));
        walletsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletsBtnActionPerformed(evt);
            }
        });
        mainMenuOptionsPanel.add(walletsBtn);

        dataBtn.setBackground(new java.awt.Color(255, 255, 255));
        dataBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dataBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/graph-icon.png"))); // NOI18N
        dataBtn.setToolTipText("Datos");
        dataBtn.setAlignmentY(0.0F);
        dataBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        dataBtn.setContentAreaFilled(false);
        dataBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataBtn.setFocusPainted(false);
        dataBtn.setFocusable(false);
        dataBtn.setMaximumSize(new java.awt.Dimension(60, 60));
        dataBtn.setMinimumSize(new java.awt.Dimension(60, 60));
        dataBtn.setOpaque(true);
        dataBtn.setPreferredSize(new java.awt.Dimension(60, 60));
        dataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBtnActionPerformed(evt);
            }
        });
        mainMenuOptionsPanel.add(dataBtn);

        menuBarPanel.add(mainMenuOptionsPanel, java.awt.BorderLayout.CENTER);

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-icon.png"))); // NOI18N
        exitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        exitBtn.setContentAreaFilled(false);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setFocusPainted(false);
        exitBtn.setMaximumSize(new java.awt.Dimension(60, 60));
        exitBtn.setMinimumSize(new java.awt.Dimension(55, 60));
        exitBtn.setOpaque(true);
        exitBtn.setPreferredSize(new java.awt.Dimension(55, 60));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        menuBarPanel.add(exitBtn, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(menuBarPanel, java.awt.BorderLayout.WEST);

        bodyPanel.setBackground(new java.awt.Color(245, 244, 251));
        bodyPanel.setMinimumSize(new java.awt.Dimension(740, 500));
        bodyPanel.setPreferredSize(new java.awt.Dimension(740, 500));
        bodyPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void defaultButtonBorder() {
        for (javax.swing.JButton button : buttons) {
            button.setBorder(whiteBorder);
            button.setBackground(Color.white);
        }
    }
    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        bodyPanel.removeAll();
        defaultButtonBorder();
        
        bodyPanel.add(profileView);
        setTitle("Block Pay | Perfil");
        
        profileBtn.setBorder(pinkBorder);
        profileBtn.setBackground(new java.awt.Color(241,185,219));
        
        bodyPanel.validate();
        bodyPanel.repaint();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void indexBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexBtnActionPerformed
        bodyPanel.removeAll();
        defaultButtonBorder();
        
        bodyPanel.add(indexView);
        setTitle("Block Pay | Home");
        
        indexBtn.setBorder(pinkBorder);
        indexBtn.setBackground(new java.awt.Color(241,185,219));
        
        bodyPanel.validate();
        bodyPanel.repaint();
    }//GEN-LAST:event_indexBtnActionPerformed

    private void walletsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletsBtnActionPerformed
        bodyPanel.removeAll();
        defaultButtonBorder();
        
        bodyPanel.add(walletsView);
        setTitle("Block Pay | Wallets");
        
        walletsBtn.setBorder(pinkBorder);
        walletsBtn.setBackground(new java.awt.Color(241,185,219));
        
        bodyPanel.validate();
        bodyPanel.repaint();
    }//GEN-LAST:event_walletsBtnActionPerformed

    private void dataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBtnActionPerformed
        bodyPanel.removeAll();
        defaultButtonBorder();
        
        bodyPanel.add(dataView);
        setTitle("Block Pay | Datos");
        
        dataBtn.setBorder(pinkBorder);
        dataBtn.setBackground(new java.awt.Color(241,185,219));
        
        bodyPanel.validate();
        bodyPanel.repaint();
    }//GEN-LAST:event_dataBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        
        
    }//GEN-LAST:event_exitBtnActionPerformed

    private javax.swing.border.LineBorder whiteBorder = new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true);
    private javax.swing.border.LineBorder pinkBorder = new javax.swing.border.LineBorder(new java.awt.Color(236,0,140), 3, true);
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton dataBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton indexBtn;
    private javax.swing.JPanel mainMenuOptionsPanel;
    private javax.swing.JPanel menuBarPanel;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton walletsBtn;
    // End of variables declaration//GEN-END:variables
}
