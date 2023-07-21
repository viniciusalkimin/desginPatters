package com.alkimin.vinicius.desconto;

import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoComValorMaiorQuinhentos(
                new DescontoOrcamentoComMaisDeCincoItens(new SemDesconto()));
        return  desconto.calcular(orcamento);
    }
}
