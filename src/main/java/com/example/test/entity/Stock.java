package com.example.test.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idStock;

    private Integer qte;

    private Integer qteMin;

    private String libelleStock;

    @OneToMany(mappedBy="stock")
    private Set<Produit> produits;

}
