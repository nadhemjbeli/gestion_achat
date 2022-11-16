package com.example.test.Controller;

import com.example.test.entity.DetailFacture;
import com.example.test.entity.Produit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detail/facture")
public class DetailFactureController extends BaseController<DetailFacture, Long> {


}
