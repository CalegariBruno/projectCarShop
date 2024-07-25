package dao;

import domain.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class VeiculoDAO extends GenericDAO{
    
    private List<Veiculo> pesquisar(String pesq, int tipo ) throws HibernateException  {
        List<Veiculo> lista = new ArrayList();
        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Veiculo.class);
            Root tabela = consulta.from(Veiculo.class);     
                        
            // Restrições
            Predicate restricoes = null;
            Expression mes = null;
            switch(tipo) {
                case 1: restricoes = builder.like(tabela.get("marca"), pesq+"%");
                        break;
                case 2: restricoes = builder.like(tabela.get("modelo"), pesq+"%");
                        break;
                case 3: restricoes = builder.like(tabela.get("placa"), pesq+"%");                
                        break;                                                            
            }            

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
    
    public List<Veiculo> pesquisarPorMarca (String pesq) throws HibernateException {
        return pesquisar(pesq,1);   
    }
    
    public List<Veiculo> pesquisarPorModelo (String pesq) throws HibernateException {
        return pesquisar(pesq,2);        
    }
    
    public List<Veiculo> pesquisarPorPlaca (String pesq) throws HibernateException {
        return pesquisar(pesq,3);        
    }
        
}
