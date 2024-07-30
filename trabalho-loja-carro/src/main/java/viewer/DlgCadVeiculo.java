package viewer;

import control.FuncoesUteis;
import control.GerenciadorInterface;
import control.tables.VeiculoAbstractTableModel;
import domain.Veiculo;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

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

        // Adicionar o listener de seleção à tabela para saber se tem ou não algum veiculo selecionado
        tblVeiculo.getSelectionModel().addListSelectionListener(e -> ativarBotoes());
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
        txtPesq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jsTabelaVeiculos1 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de veiculo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");

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

        txtPesq.setBackground(new java.awt.Color(255, 255, 255));
        txtPesq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPesq.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/24x24/search.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        tblVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsTabelaVeiculos1.setViewportView(tblVeiculo);

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/accept.png"))); // NOI18N
        btnSelecionar.setText("  Selecionar");
        btnSelecionar.setEnabled(false);
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/add.png"))); // NOI18N
        btnCadastrar.setText("  Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/remove.png"))); // NOI18N
        btnCancelar.setText("  Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbTipo.setBackground(new java.awt.Color(255, 255, 255));
        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Placa" }));

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/remove.png"))); // NOI18N
        btnExcluir.setText("  Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/repeat.png"))); // NOI18N
        btnAlterar.setText("  Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCadCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(269, 269, 269)
                                        .addComponent(jpTipoVeiculoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCadastrar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCorVeiculoCompra)
                            .addComponent(jlCorVeiculoCompra1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(btnSelecionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesq)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSelecionar)
                        .addComponent(btnExcluir)
                        .addComponent(btnAlterar)))
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

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int linha = tblVeiculo.getSelectedRow();
        if (linha >= 0) {
            linha = tblVeiculo.convertRowIndexToModel(linha);
            veiculoSelecionado = veiculoTableModel.getVeiculo(linha);
            limparCampos();
            this.setVisible(false);
        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar veiculo", JOptionPane.ERROR_MESSAGE);
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

        if (validarCampos()) {
            try {

                long renavam = Long.parseLong(tRenavam);
                int ano = Integer.parseInt(tAno);

                if (veiculoSelecionado == null) {

                    // INSERIR NO BANCO                
                    GerenciadorInterface.getInstance().getGerenciadorDominio().inserirVeiculo(placa, renavam, marca, modelo, cor, tipoVeiculo, combustivel, ano);
                    JOptionPane.showMessageDialog(this, "Veiculo inserido com sucesso.", "Cadastro Veiculo", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();

                } else {

                    // ALTERAR NO BANCO
                    GerenciadorInterface.getInstance().getGerenciadorDominio().alterarVeiculo(veiculoSelecionado.getIdVeiculo(), placa, renavam, marca, modelo, cor, tipoVeiculo, combustivel, ano);
                    JOptionPane.showMessageDialog(this, "Veiculo " + veiculoSelecionado.getModelo() + " alterado com sucesso.", "Cadastro veiculo", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();

                }
                // Atualizar a tabela
                btnPesquisarActionPerformed(null);

            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro veiculo", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        veiculoSelecionado = null;
        limparCampos();
        jlPlacaVeiculoCompra.setForeground(Color.black);
        jlRenavamVeiculoCompra.setForeground(Color.black);
        jlMarcaVeiculoCompra.setForeground(Color.black);
        jlModeloVeiculoCompra.setForeground(Color.black);
        jlAnoVeiculoCompra.setForeground(Color.black);
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        String pesq = txtPesq.getText();
        int tipo = cmbTipo.getSelectedIndex();
        List<Veiculo> lista;

        try {
            lista = GerenciadorInterface.getInstance().getGerenciadorDominio().pesquisarVeiculo(pesq, tipo);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Veiculo não encontrado.", "Pesquisar veiculo", JOptionPane.INFORMATION_MESSAGE);
            }
            veiculoTableModel.setLista(lista);
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar. " + ex.getMessage(), "Pesquisar veiculo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linha = tblVeiculo.getSelectedRow();
        if (linha >= 0) {

            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir veiculo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                //Excluir do BANCO
                linha = tblVeiculo.convertRowIndexToModel(linha);
                Veiculo veiculo = veiculoTableModel.getVeiculo(linha);
                try {
                    GerenciadorInterface.getInstance().getGerenciadorDominio().excluir(veiculo);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir veiculo. " + ex.getMessage(), "Pesquisar veiculo", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(DlgCadVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DlgCadVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Remover da TABELA
                veiculoTableModel.remover(linha);
                veiculoSelecionado = null;
                limparCampos();
            }

        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar veiculo", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        btnCadastrar.setEnabled(true);

        int linha = tblVeiculo.getSelectedRow();

        if (linha >= 0) {
            linha = tblVeiculo.convertRowIndexToModel(linha);
            veiculoSelecionado = veiculoTableModel.getVeiculo(linha);
            try {
                preencherCampos(veiculoSelecionado);
            } catch (ParseException ex) {
                Logger.getLogger(DlgCadPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar veiculo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        veiculoSelecionado = null;
        limparCampos();
    }//GEN-LAST:event_formWindowClosing

    private void preencherCampos(Veiculo veiculo) throws ParseException {

        txtPlaca.setText(veiculo.getPlaca());
        txtRenavam.setText(String.valueOf(veiculo.getRenavam()));
        txtModelo.setText(veiculo.getModelo());
        txtMarca.setText(veiculo.getMarca());
        txtAno.setText(String.valueOf(veiculo.getAno()));

        if (veiculo.getTipo().equals("Carro")) {
            jrbCarro.setSelected(true);
        } else {
            jrbMoto.setSelected(true);
        }

        cmbCombustivel.setSelectedItem(veiculo.getCombustivel());
        cmbCor.setSelectedItem(veiculo.getCor());

    }

    private void limparCampos() {

        txtPlaca.setText("");
        txtRenavam.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtAno.setText("");
        txtPesq.setText("");

        cmbCombustivel.setSelectedIndex(0);
        cmbCor.setSelectedIndex(0);
        bgTipo.clearSelection();

        veiculoTableModel.limpar();
        ativarBotoes();
    }

    private boolean validarCampos() {

        String msgErro = "";

        jlPlacaVeiculoCompra.setForeground(Color.black);
        jlRenavamVeiculoCompra.setForeground(Color.black);
        jlMarcaVeiculoCompra.setForeground(Color.black);
        jlModeloVeiculoCompra.setForeground(Color.black);
        jlAnoVeiculoCompra.setForeground(Color.black);

        if (txtPlaca.getText().isEmpty()) {
            msgErro = msgErro + "Digite a placa.\n";
            jlPlacaVeiculoCompra.setForeground(Color.red);
        }

        if (txtMarca.getText().isEmpty()) {
            msgErro = msgErro + "Digite a marca.\n";
            jlMarcaVeiculoCompra.setForeground(Color.red);
        }

        if (txtModelo.getText().isEmpty()) {
            msgErro = msgErro + "Digite o modelo.\n";
            jlModeloVeiculoCompra.setForeground(Color.red);
        }

        if (bgTipo.getSelection() == null) {
            msgErro = msgErro + "Selecione um tipo.\n";
        }

        try {
            int ano = Integer.parseInt(txtAno.getText());
        } catch (NumberFormatException erro) {
            msgErro = msgErro + "Ano inválido.\n";
            jlAnoVeiculoCompra.setForeground(Color.red);
        } catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            jlAnoVeiculoCompra.setForeground(Color.red);
        }

        try {
            int renavam = Integer.parseInt(txtRenavam.getText());
        } catch (NumberFormatException erro) {
            msgErro = msgErro + "Renavam inválido.\n";
            jlRenavamVeiculoCompra.setForeground(Color.red);
        } catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            jlRenavamVeiculoCompra.setForeground(Color.red);
        }

        if (msgErro.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro, "ERRO VEICULO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public void ativarBotoes() {
        int linha = tblVeiculo.getSelectedRow();
        if (linha != -1) {
            veiculoSelecionado = veiculoTableModel.getVeiculo(linha);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnSelecionar.setEnabled(true);
            btnCadastrar.setEnabled(false);
        } else {
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnSelecionar.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbCombustivel;
    private javax.swing.JComboBox<String> cmbCor;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAnoVeiculoCompra;
    private javax.swing.JLabel jlCorVeiculoCompra;
    private javax.swing.JLabel jlCorVeiculoCompra1;
    private javax.swing.JLabel jlMarcaVeiculoCompra;
    private javax.swing.JLabel jlModeloVeiculoCompra;
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
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRenavam;
    // End of variables declaration//GEN-END:variables
}
