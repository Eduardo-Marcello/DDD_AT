package br.com.marcello.petfirends_transporte.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data // anotação que cria os getters e setters
@AllArgsConstructor
@NoArgsConstructor // anotações para criação dos construtores
@Builder
@Table(schema = "Garagens")
@ToString
public class Garagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "garagens")
    private List<VeiculoEntrega> veiculos;
    @Embedded
    private Veiculo veiculo;
}
