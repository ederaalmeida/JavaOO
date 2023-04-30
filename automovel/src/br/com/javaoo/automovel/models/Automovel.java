package br.com.javaoo.automovel.models;

public class Automovel {

    private String marca;
    private int ano;
    private String cor;
    private double imposto;

    public double getImposto() {
        return imposto;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double porcentagemImposto() {
        return this.imposto = 0.15;

    }

}