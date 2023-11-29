package src.list_interface.OperacoesBasicas.CarrinhoDeCompras;

public class Item {

    public String nome;
    public double preco;
    public int quantidade;

    //construtores
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //metodos


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString(String nome, double preco, int quantidade) {
        return "Nome: " + nome + ", " + "Preço: " + preco + ", " + "Quantidade: " + quantidade;
    }
}
