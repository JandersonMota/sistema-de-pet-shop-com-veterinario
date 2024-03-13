package com;

import com.pessoa.Cliente;
import com.pessoa.documento.rg.CadastroDePessoaFisica;

public class App {
  public static void main(String[] args) throws Exception {
    
    //throw new RuntimeException("Equipe de desenvolvimento será informada!");

    Cliente cli = new Cliente();
    cli.setNomeCompleto("Janderson");
    cli.setDataNascimento("26/06/1991");
    cli.setNacionalidade("Brasileiro");
    cli.setNaturalidade("Santo Antônio de Jesus");
    cli.setEndereco("Rua Viriato Lôbo");
    cli.setTelefone("75988567266");
    cli.setEmail("Jandersonyo@gmail.com");
    //cli.setCpf("05261504597");
    
    CadastroDePessoaFisica cpfCliente = new CadastroDePessoaFisica();
    cpfCliente.setCpf("05261504597");

    System.out.println("\nDados do cliente: \n" + cli.toString());
  }
}
