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
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idReglement;

    private float montantPaye;

    private float montantRestant;
    private boolean payee;
    @Temporal(TemporalType.DATE)
    private Date dateReglement;

    @ManyToOne
    private Facture facture;
}
