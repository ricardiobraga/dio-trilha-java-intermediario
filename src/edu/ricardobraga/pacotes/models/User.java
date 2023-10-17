package edu.ricardobraga.pacotes.models;

import edu.ricardobraga.pacotes.enuns.EstadoBrasileiro;

public class User {
    private int id;
    private String name;
    private EstadoBrasileiro estadoBrasileiro;

    public User() {     
    }
    public User(int id, String name, EstadoBrasileiro estadoBrasileiro) {
        this.id = id;
        this.name = name;
        this.estadoBrasileiro= estadoBrasileiro;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public EstadoBrasileiro getEstadoBrasileiro() {
        return estadoBrasileiro;
    }
    public void setEstadoBrasileiro(EstadoBrasileiro estadoBrasileiro) {
        this.estadoBrasileiro = estadoBrasileiro;
    }
    @Override
    public String toString() {
        return ("User id: " + id + "\n" +
                "User name: " + name + "\n" +
                "User estado: " + estadoBrasileiro);
    }

}
