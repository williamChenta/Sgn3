package br.edu.senai.teste;

import br.edu.senai.business.AvaliacaoFactory;
import br.edu.senai.model.AlternativaQuestao;
import br.edu.senai.model.Curso;
import br.edu.senai.model.GabaritoQuestao;
import br.edu.senai.model.NivelProva;
import br.edu.senai.model.Questao;
import br.edu.senai.model.TipoQuestao;
import br.edu.senai.model.UnidadeCurricular;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class QuestoesTeste {
    
    @Test
    public void questaoAlternativas() {
        //criou curso
        Curso curso = new Curso(1, "Técnico em informática", null);
        
        //Criou questão
        Questao qualMelhorTime = new Questao();
        qualMelhorTime.setEnunciado("Qual o melhor time do mundo?");
        qualMelhorTime.setTipoQuestao(TipoQuestao.UNICA_ESCOLHA);
        
        //Criou alternativas
        AlternativaQuestao corinthians = new AlternativaQuestao();
        corinthians.setDescricao("Corinthians");
        corinthians.setQuestao(qualMelhorTime);
        
        AlternativaQuestao barcelona = new AlternativaQuestao();
        barcelona.setDescricao("Barcelona");
        barcelona.setQuestao(qualMelhorTime);
        
        AlternativaQuestao real = new AlternativaQuestao();
        real.setDescricao("Real Madri");
        real.setQuestao(qualMelhorTime);
        
        //Guarda a alternativa correta no gabarito
        List<AlternativaQuestao> alternativasCorretas = new ArrayList<>();
        alternativasCorretas.add(corinthians);
        alternativasCorretas.add(barcelona);
        GabaritoQuestao gab = new GabaritoQuestao(qualMelhorTime, alternativasCorretas);
        
        //Associou alternativas a questão
        List<AlternativaQuestao> listaAlternativas = new ArrayList<>();
        listaAlternativas.add(corinthians);
        listaAlternativas.add(barcelona);
        listaAlternativas.add(real);
        
        qualMelhorTime.setAlternativas(listaAlternativas);
        
        //Mostrando a questão com as alternativas
        System.out.println("1) " + qualMelhorTime.getEnunciado());
        
        qualMelhorTime.getAlternativas().stream().forEach((alternativa) -> {
            System.out.println("**** " + alternativa.getDescricao());
        });
        
        //lendo o gabarito
        System.out.println("a(s) resposta(s) correta(s) é(são): ");
        alternativasCorretas.stream().forEach((x) -> {
            System.out.println(x.getDescricao());
        });
                
        Assert.assertEquals(3, qualMelhorTime.getAlternativas().size());
        
        List<Questao> questoes = new ArrayList<>();
        questoes.add(qualMelhorTime);
        UnidadeCurricular logicaProgramacao = new UnidadeCurricular("Lógica de programação", 160, questoes, curso);
        
        AvaliacaoFactory af = new AvaliacaoFactory();
        af.setNivelProva(NivelProva.FACIL);
        af.setNumQuestoes(22);
        af.setUnidadeCurricular(logicaProgramacao);
        af.gerarAvaliacao();
    }        
}
