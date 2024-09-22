package br.com.marcello.petfriends_almoxarifado.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ItensPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long produtoId;
    private int quantidade;
    private double preco;
    private Date dataSaida; // data da saída quando o pedido estiver em preparação

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estoque_id")
    private Estoque estoque;

    public ItensPedido(Long produtoId, int quantidade, double preco) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.preco = preco;
        this.dataSaida = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
    }


}
