/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

/**
 *
 * @author David
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        btCadastroCliente = new javax.swing.JButton();
        btCadastroEquipamento = new javax.swing.JButton();
        btCadastroEmprestimo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        arquivo = new javax.swing.JMenu();
        ajuda = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenuItem();
        cliente = new javax.swing.JMenu();
        novo_cliente = new javax.swing.JMenuItem();
        pesquisa_cliente = new javax.swing.JMenuItem();
        emprestimos = new javax.swing.JMenu();
        novo_emprestimo = new javax.swing.JMenuItem();
        pesquisa_emprestimo = new javax.swing.JMenuItem();
        equipamentos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema ONG");

        btCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/clientes.PNG"))); // NOI18N
        btCadastroCliente.setToolTipText("Cadastro Cliente");
        btCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastroClienteMouseClicked(evt);
            }
        });

        btCadastroEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/ong.PNG"))); // NOI18N
        btCadastroEquipamento.setToolTipText("Cadastro Equipamento");

        btCadastroEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/login.png"))); // NOI18N
        btCadastroEmprestimo.setToolTipText("Cadastro Emprestimo");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/imagem/clientes.PNG"))); // NOI18N
        jButton1.setToolTipText("Pesquisar Clientes");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(btCadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastroEmprestimo)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadastroEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btCadastroEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        arquivo.setMnemonic('a');
        arquivo.setText("Arquivo");

        ajuda.setText("Ajuda");
        arquivo.add(ajuda);

        editar.setText("Editar");
        arquivo.add(editar);

        jMenuBar1.add(arquivo);

        cliente.setMnemonic('c');
        cliente.setText("Cliente");

        novo_cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        novo_cliente.setText("Novo Cliente");
        novo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_clienteActionPerformed(evt);
            }
        });
        cliente.add(novo_cliente);

        pesquisa_cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        pesquisa_cliente.setText("Pesquisa Cliente");
        pesquisa_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_clienteActionPerformed(evt);
            }
        });
        cliente.add(pesquisa_cliente);

        jMenuBar1.add(cliente);

        emprestimos.setMnemonic('e');
        emprestimos.setText("Empréstimos");

        novo_emprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        novo_emprestimo.setText("Novo Empréstimo");
        novo_emprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_emprestimoActionPerformed(evt);
            }
        });
        emprestimos.add(novo_emprestimo);

        pesquisa_emprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        pesquisa_emprestimo.setText("Pesquisar Empréstimo");
        emprestimos.add(pesquisa_emprestimo);

        jMenuBar1.add(emprestimos);

        equipamentos.setMnemonic('q');
        equipamentos.setText("Equipamentos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setText("Novo Equipamento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        equipamentos.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem2.setText("Pesquisar Equipamento");
        equipamentos.add(jMenuItem2);

        jMenuBar1.add(equipamentos);

        relatorios.setMnemonic('r');
        relatorios.setText("Relatórios");
        jMenuBar1.add(relatorios);

        sair.setMnemonic('s');
        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        dispose();
    }//GEN-LAST:event_sairMouseClicked

    private void novo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_clienteActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_novo_clienteActionPerformed

    private void novo_emprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_emprestimoActionPerformed
       new CadastroEmprestimo().setVisible(true);
    }//GEN-LAST:event_novo_emprestimoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new CadastroEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastroClienteMouseClicked
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_btCadastroClienteMouseClicked

    private void pesquisa_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_clienteActionPerformed
       new PesquisaCliente().setVisible(true);
    }//GEN-LAST:event_pesquisa_clienteActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         new PesquisaCliente().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ajuda;
    private javax.swing.JMenu arquivo;
    private javax.swing.JButton btCadastroCliente;
    private javax.swing.JButton btCadastroEmprestimo;
    private javax.swing.JButton btCadastroEquipamento;
    private javax.swing.JMenu cliente;
    private javax.swing.JMenuItem editar;
    private javax.swing.JMenu emprestimos;
    private javax.swing.JMenu equipamentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem novo_cliente;
    private javax.swing.JMenuItem novo_emprestimo;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JMenuItem pesquisa_cliente;
    private javax.swing.JMenuItem pesquisa_emprestimo;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
