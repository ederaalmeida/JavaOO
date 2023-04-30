package br.com.javaoo.automovel.applications;

import br.com.javaoo.automovel.models.Carro;
import br.com.javaoo.automovel.models.Moto;
import br.com.javaoo.automovel.models.Tributos;

public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setAno(2009);
        carro.setCor("preto");
        carro.setPeso(1000);
        carro.setValor(32000);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setAno(2009);
        moto.setCor("preto");
        moto.setPeso(1000);
        moto.setValor(18000);

        Tributos t = new Tributos();
        t.valorImposto(moto);
        System.out.println("Valor do Moto: "
                + moto.getValor() + "\n");

        t.valorImposto(carro);
        System.out.println("Valor do Carro: "
                + carro.getValor());

    }
}
