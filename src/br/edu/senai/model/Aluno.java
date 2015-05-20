package br.edu.senai.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "tb_aluno")
public class Aluno implements Serializable {

    @Id
    @Column(name = "id_aluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pessoa", unique = true)
    private Pessoa pessoa;

    public Aluno() {
    }

    public Aluno(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }    

    public int getId() {
        return id;
    }
}
