package br.edu.senai.model;

public class GabaritoQuestao {
    private int id;
    private AlternativaQuestao alternativa;

    public GabaritoQuestao() {
    }

    public GabaritoQuestao(AlternativaQuestao alternativa) {
        this.alternativa = alternativa;
    }

    public AlternativaQuestao getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(AlternativaQuestao alternativa) {
        this.alternativa = alternativa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final GabaritoQuestao other = (GabaritoQuestao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
