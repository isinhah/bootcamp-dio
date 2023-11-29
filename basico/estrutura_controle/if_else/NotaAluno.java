package estrutura_controle.if_else;

import java.util.Locale;
import java.util.Scanner;

public class NotaAluno {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Aluno: ");
    String aluno = sc.nextLine();
    System.out.print("Matéria: ");
    String materia = sc.nextLine();
    System.out.print("Nota da primeira prova: ");
    double nota1 = sc.nextDouble();
    System.out.print("Nota da segunda prova: ");
    double nota2 = sc.nextDouble();
    System.out.print("Nota da terceira prova: ");
    double nota3 = sc.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("Aluno: " + aluno);
    System.out.println("Matéria: " + materia);

    // media = 5
    if (media < 6) {
      System.out.println("Reprovado.");
      System.out.printf("Sua média: %.2f", media);
    } else {
      System.out.println("Aprovado.");
      System.out.printf("Sua média: %.2f", media);
    }

    sc.close();
  }
}
