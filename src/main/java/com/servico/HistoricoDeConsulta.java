package com.servico;

import java.util.ArrayList;

public class HistoricoDeConsulta {
  private ArrayList<RegistroMedico> consultasAnteriores = new ArrayList<>();

  public ArrayList<RegistroMedico> getConsultasAnteriores() {
    return consultasAnteriores;
  }

  public void adicionaConsulta(RegistroMedico registroMedicoRealizado) {
    this.consultasAnteriores.add(registroMedicoRealizado);
  }

  public String toString() {
    return "Histórico de consulta{" + this.consultasAnteriores +
    '}';
  }

}
