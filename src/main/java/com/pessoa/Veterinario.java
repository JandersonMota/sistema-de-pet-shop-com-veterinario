package com.pessoa;

/*
 * Cadastro do veterinário.
 * Author: Janderson Mota
 */

public class Veterinario extends Pessoa {
  //private String crmv; // CRMV é um número de registro que identifica o veterinário.
  //private String especialidade;
  
  @Override
  public String toString() {
    return "Veterinario{" +
        "nome='" + super.getNomeCompleto() + '\'' +
        ", endereco='" + super.getEndereco() + '\'' +
        ", telefone='" + super.getTelefone() + '\'' +
        ", email='" + super.getEmail() + '\'' +
        ", cpf='" + super.getCpf().getCpf() + '\'' +
        '}';
  }
}
