package com;

import java.util.ArrayList;

import com.pessoa.Cliente;

/*
 * Aqui vai as funções de manipulação do banco de dados (adicionar, remover e pesquisar).
 * Author: Janderson Mota
 */

public interface Entidade {
  public static final ArrayList<Cliente> clientes = new ArrayList<>();

  // ADD
  public String addCliente(String nome) {
    if (compararObjetos(nome)) {
      return "Adicionado um novo Cliente!";
    } else {
      return "Erro ao adicionar o Cliente.";
    }    
  }

  // REMOVER

  // PESQUISAR

  public Boolean compararObjetos(String obj) {
    if(obj == clientes) {
      return false;
    } else {
      return true;
    }
  }  
}
