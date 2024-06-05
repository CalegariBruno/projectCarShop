/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn ( name = "idEndereco")
    private Endereco endereco;
    
    @OneToMany(mappedBy = "revendedor", fetch = FetchType.LAZY )
    @JoinColumn ( name = "idCompra")
    private List<Compra> compras;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY )
    @JoinColumn ( name = "idVenda")
    private List<Venda> vendas;

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

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    
    
    
    
}
