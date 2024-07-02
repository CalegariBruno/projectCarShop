/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import domain.Compra;
import domain.Despesa;
import domain.Pessoa;
import domain.Veiculo;
import domain.Venda;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


public class GerenciadorDominio {

    private GenericDAO genDAO;
    
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
    }    
    
    public void inserirCompra( double valor, Date data, Pessoa revendedor, Veiculo veiculo ){
                
        Compra compra = new Compra(valor, data, revendedor, veiculo);        
        genDAO.inserir(compra);
        
    }
    
    public void inserirPesssoa( String nome, String cpf , String telefone, String cep, String bairro, String descricao, int numero, String cidade, String uf ){
               
        Pessoa pessoa = new Pessoa(nome, cpf, telefone, cep, bairro, descricao, numero, cidade, uf);        
        genDAO.inserir(pessoa);        
        
    }
    
    public void inserirVeiculo( String placa, long renavam, String marca, String modelo, String cor, String tipo, String combustivel, int ano ){
               
        Veiculo veiculo = new Veiculo(placa, renavam, marca, modelo, cor, tipo, combustivel, ano);
        genDAO.inserir(veiculo);   
        
    }
    
    
    public void inserirDespesa( String descricao , double valor  , Veiculo veiculo  ){
                      
        Despesa despesa = new Despesa(descricao, valor , veiculo);    
        genDAO.inserir(despesa);
 
    }
    
    public void inserirVenda( double valor, Date data, String financeira, Double retorno, Pessoa cliente, Veiculo veiculo ){
                      
        Venda venda = new Venda(valor, data, financeira, retorno, cliente, veiculo);
        genDAO.inserir(venda);
 
    }
    
    public void alterarPesssoa( int idPessoa, String nome, String cpf , String telefone, String cep, String bairro, String descricao, int numero, String cidade, String uf ){
               
        Pessoa pessoa = new Pessoa(idPessoa, nome, cpf, telefone, cep, bairro, descricao, numero, cidade, uf);        
        genDAO.alterar(pessoa);        
        
    }
    
    
    public void excluir (Object obj) throws SQLException, ClassNotFoundException {
        genDAO.excluir(obj);
    }
    
    
    public List<Veiculo> listarVeiculos(){
        return genDAO.listar(Veiculo.class);
    }
    
    public List<Pessoa> listarPessoa(){
        return genDAO.listar(Pessoa.class);
    }
    
    public List<Despesa> listarDespesa(){
        return genDAO.listar(Despesa.class);
    }    
    
    public List<Compra> listarCompra(){
        return genDAO.listar(Compra.class);
    } 
    
}
