package com.example.test.Controller;

import com.example.test.ServiceImpl.FactureServiceImp;
import com.example.test.entity.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController extends BaseController<Facture, Long> {
    @Autowired
    FactureServiceImp factureServiceImp ;

    @PutMapping("/annuler/{id}")
    public void annulerFacture(@PathVariable("id") Long id){
        factureServiceImp.annulerFacture(id);
    }

    @PostMapping("/add_facture/{idFour}")
    @Transactional
    public Facture addFacture(@RequestBody Facture facture,@PathVariable(value = "idFour") long idFour){
        return factureServiceImp.addFacture(facture, idFour);
    }

    @GetMapping("/{idFournisseur}")
    public List<Facture> getFacturesByFournisseur(@PathVariable(value = "idFournisseur") Long idFournisseur){
        return  factureServiceImp.getFacturesByFournisseur(idFournisseur);
    }


}
