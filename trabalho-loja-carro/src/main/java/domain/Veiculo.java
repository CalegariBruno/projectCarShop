package domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVeiculo;

    @Column(unique = true)
    private String placa;

    @Column(unique = true)
    private long renavam;

    private String marca;
    private String modelo;
    private String cor;
    private String tipo;
    private String combustivel;
    private int ano;

    @OneToMany(mappedBy = "veiculo", fetch = FetchType.EAGER)
    private Set<Compra> compras;

    @OneToMany(mappedBy = "veiculo", fetch = FetchType.LAZY)
    private Set<Venda> vendas;

    @OneToMany(mappedBy = "veiculo", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Despesa> despesas;

    public Veiculo() {
    }

    public Veiculo(int idVeiculo, String placa, long renavam, String marca, String modelo, String cor, String tipo, String combustivel, int ano) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.ano = ano;
    }

    public Veiculo(String placa, long renavam, String marca, String modelo, String cor, String tipo, String combustivel, int ano) {
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.ano = ano;
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

    public long getRenavam() {
        return renavam;
    }

    public void setRenavam(long renavam) {
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

    public Set<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(Set<Despesa> despesas) {
        this.despesas = despesas;
    }

    public Double getValorTotalDespesas() {
        return despesas.stream().mapToDouble(Despesa::getValor).sum();
    }

}
