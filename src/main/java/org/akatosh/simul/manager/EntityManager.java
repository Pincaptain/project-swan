package org.akatosh.simul.manager;

import org.akatosh.simul.model.Entity;
import org.akatosh.simul.model.exception.UnpopulatedSimulationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EntityManager {
    List<Entity> entities;
    boolean isPopulated;

    public EntityManager() {
        isPopulated = false;
    }

    public boolean populate(long seed) {
        if (isPopulated) return false;

        entities = new ArrayList<>();
        Random random = new Random(seed);
        int count = random.nextInt();

        for (int i = 0; i < count; i++) {
            entities.add(new Entity(random.nextInt()));
        }
        isPopulated = true;

        return true;
    }

    public boolean populate(List<Entity> entities) {
        if (isPopulated) return false;

        this.entities = entities;
        isPopulated = true;

        return true;
    }

    public void simulate() throws UnpopulatedSimulationException {
        if (!isPopulated) {
            throw new UnpopulatedSimulationException();
        }

        for (Entity entity : entities) {
            entity.start();
        }
    }
}

