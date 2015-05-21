package br.edu.senai.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tb_gabarito_questao")
public class GabaritoQuestao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gabarito")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_questao")
    private Questao questao;
    private AlternativaQuestao alternativa;

    public GabaritoQuestao() {
    }

    public GabaritoQuestao(Questao questao, AlternativaQuestao alternativa) {
        this.questao = questao;
        this.alternativa = alternativa;
    }

    public AlternativaQuestao getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(AlternativaQuestao alternativa) {
        this.alternativa = alternativa;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
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
