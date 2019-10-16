package com.lemairedev.stock.cli;

import com.lemairedev.stock.api.StockDto;
import com.lemairedev.stock.api.StockExchangeController;

public class MyCLI {

    public static void main(String[] args) {
        if (args.length == 1) {
            StockExchangeController controller = new StockExchangeController();
            StockDto stockDto = controller.getStock(args[0]);
            if (stockDto == null){
                System.out.println("Not a valid stock");
            } else {
                System.out.println(stockDto);
            }
        }
    }
}
