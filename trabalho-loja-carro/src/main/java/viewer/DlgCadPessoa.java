/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.BuscarCEP;
import control.GerenciadorInterface;
import control.tables.PessoaAbstractTableModel;
import domain.Endereco;
import domain.Pessoa;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCadPessoa extends javax.swing.JDialog {

    //TABELA PESSOA
    private Pessoa pessoaSelecionado = null;
    private PessoaAbstractTableModel pessoaTableModel;

    public DlgCadPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // ASSOCIAR o TABLE PESSOA MODEL ABSTRACT
        pessoaTableModel = new PessoaAbstractTableModel();
        tblPessoa.setModel(pessoaTableModel);
    }

    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jlTel = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jlCEP = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jlEndDescricao = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jlCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jlEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jlNumEnd = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtCadCliente = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jsTabelaVeiculos1 = new javax.swing.JScrollPane();
        tblPessoa = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        jlNomePesq = new javax.swing.JLabel();
        txtNomePesq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de pessoa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jlNome.setBackground(new java.awt.Color(0, 0, 0));
        jlNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNome.setForeground(new java.awt.Color(0, 0, 0));
        jlNome.setText("Nome Completo:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jlTel.setBackground(new java.awt.Color(0, 0, 0));
        jlTel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTel.setForeground(new java.awt.Color(0, 0, 0));
        jlTel.setText("Telefone:");

        jlCpf.setBackground(new java.awt.Color(0, 0, 0));
        jlCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCpf.setForeground(new java.awt.Color(0, 0, 0));
        jlCpf.setText("CPF:");

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlCEP.setBackground(new java.awt.Color(0, 0, 0));
        jlCEP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCEP.setForeground(new java.awt.Color(0, 0, 0));
        jlCEP.setText("CEP:");

        txtCep.setBackground(new java.awt.Color(255, 255, 255));
        txtCep.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });

        jlEndDescricao.setBackground(new java.awt.Color(0, 0, 0));
        jlEndDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlEndDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jlEndDescricao.setText("Endereço:");

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));

        jlBairro.setBackground(new java.awt.Color(0, 0, 0));
        jlBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlBairro.setForeground(new java.awt.Color(0, 0, 0));
        jlBairro.setText("Bairro:");

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));

        jlCidade.setBackground(new java.awt.Color(0, 0, 0));
        jlCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCidade.setForeground(new java.awt.Color(0, 0, 0));
        jlCidade.setText("Cidade:");

        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));

        jlEstado.setBackground(new java.awt.Color(0, 0, 0));
        jlEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(0, 0, 0));
        jlEstado.setText("Estado:");

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));

        jlNumEnd.setBackground(new java.awt.Color(0, 0, 0));
        jlNumEnd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNumEnd.setForeground(new java.awt.Color(0, 0, 0));
        jlNumEnd.setText("Nº:");

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));

        txtCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCadCliente.setText("Cadastro de Pessoa");

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

        tblPessoa.setBackground(new java.awt.Color(255, 255, 255));
        tblPessoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsTabelaVeiculos1.setViewportView(tblPessoa);

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/accept.png"))); // NOI18N
        btnSelecionar.setText("  Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlNomePesq.setBackground(new java.awt.Color(0, 0, 0));
        jlNomePesq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNomePesq.setForeground(new java.awt.Color(0, 0, 0));
        jlNomePesq.setText("Nome:");

        txtNomePesq.setBackground(new java.awt.Color(255, 255, 255));
        txtNomePesq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomePesq.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/24x24/search.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/remove.png"))); // NOI18N
        btnExcluir.setText("  Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/png/16x16/repeat.png"))); // NOI18N
        btnAlterar.setText("  Alterar");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(jlTel)
                                    .addComponent(jlCpf))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCep)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlNumEnd)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtCpf)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEndDescricao)
                                    .addComponent(jlCEP)
                                    .addComponent(jlBairro)
                                    .addComponent(jlCidade)
                                    .addComponent(jlEstado))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCadastrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelar))
                                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtCidade)
                                    .addComponent(txtBairro)
                                    .addComponent(txtEndereco)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(txtCadCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNomePesq)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomePesq)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSelecionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtCadCliente)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlNomePesq)
                        .addComponent(txtNomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlTel)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumEnd)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCEP)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEndDescricao)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEstado)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSelecionar)
                        .addComponent(btnExcluir)
                        .addComponent(btnAlterar)))
                .addContainerGap(11, Short.MAX_VALUE))
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        // INFORMAÇÕES DO REVENDEDOR
        String nome = txtNome.getText();
        String telefone = txtTelefone.getText();
        String cpf = txtCpf.getText();
        String cep = txtCep.getText();
        String tNumero = txtNumero.getText();
        String descricao = txtEndereco.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();

        if (validarCampos()) {

            try {

                int num = Integer.parseInt(tNumero);

                if (pessoaSelecionado == null) {

                    // INSERIR NO BANCO               
                    GerenciadorInterface.getInstance().getGerenciadorDominio().inserirPesssoa(nome, cpf, telefone, cep, bairro, descricao, num, cidade, estado);
                    JOptionPane.showMessageDialog(this, "Pessoa inserida com sucesso.", "Cadastro Pessoa", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();

                } else {

                    // ALTERAR NO BANCO
                    GerenciadorInterface.getInstance().getGerenciadorDominio().alterarPesssoa(pessoaSelecionado.getIdPessoa(), nome, cpf, telefone, cep, bairro, descricao, num, cidade, cpf);
                    JOptionPane.showMessageDialog(this, "Cliente " + pessoaSelecionado.getNome() + " alterado com sucesso.", "Cadastro pessoa", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();

                }

            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Compra", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        jlNome.setForeground(Color.black);
        jlTel.setForeground(Color.black);
        jlCpf.setForeground(Color.black);
        jlCEP.setForeground(Color.black);
        jlNumEnd.setForeground(Color.black);        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int linha = tblPessoa.getSelectedRow();
        if (linha >= 0) {
            linha = tblPessoa.convertRowIndexToModel(linha);
            pessoaSelecionado = pessoaTableModel.getCliente(linha);
            this.setVisible(false);
        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar pessoa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
        try {
            Endereco ender;
            ender = BuscarCEP.consultarCEP(txtCep.getText());
            if (ender != null) {
                txtEndereco.setText(ender.getDescricao());
                txtBairro.setText(ender.getBairro());
                txtCidade.setText(ender.getCidade());
                txtEstado.setText(ender.getUf());
            } else {
                JOptionPane.showMessageDialog(this, "CEP não encontrado");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "CEP não encontrado", "Erro CEP", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCepFocusLost

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        String pesq = txtNomePesq.getText();
        List<Pessoa> lista;

        try {
            lista = GerenciadorInterface.getInstance().getGerenciadorDominio().pesquisarPessoa(pesq);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pessoa não encontrada.", "Pesquisar pessoa", JOptionPane.INFORMATION_MESSAGE);
            }
            pessoaTableModel.setLista(lista);
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar. " + ex.getMessage(), "Pesquisar pessoa", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linha = tblPessoa.getSelectedRow();
        if (linha >= 0) {

            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir pessoa", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                //Excluir do BANCO
                linha = tblPessoa.convertRowIndexToModel(linha);
                Pessoa pessoa = pessoaTableModel.getCliente(linha);

                try {
                    GerenciadorInterface.getInstance().getGerenciadorDominio().excluir(pessoa);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir pessoa. " + ex.getMessage(), "Pesquisar pessoa", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(DlgCadPessoa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DlgCadPessoa.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Remover da TABELA
                pessoaTableModel.remover(linha);
            }

        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar pessoa", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limparCampos();
    }//GEN-LAST:event_formWindowClosed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        int linha = tblPessoa.getSelectedRow();

        if (linha >= 0) {
            linha = tblPessoa.convertRowIndexToModel(linha);
            pessoaSelecionado = pessoaTableModel.getCliente(linha);
            try {
                preencherCampos(pessoaSelecionado);
            } catch (ParseException ex) {
                Logger.getLogger(DlgCadPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // Mensagem de erro
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.", "Pesquisar pessoa", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void preencherCampos(Pessoa pessoa) throws ParseException {

        txtNome.setText(pessoa.getNome());
        txtTelefone.setText(pessoa.getTelefone());
        txtCpf.setText(pessoa.getCpf());
        txtCep.setText(pessoa.getEndereco().getCep());
        txtNumero.setText(String.valueOf(pessoa.getEndereco().getNumero()));
        txtEndereco.setText(pessoa.getEndereco().getDescricao());
        txtCidade.setText(pessoa.getEndereco().getCidade());
        txtBairro.setText(pessoa.getEndereco().getBairro());
        txtEstado.setText(pessoa.getEndereco().getUf());

    }

    private boolean validarCampos() {

        String msgErro = "";

        jlNome.setForeground(Color.black);
        jlTel.setForeground(Color.black);
        jlCpf.setForeground(Color.black);
        jlCEP.setForeground(Color.black);
        jlNumEnd.setForeground(Color.black);
        jlCidade.setForeground(Color.black);
        jlEstado.setForeground(Color.black);
        jlBairro.setForeground(Color.black);
        jlEndDescricao.setForeground(Color.black);

        if (txtNome.getText().isEmpty()) {
            msgErro = msgErro + "Digite o nome.\n";
            jlNome.setForeground(Color.red);
        }

        if (txtCep.getText().replace("-", "").trim().isEmpty()) {
            msgErro = msgErro + "Digite o CEP.\n";
            jlCEP.setForeground(Color.red);
        }        

        String telefone = txtTelefone.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", "").trim();
        if (telefone.isEmpty()) {
            msgErro = msgErro + "Digite o Telefone.\n";
            jlTel.setForeground(Color.red);
        }

        if (txtCpf.getText().replace(".", "").replace("-", "").trim().isEmpty()) {
            msgErro = msgErro + "Digite o CPF.\n";
            jlCpf.setForeground(Color.red);
        }

        try {
            int num = Integer.parseInt(txtNumero.getText());
        } catch (NumberFormatException erro) {
            msgErro = msgErro + "Número inválido.\n";
            jlNumEnd.setForeground(Color.red);
        } catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            jlNumEnd.setForeground(Color.red);
        }

        if (msgErro.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro, "ERRO PESSOA", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private void limparCampos() {

        txtNome.setText("");
        txtTelefone.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtNumero.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtEstado.setText("");
        txtNomePesq.setText("");
        pessoaSelecionado = null;

        // como limpar a tabela ??
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlEndDescricao;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomePesq;
    private javax.swing.JLabel jlNumEnd;
    private javax.swing.JLabel jlTel;
    private javax.swing.JScrollPane jsTabelaVeiculos1;
    private javax.swing.JTable tblPessoa;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JLabel txtCadCliente;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomePesq;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
