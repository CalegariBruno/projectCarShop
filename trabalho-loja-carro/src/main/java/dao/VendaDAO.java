package dao;

import domain.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class VendaDAO extends GenericDAO{
    
    private List<Venda> pesquisar(String pesq, int tipo ) throws HibernateException  {
        List<Venda> lista = new ArrayList();
        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Venda.class);
            Root tabela = consulta.from(Venda.class);
            
            // Restrições
            Predicate restricoes = null;
            Expression mes = null;
            switch(tipo) {
                case 1: restricoes = builder.like(tabela.get("veiculo").get("marca") , pesq+"%");
                        break;
                case 2: restricoes = builder.like(tabela.get("veiculo").get("modelo") , pesq+"%");
                        break;
                case 3: restricoes = builder.like(tabela.get("veiculo").get("placa") , pesq+"%");                
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
    
    public List<Venda> pesquisarPorMarca (String pesq) throws HibernateException {
        return pesquisar(pesq,1);   
    }
    
    public List<Venda> pesquisarPorModelo (String pesq) throws HibernateException {
        return pesquisar(pesq,2);        
    }
    
    public List<Venda> pesquisarPorPlaca (String pesq) throws HibernateException {
        return pesquisar(pesq,3);        
    }
    
}
