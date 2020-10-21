package org.akatosh;

import org.akatosh.gitbit.model.Repository;
import org.akatosh.gitbit.service.GithubService;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GithubService service = new GithubService("https://api.github.com/");

        try {
            List<Repository> repositories = service.getRepositories("Pincaptain");
            System.out.println(repositories.get(0).getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
