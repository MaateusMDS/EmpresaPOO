package br.com.solutis.main;

import br.com.solutis.model.Vendedor;

public class MainVendedor {

    public static void main(String[] args) {

        var vendedor = new Vendedor("Mateus", "Rua X", "12345678901", 1, 1400, 5, 10000, 10);

        System.out.println(vendedor.toString());
    }

}
