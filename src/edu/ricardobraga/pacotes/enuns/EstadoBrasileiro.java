package edu.ricardobraga.pacotes.enuns;

public enum EstadoBrasileiro {
    SAO_PAULO ("São Paulo", "SP"),
    PARANA ("Paraná", "PR");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    
}
