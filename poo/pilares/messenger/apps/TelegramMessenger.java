package pilares_poo.messenger.apps;

public class TelegramMessenger extends ServicoMensagemInstantanea {
  public void enviarMensagem() {
    System.out.println("Enviando mensagem pelo Telegram");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Telegram");
  }
}
