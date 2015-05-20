package br.edu.senai.model;

import java.util.List;

public class Curso {
    private int id;
    private String nome;
    private List<UnidadeCurricular> unidadeCurricular;

    public Curso() {
    }

    public Curso(int id, String nome, List<UnidadeCurricular> unidadeCurricular) {
        this.id = id;
        this.nome = nome;
        this.unidadeCurricular = unidadeCurricular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<UnidadeCurricular> getUnidadeCurricular() {
        return unidadeCurricular;
    }

    public void setUnidadeCurricular(List<UnidadeCurricular> unidadeCurricular) {
        this.unidadeCurricular = unidadeCurricular;
    }
}
