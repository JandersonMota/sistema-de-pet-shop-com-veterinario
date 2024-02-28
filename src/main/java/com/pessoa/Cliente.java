package com.pessoa;

/*
 * Cadastro do cliente.
 * Author: Janderson Mota
 */

public class Cliente {
  
  public Cliente(String endereco) throws IllegalArgumentException {}

  @Override
  public String toString() {
    return "Cliente{" +
        "nome='" + nome + '\'' +
        ", endereco='" + endereco + '\'' +
        ", telefone='" + telefone + '\'' +
        ", email='" + email + '\'' +
        '}';
  }

  /*public static void main(String[] args) {
    try {
        
    } catch (Exception e) {
        System.out.println("Erro ao criar cliente: " + e.getMessage());
    }
  }*/
}

