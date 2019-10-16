package com.lemairedev.stock.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockRepositoryTest {
    private StockRepository repository;

    @BeforeEach
    void setUp(){
        repository = new StockRepository();
    }

    @Test
    void givenValidKey_getCorrectStock() {
        Stock stock = repository.getStockInformation("AA");
        Assertions.assertEquals("Ambro AN", stock.getName());
        Assertions.assertEquals("AA", stock.getId());
    }
}