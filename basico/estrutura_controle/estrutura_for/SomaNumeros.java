package estrutura_controle.estrutura_for;

import java.util.Scanner;

public class SomaNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha um número inteiro: ");
    int numero = sc.nextInt();

    int soma = 0;
    for (int i = 1; i <= numero; i++) {
      soma += i; // 1 + 2 = 3, 3 + 3 = 6, 6 + 4 = 10...
    }

    System.out.println("A soma de todos os números até " + numero + " é " + soma);

    sc.close();
  }
}
