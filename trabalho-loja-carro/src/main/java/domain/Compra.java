/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;
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
public class Compra implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idCompra;
    
    @Temporal(TemporalType.DATE)
    private Date data; 
    
    private double valor;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa revendedor;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Veiculo veiculo;

    public Compra() {
    }

    public Compra(int idCompra, double valor, Date data, Pessoa revendedor, Veiculo veiculo) {
        this.idCompra = idCompra;
        this.valor = valor;
        this.data = data;
        this.revendedor = revendedor;
        this.veiculo = veiculo;
    }

    public Compra(double valor, Date data, Pessoa revendedor, Veiculo veiculo) {
        this.valor = valor;
        this.data = data;
        this.revendedor = revendedor;
        this.veiculo = veiculo;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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

    public Pessoa getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Pessoa revendedor) {
        this.revendedor = revendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
