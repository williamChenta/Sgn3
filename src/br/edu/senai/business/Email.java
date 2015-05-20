package br.edu.senai.business;

import br.edu.senai.model.Pessoa;
import java.util.List;

public class Email implements Comunicacao {

    @Override
    public void comunicar(List<Pessoa> pessoas) {
        
        pessoas.stream().forEach((pessoa) -> {
            System.out.println("Enviando email para: " + pessoa.getEmail());
        });
    }

    @Override
    public void comunicar(Pessoa pessoa) {
        System.out.println("Enviando email para: " + pessoa.getEmail());
    }
}
