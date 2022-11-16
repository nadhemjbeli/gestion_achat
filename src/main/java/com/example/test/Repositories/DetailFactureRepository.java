package com.example.test.Repositories;

import com.example.test.entity.CategorieProduit;
import com.example.test.entity.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepository extends JpaRepository<DetailFacture, Long> {
}
