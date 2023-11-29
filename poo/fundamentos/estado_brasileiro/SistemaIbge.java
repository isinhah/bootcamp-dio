package fundamentos_poo.estado_brasileiro;

public class SistemaIbge {
  public static void main(String[] args) {

    // método values, verifica quais opcoes criei no meu enum
    for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
      System.out.println("Sigla do Estado: " + e.getSigla() + " Nome do Estado: " + e.getNome());
    }

    // o eb é um enum que esta representando o estado pernambuco
    EstadoBrasileiro eb = EstadoBrasileiro.PERNAMBUCO;

    System.out.println("NOME DO ESTADO: " + eb.getNome());
    System.out.println("NOME EM MAIUSCULO: " + eb.getNomeMaiusculo());
    System.out.println("SIGLA: " + eb.getSigla());
    System.out.println("IBGE: " + eb.getIbge());
  }
}
