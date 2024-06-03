/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class GenericDAO {
    
    public void inserir( Object obj ) throws HibernateException{
        Session session = null;
        
        try{
            
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.getTransaction().begin();
            
            session.save(obj);
            
            session.getTransaction().commit();
            session.close();
            
        }catch (HibernateException ex) {
        
            if( session != null ){
                session.getTransaction().rollback();
                session.close();
            }
            throw new HibernateException(ex);
            
        }
    }
    
    public void excluir( Object obj ) throws HibernateException{
        Session session = null;
        
        try{
            
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.getTransaction().begin();
            
            session.delete(obj);
            
            session.getTransaction().commit();
            session.close();
            
        }catch (HibernateException ex) {
        
            if( session != null ){
                session.getTransaction().rollback();
                session.close();
            }
            throw new HibernateException(ex);
            
        }        
    }
    
    public void alterar( Object obj ) throws HibernateException{
        Session session = null;
        
        try{
            
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.getTransaction().begin();
            
            session.update(obj);
            
            session.getTransaction().commit();
            session.close();
            
        }catch (HibernateException ex) {
        
            if( session != null ){
                session.getTransaction().rollback();
                session.close();
            }
            throw new HibernateException(ex);
            
        }        
    }
    
    public List listar( Class classe ) throws HibernateException{
        Session session = null;
        List lista = null;
        
        try{
            
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.getTransaction().begin();
            
            Criteria consulta = session.createCriteria(classe);
            lista = consulta.list();
            
            session.getTransaction().commit();
            session.close();
            
        }catch (HibernateException ex) {
        
            if( session != null ){
                session.getTransaction().rollback();
                session.close();
            }
            throw new HibernateException(ex);
            
        }        
        
        return lista;
    }
        
}
