package org.akatosh.exchangio.service;

import dagger.Component;

@Component(modules = ExchangeServiceModule.class)
public interface ExchangeServiceComponent {
    ExchangeService getExchangeService();
}
