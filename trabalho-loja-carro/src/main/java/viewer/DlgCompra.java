/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.FuncoesUteis;
import control.GerenciadorInterface;
import control.tables.CompraAbstractTableModel;
import domain.Compra;
import domain.Pessoa;
import domain.Veiculo;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCompra extends javax.swing.JDialog {

    private Pessoa pessoaSelecionado = null;
    private Veiculo veiculoSelecionado = null;
    
    private CompraAbstractTableModel comprasTableModel;

    public DlgCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        comprasTableModel = new CompraAbstractTableModel();
        tblCompras.setModel(comprasTableModel);
        
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
        jlTel = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        btnBuscarPessoa = new javax.swing.JButton();
        txtNome = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        jpVeiculo = new javax.swing.JPanel();
        jlPlacaVeiculoCompra = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlMarcaVeiculoCompra = new javax.swing.JLabel();
        btnBuscarVeiculo = new javax.swing.JButton();
        txtModelo = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        jbRegistrarCompra = new javax.swing.JButton();
        jpDataValorCompra = new javax.swing.JPanel();
        jlDataCompra = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        jlValorCompra = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JTextField();
        jpListaVeiculosComprados = new javax.swing.JPanel();
        jsListaVeiculosComprados = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        txtPesq = new javax.swing.JTextField();
        btnPesqCompra = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();

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
        jlNomeVendedor.setText("Nome:");

        jlTel.setBackground(new java.awt.Color(0, 0, 0));
        jlTel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTel.setForeground(new java.awt.Color(0, 0, 0));
        jlTel.setText("Telefone:");

        jlCpf.setBackground(new java.awt.Color(0, 0, 0));
        jlCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCpf.setForeground(new java.awt.Color(0, 0, 0));
        jlCpf.setText("CPF:");

        btnBuscarPessoa.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarPessoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarPessoa.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPessoa.setText("Buscar pessoa");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(204, 0, 0));

        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(204, 0, 0));

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jpVendedorLayout = new javax.swing.GroupLayout(jpVendedor);
        jpVendedor.setLayout(jpVendedorLayout);
        jpVendedorLayout.setHorizontalGroup(
            jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVendedorLayout.createSequentialGroup()
                        .addComponent(jlNomeVendedor)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpVendedorLayout.createSequentialGroup()
                        .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVendedorLayout.createSequentialGroup()
                                .addComponent(jlCpf)
                                .addGap(18, 18, 18)
                                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpVendedorLayout.createSequentialGroup()
                                .addComponent(jlTel)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))))
            .addGroup(jpVendedorLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnBuscarPessoa)
                .addGap(0, 158, Short.MAX_VALUE))
        );
        jpVendedorLayout.setVerticalGroup(
            jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendedorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeVendedor)
                    .addComponent(txtNome))
                .addGap(18, 18, 18)
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCpf)
                    .addComponent(txtCpf))
                .addGap(18, 18, 18)
                .addGroup(jpVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTel)
                    .addComponent(txtTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnBuscarPessoa)
                .addContainerGap())
        );

        jpVeiculo.setBackground(new java.awt.Color(255, 255, 102));
        jpVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jlPlacaVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlPlacaVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlPlacaVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlPlacaVeiculoCompra.setText("Placa:");

        jlModelo.setBackground(new java.awt.Color(0, 0, 0));
        jlModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlModelo.setForeground(new java.awt.Color(0, 0, 0));
        jlModelo.setText("Modelo:");

        jlMarcaVeiculoCompra.setBackground(new java.awt.Color(0, 0, 0));
        jlMarcaVeiculoCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlMarcaVeiculoCompra.setForeground(new java.awt.Color(0, 0, 0));
        jlMarcaVeiculoCompra.setText("Marca:");

        btnBuscarVeiculo.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVeiculo.setText("Buscar veiculo");
        btnBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeiculoActionPerformed(evt);
            }
        });

        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(204, 0, 0));

        txtPlaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(204, 0, 0));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jpVeiculoLayout = new javax.swing.GroupLayout(jpVeiculo);
        jpVeiculo.setLayout(jpVeiculoLayout);
        jpVeiculoLayout.setHorizontalGroup(
            jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPlacaVeiculoCompra)
                .addGap(18, 18, 18)
                .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnBuscarVeiculo))
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addComponent(jlModelo)
                        .addGap(18, 18, 18)
                        .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addComponent(jlMarcaVeiculoCompra)
                        .addGap(18, 18, 18)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpVeiculoLayout.setVerticalGroup(
            jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlacaVeiculoCompra)
                    .addComponent(txtPlaca))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMarcaVeiculoCompra)
                    .addComponent(txtMarca))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModelo)
                    .addComponent(txtModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarVeiculo)
                .addContainerGap())
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
        jlDataCompra.setForeground(new java.awt.Color(0, 0, 0));
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
        jlValorCompra.setForeground(new java.awt.Color(0, 0, 0));
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
                .addContainerGap()
                .addGroup(jpDataValorCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlValorCompra)
                    .addComponent(jlDataCompra))
                .addGap(18, 18, 18)
                .addGroup(jpDataValorCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtValorCompra))
                .addContainerGap())
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
                .addGroup(jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNovaCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpNovaCompraLayout.createSequentialGroup()
                                .addComponent(jpVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jpVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpNovaCompraLayout.createSequentialGroup()
                                .addGap(381, 381, 381)
                                .addComponent(jbRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpNovaCompraLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jpDataValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpNovaCompraLayout.setVerticalGroup(
            jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNovaCompraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpNovaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jpDataValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jbRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jtPainelCompra.addTab("Nova", jpNovaCompra);

        jpListaVeiculosComprados.setBackground(new java.awt.Color(255, 255, 102));
        jpListaVeiculosComprados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpListaVeiculosComprados.setForeground(new java.awt.Color(0, 0, 0));

        tblCompras.setBackground(new java.awt.Color(204, 204, 204));
        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Revendedor", "Tipo", "Placa", "Renavam", "Marca", "Modelo", "Ano", "Cor", "Combustível", "Data Compra", "Valor"
            }
        ));
        jsListaVeiculosComprados.setViewportView(tblCompras);

        txtPesq.setBackground(new java.awt.Color(204, 204, 204));
        txtPesq.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPesq.setCaretColor(new java.awt.Color(0, 0, 0));

        btnPesqCompra.setBackground(new java.awt.Color(51, 51, 51));
        btnPesqCompra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPesqCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnPesqCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/24x24/search.png"))); // NOI18N
        btnPesqCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCompraActionPerformed(evt);
            }
        });

        cmbTipo.setBackground(new java.awt.Color(204, 204, 204));
        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Placa" }));

        javax.swing.GroupLayout jpListaVeiculosCompradosLayout = new javax.swing.GroupLayout(jpListaVeiculosComprados);
        jpListaVeiculosComprados.setLayout(jpListaVeiculosCompradosLayout);
        jpListaVeiculosCompradosLayout.setHorizontalGroup(
            jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVeiculosCompradosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsListaVeiculosComprados, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addGroup(jpListaVeiculosCompradosLayout.createSequentialGroup()
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesqCompra)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpListaVeiculosCompradosLayout.setVerticalGroup(
            jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaVeiculosCompradosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesqCompra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpListaVeiculosCompradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        // INFORMAÇÕES DA COMPRA
        String dataCompra = txtDataCompra.getText();
        String valorCompra = txtValorCompra.getText();
                
        try {
            // INSERIR NO BANCO            
            
            double valor = Double.parseDouble(valorCompra);
            Date data = FuncoesUteis.strToDate(dataCompra);            
                     
            GerenciadorInterface.getInstance().getGerenciadorDominio().inserirCompra( valor, data, pessoaSelecionado, veiculoSelecionado);

            JOptionPane.showMessageDialog(this, "Compra inserida com sucesso.", "Cadastro Compra", JOptionPane.INFORMATION_MESSAGE);

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Compra", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(DlgCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbRegistrarCompraActionPerformed

    private void btnBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeiculoActionPerformed
       veiculoSelecionado = GerenciadorInterface.getInstance().abrirJanCadVeiculo();
        try {
            preencherCampos(veiculoSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Buscar Veiculo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarVeiculoActionPerformed

    private void btnBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPessoaActionPerformed
        pessoaSelecionado = GerenciadorInterface.getInstance().abrirJanCadPessoa();
        try {
            preencherCampos(pessoaSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Buscar Pessoa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarPessoaActionPerformed

    private void btnPesqCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCompraActionPerformed
        String pesq = txtPesq.getText();
        int tipo = cmbTipo.getSelectedIndex();
        List<Compra> lista;
        
        try {
            lista = GerenciadorInterface.getInstance().getGerenciadorDominio().pesquisarCompra(pesq, tipo);
            if ( lista.isEmpty() ) {
                JOptionPane.showMessageDialog(this,"Veiculo não encontrado.", "Pesquisar veiculo", JOptionPane.INFORMATION_MESSAGE);
            } 
            comprasTableModel.setLista(lista);
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar veiculo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesqCompraActionPerformed

    private void preencherCampos(Object obj) throws ParseException {

        if (obj instanceof Pessoa) {
            
            Pessoa pessoa = (Pessoa) obj;
            txtNome.setText(pessoa.getNome());
            txtCpf.setText(pessoa.getCpf());
            txtTelefone.setText(pessoa.getTelefone());

        }else{
            
            Veiculo veiculo = (Veiculo) obj;
            txtPlaca.setText(veiculo.getPlaca());
            txtMarca.setText(veiculo.getMarca());
            txtModelo.setText(veiculo.getModelo());
   
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnBuscarPessoa;
    private javax.swing.JButton btnBuscarVeiculo;
    private javax.swing.JButton btnPesqCompra;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jbRegistrarCompra;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataCompra;
    private javax.swing.JLabel jlMarcaVeiculoCompra;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNomeVendedor;
    private javax.swing.JLabel jlPlacaVeiculoCompra;
    private javax.swing.JLabel jlTel;
    private javax.swing.JLabel jlTituloCompra;
    private javax.swing.JLabel jlValorCompra;
    private javax.swing.JPanel jpDataValorCompra;
    private javax.swing.JPanel jpListaVeiculosComprados;
    private javax.swing.JPanel jpNovaCompra;
    private javax.swing.JPanel jpPrincipalCompra;
    private javax.swing.JPanel jpVeiculo;
    private javax.swing.JPanel jpVendedor;
    private javax.swing.JScrollPane jsListaVeiculosComprados;
    private javax.swing.JTabbedPane jtPainelCompra;
    private javax.swing.JTable tblCompras;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JFormattedTextField txtDataCompra;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtTelefone;
    private javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}
