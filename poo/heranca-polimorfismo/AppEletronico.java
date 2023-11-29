package heranca_polimorfismo;

public class AppEletronico {
  public static void main(String[] args) {
    Eletronico eletronico = new Eletronico();
    Eletronico computador = new Computador();
    Eletronico celular = new Celular();

    eletronico.ligar();
    computador.ligar();
    celular.ligar();
  }
}
