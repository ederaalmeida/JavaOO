package br.com.javaoo.automovel.models;

public class Tributos {
    
private double valorTotal;

    public void valorImposto(Automovel a){
        this.valorTotal = a.porcentagemImposto();
        if(this.valorTotal > 1000){
            System.out.println("IPVA do automovel: " + a.porcentagemImposto());
        }else if(this.valorTotal < 1000){
            System.out.println("IPVA da moto: " + a.porcentagemImposto());
        }
    }
}
