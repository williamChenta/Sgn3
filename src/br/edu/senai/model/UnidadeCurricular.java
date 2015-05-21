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
import javax.persistence.ManyToOne;

@Entity(name = "tb_unidade_curricular")
public class UnidadeCurricular implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidade")
    private int id;
    @Column(name = "nom_unidade", length = 100, nullable = false)
    private String nome;
    @Column(name = "val_carga", precision = 2)
    private double cargaHoraria;
    @ManyToMany
    @JoinTable(name = "unidade_questao", joinColumns = @JoinColumn(name = "id_unidade"), 
            inverseJoinColumns = @JoinColumn(name = "id_questao"))
    private List<Questao> questoes;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public UnidadeCurricular() {
    }

    public UnidadeCurricular(String nome, double cargaHoraria, List<Questao> questoes, Curso curso) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.questoes = questoes;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final UnidadeCurricular other = (UnidadeCurricular) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
