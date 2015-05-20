package br.edu.senai.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "tb_aluno")
public class Aluno implements Serializable {

    @OneToOne
    private Pessoa pessoa;

    public Aluno(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }    
}
