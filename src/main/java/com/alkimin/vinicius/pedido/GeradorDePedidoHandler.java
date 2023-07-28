package com.alkimin.vinicius.pedido;

import com.alkimin.vinicius.orcamento.Orcamento;
import com.alkimin.vinicius.pedido.acao.AcaoAposPedidoCriado;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
public class GeradorDePedidoHandler {

    //@Autowired
    //construtor com injecao de dependências: repository, service e etc ...

    public List<AcaoAposPedidoCriado> acaoAposPedidoCriadoList;

    public void executar(GeradorDePedido geradorDePedido) {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"), geradorDePedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geradorDePedido.getCliente(), LocalDateTime.now(), orcamento);

        acaoAposPedidoCriadoList.forEach(
                a -> a.executarAcao(pedido)
        );
    }
}
