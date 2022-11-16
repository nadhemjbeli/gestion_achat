package com.example.test.Repositories;

import com.example.test.entity.DetailFacture;
import com.example.test.entity.DetailFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFournisseurRepository extends JpaRepository<DetailFournisseur, Long> {
}
