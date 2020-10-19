package org.akatosh;

import org.akatosh.simul.manager.EntityManager;
import org.akatosh.simul.model.exception.UnpopulatedSimulationException;

public class Main {
    public static void main(String[] args) {
        EntityManager manager = new EntityManager();
        manager.populate(3623);
        try {
            manager.simulate();
        } catch (UnpopulatedSimulationException e) {
            e.printStackTrace();
        }
    }
}
