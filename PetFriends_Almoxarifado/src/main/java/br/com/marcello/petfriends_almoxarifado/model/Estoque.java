package br.com.marcello.petfriends_almoxarifado.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data // anotação que cria os getters e setters
@AllArgsConstructor@NoArgsConstructor // anotações para criação dos construtores
@Builder
@Table(schema = "Estoques")
@ToString
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estoque")
    private List<ItensPedido> itensEstoque;
    @Embedded
    private Endereco endereco;


}
