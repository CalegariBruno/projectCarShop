/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.GerenciadorInterface;
import control.VeiculoAbstractTableModel;
import domain.Veiculo;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author 2022122760044
 */
public class DlgDespesas extends javax.swing.JDialog {

    private Veiculo veiculoSelecionado = null;
    
    private VeiculoAbstractTableModel veiculoTableModel;
    
    
    
    /**
     * Creates new form DlgConsulta
     */
    public DlgDespesas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        // ASSOCIAR o TABLE MODEL ABSTRACT
        veiculoTableModel = new VeiculoAbstractTableModel();
        tblVeiculoDespesa.setModel(veiculoTableModel);
        
    }

    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalDespesas = new javax.swing.JPanel();
        jlTituloDespesas = new javax.swing.JLabel();
        jtPainelDespesas = new javax.swing.JTabbedPane();
        jpNovaDespesa = new javax.swing.JPanel();
        jpSelecionarVeiculoDespesa = new javax.swing.JPanel();
        jlPlaca = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jbListarVeiculos = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jpVeiculosDespesa = new javax.swing.JPanel();
        jsVeiculoDespesa = new javax.swing.JScrollPane();
        tblVeiculoDespesa = new javax.swing.JTable();
        jpDespesas = new javax.swing.JPanel();
        jlDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jlValorDespesa = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jbAddDespesa = new javax.swing.JButton();
        jpListaDespesa = new javax.swing.JPanel();
        jpListaDepesas = new javax.swing.JPanel();
        jsListaDespesasVeiculos = new javax.swing.JScrollPane();
        jtListaDespesasVeiculos = new javax.swing.JTable();
        jlPlacaFiltroDespesas = new javax.swing.JLabel();
        jtPlacaFiltroDespesas = new javax.swing.JTextField();
        jbPesquisarFiltroDespesas = new javax.swing.JButton();
        jbListarFiltroDespesas = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Despesas");
        setResizable(false);

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
        jpSelecionarVeiculoDespesa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jpSelecionarVeiculoDespesa.setForeground(new java.awt.Color(0, 0, 0));

        jlPlaca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlPlaca.setForeground(new java.awt.Color(0, 0, 0));
        jlPlaca.setText("Placa:");

        txtPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        txtPesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisa.setBorder(new javax.swing.border.MatteBorder(null));
        txtPesquisa.setCaretColor(new java.awt.Color(0, 0, 0));

        jbListarVeiculos.setBackground(new java.awt.Color(51, 51, 51));
        jbListarVeiculos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbListarVeiculos.setForeground(new java.awt.Color(255, 255, 255));
        jbListarVeiculos.setText("Listar Veículos");
        jbListarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarVeiculosActionPerformed(evt);
            }
        });

        jbPesquisar.setBackground(new java.awt.Color(51, 51, 51));
        jbPesquisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jbPesquisar.setText("Pesquisar");

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
                .addComponent(jsVeiculoDespesa)
                .addContainerGap())
        );
        jpVeiculosDespesaLayout.setVerticalGroup(
            jpVeiculosDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculosDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsVeiculoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpSelecionarVeiculoDespesaLayout = new javax.swing.GroupLayout(jpSelecionarVeiculoDespesa);
        jpSelecionarVeiculoDespesa.setLayout(jpSelecionarVeiculoDespesaLayout);
        jpSelecionarVeiculoDespesaLayout.setHorizontalGroup(
            jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelecionarVeiculoDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpVeiculosDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpSelecionarVeiculoDespesaLayout.createSequentialGroup()
                        .addComponent(jlPlaca)
                        .addGap(30, 30, 30)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(jbListarVeiculos)))
                .addContainerGap())
        );
        jpSelecionarVeiculoDespesaLayout.setVerticalGroup(
            jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelecionarVeiculoDespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSelecionarVeiculoDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPlaca)
                    .addComponent(jbListarVeiculos)
                    .addComponent(jbPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jpVeiculosDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDespesas.setBackground(new java.awt.Color(255, 255, 102));
        jpDespesas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jpDespesas.setForeground(new java.awt.Color(0, 0, 0));

        jlDescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jlDescricao.setText("Descrição:");

        txtDescricao.setBackground(new java.awt.Color(204, 204, 204));
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDescricao.setBorder(new javax.swing.border.MatteBorder(null));

        jlValorDespesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlValorDespesa.setForeground(new java.awt.Color(0, 0, 0));
        jlValorDespesa.setText("Valor:");

        txtValor.setBackground(new java.awt.Color(204, 204, 204));
        txtValor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtValor.setBorder(new javax.swing.border.MatteBorder(null));

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
                        .addGap(0, 0, Short.MAX_VALUE))
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

        jtListaDespesasVeiculos.setBackground(new java.awt.Color(204, 204, 204));
        jtListaDespesasVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor", "Despesa", "Valor"
            }
        ));
        jsListaDespesasVeiculos.setViewportView(jtListaDespesasVeiculos);

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
        jbListarFiltroDespesas.setText("Listar Todas");

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

        javax.swing.GroupLayout jpListaDepesasLayout = new javax.swing.GroupLayout(jpListaDepesas);
        jpListaDepesas.setLayout(jpListaDepesasLayout);
        jpListaDepesasLayout.setHorizontalGroup(
            jpListaDepesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaDepesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPlacaFiltroDespesas)
                .addGap(18, 18, 18)
                .addComponent(jtPlacaFiltroDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPesquisarFiltroDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jbListarFiltroDespesas)
                .addContainerGap())
            .addComponent(jsListaDespesasVeiculos)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaDepesasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir))
        );
        jpListaDepesasLayout.setVerticalGroup(
            jpListaDepesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaDepesasLayout.createSequentialGroup()
                .addGroup(jpListaDepesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPlacaFiltroDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPlacaFiltroDespesas)
                    .addComponent(jbListarFiltroDespesas)
                    .addComponent(jbPesquisarFiltroDespesas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsListaDespesasVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpListaDepesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
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
        
        // PEGAR O VEICULO
        String pesquisa = txtPesquisa.getText();
        
        String descricao = txtDescricao.getText();
        String valor = txtValor.getText();
        
        try {
            // INSERIR NO BANCO

            double valorDespesa = Double.parseDouble(valor);
            
            GerenciadorInterface.getInstance().getGerenciadorDominio().inserirDespesa( descricao, valorDespesa /*, veiculo */ );

            JOptionPane.showMessageDialog(this, "Despesa inserida com sucesso.", "Cadastro Despesa", JOptionPane.INFORMATION_MESSAGE);

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Despesa", JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_jbAddDespesaActionPerformed

    private void jbListarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarVeiculosActionPerformed
        List<Veiculo> lista;
        lista = GerenciadorInterface.getInstance().getGerenciadorDominio().listarVeiculos();
        veiculoTableModel.setLista(lista);
    }//GEN-LAST:event_jbListarVeiculosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jbAddDespesa;
    private javax.swing.JButton jbListarFiltroDespesas;
    private javax.swing.JButton jbListarVeiculos;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbPesquisarFiltroDespesas;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlPlacaFiltroDespesas;
    private javax.swing.JLabel jlTituloDespesas;
    private javax.swing.JLabel jlValorDespesa;
    private javax.swing.JPanel jpDespesas;
    private javax.swing.JPanel jpListaDepesas;
    private javax.swing.JPanel jpListaDespesa;
    private javax.swing.JPanel jpNovaDespesa;
    private javax.swing.JPanel jpPrincipalDespesas;
    private javax.swing.JPanel jpSelecionarVeiculoDespesa;
    private javax.swing.JPanel jpVeiculosDespesa;
    private javax.swing.JScrollPane jsListaDespesasVeiculos;
    private javax.swing.JScrollPane jsVeiculoDespesa;
    private javax.swing.JTable jtListaDespesasVeiculos;
    private javax.swing.JTabbedPane jtPainelDespesas;
    private javax.swing.JTextField jtPlacaFiltroDespesas;
    private javax.swing.JTable tblVeiculoDespesa;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
