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

    Cliente cli = new Cliente();
    cli.setNomeCompleto("João da Silva");
    cli.setDataNascimento("05/05/2001");
    cli.setNacionalidade("Brasileiro");
    cli.setNaturalidade("Feira de Santana");

    Endereco e = new Endereco();
    e.setEstado("Bahia");
    e.setCidade("Salvador");
    e.setCep("12345678");
    e.setRua("Pituba");
    e.setNumero("1003");
    e.setComplemento("Casa do fundo");
    e.setObservacao("Próximo ao bar nobre");

    cli.setEndereco(e);
    cli.setTelefone("75988235733");
    cli.setEmail("MundoDev@gmail.com");

    CadastroDePessoaFisica cpf = new CadastroDePessoaFisica("40023588012");

    cli.setCpf(cpf);

    Cliente cli2 = new Cliente();
    cli2.setNomeCompleto("Bia");
    Cliente cli3 = new Cliente();
    cli3.setNomeCompleto("Elena");

    System.out.println("Quantidade de cliente cadastrado: " + Cliente.getNumeroDeClientes());
    System.out.println("\nDados do cliente: \n" + cli.toString());

    Veterinario vet = new Veterinario();
    vet.setNomeCompleto("Duarte de Jesus");
    vet.setDataNascimento("12/05/1990");
    vet.setNacionalidade("Canadense");
    vet.setNaturalidade("Vancouver");

    Endereco  eVet = new Endereco();
    eVet.setEstado("Bahia");
    eVet.setCidade("Santo Antônio de Jesus");
    eVet.setCep("02020202");
    eVet.setRua("Rua Chile");
    eVet.setNumero("325");
    eVet.setComplemento("Prédio");
    eVet.setObservacao("Próximo a Loucademia de Polícia");
    
    vet.setEndereco(eVet);
    vet.setTelefone("7785555555");
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
