package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.OperateurServiceInterface;
import com.example.test.ServiceInterface.ProduitServiceInterface;
import com.example.test.entity.Operateur;
import com.example.test.entity.Produit;
import org.springframework.stereotype.Service;

@Service
public class OperateurServiceImp extends BaseServiceImp<Operateur,Long> implements OperateurServiceInterface {


}