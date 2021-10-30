package view.includes;

import controller.AccountController;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.JFrame;
import model.system.Account;
import model.system.Transaction;
import model.system.Wallet;

public class WalletCard extends javax.swing.JPanel {

    private final Wallet wallet;
    private final JFrame parent;
    private final AccountController accountController;
    private final Account account;

    public WalletCard(Wallet wallet, JFrame parent, AccountController accountController, Account account) {
        this.wallet = wallet;
        this.parent = parent;
        this.accountController = accountController;
        this.account = account;

        initComponents();

        loadData();
    }

    public void loadData() {
        idTxt.setText(wallet.getID());
        moneyTxt.setText(wallet.getMoney() + "");
        nicknameTxt.setText(wallet.getNickname());

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
        moneyTxtModal = new javax.swing.JSpinner();
        transactionSuccesfull = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        transactionFailPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nicknameTxt = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();
        nicknameLabel = new javax.swing.JLabel();
        moneyTxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        sendMoneyBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        idTxt = new javax.swing.JTextField();

        sendMoneyModal.setBackground(new java.awt.Color(151, 58, 168));
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(destinataryWalletLabel, gridBagConstraints);

        destinataryWalletTxt.setEditable(false);
        destinataryWalletTxt.setBackground(new java.awt.Color(87, 16, 137));
        destinataryWalletTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinataryWalletTxt.setForeground(new java.awt.Color(255, 255, 255));
        destinataryWalletTxt.setToolTipText("Nombre de usuario");
        destinataryWalletTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(87, 16, 137), 1, true));
        destinataryWalletTxt.setCaretColor(new java.awt.Color(236, 0, 140));
        destinataryWalletTxt.setMargin(new java.awt.Insets(5, 5, 5, 5));
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(remitentWalletLabel, gridBagConstraints);

        remitentWalletCombox.setBackground(new java.awt.Color(87, 16, 137));
        remitentWalletCombox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        remitentWalletCombox.setForeground(new java.awt.Color(255, 255, 255));
        remitentWalletCombox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(87, 16, 137), 1, true));
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(sendMoneyModalMoneyLabel, gridBagConstraints);

        sendMoneyModalBtn.setBackground(new java.awt.Color(234, 105, 139));
        sendMoneyModalBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sendMoneyModalBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendMoneyModalBtn.setText("Enviar");
        sendMoneyModalBtn.setToolTipText("Ingresar");
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
        gridBagConstraints.gridy = 5;
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(sendMoneyModalMoneyLabel1, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 100));

        messageTxt.setColumns(20);
        messageTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        messageTxt.setForeground(new java.awt.Color(27, 20, 100));
        messageTxt.setLineWrap(true);
        messageTxt.setRows(5);
        messageTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jScrollPane1.setViewportView(messageTxt);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(jScrollPane1, gridBagConstraints);

        moneyTxtModal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        moneyTxtModal.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        sendMoneyModal.add(moneyTxtModal, gridBagConstraints);

        transactionSuccesfull.setBackground(new java.awt.Color(255, 255, 255));
        transactionSuccesfull.setMaximumSize(new java.awt.Dimension(300, 100));
        transactionSuccesfull.setMinimumSize(new java.awt.Dimension(300, 100));
        transactionSuccesfull.setPreferredSize(new java.awt.Dimension(300, 100));
        transactionSuccesfull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("¡¡Transacción éxitosa!!");
        transactionSuccesfull.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 20));

        transactionFailPanel.setBackground(new java.awt.Color(255, 255, 255));
        transactionFailPanel.setMaximumSize(new java.awt.Dimension(300, 100));
        transactionFailPanel.setMinimumSize(new java.awt.Dimension(300, 100));
        transactionFailPanel.setPreferredSize(new java.awt.Dimension(300, 100));
        transactionFailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("¡¡Saldo insuficiente!!");
        transactionFailPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 20));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMinimumSize(new java.awt.Dimension(430, 300));
        setPreferredSize(new java.awt.Dimension(430, 300));
        setLayout(new java.awt.GridBagLayout());

        nicknameTxt.setEditable(false);
        nicknameTxt.setBackground(new java.awt.Color(255, 255, 255));
        nicknameTxt.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        nicknameTxt.setForeground(new java.awt.Color(27, 20, 100));
        nicknameTxt.setAutoscrolls(false);
        nicknameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 20, 100), 1, true));
        nicknameTxt.setMinimumSize(new java.awt.Dimension(60, 32));
        nicknameTxt.setPreferredSize(new java.awt.Dimension(60, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 178;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 61, 0, 69);
        add(nicknameTxt, gridBagConstraints);

        idLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(71, 18, 107));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("#ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 58, 0, 0);
        add(idLabel, gridBagConstraints);

        moneyLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(71, 18, 107));
        moneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyLabel.setText("Dinero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 58, 0, 0);
        add(moneyLabel, gridBagConstraints);

        nicknameLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nicknameLabel.setForeground(new java.awt.Color(71, 18, 107));
        nicknameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nicknameLabel.setText("Apodo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 58, 0, 0);
        add(nicknameLabel, gridBagConstraints);

        moneyTxt.setBackground(new java.awt.Color(255, 255, 255));
        moneyTxt.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        moneyTxt.setForeground(new java.awt.Color(27, 20, 100));
        moneyTxt.setText("00,0");
        moneyTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 20, 100), 1, true));
        moneyTxt.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 61, 0, 69);
        add(moneyTxt, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 181;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 65, 0, 0);
        add(jSeparator2, gridBagConstraints);

        sendMoneyBtn.setBackground(new java.awt.Color(216, 49, 91));
        sendMoneyBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sendMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendMoneyBtn.setText("Enviar");
        sendMoneyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMoneyBtnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 61, 24, 0);
        add(sendMoneyBtn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 181;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 61, 0, 0);
        add(jSeparator3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 181;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 61, 0, 0);
        add(jSeparator4, gridBagConstraints);

        idTxt.setEditable(false);
        idTxt.setBackground(new java.awt.Color(255, 255, 255));
        idTxt.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        idTxt.setForeground(new java.awt.Color(27, 20, 100));
        idTxt.setText("id");
        idTxt.setAutoscrolls(false);
        idTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 20, 100), 1, true));
        idTxt.setMinimumSize(new java.awt.Dimension(60, 32));
        idTxt.setPreferredSize(new java.awt.Dimension(60, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 178;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 61, 0, 69);
        add(idTxt, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void sendMoneyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMoneyBtnMouseClicked
        destinataryWalletTxt.setText(wallet.getID());
        for (Wallet wallet1 : account.getWallets()) {
            if (!wallet1.getID().equals(wallet.getID())) {
                remitentWalletCombox.addItem(wallet1.getID());
            }
        }
        Modal modal = new Modal(parent, "Nueva transacción", true, sendMoneyModal);
    }//GEN-LAST:event_sendMoneyBtnMouseClicked

    private void sendMoneyModalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMoneyModalBtnActionPerformed

        String walletId = (String) remitentWalletCombox.getSelectedItem();
        Wallet remitent = accountController.getWalletById(walletId);
        Double money = Double.parseDouble(moneyTxtModal.getValue().toString());
        
        Transaction transaction = new Transaction(remitent, wallet, money, LocalDate.now(), messageTxt.getText());

        if (accountController.getTransactionController().addNewTransaction(transaction)) {

            Modal modal = new Modal(parent, "Transacción éxitosa", true, transactionSuccesfull);
            transaction.getRemitent().setMoney(transaction.getRemitent().getMoney() - transaction.getMoney());
            transaction.getDestinatary().setMoney(transaction.getDestinatary().getMoney() + transaction.getMoney());
            double moneyTemp = Double.parseDouble(moneyTxt.getText()) - transaction.getMoney();
            
            this.removeAll();
            
            moneyTxt.setText(moneyTemp + "");
            
        } else {
            Modal modal = new Modal(parent, "Transacción errada", true, transactionFailPanel);
        }
    }//GEN-LAST:event_sendMoneyModalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel destinataryWalletLabel;
    private javax.swing.JTextField destinataryWalletTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea messageTxt;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JLabel moneyTxt;
    private javax.swing.JSpinner moneyTxtModal;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JTextField nicknameTxt;
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
    private javax.swing.JPanel transactionSuccesfull;
    // End of variables declaration//GEN-END:variables
}
