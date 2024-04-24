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

@Entity
public class TesteTabela implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idTeste;
    
    @Column (name="nomeTeste", nullable = false)
    private String nome;

    public TesteTabela() {
    }

    public TesteTabela(int idTeste, String nome) {
        this.idTeste = idTeste;
        this.nome = nome;
    }
    
    
    
}
