package com.example.test.Repositories;

import com.example.test.entity.Facture;
import com.example.test.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
