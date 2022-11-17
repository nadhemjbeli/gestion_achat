package com.example.test.Controller;

import com.example.test.entity.DetailFournisseur;
import com.example.test.entity.Fournisseur;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController extends BaseController<Fournisseur, Long> {


}
