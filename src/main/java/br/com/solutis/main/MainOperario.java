package br.com.solutis.main;

import br.com.solutis.model.Operario;

public class MainOperario {

    public static void main(String[] args) {

        var operario = new Operario("Mateus", "Rua X", "12345678901", 1, 1400, 5, 10000, 10);

        System.out.println(operario.toString());
    }

}
