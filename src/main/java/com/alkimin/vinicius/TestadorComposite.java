package com.alkimin.vinicius;

import com.alkimin.vinicius.desconto.CalculadoraDeDesconto;
import com.alkimin.vinicius.orcamento.ItemPedido;
import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestadorComposite {

    public static void main(String[] args) {

        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemPedido(new BigDecimal("200")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(orcamentoAntigo);
        orcamentoNovo.adicionarItem(new ItemPedido(new BigDecimal("500")));

        System.out.println(orcamentoNovo.getValor());

    }
}
