package fundamentos_poo.escola;

public class Escola {
  public static void main(String[] args) {
    Aluno felipe = new Aluno();

    felipe.setNome("João");
    felipe.setIdade(10);

    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
  }
}