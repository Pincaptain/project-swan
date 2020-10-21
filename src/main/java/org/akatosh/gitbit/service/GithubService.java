package org.akatosh.gitbit.service;

import org.akatosh.gitbit.client.GithubClient;
import org.akatosh.gitbit.model.Repository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Date;
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
        return client.getRepositories(user)
                .execute()
                .body();
    }

    public Repository getStaleRepository(String user) throws IOException {
        List<Repository> repositories = getRepositories(user);

        if (repositories == null || repositories.isEmpty()) {
            return null;
        }

        return repositories.stream()
                .reduce(repositories.get(0), (x, y) -> x.getUpdatedAt().before(y.getUpdatedAt()) ? x : y);
    }

    public Repository getFreshRepository(String user) throws IOException {
        List<Repository> repositories = getRepositories(user);

        if (repositories == null || repositories.isEmpty()) {
            return null;
        }

        return repositories.stream()
                .reduce(repositories.get(0), (x, y) -> x.getUpdatedAt().after(y.getUpdatedAt()) ? x : y);
    }

    public Repository getOldestRepository(String user) throws IOException {
        List<Repository> repositories = getRepositories(user);

        if (repositories == null || repositories.isEmpty()) {
            return null;
        }

        return repositories.stream()
                .reduce(repositories.get(0), (x, y) -> x.getCreatedAt().before(y.getCreatedAt()) ? x : y);
    }

    public Repository getNewestRepository(String user) throws IOException {
        List<Repository> repositories = getRepositories(user);

        if (repositories == null || repositories.isEmpty()) {
            return null;
        }

        return repositories.stream()
                .reduce(repositories.get(0), (x, y) -> x.getCreatedAt().after(y.getCreatedAt()) ? x : y);
    }
}
