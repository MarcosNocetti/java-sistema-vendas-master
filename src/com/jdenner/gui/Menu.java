package com.jdenner.gui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Janela menu da aplicação
 *
 */
public class Menu extends javax.swing.JFrame {
    LoginT log;
    public Menu () throws Exception {
        this.log = new LoginT();
        initComponents();
        lblUser.setText(log.jUser.getText());
    }   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        toolBar = new javax.swing.JToolBar();
        btVenda = new javax.swing.JButton();
        btCompra = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btDespesas = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        miProduto = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        miProduto1 = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        miVenda = new javax.swing.JMenuItem();
        miCompra = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        desktopPane.setBackground(new java.awt.Color(153, 204, 255));
        desktopPane.setForeground(new java.awt.Color(153, 204, 255));
        desktopPane.setName("btDespesas"); // NOI18N
        desktopPane.setOpaque(false);

        toolBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        toolBar.setFloatable(false);

        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/venda.png"))); // NOI18N
        btVenda.setText("Venda");
        btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVenda.setFocusable(false);
        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/venda-foco.png"))); // NOI18N
        btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btVenda);

        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/compra.png"))); // NOI18N
        btCompra.setText("Compra");
        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCompra.setFocusable(false);
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/compra-foco.png"))); // NOI18N
        btCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        toolBar.add(btCompra);

        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/produto.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btProduto.setFocusable(false);
        btProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProduto.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/produto-foco.png"))); // NOI18N
        btProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btProduto);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/cliente-foco.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/fornecedor.png"))); // NOI18N
        btFornecedor.setText("Fornecedor");
        btFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btFornecedor.setFocusable(false);
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/fornecedor-foco.png"))); // NOI18N
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        toolBar.add(btFornecedor);

        btDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/produto.png"))); // NOI18N
        btDespesas.setText("Despesas");
        btDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btDespesas.setFocusable(false);
        btDespesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDespesas.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btDespesas.setMaximumSize(new java.awt.Dimension(83, 59));
        btDespesas.setMinimumSize(new java.awt.Dimension(83, 59));
        btDespesas.setName("btDespesas"); // NOI18N
        btDespesas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/fornecedor-foco.png"))); // NOI18N
        btDespesas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDespesasmiFornecedorActionPerformed(evt);
            }
        });
        toolBar.add(btDespesas);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/sair-foco.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        desktopPane.add(toolBar);
        toolBar.setBounds(0, 10, 884, 61);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos abertos"));
        desktopPane.add(jPanel1);
        jPanel1.setBounds(110, 110, 660, 460);

        jLabel1.setText("Usuario em uso:");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(730, 590, 80, 40);

        lblUser.setText("User");
        desktopPane.add(lblUser);
        lblUser.setBounds(820, 594, 60, 30);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);
        desktopPane.getAccessibleContext().setAccessibleName("Despesas");

        menuCadastros.setText("Cadastros");

        miProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miProduto.setText("Cadastrar Produto");
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(miProduto);

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miCliente.setText("Cadastrar Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(miCliente);

        miFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        miFornecedor.setText("Cadastrar Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        menuCadastros.add(miFornecedor);

        miProduto1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        miProduto1.setText("Cadastrar Funcionario");
        miProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProduto1ActionPerformed(evt);
            }
        });
        menuCadastros.add(miProduto1);

        menuBar.add(menuCadastros);

        menuMovimentos.setText("Movimentos");

        miVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        miVenda.setText("Registrar Venda");
        miVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        menuMovimentos.add(miVenda);

        miCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        miCompra.setText("Registrar Compra");
        miCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        menuMovimentos.add(miCompra);

        menuBar.add(menuMovimentos);

        menuSistema.setText("Sistema");

        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuSistema.add(miSobre);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuSistema.add(miSair);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
        CadastroProduto c = new CadastroProduto();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        CadastroCliente c = new CadastroCliente();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
        CadastroFornecedor c = new CadastroFornecedor();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miFornecedorActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        LancamentoVenda v = new LancamentoVenda();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraActionPerformed
        LancamentoCompra c = new LancamentoCompra();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miCompraActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        Sobre s = new Sobre();
        s.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        dispose();
        LoginT L;
        try {
            L = new LoginT();
            L.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void btDespesasmiFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDespesasmiFornecedorActionPerformed
        TelaDespesas y = new TelaDespesas();
        desktopPane.add(y);
        y.setVisible(true);
    }//GEN-LAST:event_btDespesasmiFornecedorActionPerformed

    private void miProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProduto1ActionPerformed
      CadastroFuncionario x = new CadastroFuncionario();
      desktopPane.add(x);
      x.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_miProduto1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btDespesas;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVenda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCompra;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miProduto;
    private javax.swing.JMenuItem miProduto1;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVenda;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
