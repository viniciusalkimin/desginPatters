package com.alkimin.vinicius.orcamento.estado;

import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class EstadoPedido {


    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento não pode ser aprovado.");
    }
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento não pode ser finalizado.");
    }
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento não pode ser reprovado.");
    }
}
