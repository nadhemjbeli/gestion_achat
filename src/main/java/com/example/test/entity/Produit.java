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
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;


    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures;

    @ManyToOne
    private Stock stock;


    @ManyToOne
    private CategorieProduit categorieProduit;



}
