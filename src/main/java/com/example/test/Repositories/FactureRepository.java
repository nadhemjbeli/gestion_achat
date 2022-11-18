package com.example.test.Repositories;


import com.example.test.entity.Facture;
import com.example.test.entity.Fournisseur;

import java.util.List;

public interface FactureRepository extends BaseRepository<Facture, Long> {
    List<Facture> getFacturesByFournisseur(Fournisseur fournisseur);
}
