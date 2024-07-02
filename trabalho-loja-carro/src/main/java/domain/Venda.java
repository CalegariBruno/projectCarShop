/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idVenda;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    private String financeira;
    private double retorno;
    private double valor;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa cliente;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Veiculo veiculo;

    
    public Venda() {
    }
    
    public Venda(int idVenda, double valor, Date data, String financeira, Double retorno, Pessoa cliente, Veiculo veiculo) {
        this.idVenda = idVenda;
        this.valor = valor;
        this.data = data;
        this.financeira = financeira;
        this.retorno = retorno;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Venda(double valor, Date data, String financeira, Double retorno, Pessoa cliente, Veiculo veiculo) {
        this.valor = valor;
        this.data = data;
        this.financeira = financeira;
        this.retorno = retorno;
        this.cliente = cliente;
        this.veiculo = veiculo;
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

    public Double getRetorno() {
        return retorno;
    }

    public void setRetorno(Double retorno) {
        this.retorno = retorno;
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
    
    
    
}
