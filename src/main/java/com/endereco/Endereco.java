package com.endereco;

public class Endereco {
  private String estado;
  private String cidade;
  private String cep;
  private String rua;
  private String numero;
  private String complemento;
  private String observacao;

  public Endereco(String estado, String cidade, String cep, String rua, String numero, String complemento, String observacao) throws IllegalArgumentException {
      if (estado.equals(null) || estado.isEmpty()) {
          throw new IllegalArgumentException("Estado não pode ser nulo ou vazio");
      }
      if (cidade.equals(null) || cidade.isEmpty()) {
          throw new IllegalArgumentException("Cidade não pode ser nula ou vazia");
      }
      if (cep.equals(null) || cep.isEmpty()) {
          throw new IllegalArgumentException("CEP não pode ser nulo ou vazio");
      }
      if (rua.equals(null) || rua.isEmpty()) {
          throw new IllegalArgumentException("Rua não pode ser nula ou vazia");
      }
      if (numero.equals(null) || numero.isEmpty()) {
          throw new IllegalArgumentException("Número não pode ser nulo ou vazio");
      }

      this.setEstado(estado);;
      this.setCidade(cidade);;
      this.setCep(cep);;
      this.setRua(rua);;
      this.setNumero(numero);;
      this.setComplemento(complemento);;
      this.setObservacao(observacao);;
  }

  // Getters e Setters
  public String getEstado() {
      return estado;
  }

  public void setEstado(String estado) {
      this.estado = estado;
  }

  public String getCidade() {
      return cidade;
  }

  public void setCidade(String cidade) {
      this.cidade = cidade;
  }

  public String getCep() {
      return cep;
  }

  public void setCep(String cep) {
      this.cep = cep;
  }

  public String getRua() {
      return rua;
  }

  public void setRua(String rua) {
      this.rua = rua;
  }

  public String getNumero() {
      return numero;
  }

  public void setNumero(String numero) {
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
}
