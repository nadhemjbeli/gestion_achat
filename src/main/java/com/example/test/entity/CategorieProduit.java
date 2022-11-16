package com.example.test.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idProduit;
    private String codeCategorieProduit;
    private String libelleCategorieProduit;

    @OneToMany(mappedBy="categorieProduit")
    private Set<Produit> produits;
}
