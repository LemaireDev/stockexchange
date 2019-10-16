package com.lemairedev.stock.api;

import java.math.BigDecimal;

public class StockDto {
    private final String id, name, currency;
    private final BigDecimal price;

    public StockDto(String id, String name, BigDecimal price, String currency) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + ": " + name + "\tPrice: " + price + " " + currency;
    }
}
