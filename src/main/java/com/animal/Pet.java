package com.animal;

import com.pessoa.Cliente;

/*
 * Cadastro do animal de estimação (pet).
 * Author: Janderson Mota
 */

public class Pet {
  private Cliente tutor;
  private String registroAnimal;
  private String nome;
  private String especie;
  private String raca;
  private String tipoSanguineo;
  private String dataNascimento;
  private String nacionalidade;
  private String naturalidade;
  private String sexo;
  private String cor;
  private String nomePai;
  private String nomeMae;
  private String observacao;

  public Cliente getTutor() {
    return tutor;
  }

  public void setTutor(Cliente tutor) {
    this.tutor = tutor;
  }

  public String getRegistroAnimal() {
    return registroAnimal;
  }

  public void setRegistroAnimal(String registroAnimal) {
    if ((registroAnimal.equals(null) || registroAnimal.isEmpty())) {
      throw new IllegalArgumentException("Informe o campo obrigatório.");
    }
    this.registroAnimal = registroAnimal;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if((nome.equals(null) || nome.isEmpty())) {
      throw new IllegalArgumentException("Informe o campo obrigatório.");
    }
    this.nome = nome;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    if((especie.equals(null) || especie.isEmpty())) {
      throw new IllegalArgumentException("Informe o campo obrigatório.");
    }
    this.especie = especie;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    if((raca.equals(null) || raca.isEmpty())) {
      throw new IllegalArgumentException("Informe o campo obrigatório.");
    }
    this.raca = raca;
  }

  public String getTipoSanguineo() {
    return tipoSanguineo;
  }

  public void setTipoSanguineo(String tipoSanguineo) {
    this.tipoSanguineo = tipoSanguineo;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
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

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    if((sexo.equals(null) || sexo.isEmpty())) {
      throw new IllegalArgumentException("Informe o campo obrigatório.");
    }
    this.sexo = sexo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    if((cor.equals(null) || cor.isEmpty())) {
      throw new IllegalArgumentException("Informe o campo obrigatório.");
    }
    this.cor = cor;
  }

  public String getNomePai() {
    return nomePai;
  }

  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  public String getNomeMae() {
    return nomeMae;
  }

  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public String toString() {
    return "Animal{" + 
    "tutor='" + this.tutor.getNomeCompleto() + '\'' + 
    ", nome='" + this.nome + '\'' +
    ", especie='" +this.especie + '\'' +
    ", raça='" + this.raca + '\'' +
    ", tipo sanguineo='" + this.tipoSanguineo + '\'' +
    ", data de nascimento='" + this.dataNascimento + '\'' +
    ", nacionalidade='" + this.nacionalidade + '\'' +
    ", naturalidade='" + this.naturalidade + '\'' +
    ", sexo='" + this.sexo + '\'' +
    ", cor='" + this.cor + '\'' +
    ", nome do pai='" + this.nomePai + '\''+
    ", nome da mae='" + this.nomeMae + '\'' +
    ", observacao='" + this.observacao + '\'' +
    "}";
  }

  // Métodos getters e setters omitidos para brevidade

  /*public static void main(String[] args) {
      try {
          Pet pet = new Pet("123456", "Max", "Labrador", "A+", "01/01/2020", "Brasil", "São Paulo", "Macho",
                  "Preto", "Rex", "Luna", "Cachorro brincalhão");
          System.out.println("Pet criado com sucesso!");
      } catch (IllegalArgumentException e) {
          System.out.println("Erro ao criar pet: " + e.getMessage());
      }
  }*/
}

