package com.example.test.Repositories;

import com.example.test.entity.Fournisseur;
import com.example.test.entity.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperateurRepository extends JpaRepository<Operateur, Long> {
}
