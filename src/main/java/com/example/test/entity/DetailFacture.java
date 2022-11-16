package com.example.test.entity;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idDetailFacture;

    private float qteCommande;

    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;

    @ManyToOne
    private Facture facture;


    @ManyToOne
    private Produit produit;
}
