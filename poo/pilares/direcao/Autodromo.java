package pilares_poo.direcao;

public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();

    jeep.setChassi("654644");
    jeep.ligar();

    Moto z470 = new Moto();
    z470.setChassi("548594");
    z470.ligar();

  }

}
