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
import java.util.Date;


public class GerenciadorDominio {

    private GenericDAO genDAO;
    
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
    }    
    
    public Compra inserirCompra( double valor, Date data, String nome, String cpf , String telefone, String cep, String bairro, String descricao, int numero, String cidade, String uf,
            String placa, long renavam, String marca, String modelo, String cor, String tipo, String combustivel, int ano ){
               
        Veiculo veiculo = new Veiculo(placa, renavam, marca, modelo, cor, tipo, combustivel, ano);
        Pessoa revendedor = new Pessoa(nome, cpf, telefone, cep, bairro, descricao, numero, cidade, uf);
        
        Compra compra = new Compra(valor, data, revendedor, veiculo);
        
        genDAO.inserir(compra);
        
        return compra;
    }
    
    public void /*, Despesa */ inserirDespesa( String descricao, double valor  /*, Veiculo veiculo */ ){
               
        
//        Despesa despesa = new Despesa(descricao, valor , veiculo);
//        
//        genDAO.inserir(despesa);
//        
//        return despesa;
    }
    
}
