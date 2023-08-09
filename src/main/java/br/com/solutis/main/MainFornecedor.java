package br.com.solutis.main;

import br.com.solutis.model.Fornecedor;

public class MainFornecedor {

    public static void main(String[] args) {

        var funcionario = new Fornecedor("Mateus", "Rua X", "12345678901", 0, 2300);

        System.out.println(funcionario.toString());
    }

}
