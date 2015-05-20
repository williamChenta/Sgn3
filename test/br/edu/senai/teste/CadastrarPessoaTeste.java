package br.edu.senai.teste;

import br.edu.senai.business.TipoComunicacao;
import br.edu.senai.model.Aluno;
import br.edu.senai.model.Pessoa;
import br.edu.senai.util.ConnectionDB;
import org.junit.Test;

public class CadastrarPessoaTeste {
    @Test
    public void cadastrar() {
        Pessoa william = new Pessoa("William Chenta", "9666-9398", "william.chenta@gmail.com", TipoComunicacao.SMS);
        Pessoa joao = new Pessoa("João ribeiro", "9999-9398", "joao.ribeiro@gmail.com", TipoComunicacao.EMAIL);

        Aluno aluWilliam = new Aluno(william);        
        
        ConnectionDB.insert(william);
        ConnectionDB.insert(joao);
        
        ConnectionDB.update(aluWilliam);
    }
}
