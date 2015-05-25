package br.edu.senai.business;

import br.edu.senai.model.Pessoa;
import java.util.List;
//teste
public interface Comunicacao {
    public void comunicar(List<Pessoa> pessoas);
    public void comunicar(Pessoa pessoa);
}
