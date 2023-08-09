package br.com.solutis.main;

import br.com.solutis.model.Pessoa;

public class MainPessoa {

    public static void main(String[] args) {

        var pessoa = new Pessoa("Mateus", "Rua X", "12345678901");

        System.out.println(pessoa.toString());


    }

}
