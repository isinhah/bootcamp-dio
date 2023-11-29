package pilares_poo.messenger;

import java.util.Scanner;

import pilares_poo.messenger.apps.FacebookMessenger;
import pilares_poo.messenger.apps.MSNMessenger;
import pilares_poo.messenger.apps.ServicoMensagemInstantanea;
import pilares_poo.messenger.apps.TelegramMessenger;

public class ComputadorUsuario {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ServicoMensagemInstantanea smi = null;

    System.out.println("Em que app você quer mandar msg? msn / fbm / tlg");
    String appEscolhido = sc.nextLine();

    if (appEscolhido.equals("msn"))
      smi = new MSNMessenger();
    else if (appEscolhido.equals("fbm"))
      smi = new FacebookMessenger();
    else if (appEscolhido.equals("tlg"))
      smi = new TelegramMessenger();

    smi.enviarMensagem();
    smi.receberMensagem();

    sc.close();
  }
}
