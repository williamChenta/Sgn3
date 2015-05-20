package br.edu.senai.model;

public enum TipoQuestao {
    MULTIPLA_ESCOLHA(1, "Multipla escolha"),
    UNICA_ESCOLHA(2, "Unica escolha"),
    DISSERTATIVA(3, "Dissertativa");
    
    private final int id;
    private final String descricao;

    private TipoQuestao(int id, String descricao) {
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
