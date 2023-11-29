package entrada_saida;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Número do funcionário: ");
    int num_funcionario = sc.nextInt();
    System.out.print("Horas trabalhadas: ");
    int horas_trabalhadas = sc.nextInt();
    System.out.print("Valor por hora: ");
    double valor_hora = sc.nextDouble();

    double salario = valor_hora * horas_trabalhadas;

    System.out.println("FUNCIONÁRIO: " + num_funcionario);
    System.out.printf("SALÁRIO: U$ %.2f", salario);

    sc.close();
  }
}