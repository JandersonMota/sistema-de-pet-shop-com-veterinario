package com.animal;

public class Pet {
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

  public Pet(String registroAnimal, String nome, String especie, String raca, String tipoSanguineo, String dataNascimento,
             String nacionalidade, String naturalidade, String sexo, String cor, String nomePai, String nomeMae,
             String observacao) throws IllegalArgumentException {

    if ((registroAnimal.equals(null) || registroAnimal.isEmpty()) && (nome.equals(null) || nome.isEmpty()) && (especie.equals(null) || especie.isEmpty()) && (raca.equals(null) || raca.isEmpty()) && (sexo.equals(null) || sexo.isEmpty()) && (cor.equals(null) || cor.isEmpty())) {
      throw new IllegalArgumentException("Informe os campos obrigatórios.");
    }

    this.setRegistroAnimal(registroAnimal);
    this.setNome(nomeMae);
    this.setEspecie(especie);
    this.setRaca(raca);
    this.setTipoSanguineo(tipoSanguineo);
    this.setDataNascimento(dataNascimento);
    this.setNacionalidade(nacionalidade);
    this.setNacionalidade(nacionalidade);
    this.setSexo(sexo);
    this.setCor(cor);
    this.setNomePai(nomePai);
    this.setNomeMae(nomeMae);
    this.setObservacao(observacao);
  }

  public String getRegistroAnimal() {
    return registroAnimal;
  }

  public void setRegistroAnimal(String registroAnimal) {
    this.registroAnimal = registroAnimal;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
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
    this.sexo = sexo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
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

