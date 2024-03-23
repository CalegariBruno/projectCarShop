/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

/**
 *
 * @author USUARIO
 */
public class DlgVenda extends javax.swing.JDialog {

    /**
     * Creates new form DlgVenda
     */
    public DlgVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jpPainelPrincipalVenda = new javax.swing.JPanel();
        jlTituloCompra = new javax.swing.JLabel();
        jtPainelCompra = new javax.swing.JTabbedPane();
        jpVenda = new javax.swing.JPanel();
        jpComprador = new javax.swing.JPanel();
        jlNomeComprador = new javax.swing.JLabel();
        jtNomeComprador = new javax.swing.JTextField();
        jlTelComprador = new javax.swing.JLabel();
        jlFinanceiraComprador = new javax.swing.JLabel();
        jfTelComprador = new javax.swing.JFormattedTextField();
        jtFinanceiraComprador = new javax.swing.JTextField();
        jpDataValorVenda = new javax.swing.JPanel();
        jlDataVenda = new javax.swing.JLabel();
        jfDataVenda = new javax.swing.JFormattedTextField();
        jlValorVenda = new javax.swing.JLabel();
        jtValorVenda = new javax.swing.JTextField();
        jlValorVenda1 = new javax.swing.JLabel();
        jtValorVenda1 = new javax.swing.JTextField();
        jlTituloComprador = new javax.swing.JLabel();
        jlDivisoria = new javax.swing.JLabel();
        jpVeiculos = new javax.swing.JPanel();
        jsTabelaVeiculos = new javax.swing.JScrollPane();
        jtVeiculos = new javax.swing.JTable();
        jlTituloSelecionarVeiculo = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();
        jpListaVendidos = new javax.swing.JPanel();
        jsTabelaVeiculosVendidos = new javax.swing.JScrollPane();
        jtVeiculosVendidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        jpPainelPrincipalVenda.setBackground(new java.awt.Color(255, 255, 102));
        jpPainelPrincipalVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlTituloCompra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlTituloCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlTituloCompra.setText("REGISTRO DE VENDA");

        jtPainelCompra.setBackground(new java.awt.Color(51, 51, 51));
        jtPainelCompra.setForeground(new java.awt.Color(255, 255, 255));
        jtPainelCompra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jpVenda.setBackground(new java.awt.Color(255, 255, 102));
        jpVenda.setBorder(new javax.swing.border.MatteBorder(null));

        jpComprador.setBackground(new java.awt.Color(255, 255, 102));

        jlNomeComprador.setBackground(new java.awt.Color(0, 0, 0));
        jlNomeComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNomeComprador.setForeground(new java.awt.Color(0, 0, 0));
        jlNomeComprador.setText("Nome Completo:");

        jtNomeComprador.setBackground(new java.awt.Color(204, 204, 204));
        jtNomeComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtNomeComprador.setBorder(new javax.swing.border.MatteBorder(null));
        jtNomeComprador.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jlTelComprador.setBackground(new java.awt.Color(0, 0, 0));
        jlTelComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTelComprador.setForeground(new java.awt.Color(0, 0, 0));
        jlTelComprador.setText("Telefone:");

        jlFinanceiraComprador.setBackground(new java.awt.Color(0, 0, 0));
        jlFinanceiraComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlFinanceiraComprador.setForeground(new java.awt.Color(0, 0, 0));
        jlFinanceiraComprador.setText("Financeira:");

        jfTelComprador.setBackground(new java.awt.Color(204, 204, 204));
        jfTelComprador.setBorder(new javax.swing.border.MatteBorder(null));
        jfTelComprador.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jfTelComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfTelComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtFinanceiraComprador.setBackground(new java.awt.Color(204, 204, 204));
        jtFinanceiraComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtFinanceiraComprador.setBorder(new javax.swing.border.MatteBorder(null));

        jpDataValorVenda.setBackground(new java.awt.Color(255, 255, 102));
        jpDataValorVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jpDataValorVenda.setForeground(new java.awt.Color(0, 0, 0));

        jlDataVenda.setBackground(new java.awt.Color(0, 0, 0));
        jlDataVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlDataVenda.setForeground(new java.awt.Color(204, 0, 0));
        jlDataVenda.setText("Data da venda:");

        jfDataVenda.setBackground(new java.awt.Color(204, 204, 204));
        jfDataVenda.setBorder(new javax.swing.border.MatteBorder(null));
        jfDataVenda.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jfDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfDataVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlValorVenda.setBackground(new java.awt.Color(0, 0, 0));
        jlValorVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlValorVenda.setForeground(new java.awt.Color(204, 0, 0));
        jlValorVenda.setText("Valor da venda:");

        jtValorVenda.setBackground(new java.awt.Color(204, 204, 204));
        jtValorVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtValorVenda.setBorder(new javax.swing.border.MatteBorder(null));

        jlValorVenda1.setBackground(new java.awt.Color(0, 0, 0));
        jlValorVenda1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlValorVenda1.setForeground(new java.awt.Color(204, 0, 0));
        jlValorVenda1.setText("Retorno:");

        jtValorVenda1.setBackground(new java.awt.Color(204, 204, 204));
        jtValorVenda1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtValorVenda1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jpDataValorVendaLayout = new javax.swing.GroupLayout(jpDataValorVenda);
        jpDataValorVenda.setLayout(jpDataValorVendaLayout);
        jpDataValorVendaLayout.setHorizontalGroup(
            jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                        .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValorVenda)
                            .addComponent(jlDataVenda))
                        .addGap(18, 18, 18)
                        .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                                .addComponent(jfDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtValorVenda)))
                    .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                        .addComponent(jlValorVenda1)
                        .addGap(18, 18, 18)
                        .addComponent(jtValorVenda1))))
        );
        jpDataValorVendaLayout.setVerticalGroup(
            jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataVenda)
                    .addComponent(jfDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorVenda)
                    .addComponent(jtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorVenda1)
                    .addComponent(jtValorVenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCompradorLayout = new javax.swing.GroupLayout(jpComprador);
        jpComprador.setLayout(jpCompradorLayout);
        jpCompradorLayout.setHorizontalGroup(
            jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCompradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCompradorLayout.createSequentialGroup()
                        .addComponent(jpDataValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpCompradorLayout.createSequentialGroup()
                        .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeComprador)
                            .addComponent(jlTelComprador)
                            .addComponent(jlFinanceiraComprador))
                        .addGap(18, 18, 18)
                        .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCompradorLayout.createSequentialGroup()
                                .addComponent(jtFinanceiraComprador)
                                .addGap(12, 12, 12))
                            .addGroup(jpCompradorLayout.createSequentialGroup()
                                .addComponent(jfTelComprador, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addGap(178, 178, 178))
                            .addGroup(jpCompradorLayout.createSequentialGroup()
                                .addComponent(jtNomeComprador)
                                .addGap(12, 12, 12))))))
        );
        jpCompradorLayout.setVerticalGroup(
            jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCompradorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeComprador)
                    .addComponent(jtNomeComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelComprador)
                    .addComponent(jfTelComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFinanceiraComprador)
                    .addComponent(jtFinanceiraComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jpDataValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jlTituloComprador.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jlTituloComprador.setForeground(new java.awt.Color(0, 0, 0));
        jlTituloComprador.setText("Comprador");

        jlDivisoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlDivisoria.setBorder(new javax.swing.border.MatteBorder(null));

        jpVeiculos.setBackground(new java.awt.Color(255, 255, 102));

        jtVeiculos.setBackground(new java.awt.Color(204, 204, 204));
        jtVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor"
            }
        ));
        jsTabelaVeiculos.setViewportView(jtVeiculos);

        javax.swing.GroupLayout jpVeiculosLayout = new javax.swing.GroupLayout(jpVeiculos);
        jpVeiculos.setLayout(jpVeiculosLayout);
        jpVeiculosLayout.setHorizontalGroup(
            jpVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVeiculosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsTabelaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jpVeiculosLayout.setVerticalGroup(
            jpVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jsTabelaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jlTituloSelecionarVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jlTituloSelecionarVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        jlTituloSelecionarVeiculo.setText("Selecione um veículo");

        jbRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.setBorder(null);

        javax.swing.GroupLayout jpVendaLayout = new javax.swing.GroupLayout(jpVenda);
        jpVenda.setLayout(jpVendaLayout);
        jpVendaLayout.setHorizontalGroup(
            jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jpVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpVendaLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jlTituloComprador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTituloSelecionarVeiculo)
                .addGap(95, 95, 95))
            .addGroup(jpVendaLayout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpVendaLayout.createSequentialGroup()
                    .addGap(492, 492, 492)
                    .addComponent(jlDivisoria, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(493, Short.MAX_VALUE)))
        );
        jpVendaLayout.setVerticalGroup(
            jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpVendaLayout.createSequentialGroup()
                        .addGroup(jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTituloComprador)
                            .addComponent(jlTituloSelecionarVeiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpVendaLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jlDivisoria, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)))
        );

        jtPainelCompra.addTab("Nova", jpVenda);

        jpListaVendidos.setBackground(new java.awt.Color(255, 255, 102));
        jpListaVendidos.setBorder(new javax.swing.border.MatteBorder(null));

        jtVeiculosVendidos.setBackground(new java.awt.Color(204, 204, 204));
        jtVeiculosVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome Comprador", "Placa", "Marca", "Modelo", "Data ", "Valor Venda", "Valor Compra", "Despesas", "Lucro"
            }
        ));
        jsTabelaVeiculosVendidos.setViewportView(jtVeiculosVendidos);

        javax.swing.GroupLayout jpListaVendidosLayout = new javax.swing.GroupLayout(jpListaVendidos);
        jpListaVendidos.setLayout(jpListaVendidosLayout);
        jpListaVendidosLayout.setHorizontalGroup(
            jpListaVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVendidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsTabelaVeiculosVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpListaVendidosLayout.setVerticalGroup(
            jpListaVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVendidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsTabelaVeiculosVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtPainelCompra.addTab("Vendidos", jpListaVendidos);

        javax.swing.GroupLayout jpPainelPrincipalVendaLayout = new javax.swing.GroupLayout(jpPainelPrincipalVenda);
        jpPainelPrincipalVenda.setLayout(jpPainelPrincipalVendaLayout);
        jpPainelPrincipalVendaLayout.setHorizontalGroup(
            jpPainelPrincipalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelPrincipalVendaLayout.createSequentialGroup()
                .addGroup(jpPainelPrincipalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPainelPrincipalVendaLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jlTituloCompra)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPainelPrincipalVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtPainelCompra)))
                .addContainerGap())
        );
        jpPainelPrincipalVendaLayout.setVerticalGroup(
            jpPainelPrincipalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelPrincipalVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTituloCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPainelCompra)
                .addContainerGap())
        );

        getContentPane().add(jpPainelPrincipalVenda, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgVenda dialog = new DlgVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JFormattedTextField jfDataVenda;
    private javax.swing.JFormattedTextField jfTelComprador;
    private javax.swing.JLabel jlDataVenda;
    private javax.swing.JLabel jlDivisoria;
    private javax.swing.JLabel jlFinanceiraComprador;
    private javax.swing.JLabel jlNomeComprador;
    private javax.swing.JLabel jlTelComprador;
    private javax.swing.JLabel jlTituloCompra;
    private javax.swing.JLabel jlTituloComprador;
    private javax.swing.JLabel jlTituloSelecionarVeiculo;
    private javax.swing.JLabel jlValorVenda;
    private javax.swing.JLabel jlValorVenda1;
    private javax.swing.JPanel jpComprador;
    private javax.swing.JPanel jpDataValorVenda;
    private javax.swing.JPanel jpListaVendidos;
    private javax.swing.JPanel jpPainelPrincipalVenda;
    private javax.swing.JPanel jpVeiculos;
    private javax.swing.JPanel jpVenda;
    private javax.swing.JScrollPane jsTabelaVeiculos;
    private javax.swing.JScrollPane jsTabelaVeiculosVendidos;
    private javax.swing.JTextField jtFinanceiraComprador;
    private javax.swing.JTextField jtNomeComprador;
    private javax.swing.JTabbedPane jtPainelCompra;
    private javax.swing.JTextField jtValorVenda;
    private javax.swing.JTextField jtValorVenda1;
    private javax.swing.JTable jtVeiculos;
    private javax.swing.JTable jtVeiculosVendidos;
    // End of variables declaration//GEN-END:variables
}
