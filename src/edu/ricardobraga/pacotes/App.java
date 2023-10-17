package edu.ricardobraga.pacotes;

import edu.ricardobraga.pacotes.enuns.EstadoBrasileiro;
import edu.ricardobraga.pacotes.models.User;

public class App {
    public static void main(String[] args) {        
        User user = new User(1, "Ricardo", EstadoBrasileiro.PARANA);
    
        System.out.println(user);
    }
}
