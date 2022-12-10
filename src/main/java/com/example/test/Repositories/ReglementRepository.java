package com.example.test.Repositories;

import com.example.test.entity.Operateur;
import com.example.test.entity.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ReglementRepository extends JpaRepository<Reglement, Long> {
    @Query("select sum(r.montantPaye) from Reglement r where r.facture.archivee = false and r.dateReglement between :st and :en")
    float findCA(@Param("st") Date startDate,@Param("en") Date endDate);
}
