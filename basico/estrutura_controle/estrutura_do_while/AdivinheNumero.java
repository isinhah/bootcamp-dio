package estrutura_controle.estrutura_do_while;

import java.util.Random;
import java.util.Scanner;

public class AdivinheNumero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    // vai até 100
    int numeroAleatorio = random.nextInt(100) + 1;
    int palpite;
    int tentativas = 0;

    do {
      System.out.println("Tente adivinhar o número (entre 1 e 100)");
      palpite = sc.nextInt();
      tentativas++;

      if (palpite < numeroAleatorio) {
        System.out.println("Muito baixo! Tente novamente");
      } else if (palpite > numeroAleatorio) {
        System.out.println("Muito alto! Tente novamente");
      } else {
        System.out.println("Parabéns! você acertou");
      }
    } while (palpite != numeroAleatorio);

    System.out.println("Total de tentativas: " + tentativas);

    sc.close();

  }
}
