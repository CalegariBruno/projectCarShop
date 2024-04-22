/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;


public class Venda {
    
    private int idVenda;
    private double valor;
    private Date data;
    private String finaceira;
    private Double retorno;
    
    private Pessoa cliente;
    private Veiculo veiculo;

    public Venda(int idVenda, double valor, Date data, String finaceira, Double retorno, Pessoa cliente, Veiculo veiculo) {
        this.idVenda = idVenda;
        this.valor = valor;
        this.data = data;
        this.finaceira = finaceira;
        this.retorno = retorno;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public Venda(double valor, Date data, String finaceira, Double retorno, Pessoa cliente, Veiculo veiculo) {
        this.valor = valor;
        this.data = data;
        this.finaceira = finaceira;
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

    public String getFinaceira() {
        return finaceira;
    }

    public void setFinaceira(String finaceira) {
        this.finaceira = finaceira;
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
