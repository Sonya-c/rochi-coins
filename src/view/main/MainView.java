package view.main;

import controller.JoinController;
import view.arbolGrafico.ArbolGrafico;
import model.structure.Arbol;
import controller.TransaccionController;
import javax.swing.ImageIcon;
import model.system.Persona;
import view.Dialog;

public class MainView extends javax.swing.JFrame {

    private Arbol arbol;
    private final ArbolGrafico arbolGrafico;
    private final TransaccionController transaccionController;
    private final Persona user;
    private final JoinController joinController;

    /**
     * 
     * @param arbol
     * @param user 
     */
    public MainView(Arbol arbol, Persona user) {
        initComponents();
        this.arbol = arbol;
        this.user = user;
        this.transaccionController = new TransaccionController(arbol);
        this.arbolGrafico = new ArbolGrafico(arbol);
        this.joinController = new JoinController(arbol);
        
        // Añadir los paneles externos
        this.arbolPanel.add(this.arbolGrafico);
        this.mainPanel.add(this.inicioPanel);

        this.idTxt.setText(String.valueOf(user.getId()));
        this.namesTxt.setText(user.getNames() + " " + user.getLastNames());
        this.moneyVisual.setText(String.valueOf(user.getDinero()));

        this.revalidate();
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicioPanel = new javax.swing.JPanel();
        fistPanel = new javax.swing.JPanel();
        moneyPanel = new javax.swing.JPanel();
        avilableLabel = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JLabel();
        namesTxt = new javax.swing.JLabel();
        moneyVisual = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        sendCenterPanel = new javax.swing.JPanel();
        sendFormPanel = new javax.swing.JPanel();
        sendUserNameLabel = new javax.swing.JLabel();
        sendUserNameTxt = new javax.swing.JTextField();
        sendMoneyLabel = new javax.swing.JLabel();
        sendMoneyTxt = new javax.swing.JSpinner();
        sendTitleLabel = new javax.swing.JLabel();
        sendBtn = new javax.swing.JButton();
        arbolPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        ActivityPanel = new javax.swing.JPanel();
        showArbolBtn = new javax.swing.JButton();
        showInicioBtn = new javax.swing.JButton();

        inicioPanel.setBackground(new java.awt.Color(27, 20, 100));
        inicioPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inicioPanel.setLayout(new java.awt.BorderLayout());

        fistPanel.setBackground(new java.awt.Color(27, 20, 100));
        fistPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));

        moneyPanel.setBackground(new java.awt.Color(236, 0, 140));
        moneyPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        moneyPanel.setMaximumSize(new java.awt.Dimension(100, 120));
        moneyPanel.setMinimumSize(new java.awt.Dimension(300, 120));
        moneyPanel.setPreferredSize(new java.awt.Dimension(330, 130));
        moneyPanel.setLayout(null);

        avilableLabel.setBackground(new java.awt.Color(255, 255, 255));
        avilableLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        avilableLabel.setForeground(new java.awt.Color(255, 255, 255));
        avilableLabel.setText("Disponible");
        avilableLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        moneyPanel.add(avilableLabel);
        avilableLabel.setBounds(10, 10, 58, 17);

        moneyLabel.setBackground(new java.awt.Color(255, 255, 255));
        moneyLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        moneyLabel.setText("$ ");
        moneyPanel.add(moneyLabel);
        moneyLabel.setBounds(10, 27, 35, 60);

        idLabel.setBackground(new java.awt.Color(255, 255, 255));
        idLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID");
        moneyPanel.add(idLabel);
        idLabel.setBounds(10, 87, 13, 17);

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Nombre");
        moneyPanel.add(nameLabel);
        nameLabel.setBounds(10, 110, 46, 17);

        idTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        idTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyPanel.add(idTxt);
        idTxt.setBounds(149, 88, 161, 16);

        namesTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        namesTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyPanel.add(namesTxt);
        namesTxt.setBounds(149, 110, 161, 17);

        moneyVisual.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        moneyVisual.setForeground(new java.awt.Color(255, 255, 255));
        moneyVisual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyPanel.add(moneyVisual);
        moneyVisual.setBounds(142, 30, 170, 40);

        fistPanel.add(moneyPanel);

        inicioPanel.add(fistPanel, java.awt.BorderLayout.PAGE_START);

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(null);
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        sendCenterPanel.setBackground(new java.awt.Color(27, 20, 100));
        sendCenterPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sendCenterPanel.setPreferredSize(new java.awt.Dimension(380, 230));

        sendFormPanel.setBackground(new java.awt.Color(255, 255, 255));
        sendFormPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 20, 100), 1, true));
        sendFormPanel.setPreferredSize(new java.awt.Dimension(330, 320));

        sendUserNameLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sendUserNameLabel.setText("Usuario");

        sendUserNameTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        sendMoneyLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sendMoneyLabel.setText("Cantidad");

        sendMoneyTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        sendTitleLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sendTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sendTitleLabel.setText("Enviar Dinero");

        sendBtn.setBackground(new java.awt.Color(0, 255, 197));
        sendBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sendBtn.setText("Enviar");
        sendBtn.setBorderPainted(false);
        sendBtn.setFocusPainted(false);
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sendFormPanelLayout = new javax.swing.GroupLayout(sendFormPanel);
        sendFormPanel.setLayout(sendFormPanelLayout);
        sendFormPanelLayout.setHorizontalGroup(
            sendFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendFormPanelLayout.createSequentialGroup()
                .addGroup(sendFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sendFormPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(sendTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sendFormPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(sendFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendMoneyLabel)
                            .addComponent(sendUserNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(sendFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendUserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendBtn)
                            .addComponent(sendMoneyTxt))))
                .addGap(68, 68, 68))
        );
        sendFormPanelLayout.setVerticalGroup(
            sendFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendFormPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sendTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(sendFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendUserNameLabel)
                    .addComponent(sendUserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(sendFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendMoneyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendMoneyLabel))
                .addGap(50, 50, 50)
                .addComponent(sendBtn)
                .addGap(60, 60, 60))
        );

        sendCenterPanel.add(sendFormPanel);

        scrollPanel.setViewportView(sendCenterPanel);

        inicioPanel.add(scrollPanel, java.awt.BorderLayout.CENTER);

        arbolPanel.setBackground(new java.awt.Color(255, 255, 255));
        arbolPanel.setLayout(new java.awt.BorderLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Block Pay");
        setExtendedState(6);
        setIconImage((new ImageIcon(getClass().getResource("/resources/img/logo.png"))).getImage());
        setMinimumSize(new java.awt.Dimension(600, 650));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(600, 356));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 356));
        mainPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        ActivityPanel.setBackground(new java.awt.Color(27, 20, 100));
        ActivityPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        showArbolBtn.setBackground(new java.awt.Color(42, 35, 115));
        showArbolBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        showArbolBtn.setForeground(new java.awt.Color(255, 255, 255));
        showArbolBtn.setText("Arbol");
        showArbolBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        showArbolBtn.setBorderPainted(false);
        showArbolBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showArbolBtn.setFocusPainted(false);
        showArbolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showArbolBtnActionPerformed(evt);
            }
        });
        ActivityPanel.add(showArbolBtn);

        showInicioBtn.setBackground(new java.awt.Color(42, 35, 115));
        showInicioBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        showInicioBtn.setForeground(new java.awt.Color(255, 255, 255));
        showInicioBtn.setText("Inicio");
        showInicioBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        showInicioBtn.setBorderPainted(false);
        showInicioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showInicioBtn.setFocusPainted(false);
        showInicioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInicioBtnActionPerformed(evt);
            }
        });
        ActivityPanel.add(showInicioBtn);

        getContentPane().add(ActivityPanel, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showArbolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showArbolBtnActionPerformed
        this.mainPanel.removeAll();
        this.mainPanel.add(this.arbolPanel);
        this.setTitle("Block Pay | Árbol");
        this.revalidate();
        this.repaint();
        this.arbolGrafico.draw();
    }//GEN-LAST:event_showArbolBtnActionPerformed

    private void showInicioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInicioBtnActionPerformed
        this.mainPanel.removeAll();
        this.mainPanel.add(this.inicioPanel);
        this.setTitle("Block Pay | Inicio");
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_showInicioBtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        System.out.println("view.main.MainView.sendBtn root " + this.arbol.getRoot().getInfo());
        Dialog dialog = new Dialog();

        float monto = Float.parseFloat(String.valueOf(this.sendMoneyTxt.getValue()));

        if (!sendUserNameTxt.getText().isEmpty()) {

            if (monto >= 50) {
                System.out.println("view.main.MainView.sendBtn root " + this.arbol.getRoot().getInfo());

                Persona persona = this.arbol.searchUser(this.arbol.getRoot().getChildren().search(0), sendUserNameTxt.getText(), 0);

                if (persona != null) {
                    int id = persona.getId();
                    this.transaccionController.transaccion(Integer.parseInt(this.idTxt.getText()), id, monto, this.moneyVisual);
                    this.sendUserNameTxt.setText("");
                    this.sendMoneyTxt.setValue(0);
                } else {
                    dialog.setMessage("No se encontro a este usuario");
                }

            } else {
                dialog.setMessage("Debe envíar una cantidad de dinero mayor a $50");
            }

        } else {
            dialog.setMessage("Campo usuario no puede estar vacío");
        }
    }//GEN-LAST:event_sendBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityPanel;
    private javax.swing.JPanel arbolPanel;
    private javax.swing.JLabel avilableLabel;
    private javax.swing.JPanel fistPanel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idTxt;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JPanel moneyPanel;
    private javax.swing.JLabel moneyVisual;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel namesTxt;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JButton sendBtn;
    private javax.swing.JPanel sendCenterPanel;
    private javax.swing.JPanel sendFormPanel;
    private javax.swing.JLabel sendMoneyLabel;
    private javax.swing.JSpinner sendMoneyTxt;
    private javax.swing.JLabel sendTitleLabel;
    private javax.swing.JLabel sendUserNameLabel;
    private javax.swing.JTextField sendUserNameTxt;
    private javax.swing.JButton showArbolBtn;
    private javax.swing.JButton showInicioBtn;
    // End of variables declaration//GEN-END:variables
}
