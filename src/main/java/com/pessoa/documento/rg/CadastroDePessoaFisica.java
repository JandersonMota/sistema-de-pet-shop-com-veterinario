package com.pessoa.documento.rg;

/*
 * Cadastra e valida o CPF.
 * Author: Janderson Mota
 */

public class CadastroDePessoaFisica {
  private String cpf;

  public CadastroDePessoaFisica(String cpf) throws IllegalArgumentException {
    if (validaCPF(cpf)) {
      this.cpf = cpf;
    } else {
      throw new IllegalArgumentException("CPF inválido");
    }
  }

  public String getCpf() {
    return cpf;
  }

  /*public void setCpf(String cpf) throws IllegalArgumentException {
    if (validaCPF(cpf)) {
      this.cpf = cpf;
    } else {
      throw new IllegalArgumentException("CPF inválido");
    }
  }*/

  private boolean validaCPF(String cpf) {
    if (cpf.equals(null) || cpf.length() != 11) {
      return false;
    }

    // Verifica se todos os caracteres são números
    for (int i = 0; i < cpf.length(); i++) {
      if (!Character.isDigit(cpf.charAt(i))) {
        return false;
      }
    }

    // Verifica se todos os dígitos são iguais
    boolean todosDigitosIguais = true;
    for (int i = 1; i < cpf.length(); i++) {
      if (cpf.charAt(i) != cpf.charAt(0)) {
        todosDigitosIguais = false;
          break;
      }
    }

    if (todosDigitosIguais) {
      return false;
    }

    // Calcula e verifica o dígito verificador
    int soma = 0;
    for (int i = 0; i < 9; i++) {
      soma += (cpf.charAt(i) - '0') * (10 - i);
    }

    int digito1 = 11 - (soma % 11);
    if (digito1 > 9) {
      digito1 = 0;
    }

    if (digito1 != cpf.charAt(9) - '0') {
      return false;
    }

    soma = 0;
    for (int i = 0; i < 10; i++) {
      soma += (cpf.charAt(i) - '0') * (11 - i);
    }

    int digito2 = 11 - (soma % 11);
    if (digito2 > 9) {
      digito2 = 0;
    }

    if (digito2 != cpf.charAt(10) - '0') {
      return false;
    }

    return true;
  }

  /*public static void main(String[] args) {
    try {
      CadastroDePessoaFisica cpf = new CadastroDePessoaFisica("12345678901");
      System.out.println("CPF válido: " + cpf.getCpf());
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }*/
}
