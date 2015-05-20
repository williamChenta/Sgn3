package br.edu.senai.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class OcupacaoSala {
    private int id;
    private LocalDate data;
    private Periodo periodo;
    private Curso curso;
    private UnidadeCurricular unidade;
    private static List<OcupacaoSala> ocupacoes = new ArrayList<>();

    public OcupacaoSala() {
    }

    public OcupacaoSala(LocalDate data, Periodo periodo, Curso curso, UnidadeCurricular unidade) {
        this.data = data;
        this.periodo = periodo;
        this.curso = curso;
        this.unidade = unidade;
    }
    
    public void ocupar() {
        
    }
    
    //public boolean buscarOcupacoes(Sala sala, LocalDate inicio, LocalDate fim, Periodo periodo) {
    public boolean buscarOcupacoes(LocalDate inicio, LocalDate fim) {
        
        while(inicio.isBefore(fim)) {
            System.out.println(inicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            inicio = inicio.plusDays(1);
        }
        
        return false;
    }
    
}
