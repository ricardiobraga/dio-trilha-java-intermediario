package edu.ricardobraga.collectionsDesafios.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numberList;

    public SomaNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numberList.add(numero);
    }

    public void calcularSoma(){
        int soma = 0;
        if(!numberList.isEmpty()){
            for (int numero : numberList) {
                soma += numero;
            }
        }
        System.out.println(soma);
    }

    public void encontrarMaiorNumero(){
       List<Integer> maiorNumeroList = new ArrayList<>(this.numberList);

       if(!numberList.isEmpty()){
        Collections.sort(maiorNumeroList);
       }

       System.out.println(maiorNumeroList.get(maiorNumeroList.size() - 1));         
        
    }
    public void encontrarMenorNumero(){
       List<Integer> maiorNumeroList = new ArrayList<>(this.numberList);

       if(!numberList.isEmpty()){
        Collections.sort(maiorNumeroList);
       }

       System.out.println(maiorNumeroList.get(0));         
        
    }

    public void exibirNumeros(){
        if(!numberList.isEmpty()){
            for (Integer i : numberList) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(4);

        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }
   



    
}
