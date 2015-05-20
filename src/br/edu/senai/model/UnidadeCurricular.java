package br.edu.senai.model;

import java.util.List;

public class UnidadeCurricular {
    private int id;
    private String nome;
    private double cargaHoraria;
    private List<Questao> questoes;

    public UnidadeCurricular() {
    }

    public UnidadeCurricular(String nome, double cargaHoraria, List<Questao> questoes) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.questoes = questoes;
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

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
    
}
