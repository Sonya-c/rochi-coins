/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layouts;

import model.system.Account;
/**
 *
 * @author sonya
 */
public class ProfileView extends javax.swing.JPanel {
    
    private Account account;
    /**
     * Creates new form profileView
     * @param account
     */
    public ProfileView(Account account) {
        this.account = account;
        
        initComponents();
        
        loadData();
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        passwordErrorPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usernameErrorPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        changedSavedPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();
        accountDataPanel = new javax.swing.JPanel();
        accountNameLabel = new javax.swing.JLabel();
        idUser = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();

        passwordErrorPanel.setBackground(new java.awt.Color(255, 255, 255));
        passwordErrorPanel.setMaximumSize(new java.awt.Dimension(252, 94));
        passwordErrorPanel.setMinimumSize(new java.awt.Dimension(252, 94));
        passwordErrorPanel.setPreferredSize(new java.awt.Dimension(252, 94));
        passwordErrorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("<html>La contraseña debe tener minimo 5 carácteres</html>");
        passwordErrorPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 40));

        usernameErrorPanel.setBackground(new java.awt.Color(255, 255, 255));
        usernameErrorPanel.setMaximumSize(new java.awt.Dimension(320, 95));
        usernameErrorPanel.setMinimumSize(new java.awt.Dimension(320, 95));
        usernameErrorPanel.setPreferredSize(new java.awt.Dimension(320, 95));
        usernameErrorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Este nombre de usuario ya existe :(");
        usernameErrorPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));

        changedSavedPanel.setBackground(new java.awt.Color(255, 255, 255));
        changedSavedPanel.setMaximumSize(new java.awt.Dimension(320, 95));
        changedSavedPanel.setMinimumSize(new java.awt.Dimension(320, 95));
        changedSavedPanel.setPreferredSize(new java.awt.Dimension(320, 95));
        changedSavedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Cambios guardados");
        changedSavedPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));

        setBackground(new java.awt.Color(71, 18, 107));
        setLayout(new java.awt.BorderLayout());

        parentPanel.setBackground(new java.awt.Color(71, 18, 107));
        parentPanel.setLayout(new java.awt.GridBagLayout());

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setMinimumSize(new java.awt.Dimension(530, 350));
        bodyPanel.setPreferredSize(new java.awt.Dimension(530, 350));
        bodyPanel.setLayout(new java.awt.GridBagLayout());

        accountDataPanel.setBackground(new java.awt.Color(234, 105, 139));
        accountDataPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 20, 100), 1, true));
        accountDataPanel.setLayout(new java.awt.GridBagLayout());

        accountNameLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        accountNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountNameLabel.setText("Tu cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        accountDataPanel.add(accountNameLabel, gridBagConstraints);

        idUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        idUser.setForeground(new java.awt.Color(255, 255, 255));
        idUser.setText("id del usuario");
        idUser.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        accountDataPanel.add(idUser, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(73, 124, 0, 100);
        bodyPanel.add(accountDataPanel, gridBagConstraints);

        userLabel.setBackground(new java.awt.Color(255, 255, 255));
        userLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(71, 18, 107));
        userLabel.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 124, 0, 0);
        bodyPanel.add(userLabel, gridBagConstraints);

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(71, 18, 107));
        passwordLabel.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 124, 0, 0);
        bodyPanel.add(passwordLabel, gridBagConstraints);

        userTxt.setEditable(false);
        userTxt.setBackground(new java.awt.Color(255, 255, 255));
        userTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userTxt.setForeground(new java.awt.Color(71, 18, 107));
        userTxt.setToolTipText("Nombre de usuario");
        userTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 18, 107), 1, true));
        userTxt.setCaretColor(new java.awt.Color(236, 0, 140));
        userTxt.setMargin(new java.awt.Insets(5, 5, 5, 5));
        userTxt.setName(""); // NOI18N
        userTxt.setPreferredSize(new java.awt.Dimension(170, 33));
        userTxt.setSelectionColor(new java.awt.Color(236, 0, 140));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 168;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 100);
        bodyPanel.add(userTxt, gridBagConstraints);

        passwordTxt.setEditable(false);
        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(71, 18, 107));
        passwordTxt.setToolTipText("Contraseña actual");
        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 18, 107), 1, true));
        passwordTxt.setCaretColor(new java.awt.Color(236, 0, 140));
        passwordTxt.setMargin(new java.awt.Insets(5, 5, 5, 5));
        passwordTxt.setName(""); // NOI18N
        passwordTxt.setPreferredSize(new java.awt.Dimension(170, 33));
        passwordTxt.setSelectionColor(new java.awt.Color(236, 0, 140));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 168;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 73, 100);
        bodyPanel.add(passwordTxt, gridBagConstraints);

        parentPanel.add(bodyPanel, new java.awt.GridBagConstraints());

        add(parentPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void loadData(){
        this.idUser.setText("Id: " + account.getID());
        userTxt.setText(account.getUserName());
        passwordTxt.setText(account.getPassword());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountDataPanel;
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel changedSavedPanel;
    private javax.swing.JLabel idUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel passwordErrorPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxt;
    private javax.swing.JPanel usernameErrorPanel;
    // End of variables declaration//GEN-END:variables
}
