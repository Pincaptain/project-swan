package org.akatosh.simul.model.exception;

public class UnpopulatedSimulationException extends Exception {
    public UnpopulatedSimulationException() {
    }

    @Override
    public String getMessage() {
        return "Entity Manager not populated";
    }
}
