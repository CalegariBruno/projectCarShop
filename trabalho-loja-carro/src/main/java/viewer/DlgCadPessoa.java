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
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
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
        jlNomeComprador = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jlTelComprador = new javax.swing.JLabel();
        jlCEPVendedor1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jlCEPVendedor = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jlEndVendedor = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jlBairroVendedor = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jlCidadeVendedor = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jlEstadoVendedor = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jlNumEndVendedor = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de pessoa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jlNomeComprador.setBackground(new java.awt.Color(0, 0, 0));
        jlNomeComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNomeComprador.setForeground(new java.awt.Color(0, 0, 0));
        jlNomeComprador.setText("Nome Completo:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jlTelComprador.setBackground(new java.awt.Color(0, 0, 0));
        jlTelComprador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTelComprador.setForeground(new java.awt.Color(0, 0, 0));
        jlTelComprador.setText("Telefone:");

        jlCEPVendedor1.setBackground(new java.awt.Color(0, 0, 0));
        jlCEPVendedor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCEPVendedor1.setForeground(new java.awt.Color(0, 0, 0));
        jlCEPVendedor1.setText("CPF:");

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlCEPVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlCEPVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCEPVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlCEPVendedor.setText("CEP:");

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

        jlEndVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlEndVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlEndVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlEndVendedor.setText("Endereço:");

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setBorder(new javax.swing.border.MatteBorder(null));

        jlBairroVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlBairroVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlBairroVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlBairroVendedor.setText("Bairro:");

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));
        txtBairro.setBorder(new javax.swing.border.MatteBorder(null));

        jlCidadeVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlCidadeVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCidadeVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlCidadeVendedor.setText("Cidade:");

        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtCidade.setBorder(new javax.swing.border.MatteBorder(null));

        jlEstadoVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlEstadoVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlEstadoVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlEstadoVendedor.setText("Estado:");

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtEstado.setBorder(new javax.swing.border.MatteBorder(null));

        jlNumEndVendedor.setBackground(new java.awt.Color(0, 0, 0));
        jlNumEndVendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNumEndVendedor.setForeground(new java.awt.Color(0, 0, 0));
        jlNumEndVendedor.setText("Nº:");

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setBorder(new javax.swing.border.MatteBorder(null));

        txtCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCadCliente.setText("Cadastro de Pessoa");

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

        tblPessoa.setBackground(new java.awt.Color(255, 255, 255));
        tblPessoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsTabelaVeiculos1.setViewportView(tblPessoa);

        btnSelecionar.setText("Selecionar");
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
                                    .addComponent(jlEndVendedor)
                                    .addComponent(jlCEPVendedor)
                                    .addComponent(jlBairroVendedor)
                                    .addComponent(jlCidadeVendedor)
                                    .addComponent(jlEstadoVendedor))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNomeComprador)
                                    .addComponent(jlTelComprador)
                                    .addComponent(jlCEPVendedor1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCep)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlNumEndVendedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtCpf)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(txtCadCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnCadastrar)
                        .addGap(39, 39, 39)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlNomePesq)
                            .addGap(18, 18, 18)
                            .addComponent(txtNomePesq)
                            .addGap(18, 18, 18)
                            .addComponent(btnPesquisar)))
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtCadCliente)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomePesq)
                    .addComponent(txtNomePesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNomeComprador)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlTelComprador)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCEPVendedor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumEndVendedor)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCEPVendedor)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEndVendedor)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlBairroVendedor)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCidadeVendedor)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEstadoVendedor)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jsTabelaVeiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar))
                .addContainerGap(31, Short.MAX_VALUE))
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

        try {
            // INSERIR NO BANCO

            int num = Integer.parseInt(tNumero);

            GerenciadorInterface.getInstance().getGerenciadorDominio().inserirPesssoa(nome, cpf, telefone, cep, bairro, descricao, num, cidade, estado);

            JOptionPane.showMessageDialog(this, "Pessoa inserida com sucesso.", "Cadastro Pessoa", JOptionPane.INFORMATION_MESSAGE);

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Compra", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        pessoaSelecionado = null;
        this.setVisible(false);
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
            if ( lista.isEmpty() ) {
                JOptionPane.showMessageDialog(this,"Pessoa não encontrado.", "Pesquisar pessoa", JOptionPane.INFORMATION_MESSAGE);
            } 
            pessoaTableModel.setLista(lista);
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar pessoa", JOptionPane.ERROR_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlBairroVendedor;
    private javax.swing.JLabel jlCEPVendedor;
    private javax.swing.JLabel jlCEPVendedor1;
    private javax.swing.JLabel jlCidadeVendedor;
    private javax.swing.JLabel jlEndVendedor;
    private javax.swing.JLabel jlEstadoVendedor;
    private javax.swing.JLabel jlNomeComprador;
    private javax.swing.JLabel jlNomePesq;
    private javax.swing.JLabel jlNumEndVendedor;
    private javax.swing.JLabel jlTelComprador;
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
