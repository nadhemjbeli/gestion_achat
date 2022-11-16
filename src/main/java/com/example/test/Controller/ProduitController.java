package com.example.test.Controller;

import com.example.test.ServiceImpl.StockServiceImp;
import com.example.test.entity.Produit;
import com.example.test.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController extends BaseController<Produit, Long> {


}
