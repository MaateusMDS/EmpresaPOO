package br.com.solutis.model;

public class Fornecedor extends Pessoa {
    private double valorDivida;
    private double valorCredito;

    public Fornecedor() {

    }

    public Fornecedor(String nome, String endereco, String telefone, double valorDivida, double valorCredito) {
        super(nome, endereco, telefone);
        this.valorDivida = valorDivida;
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor da dívida: " + this.valorDivida + "\nValor do crédito: " + this.valorCredito + "\nSaldo: " + this.obterSaldo() + "\n";
    }

}
