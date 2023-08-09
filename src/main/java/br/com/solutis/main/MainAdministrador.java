package br.com.solutis.main;

import br.com.solutis.model.Administrador;

public class MainAdministrador {

    public static void main(String[] args) {

        var admin = new Administrador("Mateus", "Rua X", "12345678901", 1, 5000, 9, 300);

        System.out.println(admin.toString());
    }

}
