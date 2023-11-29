package pilares_poo.equipamento_multifuncional.estabelecimento;

import pilares_poo.equipamento_multifuncional.equipamentos.copiadora.Copiadora;
import pilares_poo.equipamento_multifuncional.equipamentos.digitalizadora.Digitalizadora;
import pilares_poo.equipamento_multifuncional.equipamentos.impressora.Impressora;
import pilares_poo.equipamento_multifuncional.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
  public static void main(String[] args) {

    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;

    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.copiar();
  }
}
