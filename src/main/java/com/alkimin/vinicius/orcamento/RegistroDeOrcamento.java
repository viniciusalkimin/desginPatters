package com.alkimin.vinicius.orcamento;

import com.alkimin.vinicius.http.HttpAdapter;
import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new RuntimeException("Não é possível registrar orçamentos que não estão finalizados.");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> map = Map.of(
                "valor", orcamento.getValor(),
                "quantidade", orcamento.quantidadeItens()
        );
        httpAdapter.post(url, map);
    }
}
