package br.edu.senai.model;

import java.util.List;

public class Questao {
    private int id;
    private String enunciado;
    private UnidadeCurricular unidadeCurricular;
    private List<AlternativaQuestao> alternativas;
    private TipoQuestao tipoQuestao;
    private NivelQuestao nivelDificuldade;

    public Questao() {
    }

    public Questao(String enunciado, UnidadeCurricular unidadeCurricular, 
            List<AlternativaQuestao> alternativas, TipoQuestao tipoQuestao, NivelQuestao nivel) {
        this.enunciado = enunciado;
        this.unidadeCurricular = unidadeCurricular;
        this.alternativas = alternativas;
        this.tipoQuestao = tipoQuestao;
        this.nivelDificuldade = nivel;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public UnidadeCurricular getUnidadeCurricular() {
        return unidadeCurricular;
    }

    public void setUnidadeCurricular(UnidadeCurricular unidadeCurricular) {
        this.unidadeCurricular = unidadeCurricular;
    }

    public List<AlternativaQuestao> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<AlternativaQuestao> alternativas) {
        this.alternativas = alternativas;
    }

    public TipoQuestao getTipoQuestao() {
        return tipoQuestao;
    }

    public void setTipoQuestao(TipoQuestao tipoQuestao) {
        this.tipoQuestao = tipoQuestao;
    }

    public NivelQuestao getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(NivelQuestao nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}
