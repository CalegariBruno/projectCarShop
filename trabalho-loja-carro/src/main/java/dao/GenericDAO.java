package dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
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
            
            CriteriaQuery consulta = session.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe);
            lista = session.createQuery(consulta).getResultList();
            
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
