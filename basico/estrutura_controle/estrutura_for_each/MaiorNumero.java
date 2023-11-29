package estrutura_controle.estrutura_for_each;

//calculo da media de numeros de um array
public class MaiorNumero {
  public static void main(String[] args) {
    int[] numeros = { 10, 20, 30, 40, 50 };
    int maiorNumero = numeros[0];

    // Mostrar os elementos da lista
    for (int numero : numeros) {
      System.out.println(numero + "  ");
    }

    // Maior numero
    for (int numero : numeros) {
      if (numero > maiorNumero) {
        maiorNumero = numero;
      }
    }

    System.out.println("O maior número da lista é: " + maiorNumero);
  }
}