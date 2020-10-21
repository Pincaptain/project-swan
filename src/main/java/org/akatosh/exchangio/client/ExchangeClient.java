package org.akatosh.exchangio.client;

import org.akatosh.exchangio.model.Exchange;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ExchangeClient {
    @GET("/latest")
    @Headers("accept: application/json")
    Call<Exchange> getExchange();
}
