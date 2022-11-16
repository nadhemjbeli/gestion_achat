package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.ProduitServiceInterface;
import com.example.test.entity.Produit;
import org.springframework.stereotype.Service;

@Service
public class ProduittServiceImp extends BaseServiceImp<Produit,Long> implements ProduitServiceInterface {


}