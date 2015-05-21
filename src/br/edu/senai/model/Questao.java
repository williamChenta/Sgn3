package br.edu.senai.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name = "tb_questao")
public class Questao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_questao")
    private int id;
    @Column(name = "dsc_enunciado", nullable = false)
    private String enunciado;
    @ManyToMany(mappedBy = "questoes")
    private List<UnidadeCurricular> unidadesCurriculares;
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "questao")    
    private List<AlternativaQuestao> alternativas;
    @Enumerated
    @Column(name = "tip_questao")
    private TipoQuestao tipoQuestao;
    @Enumerated
    @Column(name = "val_nivel")
    private NivelQuestao nivelDificuldade;    
    
    public Questao() {
    }

    public Questao(String enunciado, List<UnidadeCurricular> unidadesCurriculares, 
            List<AlternativaQuestao> alternativas, TipoQuestao tipoQuestao, NivelQuestao nivel,
            List<GabaritoQuestao> gabarito) {
        this.enunciado = enunciado;
        this.unidadesCurriculares = unidadesCurriculares;
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

    public List<UnidadeCurricular> getUnidadesCurriculares() {
        return unidadesCurriculares;
    }

    public void setUnidadesCurriculares(List<UnidadeCurricular> unidadesCurriculares) {
        this.unidadesCurriculares = unidadesCurriculares;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
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
        final Questao other = (Questao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
