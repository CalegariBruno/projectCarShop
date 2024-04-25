/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Despesa implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idDespesa;
    private String descricao;
    private double valor;
    
    @ManyToOne
    @JoinColumn(name="idVeiculo")
    private Veiculo veiculo;

    public Despesa() {
    }

    public Despesa(int id, String descricao, double valor, Veiculo veiculo) {
        this.idDespesa = id;
        this.descricao = descricao;
        this.valor = valor;
        this.veiculo = veiculo;
    }

    public Despesa(String descricao, double valor, Veiculo veiculo) {
        this.descricao = descricao;
        this.valor = valor;
        this.veiculo = veiculo;
    }

    public int getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
