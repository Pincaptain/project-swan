package org.akatosh.simul.model;

public class Entity extends Thread {
    private int identity;

    public Entity() {}

    public Entity(int identity) {
        this.identity = identity;
    }

    @Override
    public void run() {
        System.out.printf("Simulating %d", identity);
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
}
