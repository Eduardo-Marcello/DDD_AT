package br.com.marcello.petfirends_transporte.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Embeddable
public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String tipoVeiculo;
}
