package com.example.test.Controller;

import com.example.test.ServiceImpl.OperateurServiceImp;
import com.example.test.entity.Fournisseur;
import com.example.test.entity.Operateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operateur")
public class OperateurController extends BaseController<Operateur, Long> {
    @Autowired
    OperateurServiceImp operateurServiceImp;

    @GetMapping("/{idOperateur}/{idFacture}")
    public void assignOperateurToFacture(@PathVariable(value = "idOperateur") long idOperateur, @PathVariable(value = "idFacture") long idFacture){
        operateurServiceImp.assignOperateurToFacture(idOperateur,idFacture);
    }

}
