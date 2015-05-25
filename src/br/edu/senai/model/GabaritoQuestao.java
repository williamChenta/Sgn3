package br.edu.senai.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name = "tb_gabarito_questao")
public class GabaritoQuestao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gabarito")
    private int id;
    @OneToOne
    @JoinColumn(name = "id_questao", unique = true)
    private Questao questao;
    
    @ManyToMany
    @JoinTable(name = "tb_gabarito_alternativa", 
            joinColumns = @JoinColumn(name = "id_gabarito"), 
            inverseJoinColumns = @JoinColumn(name = "id_alternativa"))
    private List<AlternativaQuestao> alternativasCorretas;

    public GabaritoQuestao() {
    }

    public GabaritoQuestao(Questao questao, List<AlternativaQuestao> alternativasCorretas) {
        this.questao = questao;
        this.alternativasCorretas = alternativasCorretas;
    }

    public List<AlternativaQuestao> getAlternativasCorretas() {
        return alternativasCorretas;
    }

    public void setAlternativasCorretas(List<AlternativaQuestao> alternativasCorretas) {
        this.alternativasCorretas = alternativasCorretas;
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
