package domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idPessoa;
    
    @Column (name="nomeCliente", nullable = false)
    private String nome;
    
    @Column( length = 14 ,unique=true )
    private String cpf;
    
    @Column ( length = 15)
    private String telefone;
    
    @OneToOne( mappedBy = "cliente" ,cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany(mappedBy = "revendedor", fetch = FetchType.EAGER )
    private Set<Compra> compras;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY )
    private Set<Venda> vendas;

    public Pessoa() {
    }
    
    public Pessoa(int idPessoa, String nome, String cpf ,String telefone,String cep, String bairro, String descricao, int numero, String cidade, String uf) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = new Endereco(idPessoa, cep, bairro, descricao, numero, cidade, uf);
    }

    public Pessoa(String nome, String cpf , String telefone, String cep, String bairro, String descricao, int numero, String cidade, String uf) {
        this.nome = nome;               
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = new Endereco(cep, bairro, descricao, numero, cidade, uf);
        this.endereco.setCliente(this);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }

    public Set<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(Set<Venda> vendas) {
        this.vendas = vendas;
    }     
    
}
