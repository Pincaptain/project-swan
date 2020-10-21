package org.akatosh.gitbit.client;

import org.akatosh.gitbit.model.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

import java.util.List;

public interface GithubClient {
    @GET("users/{user}/repos")
    @Headers("accept: application/json")
    Call<List<Repository>> getRepositories(@Path(value = "user", encoded = true) String user);
}
