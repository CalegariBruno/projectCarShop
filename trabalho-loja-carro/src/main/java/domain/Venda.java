package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Venda implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idVenda;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @Column ( nullable = true )
    private String financeira;
    
    @Column ( nullable = true )
    private String retorno;
    
    private double valor;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa cliente;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Veiculo veiculo;

    private double valorCompra;
    
    @Transient
    private double lucro;
    
    public Venda() {
    }
    
    public Venda(int idVenda, double valor, double valorCompra, Date data, String financeira, String retorno, Pessoa cliente, Veiculo veiculo) {
        this.idVenda = idVenda;
        this.valor = valor;
        this.data = data;
        this.financeira = financeira;
        this.retorno = retorno;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorCompra = valorCompra;
    }

    public Venda(double valor, double valorCompra, Date data, String financeira, String retorno, Pessoa cliente, Veiculo veiculo) {
        this.valor = valor;
        this.data = data;
        this.financeira = financeira;
        this.retorno = retorno;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorCompra = valorCompra;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFinanceira() {
        return financeira;
    }

    public void setFinanceira(String financeira) {
        this.financeira = financeira;
    }    

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public String getRetorno() {
        return retorno;
    }
    
    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }
    
    public double getValorCompra() {
        return valorCompra; 
    }
    
    public void setValorCompra(double valor){
        this.valorCompra = valor;
    }
    
    public Double getLucro(){
                
        return getValor() - ( getValorCompra() + veiculo.getValorTotalDespesas() ) ;       
        
    }
    
}
