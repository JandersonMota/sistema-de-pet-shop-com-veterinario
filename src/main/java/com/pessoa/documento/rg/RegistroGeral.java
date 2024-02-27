package com.pessoa.documento.rg;

/*
 * Cadastra e valida o RG.
 * Author: Janderson Mota
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class RegistroGeral {
    private String numero;
    private String orgaoEmissor;
    private Date dataExpedicao;

    public RegistroGeral(String numero, String orgaoEmissor, String dataExpedicao) throws IllegalArgumentException {
        // Verifica se o número do RG é válido
        if (!validarNumeroRG(numero)) {
            throw new IllegalArgumentException("Número de RG inválido");
        }
        this.numero = numero;
         
        // Verifica se o órgão emissor é válido
        if (orgaoEmissor == null || orgaoEmissor.isEmpty()) {
            throw new IllegalArgumentException("Órgão emissor não pode estar vazio");
        }
        this.orgaoEmissor = orgaoEmissor;
        
        // Verifica se a data de expedição é válida
        if (dataExpedicao == null) {
            throw new IllegalArgumentException("Data de expedição não pode ser nula");
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            this.dataExpedicao = dateFormat.parse(dataExpedicao);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Data de expedição inválida. Formato correto: dd/MM/yyyy");
        }
    }
     
    // Método para validar o número do RG
    private boolean validarNumeroRG(String numero) {
        // Implementar a lógica de validação aqui
        // Por exemplo, pode verificar o formato do número do RG
        return numero.matches("\\d{9}-\\d{2}");
    }

    public String getNumero() {
        return numero;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    @Override
    public String toString() {
        return "RegistroGeral{" +
                "numero='" + numero + '\'' +
                ", orgaoEmissor='" + orgaoEmissor + '\'' +
                ", dataExpedicao=" + dataExpedicao +
                '}';
    }

    /*public static void main(String[] args) {
        try {
            RegistroGeral rg1 = new RegistroGeral("13863919-13", "Ba", "26/12/2000");
            System.out.println(rg1.toString());
        } catch (Exception e) {
            System.out.println("Erro ao criar pessoa: " + e.getMessage());
        }
    }*/
}
