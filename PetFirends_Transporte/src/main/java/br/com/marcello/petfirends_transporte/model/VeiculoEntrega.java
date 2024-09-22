package br.com.marcello.petfirends_transporte.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class VeiculoEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoEntrega;
    private Date dataPartida;
    private Date dataLimiteEntrega;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "garagem_id")
    private Garagem garagem;
}
