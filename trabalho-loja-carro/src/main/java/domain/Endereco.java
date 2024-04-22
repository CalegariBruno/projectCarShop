/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Endereco {
    
    private int idEndereco;
    private String cep;   
    private String bairro;
    private String descricao;
    private int numero;  
    private String cidade;
    private String uf; 

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
