package domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Despesa implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idDespesa;
    private String descricao;
    private double valor;
    
    @ManyToOne(fetch = FetchType.EAGER)
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
