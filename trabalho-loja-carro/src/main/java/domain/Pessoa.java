/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idPessoa;
    
    @Column (name="nomeCliente", nullable = false)
    private String nome;
    
    @Column ( length = 15)
    private String telefone;
    
    @OneToOne
    @JoinColumn ( name = "endereco")
    private Endereco endereco;
    
    @OneToOne
    @JoinColumn ( name = "compra")
    private Compra compra = null;
    
    @OneToOne
    @JoinColumn ( name = "compra")
    private Venda venda = null;

    public Pessoa() {
    }
    
    public Pessoa(int idPessoa, String nome, String telefone, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
    
    
    
}
