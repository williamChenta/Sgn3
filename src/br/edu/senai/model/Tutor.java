package br.edu.senai.model;

public class Tutor {
    
    Pessoa pessoa;
    
    public Tutor(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
