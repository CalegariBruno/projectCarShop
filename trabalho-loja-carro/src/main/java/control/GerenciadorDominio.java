/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDAO;


public class GerenciadorDominio {

    private GenericDAO genDAO;
    
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();
    }    
    
}
