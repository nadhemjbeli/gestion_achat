package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.DetailFactureInterface;
import com.example.test.ServiceInterface.ReglementServiceInterface;
import com.example.test.entity.DetailFacture;
import com.example.test.entity.Reglement;
import org.springframework.stereotype.Service;

@Service
public class DetailFactureServiceImp extends BaseServiceImp<DetailFacture,Long> implements DetailFactureInterface {


}