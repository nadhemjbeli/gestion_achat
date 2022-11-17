package com.example.test.ServiceImpl;

import com.example.test.Repositories.FactureRepository;
import com.example.test.ServiceInterface.FactureServiceInterface;
import com.example.test.ServiceInterface.ProduitServiceInterface;
import com.example.test.entity.DetailFacture;
import com.example.test.entity.Facture;
import com.example.test.entity.Fournisseur;
import com.example.test.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;
import java.util.Set;

@Service
public class FactureServiceImp extends BaseServiceImp<Facture,Long> implements FactureServiceInterface {

    @Autowired
    FactureRepository factureRepositrory ;

    @Autowired
    FournisseurServiceImp fournisseurServiceImp;

    @Autowired
    DetailFactureServiceImp detailFactureServiceImp ;

    @Autowired
    ProduittServiceImp produittServiceImp ;

    @Override
    public Facture addFacture(Facture facture, Long idfournisseur) {
        Fournisseur fournisseur = fournisseurServiceImp.retrieve(idfournisseur) ;
        facture.setFournisseur(fournisseur);
        float montantRemise=0, montant=0;
        Set<DetailFacture> detailFactures;
        detailFactures = new HashSet<>();
        if (facture.getDetailFactures()!=null){
            for( DetailFacture df:facture.getDetailFactures()){
                Produit produit = produittServiceImp.retrieve(df.getProduit().getIdProduit());
                df.setProduit(produit);
                System.out.println(produit.getPrix() * df.getQteCommande());
                df.setPrixTotalDetail(produit.getPrix() * df.getQteCommande());
                df.setMontantRemise(df.getPrixTotalDetail()*df.getPourcentageRemise()/100);
                montant+=df.getPrixTotalDetail();
                montantRemise+=df.getMontantRemise();
                detailFactures.add(df);
                detailFactureServiceImp.add(df);
            }
            facture.setDetailFactures(detailFactures);
        }

        facture.setMontantFacture(montant);
        facture.setMontantRemise(montantRemise);
        this.add(facture);
        return facture;
    }

    @Override
    public void annulerFacture(Long id){
        Facture facture;
        facture = this.retrieve(id);
        if(facture!=null){
            if (facture.isArchivee()){
                facture.setArchivee(false);
                this.update(facture);
                System.out.println(facture);
            }
            else{
                System.out.println("déja annulée");
            }
        }
        else{
            System.out.println("pas de facture avec id: "+id);
        }

    }

}