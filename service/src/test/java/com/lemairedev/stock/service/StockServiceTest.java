package com.lemairedev.stock.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {
    private StockService service;

    @BeforeEach
    void setUp() {
        service = new StockService();
    }

    @Test
    void getStock_givenInvalidID_getNull() {
        Assertions.assertNull(service.getStock(""));
    }

    @Test
    void getStock_givenInvalidID_getNotNull() {
        Assertions.assertNotNull(service.getStock("BB"));
    }
}