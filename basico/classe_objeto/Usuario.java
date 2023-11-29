package classe_objeto;

public class Usuario {

  // atributos
  private String name;
  private String username;
  private int age;

  // construtor
  public Usuario(String name, String username, int age) {
    this.name = name;
    this.username = username;
    this.age = age;
  }

  // getters e setters
  public String getName() {
    return name;
  }

  public String getUsername() {
    return username;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
