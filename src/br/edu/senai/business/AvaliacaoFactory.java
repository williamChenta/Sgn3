package br.edu.senai.business;

import br.edu.senai.model.NivelProva;
import br.edu.senai.model.UnidadeCurricular;

public class AvaliacaoFactory {
    private UnidadeCurricular unidadeCurricular;
    private int numQuestoes;
    private int numQuestoesFaceis;
    private int numQuestoesMedias;
    private int numQuestoesDificeis;
    private NivelProva nivelProva;
    
    public UnidadeCurricular getUnidadeCurricular() {
        return unidadeCurricular;
    }

    public void setUnidadeCurricular(UnidadeCurricular unidadeCurricular) {
        this.unidadeCurricular = unidadeCurricular;
    }

    public int getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes(int numQuestoes) {
        this.numQuestoes = numQuestoes;
    }

    public NivelProva getNivelProva() {
        return nivelProva;
    }

    public void setNivelProva(NivelProva nivelProva) {
        this.nivelProva = nivelProva;
    }
    
    public void gerarAvaliacao() {
        //calculando o numero de questões de cada nivel de dificuldade
        calcularQuestoes();        
        System.out.println("Prova de nível " + nivelProva);
        System.out.println("Qtde. Questões Faceis: " + numQuestoesFaceis);
        System.out.println("Qtde. Questões Médias: " + numQuestoesMedias);
        System.out.println("Qtde. Questões Dificeis: " + numQuestoesDificeis);
    }
    
    public void calcularQuestoes() {
        numQuestoesFaceis = (numQuestoes * nivelProva.getPrcQuestoesFaceis()) / 100;
        numQuestoesMedias = (numQuestoes * nivelProva.getPrcQuestoesMedias()) / 100;
        numQuestoesDificeis = (numQuestoes * nivelProva.getPrcQuestoesDificeis()) / 100;
    }
}
