package estrutura_controle.estrutura_for_each;

public class AlunosNome {
  public static void main(String[] args) {
    String[] alunos = { "isabel", "joao", "giulia" };

    for (String aluno : alunos) {
      System.out.println("Nome do aluno: " + aluno);
    }
  }
}
