package com.example.test.Controller;

import com.example.test.entity.Fournisseur;
import com.example.test.entity.SecteurActivite;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secteur/activite")
public class SecteurActiviteController extends BaseController<SecteurActivite, Long> {


}
