package com.example.test.Repositories;

import com.example.test.entity.CategorieProduit;
import com.example.test.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long> {
}
