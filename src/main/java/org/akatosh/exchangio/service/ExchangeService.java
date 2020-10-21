package org.akatosh.exchangio.service;

import org.akatosh.exchangio.client.ExchangeClient;
import org.akatosh.exchangio.model.Exchange;

import javax.inject.Inject;
import java.io.IOException;

@SuppressWarnings("unused")
public class ExchangeService {
    private static final String TAG = "ExchangeService";

    private final ExchangeClient exchangeClient;

    @Inject
    public ExchangeService(ExchangeClient exchangeClient) {
        this.exchangeClient = exchangeClient;
    }

    public Exchange getExchange() throws IOException {
        return exchangeClient.getExchange()
                .execute()
                .body();
    }
}
