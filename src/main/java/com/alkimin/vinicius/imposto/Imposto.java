package com.alkimin.vinicius.imposto;

import com.alkimin.vinicius.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Imposto {

    private Imposto outro;

    protected BigDecimal calcular(Orcamento orcamento) {
        BigDecimal outroValor = BigDecimal.ZERO;
        if(!(outro == null)) {
            outroValor = outro.calcular(orcamento);
        }
        return efetuarCalculo(orcamento).add(outroValor);
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}
