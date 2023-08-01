package com.alkimin.vinicius;

import com.alkimin.vinicius.imposto.CalculadoraDeImposto;
import com.alkimin.vinicius.imposto.ICMS;
import com.alkimin.vinicius.imposto.ISS;
import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestadorDecorator {

    public static void main(String[] args) {



    Orcamento orcamento = new Orcamento(new BigDecimal("100"),2);

    CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        System.out.println(calculadoraDeImposto.calcular(orcamento, new ICMS(new ISS(null))));
    }
}
