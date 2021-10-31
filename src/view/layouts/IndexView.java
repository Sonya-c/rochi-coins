/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.layouts;

import controller.AccountController;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.JFrame;
import model.system.Account;
import model.system.Transaction;
import model.system.Wallet;
import view.includes.GraphView;
import view.includes.Modal;

/**
 *
 * @author sonya
 */
public class IndexView extends javax.swing.JPanel {

    private final Account account;
    private final AccountController accountController;
    private final JFrame parent;

    /**
     * Creates new form indexView
     *
     * @param parent
     * @param account
     * @param accountController
     */
    public IndexView(JFrame parent, Account account, AccountController accountController) {
        this.parent = parent;
        this.account = account;
        this.accountController = accountController;

        initComponents();

        moneyLabelUpdate();
        this.graphPanel.add(new GraphView(accountController.getAccountList(), accountController.getTransactionController().getBlockList()));
    }

    //GETTERS ---
    public Component getSendMoneyModal() {
        return this.sendMoneyModal;
    }
    //---

    /**
     * Método para que no se estén agregando las carteras después de que ya
     * están en el Combox
     *
     * @param wallet
     * @return
     */
    private boolean existOnCombox(Wallet wallet) {
        for (int i = 0; i < remitentWalletCombox.getItemCount(); i++) {
            if (wallet.getNickname().equals(remitentWalletCombox.getItemAt(i))) {
                return true;
            }
        }
        return false;
    }

    private void moneyLabelUpdate() {
        double money = 0;
        for (Wallet wallet : account.getWallets()) {
            money += wallet.getMoney();
        }
        moneyLabelTxt.setText((money + ""));
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

        horrizontalScrollBar = new javax.swing.JScrollBar();
        verticalScrollBar = new javax.swing.JScrollBar();
        walletNotFoundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sendMoneyModal = new javax.swing.JPanel();
        sendMoneyModalTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        destinataryWalletLabel = new javax.swing.JLabel();
        destinataryWalletTxt = new javax.swing.JTextField();
        remitentWalletLabel = new javax.swing.JLabel();
        remitentWalletCombox = new javax.swing.JComboBox<>();
        sendMoneyModalMoneyLabel = new javax.swing.JLabel();
        sendMoneyModalBtn = new javax.swing.JButton();
        sendMoneyModalMoneyLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTxt = new javax.swing.JTextArea();
        moneyTxt = new javax.swing.JSpinner();
        poorMoneyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        transactionSuccesfull = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        transactionFailPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        transactionNotPossiblePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        sendMoneyBtn = new javax.swing.JButton();
        dineroDisponiblePanel = new javax.swing.JPanel();
        disponibleLabel = new javax.swing.JLabel();
        moneyLabelTxt = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        containerPanel = new javax.swing.JPanel();
        bodyScrollPanel = new javax.swing.JScrollPane();
        graphPanel = new javax.swing.JPanel();

        horrizontalScrollBar.setBackground(new java.awt.Color(53, 42, 157));
        horrizontalScrollBar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        horrizontalScrollBar.setForeground(new java.awt.Color(236, 0, 140));
        horrizontalScrollBar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        horrizontalScrollBar.setAutoscrolls(true);
        horrizontalScrollBar.setFocusable(false);
        horrizontalScrollBar.setOpaque(false);

        verticalScrollBar.setBackground(new java.awt.Color(53, 42, 157));
        verticalScrollBar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        verticalScrollBar.setForeground(new java.awt.Color(236, 0, 140));
        verticalScrollBar.setAutoscrolls(true);
        verticalScrollBar.setFocusable(false);
        verticalScrollBar.setOpaque(false);

        walletNotFoundPanel.setBackground(new java.awt.Color(255, 255, 255));
        walletNotFoundPanel.setMaximumSize(new java.awt.Dimension(270, 100));
        walletNotFoundPanel.setMinimumSize(new java.awt.Dimension(270, 100));
        walletNotFoundPanel.setPreferredSize(new java.awt.Dimension(270, 100));
        walletNotFoundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sad-icon.png"))); // NOI18N
        jLabel1.setText("Wallet no encontrada");
        walletNotFoundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 210, 20));

        sendMoneyModal.setBackground(new java.awt.Color(71, 18, 107));
        sendMoneyModal.setMaximumSize(new java.awt.Dimension(340, 440));
        sendMoneyModal.setMinimumSize(new java.awt.Dimension(340, 440));
        sendMoneyModal.setPreferredSize(new java.awt.Dimension(340, 440));
        sendMoneyModal.setLayout(new java.awt.GridBagLayout());

        sendMoneyModalTitle.setBackground(new java.awt.Color(102, 204, 255));
        sendMoneyModalTitle.setOpaque(false);
        sendMoneyModalTitle.setLayout(new java.awt.GridBagLayout());

        title.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Enviar dinero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModalTitle.add(title, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(sendMoneyModalTitle, gridBagConstraints);

        destinataryWalletLabel.setBackground(new java.awt.Color(255, 255, 255));
        destinataryWalletLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinataryWalletLabel.setForeground(new java.awt.Color(255, 255, 255));
        destinataryWalletLabel.setText("Wallet Id");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(destinataryWalletLabel, gridBagConstraints);

        destinataryWalletTxt.setBackground(new java.awt.Color(151, 58, 168));
        destinataryWalletTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinataryWalletTxt.setForeground(new java.awt.Color(255, 255, 255));
        destinataryWalletTxt.setToolTipText("Id billetera destinatario");
        destinataryWalletTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(87, 16, 137), 1, true));
        destinataryWalletTxt.setCaretColor(new java.awt.Color(236, 0, 140));
        destinataryWalletTxt.setMargin(new java.awt.Insets(5, 5, 5, 5));
        destinataryWalletTxt.setMinimumSize(new java.awt.Dimension(170, 33));
        destinataryWalletTxt.setName(""); // NOI18N
        destinataryWalletTxt.setPreferredSize(new java.awt.Dimension(170, 33));
        destinataryWalletTxt.setSelectionColor(new java.awt.Color(236, 0, 140));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(destinataryWalletTxt, gridBagConstraints);

        remitentWalletLabel.setBackground(new java.awt.Color(255, 255, 255));
        remitentWalletLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        remitentWalletLabel.setForeground(new java.awt.Color(255, 255, 255));
        remitentWalletLabel.setText("Mi wallet");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(remitentWalletLabel, gridBagConstraints);

        remitentWalletCombox.setBackground(new java.awt.Color(151, 58, 168));
        remitentWalletCombox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        remitentWalletCombox.setForeground(new java.awt.Color(255, 255, 255));
        remitentWalletCombox.setToolTipText("Mis billeteras");
        remitentWalletCombox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(87, 16, 137), 1, true));
        remitentWalletCombox.setFocusable(false);
        remitentWalletCombox.setMinimumSize(new java.awt.Dimension(170, 33));
        remitentWalletCombox.setPreferredSize(new java.awt.Dimension(170, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(remitentWalletCombox, gridBagConstraints);

        sendMoneyModalMoneyLabel.setBackground(new java.awt.Color(255, 255, 255));
        sendMoneyModalMoneyLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sendMoneyModalMoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        sendMoneyModalMoneyLabel.setText("Mensaje");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(sendMoneyModalMoneyLabel, gridBagConstraints);

        sendMoneyModalBtn.setBackground(new java.awt.Color(234, 105, 139));
        sendMoneyModalBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sendMoneyModalBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendMoneyModalBtn.setText("Enviar");
        sendMoneyModalBtn.setToolTipText("Enviar");
        sendMoneyModalBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 58, 168), 1, true));
        sendMoneyModalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendMoneyModalBtn.setFocusPainted(false);
        sendMoneyModalBtn.setMargin(new java.awt.Insets(4, 14, 4, 14));
        sendMoneyModalBtn.setMaximumSize(new java.awt.Dimension(150, 35));
        sendMoneyModalBtn.setMinimumSize(new java.awt.Dimension(150, 35));
        sendMoneyModalBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        sendMoneyModalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMoneyModalBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(sendMoneyModalBtn, gridBagConstraints);

        sendMoneyModalMoneyLabel1.setBackground(new java.awt.Color(255, 255, 255));
        sendMoneyModalMoneyLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sendMoneyModalMoneyLabel1.setForeground(new java.awt.Color(255, 255, 255));
        sendMoneyModalMoneyLabel1.setText("Dinero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(sendMoneyModalMoneyLabel1, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 100));

        messageTxt.setColumns(20);
        messageTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        messageTxt.setForeground(new java.awt.Color(234, 105, 139));
        messageTxt.setLineWrap(true);
        messageTxt.setRows(5);
        messageTxt.setToolTipText("Mensaje");
        messageTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        messageTxt.setCaretColor(new java.awt.Color(234, 105, 139));
        messageTxt.setPreferredSize(new java.awt.Dimension(120, 37));
        jScrollPane1.setViewportView(messageTxt);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(jScrollPane1, gridBagConstraints);

        moneyTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        moneyTxt.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        moneyTxt.setToolTipText("Dinero a mandar");
        moneyTxt.setMinimumSize(new java.awt.Dimension(170, 33));
        moneyTxt.setPreferredSize(new java.awt.Dimension(170, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(moneyTxt, gridBagConstraints);

        poorMoneyPanel.setBackground(new java.awt.Color(255, 255, 255));
        poorMoneyPanel.setMaximumSize(new java.awt.Dimension(300, 100));
        poorMoneyPanel.setMinimumSize(new java.awt.Dimension(300, 100));
        poorMoneyPanel.setPreferredSize(new java.awt.Dimension(300, 100));
        poorMoneyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sad-icon.png"))); // NOI18N
        jLabel2.setText("Debe mandar más de $50 pesos");
        poorMoneyPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 290, 20));

        transactionSuccesfull.setBackground(new java.awt.Color(255, 255, 255));
        transactionSuccesfull.setMaximumSize(new java.awt.Dimension(300, 100));
        transactionSuccesfull.setMinimumSize(new java.awt.Dimension(300, 100));
        transactionSuccesfull.setPreferredSize(new java.awt.Dimension(300, 100));
        transactionSuccesfull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/happy-icon.png"))); // NOI18N
        jLabel3.setText("¡Transacción éxitosa!");
        transactionSuccesfull.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 20));

        transactionFailPanel.setBackground(new java.awt.Color(255, 255, 255));
        transactionFailPanel.setMaximumSize(new java.awt.Dimension(300, 100));
        transactionFailPanel.setMinimumSize(new java.awt.Dimension(300, 100));
        transactionFailPanel.setPreferredSize(new java.awt.Dimension(300, 100));
        transactionFailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sad-icon.png"))); // NOI18N
        jLabel4.setText("Saldo insuficiente");
        transactionFailPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 20));

        transactionNotPossiblePanel.setBackground(new java.awt.Color(255, 255, 255));
        transactionNotPossiblePanel.setMaximumSize(new java.awt.Dimension(300, 100));
        transactionNotPossiblePanel.setMinimumSize(new java.awt.Dimension(300, 100));
        transactionNotPossiblePanel.setPreferredSize(new java.awt.Dimension(300, 100));
        transactionNotPossiblePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sad-icon.png"))); // NOI18N
        jLabel6.setText("No es válida la transacción");
        transactionNotPossiblePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 20));

        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(101, 30, 149));
        Header.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Header.setPreferredSize(new java.awt.Dimension(750, 110));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        Header.setLayout(flowLayout1);

        sendMoneyBtn.setBackground(new java.awt.Color(130, 47, 175));
        sendMoneyBtn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        sendMoneyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.png"))); // NOI18N
        sendMoneyBtn.setToolTipText("Realizar transacción");
        sendMoneyBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        sendMoneyBtn.setBorderPainted(false);
        sendMoneyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendMoneyBtn.setFocusPainted(false);
        sendMoneyBtn.setFocusable(false);
        sendMoneyBtn.setOpaque(false);
        sendMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMoneyBtnActionPerformed(evt);
            }
        });
        Header.add(sendMoneyBtn);

        dineroDisponiblePanel.setBackground(new java.awt.Color(27, 20, 100));
        dineroDisponiblePanel.setMinimumSize(new java.awt.Dimension(500, 83));
        dineroDisponiblePanel.setOpaque(false);
        dineroDisponiblePanel.setPreferredSize(new java.awt.Dimension(500, 83));
        dineroDisponiblePanel.setLayout(new javax.swing.BoxLayout(dineroDisponiblePanel, javax.swing.BoxLayout.Y_AXIS));

        disponibleLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        disponibleLabel.setForeground(new java.awt.Color(255, 255, 255));
        disponibleLabel.setText("Disponible");
        dineroDisponiblePanel.add(disponibleLabel);

        moneyLabelTxt.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        moneyLabelTxt.setForeground(new java.awt.Color(255, 255, 255));
        moneyLabelTxt.setText("$ 00,0");
        dineroDisponiblePanel.add(moneyLabelTxt);

        Header.add(dineroDisponiblePanel);

        add(Header, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        containerPanel.setLayout(new java.awt.GridLayout(1, 2, 20, 20));

        bodyScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyScrollPanel.setBorder(null);
        bodyScrollPanel.setAutoscrolls(true);
        bodyScrollPanel.setHorizontalScrollBar(horrizontalScrollBar);
        bodyScrollPanel.setVerticalScrollBar(verticalScrollBar);

        graphPanel.setBackground(new java.awt.Color(255, 255, 255));
        graphPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(177, 175, 200), 1, true));
        graphPanel.setMinimumSize(new java.awt.Dimension(200, 288));
        graphPanel.setPreferredSize(new java.awt.Dimension(200, 288));
        graphPanel.setLayout(new java.awt.BorderLayout());
        bodyScrollPanel.setViewportView(graphPanel);

        containerPanel.add(bodyScrollPanel);

        bodyPanel.add(containerPanel, java.awt.BorderLayout.CENTER);

        add(bodyPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void sendMoneyModalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMoneyModalBtnActionPerformed
        String walletNickname = (String) remitentWalletCombox.getSelectedItem();
        Wallet remitent = account.getWalletByNickname(walletNickname);
        Wallet destinatary = accountController.getWalletById(destinataryWalletTxt.getText());

        Double money = Double.parseDouble(moneyTxt.getValue().toString());

        if (destinatary != null) {
            if (!remitent.getID().equals(destinatary.getID())) {
                if (money > 50) {
                    Transaction transaction = new Transaction(remitent, destinatary, money, LocalDate.now(), messageTxt.getText());

                    if (accountController.getTransactionController().addNewTransaction(transaction)) {

                        Modal modal = new Modal(parent, "Transacción éxitosa", true, transactionSuccesfull);

                        transaction.getRemitent().setMoney(transaction.getRemitent().getMoney() - transaction.getMoney());
                        transaction.getDestinatary().setMoney(transaction.getDestinatary().getMoney() + transaction.getMoney());

                        moneyLabelUpdate();

                        this.removeAll();

                    } else {
                        Modal modal = new Modal(parent, "Transacción errada", true, transactionFailPanel);
                    }
                } else {
                     Modal modal = new Modal(parent, "Envio inválido", true, poorMoneyPanel);
                }

            } else {
                Modal modal = new Modal(parent, "Datos de transacción errados", true, transactionNotPossiblePanel);
            }
            
        } else {
            Modal moda = new Modal(parent, "No existe esa billetera", true, walletNotFoundPanel);
        }
    }//GEN-LAST:event_sendMoneyModalBtnActionPerformed

    private void sendMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMoneyBtnActionPerformed
        // Añadir los labels
        if (account != null && account.getWallets() != null) {
            for (Wallet wallet : account.getWallets()) {
                if (!existOnCombox(wallet)) {
                    remitentWalletCombox.addItem(wallet.getNickname());
                }
            }
        }

        Modal modal = new Modal(parent, "Nueva transacción", true, sendMoneyModal);
    }//GEN-LAST:event_sendMoneyBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JScrollPane bodyScrollPanel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel destinataryWalletLabel;
    private javax.swing.JTextField destinataryWalletTxt;
    private javax.swing.JPanel dineroDisponiblePanel;
    private javax.swing.JLabel disponibleLabel;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JScrollBar horrizontalScrollBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageTxt;
    private javax.swing.JLabel moneyLabelTxt;
    private javax.swing.JSpinner moneyTxt;
    private javax.swing.JPanel poorMoneyPanel;
    private javax.swing.JComboBox<String> remitentWalletCombox;
    private javax.swing.JLabel remitentWalletLabel;
    private javax.swing.JButton sendMoneyBtn;
    private javax.swing.JPanel sendMoneyModal;
    private javax.swing.JButton sendMoneyModalBtn;
    private javax.swing.JLabel sendMoneyModalMoneyLabel;
    private javax.swing.JLabel sendMoneyModalMoneyLabel1;
    private javax.swing.JPanel sendMoneyModalTitle;
    private javax.swing.JLabel title;
    private javax.swing.JPanel transactionFailPanel;
    private javax.swing.JPanel transactionNotPossiblePanel;
    private javax.swing.JPanel transactionSuccesfull;
    private javax.swing.JScrollBar verticalScrollBar;
    private javax.swing.JPanel walletNotFoundPanel;
    // End of variables declaration//GEN-END:variables
}
