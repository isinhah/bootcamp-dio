package estrutura_controle.condicao_ternaria;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = sc.nextInt();

    String resultado = (numero % 2 == 0) ? "par" : "impar";

    System.out.println("O " + numero + " é " + resultado);

    sc.close();
  }
}
