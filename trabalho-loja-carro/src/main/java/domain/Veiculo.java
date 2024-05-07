/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Veiculo {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idVeiculo;
    
    @Column(length = 8 ,unique=true)
    private String placa;
    
    @Column(unique=true)
    private int renavam;
    
    private String marca;
    private String modelo;
    private String cor;
    private String tipo;
    private String combustivel;
    private int ano;
    
    @OneToOne
    @JoinColumn(name="idCompra")
    private Compra compra;
    
    @OneToOne
    @JoinColumn(name="idVenda")
    private Venda venda;
    
    @OneToMany (mappedBy = "veiculo", fetch = FetchType.LAZY)
    private List<Despesa> despesas;

    public Veiculo() {
    }

    public Veiculo(int idVeiculo, String placa, int renavam, String marca, String modelo, String cor, String tipo, String combustivel, int ano, Compra compra, Venda venda, List<Despesa> despesas) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.ano = ano;
        this.compra = compra;
        this.venda = venda;
        this.despesas = despesas;
    }

    public Veiculo(String placa, int renavam, String marca, String modelo, String cor, String tipo, String combustivel, int ano, Compra compra, Venda venda, List<Despesa> despesas) {
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.ano = ano;
        this.compra = compra;
        this.venda = venda;
        this.despesas = despesas;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }
    
    
    
}
