package br.edu.senai.business;

import br.edu.senai.model.Tutor;

public class Ensalamento {

    //Comunicacao comunicacao;
    public boolean ensalarTutor(Tutor william) {
        /*
        * disponibilidade, carga horaria, periodo 11 horas descanço,
        * competencia
        */         
        
        /* 
        * POLIMORFISMO EM AÇÃO
        
        switch (tipo) {
            case EMAIL:
                comunicacao = new Email();
                break;
            case SMS:
                comunicacao = new Sms();
                break;
        }
        */
        
        //william.getTipoComunicacao().getComunicacao().comunicar(william);
        
        william.getPessoa().getTipoComunicacao().getComunicacao().comunicar(william.getPessoa());
        System.out.println("Tutor: " + william.getPessoa().getNome() + " ensalado com sucesso!!");
        return true;
    }

}
