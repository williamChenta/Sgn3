package br.edu.senai.teste;

import br.edu.senai.business.TipoComunicacao;
import br.edu.senai.model.Aluno;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Tutor;
import br.edu.senai.util.ConnectionDB;
import org.junit.Test;

public class CadastrarPessoaTeste {
    @Test
    public void cadastrar() {
        Pessoa william = new Pessoa("William Chenta", "9666-9398", "william.chenta@gmail.com", TipoComunicacao.SMS);
        Pessoa joao = new Pessoa("João ribeiro", "9999-9398", "joao.ribeiro@gmail.com", TipoComunicacao.EMAIL);

        ConnectionDB.insert(william);
        ConnectionDB.insert(joao);
        
        Tutor tutWilliam = new Tutor(william);        
        Aluno aluJoao = new Aluno(joao);        
        
        ConnectionDB.update(tutWilliam);
        ConnectionDB.update(aluJoao);
    }
}
