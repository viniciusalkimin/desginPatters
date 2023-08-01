package com.alkimin.vinicius;

import com.alkimin.vinicius.desconto.CalculadoraDeDesconto;
import com.alkimin.vinicius.orcamento.ItemPedido;
import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        ItemPedido itemPedido = new ItemPedido(new BigDecimal("200"));

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(itemPedido);

        BigDecimal desconto = calculadoraDeDesconto.calcular(orcamento);

        System.out.println(desconto);

        orcamento.aplicarDescontoExtra();

        System.out.println(orcamento.getValor());

        orcamento.aprovar();
        orcamento.aplicarDescontoExtra();
        System.out.println(orcamento.getValor());

    }
}