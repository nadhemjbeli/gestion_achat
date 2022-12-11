package com.example.test.Controller;

import com.example.test.ServiceImpl.StockServiceImp;
import com.example.test.entity.Stock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    StockServiceImp stockService ;

    private static final Logger log = LoggerFactory.getLogger(StockController.class);

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

    @GetMapping("retrieveStatus")
    @Scheduled(cron = "0 0 22 ? * *")
    public void retrieveStatusStock() {

        System.out.println();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        log.info("Current Time      = {}", dateFormat.format(new Date()));
        log.info("\n"+stockService.retrieveStatusStock());
        System.out.println(stockService.retrieveStatusStock());
    }
}
