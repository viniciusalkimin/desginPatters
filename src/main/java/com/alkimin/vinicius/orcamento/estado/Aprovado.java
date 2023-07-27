package com.alkimin.vinicius.orcamento.estado;

import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends EstadoPedido {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoPedido(new Finalizado());
    }
}
