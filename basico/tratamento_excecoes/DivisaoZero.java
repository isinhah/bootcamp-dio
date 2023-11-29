package tratamento_excecoes;

public class DivisaoZero {
  public static void main(String[] args) {
    try {
      int resultado = 10 / 0; // Isso causará uma exceção de divisão por zero (ArithmeticException)
    } catch (ArithmeticException e) {
      System.out.println("Ocorreu um erro de divisão por zero: " + e.getMessage());
    }
  }
}
