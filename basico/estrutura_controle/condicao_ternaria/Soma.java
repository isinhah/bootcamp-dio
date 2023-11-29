package estrutura_controle.condicao_ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("A SOMA TEM QUE SER IGUAL A 10");
    System.out.println("Primeiro número: ");
    double nota1 = sc.nextDouble();
    System.out.println("Segundo número: ");
    double nota2 = sc.nextDouble();

    double soma = nota1 + nota2;

    // condição ternária
    String resultado = soma == 10 ? "Parabéns! A soma deu 10" : "Errado. A soma não deu 10";

    System.out.println(resultado);

    sc.close();
  }
}
