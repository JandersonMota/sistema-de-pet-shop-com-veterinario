package com.endereco;

/*
 * Cadastro do endereço.
 * Author: Janderson Mota
 */

public class Endereco {
  private String estado;
  private String cidade;
  private String cep;
  private String rua;
  private String numero;
  private String complemento;
  private String observacao;

  /*public Endereco(String estado, String cidade, String cep, String rua, String numero, String complemento, String observacao) throws IllegalArgumentException {
    // Verifica se o estado é válido
    if (estado == null || estado.isEmpty()) {
      throw new IllegalArgumentException("Estado não pode estar vazio");
    }
    this.estado = estado;

    // Verifica se a cidade é válida
    if (cidade == null || cidade.isEmpty()) {
      throw new IllegalArgumentException("Cidade não pode estar vazia");
    }
    this.cidade = cidade;

    // Verifica se o CEP é válido
    if (cep == null || cep.isEmpty() || cep.length() != 8 || !cep.matches("\\d{8}")) {
      throw new IllegalArgumentException("CEP inválido");
    }
    this.cep = cep;

    // Verifica se a rua é válida
    if (rua == null || rua.isEmpty()) {
      throw new IllegalArgumentException("Rua não pode estar vazia");
    }
    this.rua = rua;

    // Verifica se o número é válido
    if (numero == null || numero.isEmpty()) {
      throw new IllegalArgumentException("Número não pode estar vazio");
    }
    this.numero = numero;

    // Não é necessário verificar complemento e observação, pois podem ser opcionais

    this.complemento = complemento;
    this.observacao = observacao;
  }*/

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    // Verifica se o estado é válido
    if (estado == null || estado.isEmpty()) {
      throw new IllegalArgumentException("Estado não pode estar vazio");
    }
    this.estado = estado;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    // Verifica se a cidade é válida
    if (cidade == null || cidade.isEmpty()) {
      throw new IllegalArgumentException("Cidade não pode estar vazia");
    }
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String  cep) {
    // Verifica se o CEP é válido
    if (cep == null || cep.isEmpty() || cep.length() != 8 || !cep.matches("\\d{8}")) {
      throw new IllegalArgumentException("CEP inválido");
    }
    this.cep = cep;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    // Verifica se a rua é válida
    if (rua == null || rua.isEmpty()) {
      throw new IllegalArgumentException("Rua não pode estar vazia");
    }
    this.rua = rua;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    // Verifica se o número é válido
    if (numero == null || numero.isEmpty()) {
      throw new IllegalArgumentException("Número não pode estar vazio");
    }
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  @Override
  public String toString() {
    return "\n\nEndereco{" +
      "estado='" + estado + '\'' +
      ", cidade='" + cidade + '\'' +
      ", cep='" + cep + '\'' +
      ", rua='" + rua + '\'' +
      ", numero='" + numero + '\'' +
      ", complemento='" + complemento + '\'' +
      ", observacao='" + observacao + '\'' +
      "}\n\n";
  }

  /*public static void main(String[] args) {
    try {
      Endereco endereco1 = new Endereco("São Paulo", "São Paulo", "01234567", "Avenida Paulista", "1000", "Sala 501", "Próximo ao metrô");
      System.out.println(endereco1.toString());
    } catch (Exception e) {
      System.out.println("Erro ao criar endereço: " + e.getMessage());
    }
  }*/
}
