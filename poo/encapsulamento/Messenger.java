package encapsulamento;

public class Messenger {

  public void mandarMensagem() {
    checarInternet();
    possuiDestinatario();
    possuiMensagem();
  }

  private void checarInternet() {
    System.out.println("Checando se tem internet ou não");
  }

  private void possuiMensagem() {
    System.out.println("Checar se tem mensagem para ser enviada ou não");
  }

  private void possuiDestinatario() {
    System.out.println("Checar para quem está mandando a mensagem");
  }
}
