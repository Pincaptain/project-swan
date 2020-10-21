package org.akatosh.exchangio.service;

import dagger.Module;
import dagger.Provides;
import org.akatosh.exchangio.client.ExchangeClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ExchangeServiceModule {
    @Provides
    ExchangeClient provideExchangeClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.exchangeratesapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ExchangeClient.class);
    }
}
