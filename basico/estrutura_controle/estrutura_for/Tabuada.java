package estrutura_controle.estrutura_for;

import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número inteiro para calcular sua tabuada de 0 a 10: ");
    int numero = sc.nextInt();

    System.out.println("A tabuada de " + numero + " é: ");

    int tabuada = 0;

    for (int i = 1; i <= 10; i++) {
      tabuada = numero * i;
      System.out.println(numero + " x " + i + " = " + tabuada);
    }

    sc.close();
  }

}
