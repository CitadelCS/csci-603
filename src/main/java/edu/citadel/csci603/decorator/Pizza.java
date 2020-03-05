package edu.citadel.csci603.decorator;

public abstract class Pizza {
    // it is an abstract pizza
    protected String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
