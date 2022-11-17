package com.example.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;

    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;
    @OneToOne
    private DetailFournisseur detaiFournisseur;

    @ManyToMany(mappedBy ="fournisseurs")
    @JsonIgnore
    private Set<SecteurActivite> secteurActivites = new HashSet<>();

    @OneToMany(mappedBy="fournisseur")
    @JsonIgnore
    List<Facture> factures ;
}
