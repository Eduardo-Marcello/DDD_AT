package br.com.marcello.petfriends_almoxarifado.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Embeddable
public class Endereco {
    private String cep;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;

}
