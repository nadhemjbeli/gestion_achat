package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.FactureServiceInterface;
import com.example.test.ServiceInterface.ReglementServiceInterface;
import com.example.test.entity.Facture;
import com.example.test.entity.Reglement;
import org.springframework.stereotype.Service;

@Service
public class ReglementServiceImp extends BaseServiceImp<Reglement,Long> implements ReglementServiceInterface {


}