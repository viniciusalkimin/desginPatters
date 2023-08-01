package com.alkimin.vinicius.orcamento;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class ItemPedido implements Orcavel{

    private BigDecimal valor;

    @Override
    public BigDecimal getValor() {
        return valor;
    }
}
