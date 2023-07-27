package com.alkimin.vinicius.orcamento.estado;

import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends EstadoPedido  {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setEstadoPedido(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setEstadoPedido(new Reprovado());
    }
}
