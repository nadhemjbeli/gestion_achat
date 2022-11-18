package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.ProduitServiceInterface;
import com.example.test.entity.Produit;
import com.example.test.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduittServiceImp extends BaseServiceImp<Produit,Long> implements ProduitServiceInterface {
    @Autowired
    StockServiceImp stockServiceImp;

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit = this.retrieve(idProduit);
        Stock stock = stockServiceImp.retrieve(idStock);
        produit.setStock(stock);
        this.update(produit);
    }
}