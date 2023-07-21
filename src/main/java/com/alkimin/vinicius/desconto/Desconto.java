package com.alkimin.vinicius.desconto;

import com.alkimin.vinicius.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {

    protected Desconto proximo;

    public abstract BigDecimal calcular(Orcamento orcamento);
}
