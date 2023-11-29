package pilares_poo.direcao;

public abstract class Veiculo {
  public String chassi;

  public String getChassi() {
    return chassi;
  }

  public void setChassi(String string) {
    this.chassi = chassi;
  }

  public abstract void ligar();

}
