package estrutura_controle.estrutura_for;

import java.util.Scanner;

public class CadastroPet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos cachorros você já teve? ");
    int quantidadeCachorro = sc.nextInt();
    sc.nextLine(); // consumir a quebra de linha do nextint

    // cachorros é o nome do array que vai ter dados do tipo String
    // o tamanho do array é a quantidadeCachorro
    String[] cachorros = new String[quantidadeCachorro];

    for (int i = 0; i < quantidadeCachorro; i++) {
      System.out.println("Nome do cachorro: ");
      String nome = sc.nextLine();
      cachorros[i] = nome; // nome vai para o indice atual
    }

    // Todos os cachorros
    System.out.println("Todos os seus cachorros: ");

    for (String cachorro : cachorros) {
      System.out.println(cachorro);
    }

    sc.close();
  }
}
