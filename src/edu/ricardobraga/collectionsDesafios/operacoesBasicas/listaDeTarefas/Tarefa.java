package edu.ricardobraga.collectionsDesafios.operacoesBasicas.listaDeTarefas;

public class Tarefa {
    private String descricao;

    
    public Tarefa() {
    }


    public Tarefa(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return descricao;
    }

  
 
   
    
}

