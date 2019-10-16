package com.lemairedev.stock.api;

import com.lemairedev.stock.domain.Stock;
import com.lemairedev.stock.service.StockService;

import java.math.BigDecimal;

public class StockExchangeController {
    private StockService stockService;

    public StockExchangeController() {
        this.stockService = new StockService();
    }

    public StockDto getStock(String stockId){
        Stock stock = stockService.getStock(stockId);
        if (stock == null){
            return null;
        }
        if (stock.getPrice()==null){
            return new StockDto(stockId, stock.getName(), new BigDecimal(0), "Unknown");
        }
        return new StockDto(
                stockId,
                stock.getName(),
                stock.getPrice().getPrice(),
                stock.getPrice().getCurrency().getLabel());
    }
}
