package br.edu.senai.model;

public class AlternativaQuestao {
    private int id;
    private Questao questao;
    private String descricao;
    private char letra;

    public AlternativaQuestao() {
    }

    public AlternativaQuestao(int id, Questao questao, String descricao) {
        this.id = id;
        this.questao = questao;
        this.descricao = descricao;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlternativaQuestao other = (AlternativaQuestao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
