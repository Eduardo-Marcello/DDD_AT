package br.com.marcello.petfirends_transporte.repository;

import br.com.marcello.petfirends_transporte.model.Garagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GaragemRepository extends JpaRepository<Garagem, Long> {
}
