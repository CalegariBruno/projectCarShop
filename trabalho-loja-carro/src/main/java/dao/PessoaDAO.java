package dao;

import domain.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PessoaDAO extends GenericDAO{
    
    public List<Pessoa> pesquisar(String pesq) throws HibernateException  {
        List<Pessoa> lista = new ArrayList();
        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Pessoa.class);
            Root tabela = consulta.from(Pessoa.class);
            
            // Restrições
            Predicate restricoes = null;
            Expression mes = null;
            
            restricoes = builder.like(tabela.get("nome"), pesq+"%");                          

            consulta.where(restricoes);   
            
            // EXECUTAR
            lista = sessao.createQuery(consulta).getResultList();                                             

            sessao.getTransaction().commit();              
            sessao.close();
            
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }        

        return lista;   
        
    }
    
}
