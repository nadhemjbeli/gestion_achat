package com.example.test.ServiceImpl;

import com.example.test.Repositories.BaseRepository;
import com.example.test.Repositories.StockRepository;
import com.example.test.ServiceInterface.StockServiceInterface;
import com.example.test.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockServiceImp implements StockServiceInterface {
    @Autowired
    StockRepository jpaRepo;
    @Override
    public List<Stock> retrieveAll() {
        return new ArrayList<Stock>(this.jpaRepo.findAll());
    }

    @Override
    public Stock add(Stock e) {
        return this.jpaRepo.save(e);
    }

    @Override
    public Stock update(Stock e) {
        return this.jpaRepo.save(e);
    }

    @Override
    public Stock retrieve(Long id) {
        return this.jpaRepo.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        this.jpaRepo.deleteById(id);
    }


    @Override
    public String retrieveStatusStock() {

        List<Stock> stocks = jpaRepo.retrieveStatusStock();
        String message = "les stock avertis:\n";
        for(Stock stock: stocks){
            message += stock.getLibelleStock()+"\n";
        }
        return message;
    }
}