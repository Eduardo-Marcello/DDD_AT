package br.com.marcello.petfriends_pedido.repository;

import br.com.marcello.petfriends_pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
