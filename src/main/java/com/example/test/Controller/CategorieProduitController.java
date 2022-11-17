package com.example.test.Controller;

import com.example.test.entity.CategorieProduit;
import com.example.test.entity.Produit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorie/produit")
public class CategorieProduitController extends BaseController<CategorieProduit, Long> {


}
