package com.lemairedev.stock.domain;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class StockRepository {
    private final Map<String, Stock> stockDatabase;

    public StockRepository() {
        this.stockDatabase = new ImmutableMap.Builder<String, Stock>()
                .put("AA", new Stock("AA", "Ambro AN"))
                .put("BB", new Stock("BB", "Bambro BN"))
                .put("CC", new Stock("CC", "Camro CN"))
                .build();
    }

    public Stock getStockInformation(String stockId){
        Stock stock = stockDatabase.get(stockId);
        if (stock == null){
            throw new IllegalArgumentException("Stock not found");
        }
        return stock;
    }
}
