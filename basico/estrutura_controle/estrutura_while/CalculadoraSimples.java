package estrutura_controle.estrutura_while;

import java.util.Scanner;

public class CalculadoraSimples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int escolha;

    // enquanto escolha for diferente de 5
    while (true) {
      System.out
          .printf("MENU DE OPÇÕES: %n" + "1 - SOMA%n" + "2 - MULTIPLICAÇÃO%n" + "3 - SUBTRAÇÃO%n" + "4 - DIVISÃO%n"
              + "5 - ENCERRAR PROGRAMA%n");
      escolha = sc.nextInt();

      if (escolha == 5) {
        System.out.println("PROGRAMA ENCERRADO! ");
        break; // Encerra o loop se a escolha for 5
      }

      System.out.print("Insira o primeiro número: ");
      int primeiroNumero = sc.nextInt();
      System.out.print("Insira o segundo número: ");
      int segundoNumero = sc.nextInt();

      if (escolha == 1) {
        int soma = primeiroNumero + segundoNumero;
        System.out.println("Soma: " + primeiroNumero + " + " + segundoNumero + " = " + soma);
      } else if (escolha == 2) {
        int multiplicacao = primeiroNumero * segundoNumero;
        System.out.println("Multiplicação: " + primeiroNumero + " * " + segundoNumero + " = " + multiplicacao);
      } else if (escolha == 3) {
        int subtracao = primeiroNumero - segundoNumero;
        System.out.println("Subtração: " + primeiroNumero + " - " + segundoNumero + " = " + subtracao);
      } else if (escolha == 4) {
        int divisao = primeiroNumero / segundoNumero;
        System.out.println("Divisão: " + primeiroNumero + " / " + segundoNumero + " = " + divisao);
      }

    }

    sc.close();
  }
}
