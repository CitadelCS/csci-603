package edu.citadel.csci603.chain_of_responsibility;

public class PaintShop implements JobPerformer {
    private JobPerformer jobPerformer;

    @Override
    public void setNextJob(JobPerformer job) {
        this.jobPerformer = job;
    }

    @Override
    public void performJob(Car car) {
        car.setPaintColor("Blue");

        System.out.println("Car after PaintShop. " + car.toString());

        if (jobPerformer != null) {
            jobPerformer.performJob(car);
        }
    }
}
