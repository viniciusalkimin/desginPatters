package com.alkimin.vinicius.orcamento;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
public class Orcamento {

    @Getter
    private BigDecimal valor;
}
