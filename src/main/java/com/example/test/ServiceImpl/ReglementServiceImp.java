package com.example.test.ServiceImpl;

import com.example.test.Repositories.ReglementRepository;
import com.example.test.ServiceInterface.FactureServiceInterface;
import com.example.test.ServiceInterface.ReglementServiceInterface;
import com.example.test.entity.Facture;
import com.example.test.entity.Reglement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReglementServiceImp extends BaseServiceImp<Reglement,Long> implements ReglementServiceInterface {

    @Autowired
    ReglementRepository reglementRepository;

    @Override
    public float findCA(Date startDate, Date endDate) {
        return reglementRepository.findCA(startDate, endDate);
    }
}