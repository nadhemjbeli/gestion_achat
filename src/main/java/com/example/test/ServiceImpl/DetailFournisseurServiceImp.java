package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.DetailFactureServiceInterface;
import com.example.test.ServiceInterface.DetailFournisseurServiceInterface;
import com.example.test.entity.DetailFacture;
import com.example.test.entity.DetailFournisseur;
import org.springframework.stereotype.Service;

@Service
public class DetailFournisseurServiceImp extends BaseServiceImp<DetailFournisseur,Long> implements DetailFournisseurServiceInterface {


}