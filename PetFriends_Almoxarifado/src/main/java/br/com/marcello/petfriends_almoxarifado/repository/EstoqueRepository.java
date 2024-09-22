package br.com.marcello.petfriends_almoxarifado.repository;

import br.com.marcello.petfriends_almoxarifado.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

//Esse repositorio fará o Estoque receber os ids do produto e enviará para o ItensPedido.
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
