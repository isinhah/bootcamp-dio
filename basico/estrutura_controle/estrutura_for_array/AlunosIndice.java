package estrutura_controle.estrutura_for_array;

import java.util.Scanner;

public class AlunosIndice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] alunos = { "isabel", "giulia", "joao", "meraldo" };

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno " + alunos[i] + " está na posição " + i);
    }

    sc.close();
  }
}
