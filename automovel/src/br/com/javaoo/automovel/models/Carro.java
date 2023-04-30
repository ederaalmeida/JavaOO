package br.com.javaoo.automovel.models;

public class Carro extends Automovel {

    private double peso;
    private double valor;

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double porcentagemImposto() {
        return this.valor * 0.05;
    }

}
