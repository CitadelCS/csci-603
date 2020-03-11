package edu.citadel.csci603.chain_of_responsibility;

public class BodyShop implements JobPerformer {
    private JobPerformer jobPerformer;

    @Override
    public void setNextJob(JobPerformer job) {
        this.jobPerformer = job;
    }

    @Override
    public void performJob(Car car) {
        car.setBodyStyle("Truck");

        System.out.println("Car after BodyShop. " + car.toString());

        if (jobPerformer != null) {
            jobPerformer.performJob(car);
        }
    }
}
