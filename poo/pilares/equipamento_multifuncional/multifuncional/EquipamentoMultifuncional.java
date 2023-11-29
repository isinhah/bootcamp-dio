package pilares_poo.equipamento_multifuncional.multifuncional;

import pilares_poo.equipamento_multifuncional.equipamentos.digitalizadora.Digitalizadora;
import pilares_poo.equipamento_multifuncional.equipamentos.impressora.Impressora;
import pilares_poo.equipamento_multifuncional.equipamentos.copiadora.Copiadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

  @Override
  public void copiar() {
    System.out.println("Copiando via equipamento multifuncional");

  }

  @Override
  public void digitalizar() {
    System.out.println("Digitalizando via equipamento multifuncional");

  }

  @Override
  public void imprimir() {
    System.out.println("Imprimindo via equipamento multifuncional");

  }

}
