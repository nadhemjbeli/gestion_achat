package com.example.test.Repositories;

import com.example.test.entity.DetailFacture;
import com.example.test.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
