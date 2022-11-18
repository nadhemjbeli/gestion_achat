package com.example.test.ServiceInterface;


import com.example.test.entity.Produit;
import com.example.test.entity.Stock;

public interface ProduitServiceInterface extends BaseServiceInterface<Produit, Long>{

    void assignProduitToStock(Long idProduit, Long idStock);


}