package com.example.test.Controller;

import com.example.test.entity.CategorieProduit;
import com.example.test.entity.DetailFournisseur;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produit")
public class DetailFournisseurController extends BaseController<DetailFournisseur, Long> {


}
