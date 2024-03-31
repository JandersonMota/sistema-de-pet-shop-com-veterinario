package com;

import com.pessoa.Cliente;
import com.pessoa.documento.rg.CadastroDePessoaFisica;

public class App {
  public static void main(String[] args) throws Exception {
    
    //throw new RuntimeException("Equipe de desenvolvimento será informada!");

    Cliente cli = new Cliente();
    cli.setNomeCompleto("João da Silva");
    cli.setDataNascimento("05/05/2001");
    cli.setNacionalidade("Brasileiro");
    cli.setNaturalidade("Salvador");
    cli.setEndereco("Pituba");
    cli.setTelefone("75988235733");
    cli.setEmail("MundoDev@gmail.com");

    Cliente cli2 = new Cliente();
    cli2.setNomeCompleto("OI");
    Cliente cli3 = new Cliente();
    cli3.setNomeCompleto("ola");
    
    //cli.cpf.cpf = new CadastroDePessoaFisica();
    cli.setCpf(new CadastroDePessoaFisica());
    cli.getCpf().setCpf("40023588012");

    //CadastroDePessoaFisica cpfCliente = new CadastroDePessoaFisica();
    //cpfCliente.setCpf("400.235.880-12");

    System.out.println("Quant.: " + Cliente.getNumeroDeClientes());

    System.out.println("\nDados do cliente: \n" + cli.toString());

    //System.out.println("CPF: " + cpfCliente.getCpf());
  }
}
