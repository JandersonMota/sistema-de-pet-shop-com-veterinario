package com;

import com.animal.Pet;
import com.endereco.Endereco;
import com.pessoa.Cliente;
import com.pessoa.Veterinario;
import com.pessoa.documento.rg.CadastroDePessoaFisica;
import com.servico.AgendamentoServico;
import com.servico.HistoricoDeConsulta;
import com.servico.Marcacao;
import com.servico.RegistroMedico;
import com.servico.TempoDataHora;

public class App {
  public static void main(String[] args) throws Exception {
    
    //throw new RuntimeException("Equipe de desenvolvimento será informada!");

    // Cadastro do cliente 01
    Cliente cli = new Cliente("João da Silva", "75988235733");
    cli.setDataNascimento("05/05/2001");
    cli.setNacionalidade("Brasileiro");
    cli.setNaturalidade("Feira de Santana");

    Endereco e = new Endereco("Bahia", "Salvador", "12345678", "Pituba", "1003", "Casa do fundo", "Próximo ao bar nobre");

    cli.setEndereco(e);
    cli.setEmail("MundoDev@gmail.com");

    CadastroDePessoaFisica cpf = new CadastroDePessoaFisica("40023588012");

    cli.setCpf(cpf);

    // Cadastro do cliente 02
    Cliente cli2 = new Cliente("Bia Machado", "73999023150");
    
    Endereco e2 = new Endereco("Bahia", "Xique-Xique", "76146773", "Dorada", "14B", "Apartamento", "Quadra 3");
    
    cli2.setEndereco(e2);
    cli2.setEmail("bia.machado@gmail.com");
    
    CadastroDePessoaFisica cpf2 = new CadastroDePessoaFisica("23782254074");
    
    cli2.setCpf(cpf2);

    // Cadastro do cliente 03
    Cliente cli3 = new Cliente("Elena Xavier", "71989915120");

    System.out.println("Quantidade de cliente cadastrado: " + Cliente.getNumeroDeClientes());
    System.out.println("\n[DADOS DO CLIENTE]: \n" + cli.toString());

    // Cadastro do veterinário
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
    System.out.println("\n[DADOS DO VETERINÁRIO]: \n" + vet.toString());

    // Cadastro do pet 01
    Pet pet = new Pet();
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

    // Cadastro do pet 02
    Pet pet2 = new Pet();
    pet2.setTutor(cli2);
    pet2.setRegistroAnimal("B3329");
    pet2.setNome("Bolinha");
    pet2.setEspecie("Gato");
    pet2.setRaca("Siamês");
    pet2.setTipoSanguineo("O-");
    pet2.setDataNascimento("21/07/2018");
    pet2.setNacionalidade("brasileiro");
    pet2.setNaturalidade("São Paulo");
    pet2.setSexo("F");
    pet2.setCor("marrom e preta");
    pet2.setNomePai("Bile");
    pet2.setNomeMae("Mille");
    pet2.setObservacao("Gato valente");

    System.out.println("\n==========================================================================================");
    System.out.println("\n[DADOS DO PET]: \n" + pet);

    // Cliente agendando consulta com data e horário específico
    Marcacao agendandoConsulta = new Marcacao();
    TempoDataHora dh = new TempoDataHora();
    //agendandoConsulta.setData(26, 06, 2024);
    agendandoConsulta.setRegistroDoTempo(dh);
    agendandoConsulta.setCliente(cli);
    agendandoConsulta.setAnimal(pet);
    agendandoConsulta.setVeterinario(vet);
    agendandoConsulta.setTipoServico("Consulta");

    System.out.println("\n==========================================================================================");
    System.out.println("[AGENDANDO]: \n" + agendandoConsulta.toString());

    // Agenda com todos os clientes agendados
    AgendamentoServico agendaDeCliente = new AgendamentoServico();
    agendaDeCliente.adicionaMarcarConsulta(agendandoConsulta);

    System.out.println("\n==========================================================================================");
    //System.out.println("Agendamento de Servico: " + agendandoConsulta.toString());
    System.out.println("Data: " + agendandoConsulta.getData());

    // Cadastro do registro médico
    RegistroMedico regMed = new RegistroMedico(pet, cli, vet, "Suplemento Vitz Pet Ômega 3", "01 Cápsulas", "24 h");
    RegistroMedico regMed11 = new RegistroMedico(pet, cli, vet, "Probiótico Pet para Cães e Gatos", "4 g", "24 h");
    RegistroMedico regMed2 = new RegistroMedico(pet2, cli2, vet, "Vacina antirrábica", "1 mL", "3 anos");
    
    System.out.println("\n==========================================================================================");
    System.out.println("[REGISTRO MEDICO]: \n" + regMed.toString());

    // Historico de consulta médica
    HistoricoDeConsulta consultarHistorico = new HistoricoDeConsulta();
    consultarHistorico.adicionaConsulta(regMed);
    consultarHistorico.adicionaConsulta(regMed11);
    consultarHistorico.adicionaConsulta(regMed2);

    System.out.println("\n==========================================================================================");
    System.out.println("[HISTÓRICO DE CONSULTA]: \n" + consultarHistorico.getConsultasAnteriores());
  
    // Pesquisa
    System.out.println("\n==========================================================================================");
    System.out.println("[PESQUISA]: \n" + consultarHistorico.pesquisaCliente("João da Silva"));
  }
  
}
