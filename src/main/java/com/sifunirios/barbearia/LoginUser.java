
package com.sifunirios.barbearia;

import javax.swing.JOptionPane;

public class LoginUser extends javax.swing.JFrame {
    tableModelUser model = new tableModelUser();    

    public LoginUser() {
        initComponents();
        tbUser.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logLogin = new javax.swing.JTextField();
        logSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCadastreSe = new javax.swing.JButton();
        labSenha = new javax.swing.JLabel();
        labLogin1 = new javax.swing.JLabel();
        telaCadastro = new javax.swing.JPanel();
        tituloCadastro = new javax.swing.JLabel();
        tituloNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cadTel = new javax.swing.JTextField();
        cadEmail = new javax.swing.JTextField();
        cadNome = new javax.swing.JTextField();
        cadSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        telaUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        telaPrincipal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barbex Shop");
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(350, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        telaLogin.setBackground(new java.awt.Color(0, 0, 0));
        telaLogin.setMinimumSize(new java.awt.Dimension(350, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BARBER SHOP");

        logLogin.setBackground(new java.awt.Color(0, 0, 0));
        logLogin.setForeground(new java.awt.Color(255, 255, 255));
        logLogin.setToolTipText("");
        logLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logLoginActionPerformed(evt);
            }
        });

        logSenha.setBackground(new java.awt.Color(0, 0, 0));
        logSenha.setForeground(new java.awt.Color(255, 255, 255));
        logSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logSenhaActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(102, 102, 102));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ainda não possui uma conta?");

        btnCadastreSe.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastreSe.setForeground(new java.awt.Color(0, 0, 204));
        btnCadastreSe.setText("Cadastre já.");
        btnCadastreSe.setBorder(null);
        btnCadastreSe.setBorderPainted(false);
        btnCadastreSe.setContentAreaFilled(false);
        btnCadastreSe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastreSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreSeActionPerformed(evt);
            }
        });

        labSenha.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labSenha.setForeground(new java.awt.Color(255, 255, 255));
        labSenha.setText("SENHA:");

        labLogin1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labLogin1.setForeground(new java.awt.Color(255, 255, 255));
        labLogin1.setText("LOGIN:");

        javax.swing.GroupLayout telaLoginLayout = new javax.swing.GroupLayout(telaLogin);
        telaLogin.setLayout(telaLoginLayout);
        telaLoginLayout.setHorizontalGroup(
            telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(telaLoginLayout.createSequentialGroup()
                .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(logLogin)
                            .addComponent(labSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaLoginLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastreSe)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaLoginLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(labLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
        telaLoginLayout.setVerticalGroup(
            telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLoginLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(logLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(labSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnCadastreSe))
                .addGap(121, 121, 121)
                .addComponent(btnEntrar)
                .addGap(75, 75, 75))
            .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaLoginLayout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(labLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(398, Short.MAX_VALUE)))
        );

        getContentPane().add(telaLogin, "card2");

        telaCadastro.setBackground(new java.awt.Color(0, 0, 0));
        telaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaCadastro.setMinimumSize(new java.awt.Dimension(350, 300));
        telaCadastro.setPreferredSize(new java.awt.Dimension(350, 300));

        tituloCadastro.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        tituloCadastro.setForeground(new java.awt.Color(255, 255, 255));
        tituloCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCadastro.setText("Criar uma Conta na Barbex");

        tituloNome.setBackground(new java.awt.Color(255, 255, 255));
        tituloNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tituloNome.setForeground(new java.awt.Color(255, 255, 255));
        tituloNome.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        cadTel.setBackground(new java.awt.Color(0, 0, 0));
        cadTel.setForeground(new java.awt.Color(255, 255, 255));

        cadEmail.setBackground(new java.awt.Color(0, 0, 0));
        cadEmail.setForeground(new java.awt.Color(255, 255, 255));

        cadNome.setBackground(new java.awt.Color(0, 0, 0));
        cadNome.setForeground(new java.awt.Color(255, 255, 255));

        cadSenha.setBackground(new java.awt.Color(0, 0, 0));
        cadSenha.setForeground(new java.awt.Color(255, 255, 255));

        btnCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
        telaCadastro.setLayout(telaCadastroLayout);
        telaCadastroLayout.setHorizontalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(104, 104, 104))
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tituloNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cadSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cadNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cadEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cadTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaCadastroLayout.setVerticalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(tituloNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(telaCadastro, "card3");

        telaUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        telaUsuarios.setMinimumSize(new java.awt.Dimension(350, 600));
        telaUsuarios.setPreferredSize(new java.awt.Dimension(350, 600));

        tbUser.setBackground(new java.awt.Color(102, 102, 102));
        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbUser);

        javax.swing.GroupLayout telaUsuariosLayout = new javax.swing.GroupLayout(telaUsuarios);
        telaUsuarios.setLayout(telaUsuariosLayout);
        telaUsuariosLayout.setHorizontalGroup(
            telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        telaUsuariosLayout.setVerticalGroup(
            telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaUsuariosLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(telaUsuarios, "card4");

        telaPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        telaPrincipal.setMinimumSize(new java.awt.Dimension(350, 600));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BEM VINDO AO BARBERSHOP");

        javax.swing.GroupLayout telaPrincipalLayout = new javax.swing.GroupLayout(telaPrincipal);
        telaPrincipal.setLayout(telaPrincipalLayout);
        telaPrincipalLayout.setHorizontalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );
        telaPrincipalLayout.setVerticalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        getContentPane().add(telaPrincipal, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastreSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreSeActionPerformed
        telaLogin.setVisible(false);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastreSeActionPerformed

    private void logLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logLoginActionPerformed

    }//GEN-LAST:event_logLoginActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String login = logLogin.getText();
        String senha = logSenha.getText();
        boolean logar = this.model.validarUsuario(login, senha);
        if(logar == true){
            JOptionPane.showMessageDialog(this,"Logado!");
            telaLogin.setVisible(false);
            telaPrincipal.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"Não Logado!");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = cadNome.getText();
        String senha = cadSenha.getText();
        String tel = cadTel.getText();
        String email = cadEmail.getText();
        
        if(validarCampos(nome, senha, tel, email)){
            User u = new User(nome, senha, tel, email);

            this.model.cadastrarUsuario(u);
            telaCadastro.setVisible(false);
            telaLogin.setVisible(true);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void logSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logSenhaActionPerformed

    public boolean validarCampos(String nome, String senha, String tel, String email){
        if(nome.trim().isEmpty() || senha.trim().isEmpty() || tel.trim().isEmpty() || email.trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campos não preenchidos");
            return false;
        }else{
            JOptionPane.showMessageDialog(this,"Conta criada com sucesso!");
            return true;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastreSe;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JTextField cadEmail;
    private javax.swing.JTextField cadNome;
    private javax.swing.JPasswordField cadSenha;
    private javax.swing.JTextField cadTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labLogin1;
    private javax.swing.JLabel labSenha;
    private javax.swing.JTextField logLogin;
    private javax.swing.JPasswordField logSenha;
    private javax.swing.JTable tbUser;
    private javax.swing.JPanel telaCadastro;
    private javax.swing.JPanel telaLogin;
    private javax.swing.JPanel telaPrincipal;
    private javax.swing.JPanel telaUsuarios;
    private javax.swing.JLabel tituloCadastro;
    private javax.swing.JLabel tituloNome;
    // End of variables declaration//GEN-END:variables
}
