package org.akatosh.gitbit.service;

import org.akatosh.gitbit.client.GithubClient;
import org.akatosh.gitbit.model.Repository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class GithubService {
    private final GithubClient client;

    public GithubService(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        client = retrofit.create(GithubClient.class);
    }

    public List<Repository> getRepositories(String user) throws IOException {
        String url = String.format("users/%s/repos", user);

        return client.getRepositories(url)
                .execute()
                .body();
    }
}
