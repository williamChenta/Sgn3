package br.edu.senai.teste;

import br.edu.senai.business.Ensalamento;
import br.edu.senai.business.TipoComunicacao;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Tutor;
import org.junit.Assert;
import org.junit.Test;

public class EnsalamentoTeste {
    
    @Test
    public void ensalarTutor() {
        Pessoa william = new Pessoa("William Chenta", "9666-9398", 
                "william.chenta@gmail.com", TipoComunicacao.SMS);
        
        Ensalamento ensalamento = new Ensalamento();
        Assert.assertEquals(true, ensalamento.ensalarTutor(new Tutor(william)));
    }
}
