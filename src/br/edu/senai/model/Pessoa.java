package br.edu.senai.model;

import br.edu.senai.business.TipoComunicacao;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tb_pessoa")
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa")
    private int id;
    @Column(name = "nom_pessoa", length = 150, nullable = false)
    private String nome;
    @Column(name = "num_telefone", length = 30, nullable = false)
    private String telefone;
    @Column(name = "dsc_email", length = 150, nullable = false)
    private String email;
    @Enumerated
    @Column(name = "tip_comunicacao")
    private TipoComunicacao tipoComunicacao;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, 
            String email, TipoComunicacao tipoComunicacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoComunicacao = tipoComunicacao;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoComunicacao getTipoComunicacao() {
        return tipoComunicacao;
    }

    public void setTipoComunicacao(TipoComunicacao tipoComunicacao) {
        this.tipoComunicacao = tipoComunicacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
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
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
