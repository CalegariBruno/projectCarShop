/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.FuncoesUteis;
import control.GerenciadorInterface;
import control.tables.VeiculoAbstractTableModel;
import domain.Veiculo;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author bruno
 */
public class DlgCadVeiculo extends javax.swing.JDialog {

    //TABELA VEICULO
    private Veiculo veiculoSelecionado = null;
    private VeiculoAbstractTableModel veiculoTableModel;

    public DlgCadVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        // ASSOCIAR o TABLE VEICULO MODEL ABSTRACT
        veiculoTableModel = new VeiculoAbstractTableModel();
        tblVeiculo.setModel(veiculoTableModel);
    }

    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtCadCliente = new javax.swing.JLabel();
        jlPlacaVeiculoCompra = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jlRenavamVeiculoCompra = new javax.swing.JLabel();
        txtRenavam = new javax.swing.JTextField();
        jlMarcaVeiculoCompra = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jlModeloVeiculoCompra = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jlAnoVeiculoCompra = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jlCorVeiculoCompra = new javax.swing.JLabel();
        cmbCor = new javax.swing.JComboBox<>();
        jlCorVeiculoCompra1 = new javax.swing.JLabel();
        cmbCombustivel = new javax.swing.JComboBox<>();
        jpTipoVeiculoCompra = new javax.swing.JPanel();
        jrbCarro = new javax.swing.JRadioButton();
        jrbMoto = new javax.swing.JRadioButton();
        jlNomePesq = new javax.swing.JLabel();
        txtNomePesq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jsTabelaVeiculos1 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        txtCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCadCliente.setText("Cadastro de Veiculo");

        jlPlacaVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlPlacaVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlPlacaVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlPlacaVeiculoCompra.setText("Placa:");

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca.setCaretColor(new java.awt.Color(0, 0, 0));

        jlRenavamVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlRenavamVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlRenavamVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlRenavamVeiculoCompra.setText("Renavam:");

        txtRenavam.setBackground(new java.awt.Color(255, 255, 255));
        txtRenavam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRenavam.setForeground(new java.awt.Color(0, 0, 0));
        txtRenavam.setCaretColor(new java.awt.Color(0, 0, 0));

        jlMarcaVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlMarcaVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlMarcaVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlMarcaVeiculoCompra.setText("Marca:");

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.setCaretColor(new java.awt.Color(0, 0, 0));

        jlModeloVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlModeloVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlModeloVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlModeloVeiculoCompra.setText("Modelo:");

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtModelo.setCaretColor(new java.awt.Color(0, 0, 0));

        jlAnoVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlAnoVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlAnoVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlAnoVeiculoCompra.setText("Ano:");

        txtAno.setBackground(new java.awt.Color(255, 255, 255));
        txtAno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAno.setForeground(new java.awt.Color(0, 0, 0));
        txtAno.setCaretColor(new java.awt.Color(0, 0, 0));

        jlCorVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCorVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra.setText("Cor:");

        cmbCor.setBackground(new java.awt.Color(255, 255, 255));
        cmbCor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCor.setForeground(new java.awt.Color(0, 0, 0));
        cmbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Prata", "Branco", "Vermelho", "Cinza", "Verde", "Azul", "Amarelo", "Rosa", "Roxo", "Marrom" }));
        cmbCor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlCorVeiculoCompra1.setBackground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCorVeiculoCompra1.setForeground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra1.setText("Combustível:");

        cmbCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        cmbCombustivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        cmbCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Flex", "Etanol", "Gás", "Elétrico", "Híbrido" }));

        jpTipoVeiculoCompra.setBackground(new java.awt.Color(204, 204, 204));
        jpTipoVeiculoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTipoVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));

        jrbCarro.setBackground(new java.awt.Color(204, 204, 204));
        bgTipo.add(jrbCarro);
        jrbCarro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jrbCarro.setForeground(new java.awt.Color(0, 0, 0));
        jrbCarro.setMnemonic('C');
        jrbCarro.setText("Carro");

        jrbMoto.setBackground(new java.awt.Color(204, 204, 204));
        bgTipo.add(jrbMoto);
        jrbMoto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jrbMoto.setForeground(new java.awt.Color(0, 0, 0));
        jrbMoto.setMnemonic('M');
        jrbMoto.setText("Moto");

        javax.swing.GroupLayout jpTipoVeiculoCompraLayout = new javax.swing.GroupLayout(jpTipoVeiculoCompra);
        jpTipoVeiculoCompra.setLayout(jpTipoVeiculoCompraLayout);
        jpTipoVeiculoCompraLayout.setHorizontalGroup(
            jpTipoVeiculoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTipoVeiculoCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTipoVeiculoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbCarro)
                    .addComponent(jrbMoto))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpTipoVeiculoCompraLayout.setVerticalGroup(
            jpTipoVeiculoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTipoVeiculoCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbMoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlNomePesq.setBackground(new java.awt.Color(0, 0, 0));
        jlNomePesq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNomePesq.setForeground(new java.awt.Color(0, 0, 0));
        jlNomePesq.setText("Placa:");

        txtNomePesq.setBackground(new java.awt.Color(255, 255, 255));
        txtNomePesq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomePesq.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        btnPesquisar.setText("P");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tblVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        tblVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsTabelaVeiculos1.setViewportView(tblVeiculo);

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPlacaVeiculoCompra)
                            .addComponent(jlRenavamVeiculoCompra)
                            .addComponent(jlMarcaVeiculoCompra)
                            .addComponent(jlModeloVeiculoCompra)
                            .addComponent(jlAnoVeiculoCompra))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCadCliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRenavam, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpTipoVeiculoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCorVeiculoCompra)
                            .addComponent(jlCorVeiculoCompra1))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(39, 39, 39)
                                .addComponent(btnCancelar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbCombustivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlNomePesq)
                            .addGap(18, 18, 18)
                            .addComponent(txtNomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListar)))
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtCadCliente)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPlacaVeiculoCompra)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRenavamVeiculoCompra)
                            .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMarcaVeiculoCompra)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jpTipoVeiculoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModeloVeiculoCompra)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnoVeiculoCompra)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCorVeiculoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorVeiculoCompra1)
                    .addComponent(cmbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(jlNomePesq)
                    .addComponent(txtNomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar)
                        .addComponent(btnCancelar)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        List<Veiculo> lista;
        lista = GerenciadorInterface.getInstance().getGerenciadorDominio().listarVeiculos();
        veiculoTableModel.setLista(lista);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int linha = tblVeiculo.getSelectedRow();
        if (linha >= 0) {
            linha = tblVeiculo.convertRowIndexToModel(linha);
            veiculoSelecionado = veiculoTableModel.getVeiculo(linha);
            this.setVisible(false);
        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar pessoa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        // INFORMAÇÕES DO VEICULO 
        String placa = txtPlaca.getText();
        String tRenavam = txtRenavam.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String tAno = txtAno.getText();
        String cor = (String) cmbCor.getSelectedItem();
        String combustivel = (String) cmbCombustivel.getSelectedItem();

        String tipoVeiculo = FuncoesUteis.getSelectedButtonText(bgTipo);

        try {
            // INSERIR NO BANCO

            long renavam = Long.parseLong(tRenavam);
            int ano = Integer.parseInt(tAno);

            GerenciadorInterface.getInstance().getGerenciadorDominio().inserirVeiculo(placa, renavam, marca, modelo, cor, tipoVeiculo, combustivel, ano);

            JOptionPane.showMessageDialog(this, "Veiculo inserido com sucesso.", "Cadastro Veiculo", JOptionPane.INFORMATION_MESSAGE);

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro veiculo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        veiculoSelecionado = null;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbCombustivel;
    private javax.swing.JComboBox<String> cmbCor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAnoVeiculoCompra;
    private javax.swing.JLabel jlCorVeiculoCompra;
    private javax.swing.JLabel jlCorVeiculoCompra1;
    private javax.swing.JLabel jlMarcaVeiculoCompra;
    private javax.swing.JLabel jlModeloVeiculoCompra;
    private javax.swing.JLabel jlNomePesq;
    private javax.swing.JLabel jlPlacaVeiculoCompra;
    private javax.swing.JLabel jlRenavamVeiculoCompra;
    private javax.swing.JPanel jpTipoVeiculoCompra;
    private javax.swing.JRadioButton jrbCarro;
    private javax.swing.JRadioButton jrbMoto;
    private javax.swing.JScrollPane jsTabelaVeiculos1;
    private javax.swing.JTable tblVeiculo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JLabel txtCadCliente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomePesq;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRenavam;
    // End of variables declaration//GEN-END:variables
}
