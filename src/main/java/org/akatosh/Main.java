package org.akatosh;

import org.akatosh.gitbit.model.Repository;
import org.akatosh.gitbit.service.GithubService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GithubService service = new GithubService("https://api.github.com/");

        try {
            String user = "Pincaptain";

            Repository staleRepository = service.getStaleRepository(user);
            System.out.printf("Stale Repository: %s %s%n", staleRepository.getName(),
                    staleRepository.getUpdatedAt().toString());

            Repository freshRepository = service.getFreshRepository(user);
            System.out.printf("Fresh Repository: %s %s%n", freshRepository.getName(),
                    freshRepository.getUpdatedAt().toString());

            Repository oldestRepository = service.getOldestRepository(user);
            System.out.printf("Oldest Repository: %s %s%n", oldestRepository.getName(),
                    oldestRepository.getCreatedAt().toString());

            Repository newestRepository = service.getNewestRepository(user);
            System.out.printf("Newest Repository: %s %s%n", newestRepository.getName(),
                    newestRepository.getCreatedAt().toString());

            System.out.printf("Maybe you should consider updating \"%s\". ;)", staleRepository.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
