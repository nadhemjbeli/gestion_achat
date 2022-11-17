package com.example.test.ServiceImpl;

import com.example.test.ServiceInterface.OperateurServiceInterface;
import com.example.test.ServiceInterface.SecteurActiviteServiceInterface;
import com.example.test.entity.Operateur;
import com.example.test.entity.SecteurActivite;
import org.springframework.stereotype.Service;

@Service
public class SecteurActiviteServiceImp extends BaseServiceImp<SecteurActivite,Long> implements SecteurActiviteServiceInterface {


}