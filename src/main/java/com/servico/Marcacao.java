package com.servico;

import java.time.LocalDate;
import java.time.LocalTime;

import com.animal.Pet;
import com.pessoa.Cliente;
import com.pessoa.Veterinario;

/*
 * A consulta pode ser marcada pelo cliente ou pelo funcionario.
 * Author: Janderson Mota
 */

public class Marcacao {
  private LocalDate dataHora;
  private String registroDoTempo;
  private Cliente cliente;
  private Pet animal;
  private Veterinario veterinario;
  private String tipoServico;
  private TempoDataHora agendarDataHora;
  private String data;
  private String hora;

  public Marcacao() {
    this.agendarDataHora = new TempoDataHora();
  }
  
  public LocalDate getDataHora() {
    return dataHora;
  }

  public String getRegistroDoTempo() {
    return registroDoTempo;
  }

  public void setRegistroDoTempo(TempoDataHora dh) {
    this.registroDoTempo = dh.dataEHoraLocal();
  }
    
  public Cliente getCliente() {
    return cliente;
  }
    
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
    
  public Pet getAnimal() {
    return animal;
  }
    
  public void setAnimal(Pet animal) {
    this.animal = animal;
  }
    
  public Veterinario getVeterinario() {
    return veterinario;
  }
    
  public void setVeterinario(Veterinario veterinario) {
    this.veterinario = veterinario;
  }
    
  public String getTipoServico() {
    return tipoServico;
  }
    
  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }

  public String getData() {
    return data;
  }

  public void setData(int dia, int mes, int ano) throws Exception {
    /*if (dia == null || mes == null || ano == null) {
      throw new Exception("Data não pode ser vazio.");
    }*/

    this.dataHora = LocalDate.parse(this.agendarDataHora.agendaData(dia, mes, ano));
    
    if(validarDataAgendamento()) {
      this.data = this.agendarDataHora.agendaData(dia, mes, ano);
    }

  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    if(validarHorarioAgendamento(hora)) {
      this.hora = hora;
    }
  }

  public boolean validarDataAgendamento() {

    if (this.dataHora.getDayOfWeek().getValue() >= 6) { // 6 = sábado, 7 = domingo
      throw new IllegalArgumentException("Não é possível agendar serviços para os fins de semana.");
    }

    return true;
  }

  public boolean validarHorarioAgendamento(String hora) {

    LocalTime horario = LocalTime.parse(hora);
    int horaDoAgendamento = horario.getHour();
    if (horaDoAgendamento < 8 || horaDoAgendamento >= 18) {
      throw new IllegalArgumentException("Os agendamentos só podem ser feitos entre as 8h e as 18h.");
    }

    return true;
  }

  @Override
  public String toString() {
    return "\n\nAgendamento{" +
      "data='" + this.data + '\'' +
      ", hora='" + this.hora + '\'' + 
      ", registro='" + this.registroDoTempo + '\'' +
      ", cliente='" + this.cliente.getNomeCompleto() + '\'' +
      ", animal='" + this.animal.getNome() + '\'' +
      ", veterinário='" + this.veterinario.getNomeCompleto() + '\'' +
      ", tipo de serviço='" + this.tipoServico + '\'' +
      "}";
  }
}
