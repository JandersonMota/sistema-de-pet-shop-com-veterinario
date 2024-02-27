package com.pessoa;

/*
 * Aqui contem dados do cliente que possui em mais de um documento.
 * Author: Janderson Mota
 */

public class Pessoa {
  private String nomeCompleto;
  private String dataNascimento;
  private String naturalidade;
  private String nacionalidade;

  public Pessoa(String nomeCompleto, String dataNascimento, String naturalidade, String nacionalidade) throws Exception {

    setNomeCompleto(nomeCompleto);
    setDataNascimento(dataNascimento);
    setNaturalidade(naturalidade);
    setNacionalidade(nacionalidade);
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) throws Exception {
    if (nomeCompleto.equals(null) || nomeCompleto.isEmpty()) {
      throw new Exception("Nome completo não pode ser vazio.");
    }
    this.nomeCompleto = nomeCompleto;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) throws Exception {
    // Aqui você pode adicionar lógica para validar o formato da data de nascimento, se necessário
    this.dataNascimento = dataNascimento;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  /*public static void main(String[] args) {
    try {
      Pessoa pessoa = new Pessoa("João da Silva", "01/01/2000", "São Paulo", "Brasileiro",
                          "A+", "José da Silva", "Brasileiro", "Maria Oliveira", "Brasileira");

      // Exemplo de como acessar os dados da pessoa
      System.out.println("Nome completo: " + pessoa.getNomeCompleto());
      System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
      System.out.println("Naturalidade: " + pessoa.getNaturalidade());
      System.out.println("Nacionalidade: " + pessoa.getNacionalidade());
      System.out.println("Tipo sanguíneo: " + pessoa.getTipoSanguineo());
      System.out.println("Nome completo do pai: " + pessoa.getNomeCompletoPai());
      System.out.println("Nacionalidade do pai: " + pessoa.getNacionalidadePai());
      System.out.println("Nome completo da mãe: " + pessoa.getNomeCompletoMae());
      System.out.println("Nacionalidade da mãe: " + pessoa.getNacionalidadeMae());
    } catch (Exception e) {
      System.out.println("Erro ao criar pessoa: " + e.getMessage());
    }
  }*/
}
