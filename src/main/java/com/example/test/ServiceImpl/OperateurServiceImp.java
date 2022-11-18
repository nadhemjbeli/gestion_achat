package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.OperateurServiceInterface;
import com.example.test.ServiceInterface.ProduitServiceInterface;
import com.example.test.entity.Facture;
import com.example.test.entity.Operateur;
import com.example.test.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class OperateurServiceImp extends BaseServiceImp<Operateur,Long> implements OperateurServiceInterface {
    @Autowired
    FactureServiceImp factureServiceImp;

    @Override
    @Transactional
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur operateur = this.retrieve(idOperateur) ;
        Facture facture = factureServiceImp.retrieve(idFacture) ;
        Set<Facture> factures = new HashSet<>()   ;
        factures.add(facture) ;
        operateur.setFactures(factures);
        operateur.getFactures().add(facture);
    }
}