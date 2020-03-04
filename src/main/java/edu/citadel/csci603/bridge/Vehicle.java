package edu.citadel.csci603.bridge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class Vehicle {
    protected List<Workshop> workshops;

    protected Vehicle(Workshop... workshops) {
        this.workshops = new LinkedList<>();
        this.workshops.addAll(Arrays.asList(workshops));
    }

    abstract public void manufacture();
}
