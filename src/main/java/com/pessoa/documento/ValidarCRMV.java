package com.pessoa.documento;

import java.util.regex.*;

public class ValidarCRMV {

  public static boolean validarCRMV(String crmv) {
    // Expressão regular para validar o formato do CRMV
    String regex = "^\\d{2}\\.\\d{4}$";

    // Compilar a expressão regular
    Pattern pattern = Pattern.compile(regex);

    // Verificar se o formato do CRMV está correto
    Matcher matcher = pattern.matcher(crmv);

    if (!matcher.matches()) {
      throw new IllegalArgumentException("Formato do CRMV inválido");
    }

    // Verificar se os dígitos após o ponto são válidos
    String[] partes = crmv.split("\\.");
    int estado = Integer.parseInt(partes[0]);
    int numero = Integer.parseInt(partes[1]);

    // Aqui você pode adicionar regras específicas para validar o número de estado e o número do CRMV

    return true; // Se todas as validações passarem, o CRMV é considerado válido
  }

    /*
    public static void main(String[] args) {
        String crmv = "12.3456"; // Exemplo de número de CRMV

        try {
            if (validarCRMV(crmv)) {
                System.out.println("O número de CRMV é válido.");
            } else {
                System.out.println("O número de CRMV é inválido.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }*/
}
