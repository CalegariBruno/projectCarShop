package viewer;

import control.GerenciadorInterface;


public class FrmPrincipalLoja extends javax.swing.JFrame {


    public FrmPrincipalLoja() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpImagem = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        jpBotoes = new javax.swing.JPanel();
        jbCompra = new javax.swing.JButton();
        jbVenda = new javax.swing.JButton();
        jbDespesas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela Principal");
        setResizable(false);

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 102));
        jpPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jpImagem.setBackground(new java.awt.Color(255, 255, 102));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/nova.png"))); // NOI18N

        javax.swing.GroupLayout jpImagemLayout = new javax.swing.GroupLayout(jpImagem);
        jpImagem.setLayout(jpImagemLayout);
        jpImagemLayout.setHorizontalGroup(
            jpImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpImagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagem)
                .addGap(65, 65, 65))
        );
        jpImagemLayout.setVerticalGroup(
            jpImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpImagemLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(imagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpBotoes.setBackground(new java.awt.Color(0, 0, 0));
        jpBotoes.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 102)));

        jbCompra.setBackground(new java.awt.Color(255, 255, 102));
        jbCompra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbCompra.setForeground(new java.awt.Color(0, 0, 0));
        jbCompra.setText("Compra");
        jbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompraActionPerformed(evt);
            }
        });

        jbVenda.setBackground(new java.awt.Color(255, 255, 102));
        jbVenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbVenda.setForeground(new java.awt.Color(0, 0, 0));
        jbVenda.setText("Venda");
        jbVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVendaActionPerformed(evt);
            }
        });

        jbDespesas.setBackground(new java.awt.Color(255, 255, 102));
        jbDespesas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbDespesas.setForeground(new java.awt.Color(0, 0, 0));
        jbDespesas.setText("Despesas");
        jbDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDespesasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jpBotoesLayout.setVerticalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jpImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
            .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jpImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jpPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompraActionPerformed
        GerenciadorInterface.getInstance().abrirJanCompra();
    }//GEN-LAST:event_jbCompraActionPerformed

    private void jbVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVendaActionPerformed
        GerenciadorInterface.getInstance().abrirJanVenda();
    }//GEN-LAST:event_jbVendaActionPerformed

    private void jbDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDespesasActionPerformed
        GerenciadorInterface.getInstance().abrirJanDespesa();
    }//GEN-LAST:event_jbDespesasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem;
    private javax.swing.JButton jbCompra;
    private javax.swing.JButton jbDespesas;
    private javax.swing.JButton jbVenda;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpImagem;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
