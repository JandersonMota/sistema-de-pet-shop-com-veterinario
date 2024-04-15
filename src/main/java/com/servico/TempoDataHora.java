package com.servico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Aqui vai tudo relacionado a data e horaio.
 * Author: Janderson Mota
 */

public class TempoDataHora {

  public String dataEHoraLocal() {

    LocalDateTime agora = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/y h:m:s");
    
    String agoraFormatado = agora.format(formatter);

    return agoraFormatado;

  }

  public String agendaData(int dia, int mes, int ano) {

    LocalDate dataAgendada = LocalDate.of(ano, mes, dia);
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = dataAgendada.format(formatarData);
    return dataFormatada;

  }

  public String agendaHora(int hora, int minuto) {

    LocalTime horaAgendada = LocalTime.of(hora, minuto);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    String agendada = horaAgendada.format(formatter);
    return agendada;

  }

}
