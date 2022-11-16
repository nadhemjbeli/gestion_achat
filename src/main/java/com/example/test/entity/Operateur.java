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
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idOperateur;
    private String nom;
    private String prenom;
    private String password;

    @OneToMany
    private Set<Facture> factures;

}
