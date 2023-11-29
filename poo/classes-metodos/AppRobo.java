package classe_objeto_metodo;

import java.util.Scanner;

public class AppRobo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Robo robo = new Robo();

    robo.ligar();
    robo.andar();
    robo.somar(5, 5);
    robo.subtrair(10, 5);
    robo.andar();
    robo.desligar();

    sc.close();
  }
}
