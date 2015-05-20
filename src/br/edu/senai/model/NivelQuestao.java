package br.edu.senai.model;

public enum NivelQuestao {
    FÁCIL(1, "Fácil"),
    MÉDIO(2, "Médio"),
    DIFICIL(3, "Dificil"),
    MUITO_DIFICIL(4, "Muito Dificil");
    
    private final int id;
    private final String descricao;

    private NivelQuestao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
