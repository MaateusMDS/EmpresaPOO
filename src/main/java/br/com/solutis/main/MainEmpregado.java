package br.com.solutis.main;

import br.com.solutis.model.Empregado;

public class MainEmpregado {

    public static void main(String[] args) {

        var empregado = new Empregado("Mateus", "Rua X", "12345678901", 1, 2500, 5);

        System.out.println(empregado.toString());
    }
}