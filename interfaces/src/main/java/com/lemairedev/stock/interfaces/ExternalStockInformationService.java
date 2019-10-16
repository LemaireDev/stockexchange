package com.lemairedev.stock.interfaces;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    public static BigDecimal getPriceInEuroForStock(String stockId){
        return new BigDecimal(RandomUtils.nextInt(10,101));
    }
}
