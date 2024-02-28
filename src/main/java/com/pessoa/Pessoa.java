package com.pessoa;

/*
 * Aqui contem dados do cliente que possui em mais de um documento.
 * Author: Janderson Mota
 */

public class Pessoa {
  private String nomeCompleto;
  private String dataNascimento;
  private String nacionalidade;
  private String naturalidade;
  private String endereco;
  private String telefone;
  private String email;

  public Pessoa(String nomeCompleto, String dataNascimento, String nacionalidade, String naturalidade, String endereco, String telefone, String email) throws Exception {
    // Verifica se o endereço é válido
    if (endereco == null || endereco.isEmpty()) {
      throw new IllegalArgumentException("Endereço não pode estar vazio");
    }
    this.endereco = endereco;

    // Verifica se o telefone é válido
    if (telefone == null || telefone.isEmpty()) {
      throw new IllegalArgumentException("Telefone não pode estar vazio");
    }
    this.telefone = telefone;

    // Verifica se o email é válido
    if (email == null || email.isEmpty() || !email.contains("@")) {
      throw new IllegalArgumentException("Email inválido");
    }
    this.email = email;

    this.setNomeCompleto(nomeCompleto);
    this.setDataNascimento(dataNascimento);
    this.setNacionalidade(nacionalidade);
    this.setNaturalidade(naturalidade);
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

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
