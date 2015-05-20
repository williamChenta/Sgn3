package br.edu.senai.model;

public enum NivelProva {
    FACIL(70, 30, 0),
    MEDIO(50, 40, 10),
    DIFICIL(20, 40, 40),
    MUITO_DIFICIL(0, 30, 70);
    
    int prcQuestoesFaceis, prcQuestoesMedias, prcQuestoesDificeis;

    private NivelProva(int prcQuestoesFaceis, int prcQuestoesMedias, int prcQuestoesDificeis) {
        this.prcQuestoesFaceis = prcQuestoesFaceis;
        this.prcQuestoesMedias = prcQuestoesMedias;
        this.prcQuestoesDificeis = prcQuestoesDificeis;
    }

    public int getPrcQuestoesFaceis() {
        return prcQuestoesFaceis;
    }

    public int getPrcQuestoesMedias() {
        return prcQuestoesMedias;
    }

    public int getPrcQuestoesDificeis() {
        return prcQuestoesDificeis;
    }
}
