package classe_objeto_metodo;

public class Robo {
  private int id;
  private String nome;
  private int idade;

  // metodos
  public void andar() {
    System.out.println("Andando...");
  }

  public void ligar() {
    System.out.println("Ligando...");
  }

  public void desligar() {
    System.out.println("Desligando...");
  }

  public int somar(int a, int b) {
    return a + b;
  }

  public int subtrair(int a, int b) {
    return a - b;
  }

  public int getId() {
    return id;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
