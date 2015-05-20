package br.edu.senai.business;

public enum TipoComunicacao {
    EMAIL(new Email(), 1, "E-mail"),
    SMS(new Sms(), 2, "SMS");
    
    private final int codigo;
    private final Comunicacao comunicacao;
    private final String descricao;

    private TipoComunicacao(Comunicacao comunicacao, int codigo, String descricao) {
        this.comunicacao = comunicacao;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Comunicacao getComunicacao() {
        return comunicacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
