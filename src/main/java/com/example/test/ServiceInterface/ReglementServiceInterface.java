package com.example.test.ServiceInterface;


import com.example.test.entity.Produit;
import com.example.test.entity.Reglement;

import java.util.Date;

public interface ReglementServiceInterface extends BaseServiceInterface<Reglement, Long>{
    float findCA(Date startDate, Date endDate);


}