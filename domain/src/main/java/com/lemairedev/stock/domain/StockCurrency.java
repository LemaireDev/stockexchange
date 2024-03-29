package com.lemairedev.stock.domain;

public enum StockCurrency {
    EUR("Euro", "€"),
    USD("Dollar", "$"),
    GBP("Pounds", "£");

    private String label, symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    public String getLabel() {
        return label;
    }

    public String getSymbol() {
        return symbol;
    }
}
