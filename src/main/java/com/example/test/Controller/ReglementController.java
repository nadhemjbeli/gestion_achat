package com.example.test.Controller;

import com.example.test.ServiceImpl.ReglementServiceImp;
import com.example.test.entity.Produit;
import com.example.test.entity.Reglement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/reglement")
public class ReglementController extends BaseController<Reglement, Long> {

    @Autowired
    ReglementServiceImp reglementServiceImp;
    @GetMapping("findCA/{start}/{end}")
    public float findCA(@PathVariable("start") String date1, @PathVariable("end") String date2) {
        java.sql.Date startDate = java.sql.Date.valueOf(date1);
        java.sql.Date endDate = java.sql.Date.valueOf(date2);
        return reglementServiceImp.findCA(startDate, endDate);
    }

}
