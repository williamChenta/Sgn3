package br.edu.senai.business;

import br.edu.senai.model.Pessoa;
import java.util.List;

public class Sms implements Comunicacao {

    @Override
    public void comunicar(List<Pessoa> pessoas) {
        System.out.println("Implementar comunicação por sms");
    }

    @Override
    public void comunicar(Pessoa pessoa) {
        System.out.println("Enviando sms para: " + pessoa.getNome());
    }
}
