package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.DetailFournisseurServiceInterface;
import com.example.test.ServiceInterface.FournisseurServiceInterface;
import com.example.test.entity.DetailFournisseur;
import com.example.test.entity.Fournisseur;
import org.springframework.stereotype.Service;

@Service
public class FournisseurServiceImp extends BaseServiceImp<Fournisseur,Long> implements FournisseurServiceInterface {


}