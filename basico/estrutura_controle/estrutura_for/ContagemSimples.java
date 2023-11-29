package estrutura_controle.estrutura_for;

import java.util.Scanner;

public class ContagemSimples {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Até qual número natural você quer contar? ");
    int numeroLimite = sc.nextInt();
    System.out.print("De quanto em quanto você quer contar? ");
    int numeroQuantidade = sc.nextInt();

    for (int i = 1; i <= numeroLimite; i += numeroQuantidade) {
      System.out.println(i + " ");
    }

    sc.close();
  }
}
