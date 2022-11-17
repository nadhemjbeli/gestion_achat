package com.example.test.ServiceInterface;


import com.example.test.entity.Facture;
import com.example.test.entity.Fournisseur;
import com.example.test.entity.Produit;

public interface FactureServiceInterface extends BaseServiceInterface<Facture, Long>{

    public Facture addFacture(Facture facture, Long idfournisseur);

    public void annulerFacture(Long id);

}