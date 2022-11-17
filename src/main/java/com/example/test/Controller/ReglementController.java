package com.example.test.Controller;

import com.example.test.entity.Produit;
import com.example.test.entity.Reglement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reglement")
public class ReglementController extends BaseController<Reglement, Long> {


}
