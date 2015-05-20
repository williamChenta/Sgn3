package br.edu.senai.teste;

import br.edu.senai.model.OcupacaoSala;
import java.time.LocalDate;
import org.junit.Test;

/**
 *
 * @author william.chenta
 */
public class OcupacaoSalaTeste {
    @Test
    public void buscarOcupacoes() {
        OcupacaoSala ocupacao = new OcupacaoSala();
        ocupacao.buscarOcupacoes(LocalDate.now(), LocalDate.now().plusDays(20));
    }
}
