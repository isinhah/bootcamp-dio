package estrutura_controle.estrutura_for;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Número inteiro para calcular o fatorial: ");
    int numeroFatorial = sc.nextInt();

    int fatorial = 1;
    for (int i = 1; i <= numeroFatorial; i++) {
      fatorial *= i;
      System.out.print(i + "  ");
    }

    System.out.println("O fatorial de " + numeroFatorial + " é " + fatorial);

    sc.close();
  }

}
