package br.com.marcello.petfriends_pedido.rabbitmq;

import br.com.marcello.petfriends_pedido.model.Pedido;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PedidoTransporteProducer {
    private final AmqpTemplate amqpTemplate;
    private final ObjectMapper objectMapper;

    public void sendPedido(Pedido pedido) throws JsonProcessingException {
        amqpTemplate.convertAndSend("pedido-transporte.exc", "pedido-transporte.rk", objectMapper.writeValueAsString(pedido));
    }
}
