package edu.citadel.csci603.chain_of_responsibility;

public class TireCenter implements JobPerformer {
    private JobPerformer jobPerformer;

    @Override
    public void setNextJob(JobPerformer job) {
        this.jobPerformer = job;
    }

    @Override
    public void performJob(Car car) {
        car.setTireSize("33");
        car.setTireType("BFGoodrich A/T TKO");

        System.out.println("Car after TireCenter. " + car.toString());

        if (jobPerformer != null) {
            jobPerformer.performJob(car);
        }
    }
}
