
package com.sifunirios.barbearia;

import javax.swing.JOptionPane;

public class InterfaceBarbershop extends javax.swing.JFrame {
    tableModelUser model = new tableModelUser();
    tableModelAgendamento modelAgenda = new tableModelAgendamento();

    public InterfaceBarbershop() {
        initComponents();
        tbUser.setModel(model);
        tbAgenda.setModel(modelAgenda);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaInicial = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        btnCriarConta = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        telaLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logLogin = new javax.swing.JTextField();
        logSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCadastreSe = new javax.swing.JButton();
        labSenha = new javax.swing.JLabel();
        labLogin1 = new javax.swing.JLabel();
        telaLoginEmpresa = new javax.swing.JPanel();
        labTitleBarbershopEmpresa = new javax.swing.JLabel();
        labTitleEmpresa = new javax.swing.JLabel();
        labLoginEmpresa = new javax.swing.JLabel();
        logLoginEmpresa = new javax.swing.JTextField();
        labSenhaEmpresa = new javax.swing.JLabel();
        logSenhaEmpresa = new javax.swing.JPasswordField();
        btnEntrarEmpresa = new javax.swing.JButton();
        telaCadastro = new javax.swing.JPanel();
        tituloCadastro = new javax.swing.JLabel();
        tituloLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cadTel = new javax.swing.JTextField();
        cadEmail = new javax.swing.JTextField();
        cadNome = new javax.swing.JTextField();
        cadSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        tituloNome = new javax.swing.JLabel();
        cadLogin = new javax.swing.JTextField();
        btnVoltarTelaInicial = new javax.swing.JButton();
        telaUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        telaPrincipalUser = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        telaPrincipalBarbearia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAgenda = new javax.swing.JTable();
        labAgendaAtendimento = new javax.swing.JLabel();
        telaAgendamento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barbex Shop");
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(350, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        telaInicial.setBackground(new java.awt.Color(51, 0, 102));
        telaInicial.setMinimumSize(new java.awt.Dimension(350, 600));

        jLabel7.setFont(new java.awt.Font("Frank Ruehl CLM", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BARBER SHOP");

        btnLogar.setBackground(new java.awt.Color(255, 51, 0));
        btnLogar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(255, 255, 255));
        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        btnCriarConta.setBackground(new java.awt.Color(255, 51, 0));
        btnCriarConta.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarConta.setText("Criar Conta");
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });

        btnEmpresa.setBackground(new java.awt.Color(255, 51, 0));
        btnEmpresa.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpresa.setText("Empresa");
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaInicialLayout = new javax.swing.GroupLayout(telaInicial);
        telaInicial.setLayout(telaInicialLayout);
        telaInicialLayout.setHorizontalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInicialLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCriarConta, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(btnLogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67))))
        );
        telaInicialLayout.setVerticalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        getContentPane().add(telaInicial, "card6");

        telaLogin.setBackground(new java.awt.Color(51, 0, 102));
        telaLogin.setMinimumSize(new java.awt.Dimension(350, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Gabriola", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BARBER SHOP");

        logLogin.setBackground(new java.awt.Color(51, 0, 102));
        logLogin.setForeground(new java.awt.Color(255, 255, 255));
        logLogin.setToolTipText("");

        logSenha.setBackground(new java.awt.Color(51, 0, 102));
        logSenha.setForeground(new java.awt.Color(255, 255, 255));

        btnEntrar.setBackground(new java.awt.Color(255, 51, 0));
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
        labSenha.setForeground(new java.awt.Color(255, 51, 0));
        labSenha.setText("SENHA:");

        labLogin1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labLogin1.setForeground(new java.awt.Color(255, 51, 0));
        labLogin1.setText("LOGIN:");

        javax.swing.GroupLayout telaLoginLayout = new javax.swing.GroupLayout(telaLogin);
        telaLogin.setLayout(telaLoginLayout);
        telaLoginLayout.setHorizontalGroup(
            telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(telaLoginLayout.createSequentialGroup()
                .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(logSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                .addComponent(logLogin)
                                .addComponent(labSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(telaLoginLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCadastreSe)))))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaLoginLayout.setVerticalGroup(
            telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLoginLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(labSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnCadastreSe))
                .addGap(121, 121, 121)
                .addComponent(btnEntrar)
                .addGap(75, 75, 75))
        );

        getContentPane().add(telaLogin, "card2");

        telaLoginEmpresa.setBackground(new java.awt.Color(51, 0, 102));
        telaLoginEmpresa.setMinimumSize(new java.awt.Dimension(350, 600));

        labTitleBarbershopEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        labTitleBarbershopEmpresa.setFont(new java.awt.Font("Gabriola", 2, 48)); // NOI18N
        labTitleBarbershopEmpresa.setForeground(new java.awt.Color(255, 51, 0));
        labTitleBarbershopEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitleBarbershopEmpresa.setText("BARBER SHOP");

        labTitleEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        labTitleEmpresa.setFont(new java.awt.Font("Gadugi", 2, 18)); // NOI18N
        labTitleEmpresa.setForeground(new java.awt.Color(255, 51, 0));
        labTitleEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitleEmpresa.setText("Empresa");

        labLoginEmpresa.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labLoginEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        labLoginEmpresa.setText("LOGIN:");

        logLoginEmpresa.setBackground(new java.awt.Color(51, 0, 102));
        logLoginEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        logLoginEmpresa.setToolTipText("");

        labSenhaEmpresa.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labSenhaEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        labSenhaEmpresa.setText("SENHA:");

        logSenhaEmpresa.setBackground(new java.awt.Color(51, 0, 102));
        logSenhaEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        btnEntrarEmpresa.setBackground(new java.awt.Color(255, 51, 0));
        btnEntrarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrarEmpresa.setText("Entrar");
        btnEntrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaLoginEmpresaLayout = new javax.swing.GroupLayout(telaLoginEmpresa);
        telaLoginEmpresa.setLayout(telaLoginEmpresaLayout);
        telaLoginEmpresaLayout.setHorizontalGroup(
            telaLoginEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLoginEmpresaLayout.createSequentialGroup()
                .addGroup(telaLoginEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLoginEmpresaLayout.createSequentialGroup()
                        .addGroup(telaLoginEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaLoginEmpresaLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(telaLoginEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labLoginEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(telaLoginEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(logSenhaEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                        .addComponent(logLoginEmpresa)
                                        .addComponent(labSenhaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(telaLoginEmpresaLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(btnEntrarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaLoginEmpresaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(labTitleEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(telaLoginEmpresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labTitleBarbershopEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaLoginEmpresaLayout.setVerticalGroup(
            telaLoginEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLoginEmpresaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labTitleBarbershopEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTitleEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(labLoginEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logLoginEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(labSenhaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logSenhaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(btnEntrarEmpresa)
                .addGap(75, 75, 75))
        );

        getContentPane().add(telaLoginEmpresa, "card2");

        telaCadastro.setBackground(new java.awt.Color(51, 0, 102));
        telaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaCadastro.setMinimumSize(new java.awt.Dimension(350, 300));
        telaCadastro.setPreferredSize(new java.awt.Dimension(350, 300));

        tituloCadastro.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        tituloCadastro.setForeground(new java.awt.Color(255, 51, 0));
        tituloCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCadastro.setText("Criar uma Conta na Barbex");

        tituloLogin.setBackground(new java.awt.Color(255, 255, 255));
        tituloLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        tituloLogin.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        cadTel.setBackground(new java.awt.Color(51, 0, 102));
        cadTel.setForeground(new java.awt.Color(255, 255, 255));

        cadEmail.setBackground(new java.awt.Color(51, 0, 102));
        cadEmail.setForeground(new java.awt.Color(255, 255, 255));

        cadNome.setBackground(new java.awt.Color(51, 0, 102));
        cadNome.setForeground(new java.awt.Color(255, 255, 255));

        cadSenha.setBackground(new java.awt.Color(51, 0, 102));
        cadSenha.setForeground(new java.awt.Color(255, 255, 255));

        btnCadastrar.setBackground(new java.awt.Color(255, 51, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tituloNome.setBackground(new java.awt.Color(255, 255, 255));
        tituloNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tituloNome.setForeground(new java.awt.Color(255, 255, 255));
        tituloNome.setText("Nome:");

        cadLogin.setBackground(new java.awt.Color(51, 0, 102));
        cadLogin.setForeground(new java.awt.Color(255, 255, 255));

        btnVoltarTelaInicial.setBackground(new java.awt.Color(255, 51, 0));
        btnVoltarTelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarTelaInicial.setText("Tela Inicial");
        btnVoltarTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
        telaCadastro.setLayout(telaCadastroLayout);
        telaCadastroLayout.setHorizontalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                    .addGroup(telaCadastroLayout.createSequentialGroup()
                        .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaCadastroLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tituloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cadSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cadNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5)
                                    .addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cadEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cadTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(telaCadastroLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(btnVoltarTelaInicial)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaCadastroLayout.setVerticalGroup(
            telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnVoltarTelaInicial)
                .addGap(57, 57, 57))
        );

        getContentPane().add(telaCadastro, "card3");

        telaUsuarios.setBackground(new java.awt.Color(51, 0, 102));
        telaUsuarios.setMinimumSize(new java.awt.Dimension(350, 600));
        telaUsuarios.setPreferredSize(new java.awt.Dimension(350, 600));

        tbUser.setBackground(new java.awt.Color(51, 0, 102));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaUsuariosLayout.createSequentialGroup()
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

        telaPrincipalUser.setBackground(new java.awt.Color(51, 0, 102));
        telaPrincipalUser.setMinimumSize(new java.awt.Dimension(350, 600));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BEM VINDO AO BARBERSHOP");

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel9.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BARBEARIA X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 0));

        jLabel13.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BARBEARIA X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 0));

        jLabel15.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("BARBEARIA X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 51, 0));

        jLabel17.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("BARBEARIA X");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 51, 0));

        jLabel19.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("BARBEARIA X");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 51, 0));

        jLabel21.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("BARBEARIA X");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        btnSair.setBackground(new java.awt.Color(255, 51, 0));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");

        javax.swing.GroupLayout telaPrincipalUserLayout = new javax.swing.GroupLayout(telaPrincipalUser);
        telaPrincipalUser.setLayout(telaPrincipalUserLayout);
        telaPrincipalUserLayout.setHorizontalGroup(
            telaPrincipalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalUserLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(telaPrincipalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaPrincipalUserLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaPrincipalUserLayout.createSequentialGroup()
                        .addGroup(telaPrincipalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(telaPrincipalUserLayout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaPrincipalUserLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaPrincipalUserLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
            .addGroup(telaPrincipalUserLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnSair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        telaPrincipalUserLayout.setVerticalGroup(
            telaPrincipalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaPrincipalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaPrincipalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaPrincipalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(telaPrincipalUser, "card5");

        telaPrincipalBarbearia.setBackground(new java.awt.Color(51, 0, 102));

        tbAgenda.setBackground(new java.awt.Color(51, 0, 102));
        tbAgenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbAgenda);

        labAgendaAtendimento.setFont(new java.awt.Font("Gentium Basic", 0, 24)); // NOI18N
        labAgendaAtendimento.setForeground(new java.awt.Color(255, 51, 0));
        labAgendaAtendimento.setText("Agenda de Atendimento");

        javax.swing.GroupLayout telaPrincipalBarbeariaLayout = new javax.swing.GroupLayout(telaPrincipalBarbearia);
        telaPrincipalBarbearia.setLayout(telaPrincipalBarbeariaLayout);
        telaPrincipalBarbeariaLayout.setHorizontalGroup(
            telaPrincipalBarbeariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalBarbeariaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labAgendaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(telaPrincipalBarbeariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        telaPrincipalBarbeariaLayout.setVerticalGroup(
            telaPrincipalBarbeariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaPrincipalBarbeariaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labAgendaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        getContentPane().add(telaPrincipalBarbearia, "card7");

        telaAgendamento.setBackground(new java.awt.Color(51, 0, 102));
        telaAgendamento.setMinimumSize(new java.awt.Dimension(350, 600));

        javax.swing.GroupLayout telaAgendamentoLayout = new javax.swing.GroupLayout(telaAgendamento);
        telaAgendamento.setLayout(telaAgendamentoLayout);
        telaAgendamentoLayout.setHorizontalGroup(
            telaAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        telaAgendamentoLayout.setVerticalGroup(
            telaAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(telaAgendamento, "card9");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastreSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreSeActionPerformed
        telaLogin.setVisible(false);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastreSeActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String login = logLogin.getText();
        String senha = logSenha.getText();
        boolean logar = this.model.validarUsuario(login, senha);
        if(logar == true){
            telaLogin.setVisible(false);
            telaPrincipalUser.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"Login ou senha incorretos ou não cadastrados!");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = cadNome.getText();
        String login = cadLogin.getText();
        String senha = cadSenha.getText();
        String tel = cadTel.getText();
        String email = cadEmail.getText();
        
        if(validarCampos(nome, login, senha, tel, email)){
            User u = new User(nome, login, senha, tel, email);

            this.model.cadastrarUsuario(u);
            telaCadastro.setVisible(false);
            telaLogin.setVisible(true);
            cadNome.setText("");
            cadLogin.setText("");
            cadSenha.setText("");
            cadTel.setText("");
            cadEmail.setText("");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        telaInicial.setVisible(false);
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        telaInicial.setVisible(false);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCriarContaActionPerformed

    private void btnVoltarTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaInicialActionPerformed
        telaCadastro.setVisible(false);
        telaInicial.setVisible(true);
    }//GEN-LAST:event_btnVoltarTelaInicialActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        telaInicial.setVisible(false);
        telaLoginEmpresa.setVisible(true);
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnEntrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarEmpresaActionPerformed
        if(logLoginEmpresa.getText().equals("admin") && logSenhaEmpresa.getText().equals("password")){
            telaLoginEmpresa.setVisible(false);
            telaPrincipalBarbearia.setVisible(true);
        }
    }//GEN-LAST:event_btnEntrarEmpresaActionPerformed

    public boolean validarCampos(String nome, String login, String senha, String tel, String email){
        if(nome.trim().isEmpty() || login.trim().isEmpty() || senha.trim().isEmpty() || tel.trim().isEmpty() || email.trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Preencha todos os campos.");
            return false;
        }else{
            JOptionPane.showMessageDialog(this,"Sua conta foi criada com sucesso!");
            return true;
        }
    }
    
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
            java.util.logging.Logger.getLogger(InterfaceBarbershop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceBarbershop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceBarbershop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceBarbershop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBarbershop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastreSe;
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrarEmpresa;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltarTelaInicial;
    private javax.swing.JTextField cadEmail;
    private javax.swing.JTextField cadLogin;
    private javax.swing.JTextField cadNome;
    private javax.swing.JPasswordField cadSenha;
    private javax.swing.JTextField cadTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labAgendaAtendimento;
    private javax.swing.JLabel labLogin1;
    private javax.swing.JLabel labLoginEmpresa;
    private javax.swing.JLabel labSenha;
    private javax.swing.JLabel labSenhaEmpresa;
    private javax.swing.JLabel labTitleBarbershopEmpresa;
    private javax.swing.JLabel labTitleEmpresa;
    private javax.swing.JTextField logLogin;
    private javax.swing.JTextField logLoginEmpresa;
    private javax.swing.JPasswordField logSenha;
    private javax.swing.JPasswordField logSenhaEmpresa;
    private javax.swing.JTable tbAgenda;
    private javax.swing.JTable tbUser;
    private javax.swing.JPanel telaAgendamento;
    private javax.swing.JPanel telaCadastro;
    private javax.swing.JPanel telaInicial;
    private javax.swing.JPanel telaLogin;
    private javax.swing.JPanel telaLoginEmpresa;
    private javax.swing.JPanel telaPrincipalBarbearia;
    private javax.swing.JPanel telaPrincipalUser;
    private javax.swing.JPanel telaUsuarios;
    private javax.swing.JLabel tituloCadastro;
    private javax.swing.JLabel tituloLogin;
    private javax.swing.JLabel tituloNome;
    // End of variables declaration//GEN-END:variables
}
