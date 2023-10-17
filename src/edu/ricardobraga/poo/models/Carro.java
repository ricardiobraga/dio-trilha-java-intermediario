package edu.ricardobraga.poo.models;

public class Carro extends Veiculo {
    

    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro Ligado");
    }
    void confereCombustivel(){
        System.out.println("conferindo Combustível...");
    }
    void confereCambio(){
        System.out.println("Conferindo câmbio em P");
    }
}
