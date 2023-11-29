package src.list_interface.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributo - lista de itens
    private List<Item> itemList;

    //carrinho de compras recebe um array itemList
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //métodos

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itemList.remove(nome);
    }

    public double calcularValorTotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    }
}
