package com;

import com.animal.Pet;
import com.endereco.Endereco;
import com.pessoa.Cliente;
import com.pessoa.Veterinario;
import com.pessoa.documento.rg.CadastroDePessoaFisica;
import com.servico.AgendamentoServico;
import com.servico.Marcacao;
import com.servico.RegistroMedico;
import com.servico.TempoDataHora;

public class App {
  public static void main(String[] args) throws Exception {
    
    //throw new RuntimeException("Equipe de desenvolvimento será informada!");

    Cliente cli = new Cliente("João da Silva", "75988235733");
    cli.setDataNascimento("05/05/2001");
    cli.setNacionalidade("Brasileiro");
    cli.setNaturalidade("Feira de Santana");

    Endereco e = new Endereco("Bahia", "Salvador", "12345678", "Pituba", "1003", "Casa do fundo", "Próximo ao bar nobre");

    cli.setEndereco(e);
    cli.setEmail("MundoDev@gmail.com");

    CadastroDePessoaFisica cpf = new CadastroDePessoaFisica("40023588012");

    cli.setCpf(cpf);

    Cliente cli2 = new Cliente("Bia", "73999023150");
    Cliente cli3 = new Cliente("Elena", "71989915120");

    System.out.println("Quantidade de cliente cadastrado: " + Cliente.getNumeroDeClientes());
    System.out.println("\nDados do cliente: \n" + cli.toString());

    Veterinario vet = new Veterinario("Duarte de Jesus", "7785555555");
    vet.setDataNascimento("12/05/1990");
    vet.setNacionalidade("Canadense");
    vet.setNaturalidade("Vancouver");

    Endereco  eVet = new Endereco("Bahia", "Santo Antônio de Jesus", "02020202", "Rua Chile", "325", "Prédio", "Próximo a Loucademia de Polícia");
    
    vet.setEndereco(eVet);
    vet.setEmail("duarte.jesus@gmail.com");

    CadastroDePessoaFisica cpfVet = new CadastroDePessoaFisica("83314810032");

    vet.setCpf(cpfVet);

    System.out.println("\n==========================================================================================");
    System.out.println("\nDados do veterinário: \n" + vet.toString());

    Pet  pet = new Pet();
    pet.setTutor(cli);
    pet.setRegistroAnimal("A100");
    pet.setNome("Caramelo");
    pet.setEspecie("Cachorro");
    pet.setRaca("viralata");
    pet.setTipoSanguineo("A+");
    pet.setDataNascimento("01/02/2020");
    pet.setNacionalidade("brasileiro");
    pet.setNaturalidade("Rio de Janeiro");
    pet.setSexo("M");
    pet.setCor("marrom");
    pet.setNomePai("Bob");
    pet.setNomeMae("Jane");
    pet.setObservacao("Gangue do maluco");

    System.out.println("\n==========================================================================================");
    System.out.println("\nDados do animal: \n" + pet);

    Marcacao agendandoConsulta = new Marcacao();
    TempoDataHora dh = new TempoDataHora();
    agendandoConsulta.setData(26, 06, 2024);
    agendandoConsulta.setRegistroDoTempo(dh);
    agendandoConsulta.setCliente(cli);
    agendandoConsulta.setAnimal(pet);
    agendandoConsulta.setVeterinario(vet);
    agendandoConsulta.setTipoServico("Consulta");

    System.out.println("\n==========================================================================================");
    System.out.println(agendandoConsulta.toString());

    AgendamentoServico agendaDeCliente = new AgendamentoServico();
    agendaDeCliente.adicionaMarcarConsulta(agendandoConsulta);

    System.out.println("\n==========================================================================================");
    //System.out.println("Agendamento de Servico: " + agendandoConsulta.toString());
    System.out.println("Data: " + agendandoConsulta.getData());

    RegistroMedico regMed = new RegistroMedico(pet, cli, vet, "Suplemento Vitz Pet Ômega 3", "01 Cápsulas", "24 h");
    
    System.out.println("\n==========================================================================================");
    System.out.println("[TESTE]: \n" + regMed.toString());

  }
  
}
