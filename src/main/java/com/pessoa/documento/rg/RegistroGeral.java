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

    public void setNumero(String numero) {
        if (!validarNumeroRG(numero)) {
            throw new IllegalArgumentException("Número de RG inválido");
        } else {
            this.numero = numero;
        }
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        if (orgaoEmissor == null || orgaoEmissor.isEmpty()) {
            throw new IllegalArgumentException("Órgão emissor não pode estar vazio");
        } else {
            this.orgaoEmissor = orgaoEmissor;
        }
    }

    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Date dataExpedicao) {
        if (dataExpedicao == null) {
            throw new IllegalArgumentException("Data de expedição não pode ser nula");
        } else {
            this.dataExpedicao = dataExpedicao;
        }
    }

    @Override
    public String toString() {
        return "RegistroGeral{" +
                "numero='" + this.numero + '\'' +
                ", orgaoEmissor='" + this.orgaoEmissor + '\'' +
                ", dataExpedicao=" + this.dataExpedicao +
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
