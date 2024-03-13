package com.pessoa;

/*
 * Cadastro do cliente.
 * Author: Janderson Mota
 */

public class Cliente extends Pessoa {
  private boolean whatsapp;
  private boolean telegram;

  public boolean isWhatsapp() {
    return whatsapp;
  }

  public void setWhatsapp(boolean whatsapp) {
    this.whatsapp = whatsapp;
  }

  public boolean isTelegram() {
    return telegram;
  }

  public void setTelegram(boolean telegram) {
    this.telegram = telegram;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "nome='" + super.getNomeCompleto() + '\'' +
        ", endereco='" + super.getEndereco() + '\'' +
        ", telefone='" + super.getTelefone() + '\'' +
        ", email='" + super.getEmail() + '\'' +
        ", cpf='" + super.getCpf() + '\'' +
        '}';
  }

  /*public static void main(String[] args) {
    try {
        
    } catch (Exception e) {
        System.out.println("Erro ao criar cliente: " + e.getMessage());
    }
  }*/
}