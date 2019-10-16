package com.lemairedev.stock.service;

import com.lemairedev.stock.domain.Stock;
import com.lemairedev.stock.domain.StockCurrency;
import com.lemairedev.stock.domain.StockPrice;
import com.lemairedev.stock.domain.StockRepository;
import com.lemairedev.stock.interfaces.ExternalStockInformationService;

import java.math.BigDecimal;

public class StockService {
    private StockRepository repository = new StockRepository();

    public Stock getStock(String id) {
        try {
            Stock stock = repository.getStockInformation(id);
            BigDecimal price = ExternalStockInformationService.getPriceInEuroForStock(id);
            stock.setPrice(new StockPrice(price, StockCurrency.EUR));
            return stock;
        } catch (IllegalArgumentException ex){
            return null;
        }
    }
}
