package com.example.test.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;
    @OneToOne(mappedBy = "detaiFournisseur")
    private Fournisseur fournisseur;
}
