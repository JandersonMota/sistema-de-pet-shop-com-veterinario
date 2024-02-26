package com.pessoa.documento.rg;

public class RegistroGeral {
  private String numero;
  private String nome;
  private String dataNascimento;
  
  public RegistroGeral(String numero, String nome, String dataNascimento) throws IllegalArgumentException {
      if(numero.equals(null) || numero.isEmpty()) {
          throw new IllegalArgumentException("Número do RG não pode ser nulo ou vazio");
      }
      if(nome.equals(null) || nome.isEmpty()) {
          throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
      }
      if(dataNascimento.equals(null) || dataNascimento.isEmpty()) {
          throw new IllegalArgumentException("Data de nascimento não pode ser nula ou vazia");
      }
      
      this.setNumero(numero);
      this.setNome(nome);
      this.setDataNascimento(dataNascimento);
  }
  
  // Métodos getters e setters
  public String getNumero() {
      return numero;
  }

  public void setNumero(String numero) {
      this.numero = numero;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getDataNascimento() {
      return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
      this.dataNascimento = dataNascimento;
  }
  
  // Método toString para representação textual do RegistroGeral
  @Override
  public String toString() {
      return "\n\nRegistroGeral [Número=" + numero + ", Nome=" + nome + ", Data de Nascimento=" + dataNascimento + "]\n";
  }
}
