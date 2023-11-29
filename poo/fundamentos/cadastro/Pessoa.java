package fundamentos_poo.cadastro;

public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;

  // o nome deverá ser igual ao nome da classe
  public Pessoa(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  // ...
  // getters
  // setters

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String newEndereco) {
    this.endereco = newEndereco;
  }
}
