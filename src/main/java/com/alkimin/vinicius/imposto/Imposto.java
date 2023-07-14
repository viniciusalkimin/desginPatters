package com.alkimin.vinicius.imposto;

import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);
}
