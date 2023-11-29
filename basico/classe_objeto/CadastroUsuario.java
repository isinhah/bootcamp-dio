package classe_objeto;

import java.util.Scanner;

public class CadastroUsuario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira seu nome: ");
    String name = sc.nextLine();
    System.out.print("Insira seu username: ");
    String username = sc.nextLine();
    System.out.print("Insira sua idade: ");
    int age = sc.nextInt();

    Usuario usuario = new Usuario(name, username, age);

    System.out.printf("USUÁRIO CADASTRADO!%n");
    System.out.println("Nome: " + usuario.getName());
    System.out.println("Username: " + usuario.getUsername());
    System.out.println("Idade: " + usuario.getAge());

    sc.close();
  }
}
