package com.example.test.Controller;

import com.example.test.ServiceImpl.StockServiceImp;
import com.example.test.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    StockServiceImp stockService ;

    @GetMapping("/all")
    private List<Stock> retrieveAllStocks(){
        return  stockService.retrieveAll();
    }

    @GetMapping("/{id}")
    private Stock retrieveStock(@PathVariable("id") Long id ){
        return stockService.retrieve(id);
    }

    @DeleteMapping("/del/{id}")
    private  void deleteStock(@PathVariable("id") Long id ){
        stockService.remove(id);
    }
    @PostMapping("/add")
    private Stock AddStock(@RequestBody Stock equipe ){
        stockService.add(equipe);
        return equipe;
    }
    @PutMapping()
    private  Stock updateStock (@RequestBody Stock e ){
        stockService.update(e);
        return  e ;
    }
}
