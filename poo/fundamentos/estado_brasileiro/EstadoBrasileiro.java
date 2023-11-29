package fundamentos_poo.estado_brasileiro;

public enum EstadoBrasileiro {
  // Objetos pré-estabelecidos
  SAO_PAULO("SP", "São Paulo", 11), // Constante do objeto
  RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
  PIAUI("PI", "Piauí", 13),
  MARANHAO("MA", "Maranhão", 14),
  PERNAMBUCO("PE", "Pernambuco", 15);

  private String nome;
  private String sigla;
  private int ibge;

  private EstadoBrasileiro(String sigla, String nome, int ibge) {
    this.sigla = sigla;
    this.nome = nome;
    this.ibge = ibge;
  }

  public String getSigla() {
    return sigla;
  }

  public String getNome() {
    return nome;
  }

  public int getIbge() {
    return ibge;
  }

  public String getNomeMaiusculo() {
    return nome.toUpperCase();
  }

}
