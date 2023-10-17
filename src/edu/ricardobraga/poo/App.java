package edu.ricardobraga.poo;

import edu.ricardobraga.poo.models.Carro;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setChassi("12345");

        carro.ligar();
    }
}
