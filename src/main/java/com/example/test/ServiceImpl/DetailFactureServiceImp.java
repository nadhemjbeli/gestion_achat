package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.DetailFactureServiceInterface;
import com.example.test.entity.DetailFacture;
import org.springframework.stereotype.Service;

@Service
public class DetailFactureServiceImp extends BaseServiceImp<DetailFacture,Long> implements DetailFactureServiceInterface {


}