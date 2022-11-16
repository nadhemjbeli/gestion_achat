package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.FactureServiceInterface;
import com.example.test.ServiceInterface.ProduitServiceInterface;
import com.example.test.entity.Facture;
import com.example.test.entity.Produit;
import org.springframework.stereotype.Service;

@Service
public class FactureServiceImp extends BaseServiceImp<Facture,Long> implements FactureServiceInterface {


}