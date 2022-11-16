package com.example.test.Repositories;

import com.example.test.entity.Operateur;
import com.example.test.entity.SecteurActivite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurActiviteRepository extends JpaRepository<SecteurActivite, Long> {
}
