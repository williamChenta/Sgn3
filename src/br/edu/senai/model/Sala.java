package br.edu.senai.model;

public class Sala {
    private int id;
    private String nome;
    private int capacidade;
    private boolean temPC;

    public Sala() {
    }

    public Sala(int id, String nome, int capacidade, boolean temPC) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.temPC = temPC;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isTemPC() {
        return temPC;
    }

    public void setTemPC(boolean temPC) {
        this.temPC = temPC;
    }
    
    public void imprimeCaracteristicas() {
        System.out.println("nome: " + this.nome + "\nCapacidade: " + this.capacidade + 
                "\n" + (this.isTemPC() ? "Equipada com computadores" : "Sala simples. Sem computadores"));
    }
}
