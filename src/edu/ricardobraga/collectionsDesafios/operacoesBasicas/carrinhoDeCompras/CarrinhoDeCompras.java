package edu.ricardobraga.collectionsDesafios.operacoesBasicas.carrinhoDeCompras;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensPararemover = new ArrayList<>();

        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensPararemover.add(item);
            }
        }
        itemList.removeAll(itensPararemover);
    }

    public void calcularCalorTotal() {
        String formato = "R$ #,##0.00";
        DecimalFormat df = new DecimalFormat(formato);        

        Double total = 0.00;
        for (Item item : itemList) {
            total += item.getPreco() * item.getQuantidade();
        }

        System.out.println("O valor total do carrinho é: " + df.format(total));
    }

    public void exibirItens() {
        for (Item item : itemList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Cabo Sata", 10.00, 1);
        carrinhoDeCompras.adicionarItem("Iphone", 5000.00, 2);
        carrinhoDeCompras.adicionarItem("Chocolate", 3.60, 5);

        carrinhoDeCompras.removerItem("Cabo Sata");

        carrinhoDeCompras.calcularCalorTotal();

        carrinhoDeCompras.exibirItens();
    }

}
