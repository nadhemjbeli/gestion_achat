package com.example.test.ServiceInterface;


import com.example.test.entity.Facture;
import com.example.test.entity.Fournisseur;
import com.example.test.entity.Produit;

import java.util.List;

public interface FactureServiceInterface extends BaseServiceInterface<Facture, Long>{

    Facture addFacture(Facture facture, Long idfournisseur);

    void annulerFacture(Long id);

    List<Facture> getFacturesByFournisseur(Long idfournisseur);

}