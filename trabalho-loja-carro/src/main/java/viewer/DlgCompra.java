/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.BuscarCEP;
import control.FuncoesUteis;
import control.GerenciadorInterface;
import domain.Compra;
import domain.Endereco;
import domain.Pessoa;
import domain.Veiculo;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author 2022122760044
 */
public class DlgCompra extends javax.swing.JDialog {

 
    public DlgCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        jpPrincipalCompra = new javax.swing.JPanel();
        jlTituloCompra = new javax.swing.JLabel();
        jtPainelCompra = new javax.swing.JTabbedPane();
        jpNovaCompra = new javax.swing.JPanel();
        jpVendedor = new javax.swing.JPanel();
        jlNomeVendedor = new javax.swing.JLabel();
        jlTelVendedor = new javax.swing.JLabel();
        txtTelRevendedor = new javax.swing.JFormattedTextField();
        txtNomeRevendedor = new javax.swing.JTextField();
        jlCEPVendedor1 = new javax.swing.JLabel();
        txtCpfRevendedor = new javax.swing.JFormattedTextField();
        btnaddPessoa = new javax.swing.JButton();
        jpVeiculo = new javax.swing.JPanel();
        jlPlacaVeiculoCompra = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jlRenavamVeiculoCompra = new javax.swing.JLabel();
        txtRenavam = new javax.swing.JTextField();
        jlMarcaVeiculoCompra = new javax.swing.JLabel();
        jlModeloVeiculoCompra = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jlAnoVeiculoCompra = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jpTipoVeiculoCompra = new javax.swing.JPanel();
        jrbCarro = new javax.swing.JRadioButton();
        jrbMoto = new javax.swing.JRadioButton();
        jlCorVeiculoCompra = new javax.swing.JLabel();
        cmbCor = new javax.swing.JComboBox<>();
        jlCorVeiculoCompra1 = new javax.swing.JLabel();
        cmbCombustivel = new javax.swing.JComboBox<>();
        btnAddVeiculo = new javax.swing.JButton();
        jbRegistrarCompra = new javax.swing.JButton();
        jpDataValorCompra = new javax.swing.JPanel();
        jlDataCompra = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        jlValorCompra = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JTextField();
        jpListaVeiculosComprados = new javax.swing.JPanel();
        jsListaVeiculosComprados = new javax.swing.JScrollPane();
        jtListaVeiculosComprados = new javax.swing.JTable();
        jtPlacaFiltroDespesas = new javax.swing.JTextField();
        jbPesquisarFiltroDespesas = new javax.swing.JButton();
        jbListarFiltroDespesas = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha de Entrada");
        setPreferredSize(new java.awt.Dimension(1020, 750));
        setResizable(false);

        jpPrincipalCompra.setBackground(new java.awt.Color(255, 255, 102));
        jpPrincipalCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jpPrincipalCompra.setPreferredSize(new java.awt.Dimension(1000, 700));

        jlTituloCompra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlTituloCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlTituloCompra.setText("FICHA DE ENTRADA");

        jtPainelCompra.setBackground(new java.awt.Color(0, 0, 0));
        jtPainelCompra.setForeground(new java.awt.Color(255, 255, 255));
        jtPainelCompra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtPainelCompra.setMinimumSize(new java.awt.Dimension(91, 60));
        jtPainelCompra.setPreferredSize(new java.awt.Dimension(978, 632));

        jpNovaCompra.setBackground(new java.awt.Color(255, 255, 102));
        jpNovaCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpNovaCompra.setForeground(new java.awt.Color(0, 0, 0));

        jpVendedor.setBackground(new java.awt.Color(255, 255, 102));
        jpVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Revendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jlNomeVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlNomeVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNomeVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlNomeVendedor.setText("Nome Completo:");

        jlTelVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlTelVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTelVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlTelVendedor.setText("Telefone:");

        txtTelRevendedor.setBackground(new java.awt.Color(204, 204, 204));
        txtTelRevendedor.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelRevendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelRevendedor.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTelRevendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtNomeRevendedor.setBackground(new java.awt.Color(204, 204, 204));
        txtNomeRevendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeRevendedor.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeRevendedor.setCaretColor(new java.awt.Color(0, 0, 0));

        jlCEPVendedor1.setBackground(new java.awt.Color(0, 0, 0));
        jlCEPVendedor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCEPVendedor1.setForeground(new java.awt.Color(0, 0, 0));
        jlCEPVendedor1.setText("CPF:");

        txtCpfRevendedor.setBackground(new java.awt.Color(204, 204, 204));
        txtCpfRevendedor.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpfRevendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfRevendedor.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCpfRevendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnaddPessoa.setBackground(new java.awt.Color(51, 51, 51));
        btnaddPessoa.setForeground(new java.awt.Color(255, 255, 255));
        btnaddPessoa.setText("add pessoa");
        btnaddPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpVendedorLayout = new javax.swing.GroupLayout(jpVendedor);
        jpVendedor.setLayout(jpVendedorLayout);
        jpVendedorLayout.setHorizontalGroup(
            jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVendedorLayout.createSequentialGroup()
                        .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeVendedor)
                            .addComponent(jlTelVendedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeRevendedor)
                            .addGroup(jpVendedorLayout.createSequentialGroup()
                                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCpfRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 146, Short.MAX_VALUE)))
                        .addGap(3, 3, 3))
                    .addGroup(jpVendedorLayout.createSequentialGroup()
                        .addComponent(jlCEPVendedor1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpVendedorLayout.createSequentialGroup()
                        .addComponent(btnaddPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpVendedorLayout.setVerticalGroup(
            jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendedorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeVendedor)
                    .addComponent(txtNomeRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelVendedor)
                    .addComponent(txtTelRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCEPVendedor1))
                .addGap(42, 42, 42)
                .addComponent(btnaddPessoa)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jpVeiculo.setBackground(new java.awt.Color(255, 255, 102));
        jpVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jlPlacaVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlPlacaVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlPlacaVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlPlacaVeiculoCompra.setText("Placa:");

        txtPlaca.setBackground(new java.awt.Color(204, 204, 204));
        txtPlaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca.setCaretColor(new java.awt.Color(0, 0, 0));

        jlRenavamVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlRenavamVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlRenavamVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlRenavamVeiculoCompra.setText("Renavam:");

        txtRenavam.setBackground(new java.awt.Color(204, 204, 204));
        txtRenavam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRenavam.setForeground(new java.awt.Color(0, 0, 0));
        txtRenavam.setCaretColor(new java.awt.Color(0, 0, 0));

        jlMarcaVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlMarcaVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlMarcaVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlMarcaVeiculoCompra.setText("Marca:");

        jlModeloVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlModeloVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlModeloVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlModeloVeiculoCompra.setText("Modelo:");

        txtModelo.setBackground(new java.awt.Color(204, 204, 204));
        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtModelo.setCaretColor(new java.awt.Color(0, 0, 0));

        txtMarca.setBackground(new java.awt.Color(204, 204, 204));
        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.setCaretColor(new java.awt.Color(0, 0, 0));

        jlAnoVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlAnoVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlAnoVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlAnoVeiculoCompra.setText("Ano:");

        txtAno.setBackground(new java.awt.Color(204, 204, 204));
        txtAno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAno.setForeground(new java.awt.Color(0, 0, 0));
        txtAno.setCaretColor(new java.awt.Color(0, 0, 0));

        jpTipoVeiculoCompra.setBackground(new java.awt.Color(255, 255, 102));
        jpTipoVeiculoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTipoVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));

        jrbCarro.setBackground(new java.awt.Color(255, 255, 102));
        bgTipo.add(jrbCarro);
        jrbCarro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jrbCarro.setForeground(new java.awt.Color(0, 0, 0));
        jrbCarro.setMnemonic('C');
        jrbCarro.setText("Carro");

        jrbMoto.setBackground(new java.awt.Color(255, 255, 102));
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

        jlCorVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCorVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra.setText("Cor:");

        cmbCor.setBackground(new java.awt.Color(204, 204, 204));
        cmbCor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCor.setForeground(new java.awt.Color(0, 0, 0));
        cmbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Prata", "Branco", "Vermelho", "Cinza", "Verde", "Azul", "Amarelo", "Rosa", "Roxo", "Marrom" }));
        cmbCor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlCorVeiculoCompra1.setBackground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCorVeiculoCompra1.setForeground(new java.awt.Color(0, 0, 0));
        jlCorVeiculoCompra1.setText("Combustível:");

        cmbCombustivel.setBackground(new java.awt.Color(204, 204, 204));
        cmbCombustivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        cmbCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Flex", "Etanol", "Gás", "Elétrico", "Híbrido" }));

        btnAddVeiculo.setBackground(new java.awt.Color(51, 51, 51));
        btnAddVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnAddVeiculo.setText("add veiculo");
        btnAddVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpVeiculoLayout = new javax.swing.GroupLayout(jpVeiculo);
        jpVeiculo.setLayout(jpVeiculoLayout);
        jpVeiculoLayout.setHorizontalGroup(
            jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPlacaVeiculoCompra)
                            .addComponent(jlRenavamVeiculoCompra)
                            .addComponent(jlMarcaVeiculoCompra)
                            .addComponent(jlModeloVeiculoCompra)
                            .addComponent(jlAnoVeiculoCompra))
                        .addGap(31, 31, 31)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRenavam, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtMarca)
                            .addComponent(txtModelo)
                            .addComponent(txtPlaca)
                            .addComponent(txtAno))
                        .addGap(28, 28, 28)
                        .addComponent(jpTipoVeiculoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCorVeiculoCompra)
                                .addComponent(jlCorVeiculoCompra1)))
                        .addGap(4, 4, 4)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCombustivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCor, 0, 140, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpVeiculoLayout.setVerticalGroup(
            jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTipoVeiculoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPlacaVeiculoCompra)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRenavamVeiculoCompra)
                            .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMarcaVeiculoCompra)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModeloVeiculoCompra)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAnoVeiculoCompra)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCorVeiculoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorVeiculoCompra1)
                    .addComponent(cmbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnAddVeiculo)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jbRegistrarCompra.setBackground(new java.awt.Color(51, 51, 51));
        jbRegistrarCompra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrarCompra.setText("Registrar");
        jbRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarCompraActionPerformed(evt);
            }
        });

        jpDataValorCompra.setBackground(new java.awt.Color(255, 255, 102));
        jpDataValorCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jlDataCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlDataCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlDataCompra.setForeground(new java.awt.Color(204, 0, 0));
        jlDataCompra.setText("Data da compra:");

        txtDataCompra.setBackground(new java.awt.Color(204, 204, 204));
        txtDataCompra.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCompra.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDataCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlValorCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlValorCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlValorCompra.setForeground(new java.awt.Color(204, 0, 0));
        jlValorCompra.setText("Valor da compra:");

        txtValorCompra.setBackground(new java.awt.Color(204, 204, 204));
        txtValorCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValorCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtValorCompra.setCaretColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpDataValorCompraLayout = new javax.swing.GroupLayout(jpDataValorCompra);
        jpDataValorCompra.setLayout(jpDataValorCompraLayout);
        jpDataValorCompraLayout.setHorizontalGroup(
            jpDataValorCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataValorCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDataValorCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDataValorCompraLayout.createSequentialGroup()
                        .addComponent(jlDataCompra)
                        .addGap(22, 22, 22)
                        .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDataValorCompraLayout.createSequentialGroup()
                        .addComponent(jlValorCompra)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorCompra))))
        );
        jpDataValorCompraLayout.setVerticalGroup(
            jpDataValorCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataValorCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDataValorCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataCompra)
                    .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataValorCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorCompra)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpNovaCompraLayout = new javax.swing.GroupLayout(jpNovaCompra);
        jpNovaCompra.setLayout(jpNovaCompraLayout);
        jpNovaCompraLayout.setHorizontalGroup(
            jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNovaCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNovaCompraLayout.createSequentialGroup()
                        .addGroup(jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpDataValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpNovaCompraLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jbRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpNovaCompraLayout.setVerticalGroup(
            jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNovaCompraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNovaCompraLayout.createSequentialGroup()
                        .addComponent(jpVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpNovaCompraLayout.createSequentialGroup()
                        .addComponent(jpVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jpDataValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtPainelCompra.addTab("Nova", jpNovaCompra);

        jpListaVeiculosComprados.setBackground(new java.awt.Color(255, 255, 102));
        jpListaVeiculosComprados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpListaVeiculosComprados.setForeground(new java.awt.Color(0, 0, 0));

        jtListaVeiculosComprados.setBackground(new java.awt.Color(204, 204, 204));
        jtListaVeiculosComprados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendedor", "Tipo", "Placa", "Renavam", "Marca", "Modelo", "Ano", "Cor", "Combustível", "Data Compra", "Valor"
            }
        ));
        jsListaVeiculosComprados.setViewportView(jtListaVeiculosComprados);

        jtPlacaFiltroDespesas.setBackground(new java.awt.Color(204, 204, 204));
        jtPlacaFiltroDespesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtPlacaFiltroDespesas.setCaretColor(new java.awt.Color(0, 0, 0));

        jbPesquisarFiltroDespesas.setBackground(new java.awt.Color(51, 51, 51));
        jbPesquisarFiltroDespesas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPesquisarFiltroDespesas.setForeground(new java.awt.Color(255, 255, 255));
        jbPesquisarFiltroDespesas.setText("Pesquisar");

        jbListarFiltroDespesas.setBackground(new java.awt.Color(51, 51, 51));
        jbListarFiltroDespesas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbListarFiltroDespesas.setForeground(new java.awt.Color(255, 255, 255));
        jbListarFiltroDespesas.setText("Listar");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Placa" }));

        javax.swing.GroupLayout jpListaVeiculosCompradosLayout = new javax.swing.GroupLayout(jpListaVeiculosComprados);
        jpListaVeiculosComprados.setLayout(jpListaVeiculosCompradosLayout);
        jpListaVeiculosCompradosLayout.setHorizontalGroup(
            jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVeiculosCompradosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsListaVeiculosComprados, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaVeiculosCompradosLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtPlacaFiltroDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisarFiltroDespesas)
                        .addGap(113, 113, 113)
                        .addComponent(jbListarFiltroDespesas)))
                .addContainerGap())
        );
        jpListaVeiculosCompradosLayout.setVerticalGroup(
            jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaVeiculosCompradosLayout.createSequentialGroup()
                .addGroup(jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpListaVeiculosCompradosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPlacaFiltroDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbListarFiltroDespesas)
                            .addComponent(jbPesquisarFiltroDespesas)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaVeiculosCompradosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jsListaVeiculosComprados, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        jtPainelCompra.addTab("Comprados", jpListaVeiculosComprados);

        javax.swing.GroupLayout jpPrincipalCompraLayout = new javax.swing.GroupLayout(jpPrincipalCompra);
        jpPrincipalCompra.setLayout(jpPrincipalCompraLayout);
        jpPrincipalCompraLayout.setHorizontalGroup(
            jpPrincipalCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalCompraLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jlTituloCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpPrincipalCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtPainelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpPrincipalCompraLayout.setVerticalGroup(
            jpPrincipalCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTituloCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPainelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jpPrincipalCompra, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarCompraActionPerformed

//        // INFORMAÇÕES DA COMPRA
//        String dataCompra = txtDataCompra.getText();
//        String valorCompra = txtValorCompra.getText();
//
//        
//                
//        try {
//            // INSERIR NO BANCO
//
//            
//            
//            double valor = Double.parseDouble(valorCompra);
//            Date data = FuncoesUteis.strToDate(dataCompra);
//            
//            
//            Veiculo veiculo = new Veiculo(placa, renavam, marca, modelo, cor, tAno, combustivel, ano);
//            
//            //GerenciadorInterface.getInstance().getGerenciadorDominio().inserirCompra( valor, data, nome, cpf, telefone,cep, bairro,
//            //        descricao, num, cidade, estado, placa, renavam, marca, modelo, cor, tipoVeiculo, combustivel, ano);
//            
//            GerenciadorInterface.getInstance().getGerenciadorDominio().inserirCompra( valor, data, revendedor, veiculo);
//
//            JOptionPane.showMessageDialog(this, "Compra inserida com sucesso.", "Cadastro Compra", JOptionPane.INFORMATION_MESSAGE);
//
//        } catch (HibernateException ex) {
//            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Compra", JOptionPane.ERROR_MESSAGE);
//        } catch (ParseException ex) {
//            Logger.getLogger(DlgCompra.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jbRegistrarCompraActionPerformed

    private void btnaddPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddPessoaActionPerformed
        
        // INFORMAÇÕES DO REVENDEDOR
        String nome = txtNomeRevendedor.getText();
        String telefone = txtTelRevendedor.getText();
        String cpf = txtCpfRevendedor.getText();
        String cep = txtCepRevendedor.getText();
        String txtNumero = txtNumEndRevendedor.getText();
        String descricao = txtDescEndereco.getText();
        String bairro = txtBairroEnder.getText();
        String cidade = txtCidadeEnder.getText();
        String estado = txtEstadoEnd.getText();
        
        try {
            // INSERIR NO BANCO

            
            int num = Integer.parseInt(txtNumero);
            
            GerenciadorInterface.getInstance().getGerenciadorDominio().inserirPesssoa(nome, cpf, telefone, cep, bairro, descricao, num, cidade, estado);

            JOptionPane.showMessageDialog(this, "Pessoa inserida com sucesso.", "Cadastro Pessoa", JOptionPane.INFORMATION_MESSAGE);

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Compra", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnaddPessoaActionPerformed

    private void btnAddVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVeiculoActionPerformed
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
        
    }//GEN-LAST:event_btnAddVeiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnAddVeiculo;
    private javax.swing.JButton btnaddPessoa;
    private javax.swing.JComboBox<String> cmbCombustivel;
    private javax.swing.JComboBox<String> cmbCor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jbListarFiltroDespesas;
    private javax.swing.JButton jbPesquisarFiltroDespesas;
    private javax.swing.JButton jbRegistrarCompra;
    private javax.swing.JLabel jlAnoVeiculoCompra;
    private javax.swing.JLabel jlCEPVendedor1;
    private javax.swing.JLabel jlCorVeiculoCompra;
    private javax.swing.JLabel jlCorVeiculoCompra1;
    private javax.swing.JLabel jlDataCompra;
    private javax.swing.JLabel jlMarcaVeiculoCompra;
    private javax.swing.JLabel jlModeloVeiculoCompra;
    private javax.swing.JLabel jlNomeVendedor;
    private javax.swing.JLabel jlPlacaVeiculoCompra;
    private javax.swing.JLabel jlRenavamVeiculoCompra;
    private javax.swing.JLabel jlTelVendedor;
    private javax.swing.JLabel jlTituloCompra;
    private javax.swing.JLabel jlValorCompra;
    private javax.swing.JPanel jpDataValorCompra;
    private javax.swing.JPanel jpListaVeiculosComprados;
    private javax.swing.JPanel jpNovaCompra;
    private javax.swing.JPanel jpPrincipalCompra;
    private javax.swing.JPanel jpTipoVeiculoCompra;
    private javax.swing.JPanel jpVeiculo;
    private javax.swing.JPanel jpVendedor;
    private javax.swing.JRadioButton jrbCarro;
    private javax.swing.JRadioButton jrbMoto;
    private javax.swing.JScrollPane jsListaVeiculosComprados;
    private javax.swing.JTable jtListaVeiculosComprados;
    private javax.swing.JTabbedPane jtPainelCompra;
    private javax.swing.JTextField jtPlacaFiltroDespesas;
    private javax.swing.JTextField txtAno;
    private javax.swing.JFormattedTextField txtCpfRevendedor;
    private javax.swing.JFormattedTextField txtDataCompra;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomeRevendedor;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRenavam;
    private javax.swing.JFormattedTextField txtTelRevendedor;
    private javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}
