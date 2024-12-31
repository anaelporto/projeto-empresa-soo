/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Samuel Bastos Buchdid
 */
@Entity(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoa;

    private String nome;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_idpessoa")
    private List<Endereco> endereco;
    
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_idpessoa")
    private List<Projeto> projeto;
    
    private Acesso acesso;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contato_idContato")
    private Contato contato;

    public Pessoa() {
        this.endereco = new ArrayList<>();
        this.projeto = new ArrayList<>();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }
    
    public void setProjeto(Projeto projeto) {
        this.projeto.add(projeto);
    }
}