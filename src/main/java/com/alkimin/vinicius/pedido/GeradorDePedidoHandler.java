package com.alkimin.vinicius.pedido;

import com.alkimin.vinicius.orcamento.ItemPedido;
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

    // Ao aplicar o padrão Command, acabamos aplicando o padrão FACADE no metodo executar()
    // O metodo é onde concentra ações de várias outras classes e entrega uma abstração pro cliente

    public void executar(GeradorDePedido geradorDePedido) {
        ItemPedido itemPedido = new ItemPedido(new BigDecimal("500"));
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(itemPedido);
        Pedido pedido = new Pedido(geradorDePedido.getCliente(), LocalDateTime.now(), orcamento);

        acaoAposPedidoCriadoList.forEach(
                a -> a.executarAcao(pedido)
        );
    }
}
