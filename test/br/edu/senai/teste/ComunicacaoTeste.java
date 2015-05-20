package br.edu.senai.teste;

import br.edu.senai.business.Comunicacao;
import br.edu.senai.business.Email;
import br.edu.senai.business.TipoComunicacao;
import br.edu.senai.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ComunicacaoTeste {
    @Test
    public void testeComunicacaoEmail() {
        List<Pessoa> alunos = new ArrayList<>();
        alunos.add(new Pessoa("William Chenta", "9666-9398", "william.chenta@gmail.com", TipoComunicacao.SMS));
        alunos.add(new Pessoa("João ribeiro", "9999-9398", "joao.ribeiro@gmail.com", TipoComunicacao.EMAIL));
        
        Comunicacao viaEmail = new Email();
        viaEmail.comunicar(alunos);
    }
}
