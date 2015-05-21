package br.edu.senai.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tb_curso")
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private int id;
    @Column(name = "nom_curso", length = 90, nullable = false)
    private String nome;
    @OneToMany(mappedBy = "curso")
    private List<UnidadeCurricular> unidadeCurricular;

    public Curso() {
    }

    public Curso(int id, String nome, List<UnidadeCurricular> unidadeCurricular) {
        this.id = id;
        this.nome = nome;
        this.unidadeCurricular = unidadeCurricular;
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

    public List<UnidadeCurricular> getUnidadeCurricular() {
        return unidadeCurricular;
    }

    public void setUnidadeCurricular(List<UnidadeCurricular> unidadeCurricular) {
        this.unidadeCurricular = unidadeCurricular;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
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
        final Curso other = (Curso) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
