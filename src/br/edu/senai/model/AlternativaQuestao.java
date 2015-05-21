package br.edu.senai.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tb_alternativa_questao")
public class AlternativaQuestao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alternativa")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_questao")
    private Questao questao;
    @Column(name = "dsc_alternativa", nullable = false)
    private String descricao;
    @Column(name = "ltr_alternativa", nullable = false)
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

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
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
