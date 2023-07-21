package com.alkimin.vinicius;

import com.alkimin.vinicius.desconto.CalculadoraDeDesconto;
import com.alkimin.vinicius.desconto.Desconto;
import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(new BigDecimal("622"), 4);

        BigDecimal desconto = calculadoraDeDesconto.calcular(orcamento);

        System.out.println(desconto);

    }
}