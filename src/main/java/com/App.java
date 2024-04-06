package com;

import com.endereco.Endereco;
import com.pessoa.Cliente;
import com.pessoa.documento.rg.CadastroDePessoaFisica;

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

    CadastroDePessoaFisica cpf = new CadastroDePessoaFisica();
    cpf.setCpf("40023588012");

    cli.setCpf(cpf);

    Cliente cli2 = new Cliente();
    cli2.setNomeCompleto("Bia");
    Cliente cli3 = new Cliente();
    cli3.setNomeCompleto("Elena");

    System.out.println("Quantidade de cliente cadastrado: " + Cliente.getNumeroDeClientes());

    System.out.println("\nDados do cliente: \n" + cli.toString());
  }
}
