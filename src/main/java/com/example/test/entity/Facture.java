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
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idFacture;

    private float montantRemise;
    private float montantFacture;

    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDernireModification;
    private boolean archivee;


    @OneToMany(mappedBy="facture")
    private Set<DetailFacture> detailFactures;
    @OneToMany(mappedBy="facture")
    private Set<Reglement> reglements;

    @ManyToOne
    private Fournisseur fournisseur;

}
