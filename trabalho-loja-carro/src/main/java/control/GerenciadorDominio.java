/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import domain.Compra;
import domain.Pessoa;
import domain.Veiculo;
import java.util.Date;


public class GerenciadorDominio {

    private GenericDAO genDAO;
    
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
    }    
    
    public Compra inserirCompra( double valor, Date data, Pessoa revendedor, Veiculo veiculo ){
        Compra compra = new Compra(valor, data, revendedor, veiculo);
        genDAO.inserir(compra);
        return compra;
    }
    
}
