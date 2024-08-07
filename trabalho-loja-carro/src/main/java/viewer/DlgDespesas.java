package viewer;

import control.tables.DespesasAbstractTableModel;
import control.GerenciadorInterface;
import control.tables.VeiculoAbstractTableModel;
import domain.Compra;
import domain.Despesa;
import domain.Veiculo;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgDespesas extends javax.swing.JDialog {

    private VeiculoAbstractTableModel veiculoTableModel;
    private DespesasAbstractTableModel despesaTableModel;

    public DlgDespesas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // ASSOCIAR o TABLE MODEL ABSTRACT
        veiculoTableModel = new VeiculoAbstractTableModel();
        tblVeiculoDespesa.setModel(veiculoTableModel);
        tblBuscarVeiculo.setModel(veiculoTableModel);

        despesaTableModel = new DespesasAbstractTableModel();
        tblDespesas.setModel(despesaTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalDespesas = new javax.swing.JPanel();
        jlTituloDespesas = new javax.swing.JLabel();
        jtPainelDespesas = new javax.swing.JTabbedPane();
        jpNovaDespesa = new javax.swing.JPanel();
        jpSelecionarVeiculoDespesa = new javax.swing.JPanel();
        txtPesq = new javax.swing.JTextField();
        btnPesq = new javax.swing.JButton();
        jpVeiculosDespesa = new javax.swing.JPanel();
        jsVeiculoDespesa = new javax.swing.JScrollPane();
        tblVeiculoDespesa = new javax.swing.JTable();
        cmbTipo = new javax.swing.JComboBox<>();
        jpDespesas = new javax.swing.JPanel();
        jlDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jlValorDespesa = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jbAddDespesa = new javax.swing.JButton();
        jpListaDespesa = new javax.swing.JPanel();
        jpListaDepesas = new javax.swing.JPanel();
        jpSelecionarVeiculoDespesa1 = new javax.swing.JPanel();
        txtPesq1 = new javax.swing.JTextField();
        btnPesq1 = new javax.swing.JButton();
        jpVeiculosDespesa1 = new javax.swing.JPanel();
        jsVeiculoDespesa1 = new javax.swing.JScrollPane();
        tblBuscarVeiculo = new javax.swing.JTable();
        cmbTipo1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jpListaDespesas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDespesas = new javax.swing.JTable();
        labelValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JLabel();
        btnExcluirDespesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Despesas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpPrincipalDespesas.setBackground(new java.awt.Color(255, 255, 102));
        jpPrincipalDespesas.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jlTituloDespesas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlTituloDespesas.setForeground(new java.awt.Color(0, 0, 0));
        jlTituloDespesas.setText("REGISTRO DE DESPESAS");

        jtPainelDespesas.setBackground(new java.awt.Color(51, 51, 51));
        jtPainelDespesas.setForeground(new java.awt.Color(255, 255, 255));
        jtPainelDespesas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jpNovaDespesa.setBackground(new java.awt.Color(255, 255, 102));
        jpNovaDespesa.setBorder(new javax.swing.border.MatteBorder(null));
        jpNovaDespesa.setForeground(new java.awt.Color(51, 51, 51));

        jpSelecionarVeiculoDespesa.setBackground(new java.awt.Color(255, 255, 102));
        jpSelecionarVeiculoDespesa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Selecione um veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jpSelecionarVeiculoDespesa.setForeground(new java.awt.Color(0, 0, 0));

        txtPesq.setBackground(new java.awt.Color(204, 204, 204));
        txtPesq.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPesq.setForeground(new java.awt.Color(0, 0, 0));
        txtPesq.setCaretColor(new java.awt.Color(0, 0, 0));

        btnPesq.setBackground(new java.awt.Color(153, 153, 153));
        btnPesq.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPesq.setForeground(new java.awt.Color(255, 255, 255));
        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/24x24/search.png"))); // NOI18N
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        jpVeiculosDespesa.setBackground(new java.awt.Color(255, 255, 102));

        tblVeiculoDespesa.setBackground(new java.awt.Color(204, 204, 204));
        tblVeiculoDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor"
            }
        ));
        jsVeiculoDespesa.setViewportView(tblVeiculoDespesa);

        javax.swing.GroupLayout jpVeiculosDespesaLayout = new javax.swing.GroupLayout(jpVeiculosDespesa);
        jpVeiculosDespesa.setLayout(jpVeiculosDespesaLayout);
        jpVeiculosDespesaLayout.setHorizontalGroup(
            jpVeiculosDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculosDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsVeiculoDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpVeiculosDespesaLayout.setVerticalGroup(
            jpVeiculosDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculosDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsVeiculoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbTipo.setBackground(new java.awt.Color(204, 204, 204));
        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Placa" }));

        javax.swing.GroupLayout jpSelecionarVeiculoDespesaLayout = new javax.swing.GroupLayout(jpSelecionarVeiculoDespesa);
        jpSelecionarVeiculoDespesa.setLayout(jpSelecionarVeiculoDespesaLayout);
        jpSelecionarVeiculoDespesaLayout.setHorizontalGroup(
            jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelecionarVeiculoDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpVeiculosDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpSelecionarVeiculoDespesaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpSelecionarVeiculoDespesaLayout.setVerticalGroup(
            jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelecionarVeiculoDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpVeiculosDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDespesas.setBackground(new java.awt.Color(255, 255, 102));
        jpDespesas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jpDespesas.setForeground(new java.awt.Color(0, 0, 0));

        jlDescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jlDescricao.setText("Descrição:");

        txtDescricao.setBackground(new java.awt.Color(204, 204, 204));
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jlValorDespesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlValorDespesa.setForeground(new java.awt.Color(0, 0, 0));
        jlValorDespesa.setText("Valor:");

        txtValor.setBackground(new java.awt.Color(204, 204, 204));
        txtValor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jbAddDespesa.setBackground(new java.awt.Color(51, 51, 51));
        jbAddDespesa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbAddDespesa.setForeground(new java.awt.Color(255, 255, 255));
        jbAddDespesa.setText("Adicionar");
        jbAddDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDespesasLayout = new javax.swing.GroupLayout(jpDespesas);
        jpDespesas.setLayout(jpDespesasLayout);
        jpDespesasLayout.setHorizontalGroup(
            jpDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDespesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao)
                    .addComponent(jlValorDespesa))
                .addGap(18, 18, 18)
                .addGroup(jpDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDespesasLayout.createSequentialGroup()
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 320, Short.MAX_VALUE))
                    .addGroup(jpDespesasLayout.createSequentialGroup()
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAddDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpDespesasLayout.setVerticalGroup(
            jpDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDespesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescricao))
                .addGroup(jpDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDespesasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jbAddDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpDespesasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlValorDespesa))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jpNovaDespesaLayout = new javax.swing.GroupLayout(jpNovaDespesa);
        jpNovaDespesa.setLayout(jpNovaDespesaLayout);
        jpNovaDespesaLayout.setHorizontalGroup(
            jpNovaDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNovaDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNovaDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpSelecionarVeiculoDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpNovaDespesaLayout.setVerticalGroup(
            jpNovaDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNovaDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpSelecionarVeiculoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtPainelDespesas.addTab("Nova", jpNovaDespesa);

        jpListaDespesa.setBackground(new java.awt.Color(255, 255, 102));
        jpListaDespesa.setBorder(new javax.swing.border.MatteBorder(null));
        jpListaDespesa.setForeground(new java.awt.Color(51, 51, 51));

        jpListaDepesas.setBackground(new java.awt.Color(255, 255, 102));

        jpSelecionarVeiculoDespesa1.setBackground(new java.awt.Color(255, 255, 102));
        jpSelecionarVeiculoDespesa1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Selecione um veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jpSelecionarVeiculoDespesa1.setForeground(new java.awt.Color(0, 0, 0));

        txtPesq1.setBackground(new java.awt.Color(204, 204, 204));
        txtPesq1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPesq1.setForeground(new java.awt.Color(0, 0, 0));
        txtPesq1.setCaretColor(new java.awt.Color(0, 0, 0));

        btnPesq1.setBackground(new java.awt.Color(153, 153, 153));
        btnPesq1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPesq1.setForeground(new java.awt.Color(255, 255, 255));
        btnPesq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/24x24/search.png"))); // NOI18N
        btnPesq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesq1ActionPerformed(evt);
            }
        });

        jpVeiculosDespesa1.setBackground(new java.awt.Color(255, 255, 102));

        tblBuscarVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        tblBuscarVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor"
            }
        ));
        jsVeiculoDespesa1.setViewportView(tblBuscarVeiculo);

        javax.swing.GroupLayout jpVeiculosDespesa1Layout = new javax.swing.GroupLayout(jpVeiculosDespesa1);
        jpVeiculosDespesa1.setLayout(jpVeiculosDespesa1Layout);
        jpVeiculosDespesa1Layout.setHorizontalGroup(
            jpVeiculosDespesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculosDespesa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsVeiculoDespesa1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpVeiculosDespesa1Layout.setVerticalGroup(
            jpVeiculosDespesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculosDespesa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsVeiculoDespesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbTipo1.setBackground(new java.awt.Color(204, 204, 204));
        cmbTipo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTipo1.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", "Modelo", "Placa" }));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/accept.png"))); // NOI18N
        jButton1.setText("  Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSelecionarVeiculoDespesa1Layout = new javax.swing.GroupLayout(jpSelecionarVeiculoDespesa1);
        jpSelecionarVeiculoDespesa1.setLayout(jpSelecionarVeiculoDespesa1Layout);
        jpSelecionarVeiculoDespesa1Layout.setHorizontalGroup(
            jpSelecionarVeiculoDespesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelecionarVeiculoDespesa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSelecionarVeiculoDespesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSelecionarVeiculoDespesa1Layout.createSequentialGroup()
                        .addComponent(jpVeiculosDespesa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpSelecionarVeiculoDespesa1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesq1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesq1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))))
        );
        jpSelecionarVeiculoDespesa1Layout.setVerticalGroup(
            jpSelecionarVeiculoDespesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelecionarVeiculoDespesa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSelecionarVeiculoDespesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSelecionarVeiculoDespesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesq1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesq1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jpVeiculosDespesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpListaDespesas.setBackground(new java.awt.Color(255, 255, 102));
        jpListaDespesas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Despesas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jpListaDespesas.setForeground(new java.awt.Color(0, 0, 0));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        tblDespesas.setBackground(new java.awt.Color(204, 204, 204));
        tblDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Descrição", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tblDespesas);

        labelValorTotal.setBackground(new java.awt.Color(0, 0, 0));
        labelValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelValorTotal.setText("Valor Total:");

        txtValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValorTotal.setForeground(new java.awt.Color(255, 0, 0));

        btnExcluirDespesa.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluirDespesa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluirDespesa.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/remove.png"))); // NOI18N
        btnExcluirDespesa.setText("  Excluir");
        btnExcluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpListaDespesasLayout = new javax.swing.GroupLayout(jpListaDespesas);
        jpListaDespesas.setLayout(jpListaDespesasLayout);
        jpListaDespesasLayout.setHorizontalGroup(
            jpListaDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaDespesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListaDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addGroup(jpListaDespesasLayout.createSequentialGroup()
                        .addComponent(labelValorTotal)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirDespesa)))
                .addContainerGap())
        );
        jpListaDespesasLayout.setVerticalGroup(
            jpListaDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaDespesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpListaDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorTotal)
                    .addComponent(txtValorTotal)
                    .addComponent(btnExcluirDespesa))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpListaDepesasLayout = new javax.swing.GroupLayout(jpListaDepesas);
        jpListaDepesas.setLayout(jpListaDepesasLayout);
        jpListaDepesasLayout.setHorizontalGroup(
            jpListaDepesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaDepesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListaDepesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpSelecionarVeiculoDespesa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpListaDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpListaDepesasLayout.setVerticalGroup(
            jpListaDepesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaDepesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpSelecionarVeiculoDespesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpListaDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpListaDespesaLayout = new javax.swing.GroupLayout(jpListaDespesa);
        jpListaDespesa.setLayout(jpListaDespesaLayout);
        jpListaDespesaLayout.setHorizontalGroup(
            jpListaDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpListaDepesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpListaDespesaLayout.setVerticalGroup(
            jpListaDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpListaDepesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtPainelDespesas.addTab("Despesas", jpListaDespesa);

        javax.swing.GroupLayout jpPrincipalDespesasLayout = new javax.swing.GroupLayout(jpPrincipalDespesas);
        jpPrincipalDespesas.setLayout(jpPrincipalDespesasLayout);
        jpPrincipalDespesasLayout.setHorizontalGroup(
            jpPrincipalDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalDespesasLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jlTituloDespesas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalDespesasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtPainelDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpPrincipalDespesasLayout.setVerticalGroup(
            jpPrincipalDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalDespesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTituloDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPainelDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpPrincipalDespesas, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddDespesaActionPerformed

        int linha = tblVeiculoDespesa.getSelectedRow();

        if (linha >= 0) {

            String descricao = txtDescricao.getText();
            String valor = txtValor.getText();

            //PEGAR O VEICULO SELECIONADO
            linha = tblVeiculoDespesa.convertRowIndexToModel(linha);
            Veiculo veiculo = veiculoTableModel.getVeiculo(linha);

            if (validarCampos()) {
                try {
                    // INSERIR NO BANCO

                    double valorDespesa = Double.parseDouble(valor);
                    GerenciadorInterface.getInstance().getGerenciadorDominio().inserirDespesa(descricao, valorDespesa, veiculo);
                    JOptionPane.showMessageDialog(this, "Despesa inserida com sucesso.", "Cadastro Despesa", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();

                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Despesa", JOptionPane.ERROR_MESSAGE);

                }
            }

        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar Veiculo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbAddDespesaActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
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
    }//GEN-LAST:event_btnPesqActionPerformed

    private void btnPesq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesq1ActionPerformed
        String pesq = txtPesq1.getText();
        int tipo = cmbTipo1.getSelectedIndex();
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
    }//GEN-LAST:event_btnPesq1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int linha = tblBuscarVeiculo.getSelectedRow();
        List<Despesa> lista;

        if (linha >= 0) {

            //PEGAR O VEICULO SELECIONADO
            linha = tblBuscarVeiculo.convertRowIndexToModel(linha);
            Veiculo veiculo = veiculoTableModel.getVeiculo(linha);

            double total = veiculo.getValorTotalDespesas();
            String totalDespesas = Double.toString(total);

            lista = GerenciadorInterface.getInstance().getGerenciadorDominio().pesquisarDespesa(veiculo.getPlaca());

            despesaTableModel.setLista(lista);

            txtValorTotal.setText("R$ " + totalDespesas);

        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limparCampos();
    }//GEN-LAST:event_formWindowClosed

    private void btnExcluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirDespesaActionPerformed

        int linha = tblDespesas.getSelectedRow();
        double total=0;
        
        if (linha >= 0) {

            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir Despesa", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                //Excluir do BANCO
                linha = tblDespesas.convertRowIndexToModel(linha);
                Despesa despesa = despesaTableModel.getDespesa(linha);

                try {
                    GerenciadorInterface.getInstance().getGerenciadorDominio().excluir(despesa);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir Despesa. " + ex.getMessage(), "Pesquisar Despesa", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(DlgCadVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DlgCadVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Remover da TABELA
                despesaTableModel.remover(linha);
                limparCampos();
            }

        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar Despesa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirDespesaActionPerformed

    private boolean validarCampos() {

        String msgErro = "";

        jlDescricao.setForeground(Color.black);
        jlValorDespesa.setForeground(Color.black);

        if (txtDescricao.getText().isEmpty()) {
            msgErro = msgErro + "Insira a descrição.\n";
            jlDescricao.setForeground(Color.red);
        }

        if (txtValor.getText().isEmpty()) {
            msgErro = msgErro + "Insira o valor.\n";
            jlValorDespesa.setForeground(Color.red);
        }

        try {
            double num = Double.parseDouble(txtValor.getText());
        } catch (NumberFormatException erro) {
            msgErro = msgErro + "Valor inválido.\n";
            jlValorDespesa.setForeground(Color.red);
        } catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            jlValorDespesa.setForeground(Color.red);
        }

        if (msgErro.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro, "ERRO PESSOA", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public void limparCampos() {
        txtDescricao.setText("");
        txtValor.setText("");
        txtPesq.setText("");
        txtPesq1.setText("");
        txtValorTotal.setText("");
        jlDescricao.setForeground(Color.black);
        jlValorDespesa.setForeground(Color.black);
        veiculoTableModel.limpar();
        despesaTableModel.limpar();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirDespesa;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnPesq1;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbTipo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAddDespesa;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlTituloDespesas;
    private javax.swing.JLabel jlValorDespesa;
    private javax.swing.JPanel jpDespesas;
    private javax.swing.JPanel jpListaDepesas;
    private javax.swing.JPanel jpListaDespesa;
    private javax.swing.JPanel jpListaDespesas;
    private javax.swing.JPanel jpNovaDespesa;
    private javax.swing.JPanel jpPrincipalDespesas;
    private javax.swing.JPanel jpSelecionarVeiculoDespesa;
    private javax.swing.JPanel jpSelecionarVeiculoDespesa1;
    private javax.swing.JPanel jpVeiculosDespesa;
    private javax.swing.JPanel jpVeiculosDespesa1;
    private javax.swing.JScrollPane jsVeiculoDespesa;
    private javax.swing.JScrollPane jsVeiculoDespesa1;
    private javax.swing.JTabbedPane jtPainelDespesas;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JTable tblBuscarVeiculo;
    private javax.swing.JTable tblDespesas;
    private javax.swing.JTable tblVeiculoDespesa;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextField txtPesq1;
    private javax.swing.JTextField txtValor;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
