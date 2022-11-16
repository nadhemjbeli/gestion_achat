package com.example.test.Repositories;

import com.example.test.entity.Operateur;
import com.example.test.entity.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReglementRepository extends JpaRepository<Reglement, Long> {
}
