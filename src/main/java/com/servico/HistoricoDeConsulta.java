package com.servico;

import java.util.ArrayList;

/*
 * Consultar histórico do pet.
 * Author: Janderson Mota
 */

public class HistoricoDeConsulta {
  private ArrayList<RegistroMedico> consultasAnteriores = new ArrayList<>();

  public ArrayList<RegistroMedico> getConsultasAnteriores() {
    return consultasAnteriores;
  }

  public void adicionaConsulta(RegistroMedico registroMedicoRealizado) {
    this.consultasAnteriores.add(registroMedicoRealizado);
  }

  public RegistroMedico pesquisaCliente(String cliente) {
    try {
      for (RegistroMedico registroMedico : this.consultasAnteriores) {
        if (registroMedico.getCliente().getNomeCompleto().equals(cliente)) {
          return registroMedico;
        }
      }
    } catch (Exception e) {
      throw new Error(e);
    }
    return null;
  }

  public String toString() {
    return "Histórico de consulta{" + this.consultasAnteriores +
    '}';
  }

}
