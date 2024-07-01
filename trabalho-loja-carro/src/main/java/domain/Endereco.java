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
import javax.persistence.MapsId;
import javax.persistence.OneToOne;


@Entity
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idEndereco;
    
    @Column ( length = 10)
    private String cep;
    
    @Column ( length = 50)
    private String bairro;
    
    @Column ( length = 100)
    private String descricao;
    
    @Column
    private int numero;
    
    @Column ( length = 50)
    private String cidade;
    
    @Column ( length = 20)
    private String uf; 
    
    @OneToOne
    @MapsId
    @JoinColumn (name = "idPessoa")
    private Pessoa cliente;


    public Endereco() {
    }
    
    public Endereco(int idEndereco, String cep, String bairro, String descricao, int numero, String cidade, String uf) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.bairro = bairro;
        this.descricao = descricao;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Endereco(String cep, String bairro, String descricao, int numero, String cidade, String uf) {
        this.cep = cep;
        this.bairro = bairro;
        this.descricao = descricao;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
    
}
