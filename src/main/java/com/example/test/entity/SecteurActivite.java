package com.example.test.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;

    @ManyToMany
    private Set<Fournisseur> fournisseurs = new HashSet<>();

}
