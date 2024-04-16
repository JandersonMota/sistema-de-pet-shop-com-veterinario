package com.servico;

import com.animal.Pet;
import com.pessoa.Cliente;
import com.pessoa.Veterinario;

public class RegistroMedico {
  private String medicamento;
  private String dosagem;
  private String frequenciaDaDosagem;
  private Pet pet;
  private Cliente cliente;
  private Veterinario veterinario;

  public RegistroMedico(Pet pet, Cliente cliente, Veterinario veterinario, String medicamento, String dosagem, String frequenciaDaDosagem) {
    this.pet = pet;
    this.cliente = cliente;
    this.veterinario = veterinario;
    this.medicamento = medicamento;
    this.dosagem = dosagem;
    this.frequenciaDaDosagem = frequenciaDaDosagem;   
  }

  public String getMedicamento() {
    return medicamento;
  }

  public String getDosagem() {
    return dosagem;
  }

  public String getFrequenciaDaDosagem() {
    return frequenciaDaDosagem;
  }

  public Pet getPet() {
    return pet;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Veterinario getVeterinario() {
    return veterinario;
  }

  public void prescrisaoDoMedicamento() {}

  // Descrição de quaisquer sintomas ou problemas de saúde atuais que o animal esteja enfrentando.
  public void problemaDeSaude() {}

  public void resultadoDeExameETeste() {}

  public String toString() {
    return "Registro Medido{" +
    "Informações do animal:\n" + this.pet +
    "\n\nInformações do Proprietário:\n" + this.cliente +
    "\n\nInformações do Veterinário:\n" +
    "{nome='" + this.veterinario.getNomeCompleto() + '\'' +
    ", telefone='" + this.veterinario.getTelefone() + '\'' +
    ", email='" + this.veterinario.getEmail() + "\'}" +
    "\n\nInformações do Medicamento:\n" +
    "medicamento='" + this.medicamento + '\'' +
    ", dosagem='" + this.dosagem + '\'' +
    ", frequencia de uso='" + this.frequenciaDaDosagem + '\'' +
    "}";
  }
}
