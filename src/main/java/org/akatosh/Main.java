package org.akatosh;

import org.akatosh.exchangio.model.Exchange;
import org.akatosh.exchangio.service.DaggerExchangeServiceComponent;
import org.akatosh.exchangio.service.ExchangeService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExchangeService exchangeService = DaggerExchangeServiceComponent.create()
                .getExchangeService();

        try {
            Exchange exchange = exchangeService.getExchange();
            System.out.println(exchange.getRates().getDollar());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
