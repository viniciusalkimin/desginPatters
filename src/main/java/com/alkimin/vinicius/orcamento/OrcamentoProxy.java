package com.alkimin.vinicius.orcamento;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;


public class OrcamentoProxy extends Orcamento{

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public BigDecimal getValor() {
        if(valor == null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }

}
