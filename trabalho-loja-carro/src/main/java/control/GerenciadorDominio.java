package control;

import dao.CompraDAO;
import dao.ConexaoHibernate;
import dao.DespesaDAO;
import dao.GenericDAO;
import dao.PessoaDAO;
import dao.VeiculoDAO;
import dao.VendaDAO;
import domain.Compra;
import domain.Despesa;
import domain.Pessoa;
import domain.Veiculo;
import domain.Venda;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;


public class GerenciadorDominio {

    private GenericDAO genDAO;
    private PessoaDAO pesDAO;
    private VeiculoDAO veiDAO;
    private VendaDAO venDAO;
    private CompraDAO comDAO;
    private DespesaDAO desDAO;
    
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
        pesDAO = new PessoaDAO();
        veiDAO = new VeiculoDAO();
        venDAO = new VendaDAO();
        comDAO = new CompraDAO();
        desDAO = new DespesaDAO();
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
    
    public void inserirVenda( double valor, Date data, String financeira, String retorno, Pessoa cliente, Veiculo veiculo ){
                      
        Venda venda = new Venda(valor, data, financeira, retorno, cliente, veiculo);
        genDAO.inserir(venda);
 
    }
    
    public void alterarPesssoa( int idPessoa, String nome, String cpf , String telefone, String cep, String bairro, String descricao, int numero, String cidade, String uf ){
               
        Pessoa pessoa = new Pessoa(idPessoa, nome, cpf, telefone, cep, bairro, descricao, numero, cidade, uf);        
        genDAO.alterar(pessoa);        
        
    }
    
    public void alterarVeiculo( int idVeiculo, String placa, long renavam, String marca, String modelo, String cor, String tipo, String combustivel, int ano ){
               
        Veiculo veiculo = new Veiculo(idVeiculo, placa, renavam, marca, modelo, cor, tipo, combustivel, ano);
        genDAO.alterar(veiculo);        
        
    }
    
    public List<Pessoa> pesquisarPessoa(String pesq) throws HibernateException {
        return pesDAO.pesquisar(pesq);               
    }
    
    public List<Despesa> pesquisarDespesa(String placa) throws HibernateException {
        return desDAO.pesquisar(placa);               
    }
    
    public List<Veiculo> pesquisarVeiculo(String pesq, int tipo) throws HibernateException {
        
        switch (tipo) {
            case 0: return veiDAO.pesquisarPorMarca(pesq);
            case 1: return veiDAO.pesquisarPorModelo(pesq);
            case 2: return veiDAO.pesquisarPorPlaca(pesq);            
            default : return null;
        }
        
    }
    
    public List<Venda> pesquisarVenda(String pesq, int tipo) throws HibernateException {
        
        switch (tipo) {
            case 0: return venDAO.pesquisarPorMarca(pesq);
            case 1: return venDAO.pesquisarPorModelo(pesq);
            case 2: return venDAO.pesquisarPorPlaca(pesq);            
            default : return null;
        }
        
    }
    
    public List<Compra> pesquisarCompra(String pesq, int tipo) throws HibernateException {
        
        switch (tipo) {
            case 0: return comDAO.pesquisarPorMarca(pesq);
            case 1: return comDAO.pesquisarPorModelo(pesq);
            case 2: return comDAO.pesquisarPorPlaca(pesq);            
            default : return null;
        }
        
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
    
    public List<Venda> listarVenda(){
        return genDAO.listar(Venda.class);
    }
    
}
