/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.senai.teste;

import br.edu.senai.model.Curso;
import br.edu.senai.model.Sala;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author william.chenta
 */
public class CursoTeste {
    @Test
    public void criarCurso() {
        Curso informatica = new Curso();
        informatica.setId(1);
        informatica.setNome("Técnico em informática");
        informatica.setUnidadeCurricular(null);
        
        Sala d10 = new Sala(1, "D10", 35, false);
        d10.imprimeCaracteristicas();
        
        Assert.assertEquals(1, informatica.getId());
    }
}
