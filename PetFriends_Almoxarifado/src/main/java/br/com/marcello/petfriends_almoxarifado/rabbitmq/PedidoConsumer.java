package br.com.marcello.petfriends_almoxarifado.rabbitmq;

import br.com.marcello.petfriends_almoxarifado.model.Pedido;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class PedidoConsumer {
    private final ObjectMapper objectMapper;

    @RabbitListener(queues = {"pedidos"})
    public void receive(@Payload String json) {
        try{
            Pedido pedido = objectMapper.readValue(json, Pedido.class);
            log.info("Pedido received: " + pedido);

        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
