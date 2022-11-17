package com.example.test.Controller;

import com.example.test.entity.Fournisseur;
import com.example.test.entity.Operateur;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operateur")
public class OperateurController extends BaseController<Operateur, Long> {


}
