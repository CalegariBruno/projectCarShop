/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.FuncoesUteis;
import control.GerenciadorInterface;
import control.tables.PessoaAbstractTableModel;
import control.tables.VeiculoAbstractTableModel;
import domain.Pessoa;
import domain.Veiculo;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author USUARIO
 */
public class DlgVenda extends javax.swing.JDialog {

    private Pessoa pessoaSelecionado = null;

    //TABELA VEICULO
    private Veiculo veiculoSelecionado = null;
    private VeiculoAbstractTableModel veiculoTableModel;

    public DlgVenda(java.awt.Frame parent, boolean modal) {
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

        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jpPainelPrincipalVenda = new javax.swing.JPanel();
        jlTituloCompra = new javax.swing.JLabel();
        jtPainelCompra = new javax.swing.JTabbedPane();
        jpVenda = new javax.swing.JPanel();
        jpComprador = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        btnBuscarPessoa = new javax.swing.JButton();
        txtTelefone = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jpVeiculos = new javax.swing.JPanel();
        jsTabelaVeiculos = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        jlPlaca = new javax.swing.JLabel();
        jtPlaca = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        btnListarVeiculo = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jpDataValorVenda = new javax.swing.JPanel();
        jlDataVenda = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jlValorVenda = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jlValorVenda1 = new javax.swing.JLabel();
        txtRetorno = new javax.swing.JTextField();
        txtFinanceira = new javax.swing.JTextField();
        jlFinanceiraComprador = new javax.swing.JLabel();
        jpListaVendidos = new javax.swing.JPanel();
        jsTabelaVeiculosVendidos = new javax.swing.JScrollPane();
        jtVeiculosVendidos = new javax.swing.JTable();
        jlPlacaFiltroDespesas = new javax.swing.JLabel();
        jtPlacaFiltroDespesas = new javax.swing.JTextField();
        jbPesquisarFiltroDespesas = new javax.swing.JButton();
        jbListarFiltroDespesas = new javax.swing.JButton();

        btnEditar.setBackground(new java.awt.Color(153, 153, 153));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Venda");
        setResizable(false);

        jpPainelPrincipalVenda.setBackground(new java.awt.Color(255, 255, 102));
        jpPainelPrincipalVenda.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
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
        jpComprador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comprador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jlNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlNome.setForeground(new java.awt.Color(0, 0, 0));
        jlNome.setText("Nome:");

        btnBuscarPessoa.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarPessoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarPessoa.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPessoa.setText("Buscar pessoa");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(204, 0, 0));

        jlTelefone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jlTelefone.setText("Telefone:");

        jlCpf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlCpf.setForeground(new java.awt.Color(0, 0, 0));
        jlCpf.setText("Cpf: ");

        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(204, 0, 0));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jpCompradorLayout = new javax.swing.GroupLayout(jpComprador);
        jpComprador.setLayout(jpCompradorLayout);
        jpCompradorLayout.setHorizontalGroup(
            jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCompradorLayout.createSequentialGroup()
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCompradorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCompradorLayout.createSequentialGroup()
                                .addComponent(jlTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpCompradorLayout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpCompradorLayout.createSequentialGroup()
                                .addComponent(jlCpf)
                                .addGap(18, 18, 18)
                                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jpCompradorLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnBuscarPessoa)))
                .addContainerGap())
        );
        jpCompradorLayout.setVerticalGroup(
            jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCompradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(txtNome))
                .addGap(18, 18, 18)
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCpf)
                    .addComponent(txtCpf))
                .addGap(18, 18, 18)
                .addGroup(jpCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(txtTelefone))
                .addGap(32, 32, 32)
                .addComponent(btnBuscarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpVeiculos.setBackground(new java.awt.Color(255, 255, 102));
        jpVeiculos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        tblVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor"
            }
        ));
        jsTabelaVeiculos.setViewportView(tblVeiculo);

        jlPlaca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlPlaca.setForeground(new java.awt.Color(0, 0, 0));
        jlPlaca.setText("Placa:");

        jtPlaca.setBackground(new java.awt.Color(204, 204, 204));
        jtPlaca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtPlaca.setBorder(new javax.swing.border.MatteBorder(null));

        jbPesquisar.setBackground(new java.awt.Color(51, 51, 51));
        jbPesquisar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jbPesquisar.setText("p");

        btnListarVeiculo.setBackground(new java.awt.Color(51, 51, 51));
        btnListarVeiculo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnListarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnListarVeiculo.setText("Listar");
        btnListarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpVeiculosLayout = new javax.swing.GroupLayout(jpVeiculos);
        jpVeiculos.setLayout(jpVeiculosLayout);
        jpVeiculosLayout.setHorizontalGroup(
            jpVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVeiculosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jsTabelaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVeiculosLayout.createSequentialGroup()
                        .addComponent(jlPlaca)
                        .addGap(18, 18, 18)
                        .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarVeiculo)))
                .addContainerGap())
        );
        jpVeiculosLayout.setVerticalGroup(
            jpVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVeiculosLayout.createSequentialGroup()
                .addGroup(jpVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPlaca)
                    .addComponent(jbPesquisar)
                    .addComponent(btnListarVeiculo))
                .addGap(18, 18, 18)
                .addComponent(jsTabelaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jpDataValorVenda.setBackground(new java.awt.Color(255, 255, 102));
        jpDataValorVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jpDataValorVenda.setForeground(new java.awt.Color(0, 0, 0));

        jlDataVenda.setBackground(new java.awt.Color(0, 0, 0));
        jlDataVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlDataVenda.setForeground(new java.awt.Color(0, 0, 0));
        jlDataVenda.setText("Data:");

        txtData.setBackground(new java.awt.Color(204, 204, 204));
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlValorVenda.setBackground(new java.awt.Color(0, 0, 0));
        jlValorVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlValorVenda.setForeground(new java.awt.Color(0, 0, 0));
        jlValorVenda.setText("Valor:");

        txtValor.setBackground(new java.awt.Color(204, 204, 204));
        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlValorVenda1.setBackground(new java.awt.Color(0, 0, 0));
        jlValorVenda1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlValorVenda1.setForeground(new java.awt.Color(0, 0, 0));
        jlValorVenda1.setText("Retorno:");

        txtRetorno.setBackground(new java.awt.Color(204, 204, 204));
        txtRetorno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFinanceira.setBackground(new java.awt.Color(204, 204, 204));
        txtFinanceira.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlFinanceiraComprador.setBackground(new java.awt.Color(0, 0, 0));
        jlFinanceiraComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlFinanceiraComprador.setForeground(new java.awt.Color(0, 0, 0));
        jlFinanceiraComprador.setText("Financeira:");

        javax.swing.GroupLayout jpDataValorVendaLayout = new javax.swing.GroupLayout(jpDataValorVenda);
        jpDataValorVenda.setLayout(jpDataValorVendaLayout);
        jpDataValorVendaLayout.setHorizontalGroup(
            jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFinanceiraComprador)
                    .addComponent(jlValorVenda1)
                    .addComponent(jlDataVenda))
                .addGap(18, 18, 18)
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(jlValorVenda)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRetorno)
                    .addComponent(txtFinanceira))
                .addContainerGap())
        );
        jpDataValorVendaLayout.setVerticalGroup(
            jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataValorVendaLayout.createSequentialGroup()
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataVenda)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorVenda)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFinanceiraComprador)
                    .addComponent(txtFinanceira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataValorVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorVenda1)
                    .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpVendaLayout = new javax.swing.GroupLayout(jpVenda);
        jpVenda.setLayout(jpVendaLayout);
        jpVendaLayout.setHorizontalGroup(
            jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendaLayout.createSequentialGroup()
                .addGroup(jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpComprador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVendaLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVendaLayout.createSequentialGroup()
                .addGap(0, 193, Short.MAX_VALUE)
                .addComponent(jpDataValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jpVendaLayout.setVerticalGroup(
            jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpComprador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jpDataValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jtPainelCompra.addTab("Nova", jpVenda);

        jpListaVendidos.setBackground(new java.awt.Color(255, 255, 102));
        jpListaVendidos.setBorder(new javax.swing.border.MatteBorder(null));

        jtVeiculosVendidos.setBackground(new java.awt.Color(204, 204, 204));
        jtVeiculosVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Comprador", "Placa", "Marca", "Modelo", "Data ", "Valor Venda", "Valor Compra", "Despesas", "Lucro"
            }
        ));
        jsTabelaVeiculosVendidos.setViewportView(jtVeiculosVendidos);

        jlPlacaFiltroDespesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlPlacaFiltroDespesas.setForeground(new java.awt.Color(0, 0, 0));
        jlPlacaFiltroDespesas.setText("Placa:");

        jtPlacaFiltroDespesas.setBackground(new java.awt.Color(204, 204, 204));
        jtPlacaFiltroDespesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtPlacaFiltroDespesas.setBorder(new javax.swing.border.MatteBorder(null));

        jbPesquisarFiltroDespesas.setBackground(new java.awt.Color(51, 51, 51));
        jbPesquisarFiltroDespesas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPesquisarFiltroDespesas.setForeground(new java.awt.Color(255, 255, 255));
        jbPesquisarFiltroDespesas.setText("Pesquisar");

        jbListarFiltroDespesas.setBackground(new java.awt.Color(51, 51, 51));
        jbListarFiltroDespesas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbListarFiltroDespesas.setForeground(new java.awt.Color(255, 255, 255));
        jbListarFiltroDespesas.setText("Listar");

        javax.swing.GroupLayout jpListaVendidosLayout = new javax.swing.GroupLayout(jpListaVendidos);
        jpListaVendidos.setLayout(jpListaVendidosLayout);
        jpListaVendidosLayout.setHorizontalGroup(
            jpListaVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaVendidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListaVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsTabelaVeiculosVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addGroup(jpListaVendidosLayout.createSequentialGroup()
                        .addComponent(jlPlacaFiltroDespesas)
                        .addGap(18, 18, 18)
                        .addComponent(jtPlacaFiltroDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisarFiltroDespesas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addComponent(jbListarFiltroDespesas)))
                .addContainerGap())
        );
        jpListaVendidosLayout.setVerticalGroup(
            jpListaVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaVendidosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpListaVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPlacaFiltroDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPlacaFiltroDespesas)
                    .addComponent(jbListarFiltroDespesas)
                    .addComponent(jbPesquisarFiltroDespesas))
                .addGap(18, 18, 18)
                .addComponent(jsTabelaVeiculosVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(49, 49, 49))
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

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed

        int linha = tblVeiculo.getSelectedRow();

        //INFORMAÇÕES DA VENDA
        String dataVenda = txtData.getText();
        String valorVenda = txtValor.getText();
        String financeira = txtFinanceira.getText();
        String retornoVenda = txtRetorno.getText();

        if (pessoaSelecionado != null && linha >= 0) {

            //PEGAR O VEICULO SELECIONADO
            linha = tblVeiculo.convertRowIndexToModel(linha);
            Veiculo veiculo = veiculoTableModel.getVeiculo(linha);

            try {
                // INSERIR NO BANCO

                double valor = Double.parseDouble(valorVenda);
                double retorno = Double.parseDouble(retornoVenda);
                Date data = FuncoesUteis.strToDate(dataVenda);

                GerenciadorInterface.getInstance().getGerenciadorDominio().inserirVenda(valor, data, financeira, retorno, pessoaSelecionado, veiculo);

                JOptionPane.showMessageDialog(this, "Venda inserida com sucesso.", "Cadastro Venda", JOptionPane.INFORMATION_MESSAGE);

            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Venda", JOptionPane.ERROR_MESSAGE);

            } catch (ParseException ex) {
                Logger.getLogger(DlgVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            // Mensagem de erro
            JOptionPane.showMessageDialog(this,"Selecione um veiculo.", "Pesquisar veiculo", JOptionPane.ERROR_MESSAGE);
            
        }

    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void btnListarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVeiculoActionPerformed
        List<Veiculo> lista;
        lista = GerenciadorInterface.getInstance().getGerenciadorDominio().listarVeiculos();
        veiculoTableModel.setLista(lista);
    }//GEN-LAST:event_btnListarVeiculoActionPerformed

    private void btnBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPessoaActionPerformed
        pessoaSelecionado = GerenciadorInterface.getInstance().abrirJanCadPessoa();
        try {
            preencherCampos(pessoaSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Pessoa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarPessoaActionPerformed

    private void preencherCampos(Pessoa pessoa) throws ParseException {

        if (pessoa != null) {

            txtNome.setText(pessoa.getNome());
            txtCpf.setText(pessoa.getCpf());
            txtTelefone.setText(pessoa.getTelefone());

        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPessoa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListarVeiculo;
    private javax.swing.JButton jbListarFiltroDespesas;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbPesquisarFiltroDespesas;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataVenda;
    private javax.swing.JLabel jlFinanceiraComprador;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlPlacaFiltroDespesas;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTituloCompra;
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
    private javax.swing.JTabbedPane jtPainelCompra;
    private javax.swing.JTextField jtPlaca;
    private javax.swing.JTextField jtPlacaFiltroDespesas;
    private javax.swing.JTable jtVeiculosVendidos;
    private javax.swing.JTable tblVeiculo;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtFinanceira;
    private javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtRetorno;
    private javax.swing.JLabel txtTelefone;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
