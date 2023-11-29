package fundamentos_poo.lanchonete;

import fundamentos_poo.lanchonete.area.cliente.Cliente;
import fundamentos_poo.lanchonete.atendimento.Atendente;
import fundamentos_poo.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();

    // ações que estabelecimento precisa ter ciência
    cozinheiro.adicionarSucoNoBalcao();
    ;
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Atendente atendente = new Atendente();
    atendente.servindoMesa();
    atendente.receberPagamento();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();
  }
}