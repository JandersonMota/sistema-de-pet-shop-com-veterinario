package com.servico;

import java.util.ArrayList;

/*
 * Aqui vai todos os serviços marcados.
 * Author: Janderson Mota
*/

public class AgendamentoServico {

  private ArrayList<Marcacao> listaDeAgendamentos = new ArrayList<>(); //Lista de agendamentos do cliente

  public ArrayList<Marcacao> getListaDeAgendamentos() {
    return listaDeAgendamentos;
  }

  public void adicionaMarcarConsulta(Marcacao consultaMarcada) {
    this.listaDeAgendamentos.add(consultaMarcada);
  }

  public void removeMarcaConsulta(Marcacao consultaRemovida) {
    this.listaDeAgendamentos.remove(consultaRemovida);
  }

  @Override
  public String toString() {
    return "" + this.listaDeAgendamentos;
  }

}
