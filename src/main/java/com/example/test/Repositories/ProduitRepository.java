package com.example.test.Repositories;

import com.example.test.entity.Produit;
import com.example.test.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
