package edu.citadel.csci603.chain_of_responsibility;

public interface JobPerformer {
    void setNextJob(JobPerformer job);
    void performJob(Car car);
}
