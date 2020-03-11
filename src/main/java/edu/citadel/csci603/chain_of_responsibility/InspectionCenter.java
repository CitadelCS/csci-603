package edu.citadel.csci603.chain_of_responsibility;

public class InspectionCenter implements JobPerformer {
    private JobPerformer jobPerformer;

    @Override
    public void setNextJob(JobPerformer job) {
        this.jobPerformer = job;
    }

    @Override
    public void performJob(Car car) {
        car.setHasPassedInspection(true);

        System.out.println("Car after InspectionCenter. " + car.toString());

        if (jobPerformer != null) {
            jobPerformer.performJob(car);
        }
    }
}
