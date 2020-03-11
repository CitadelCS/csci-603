package edu.citadel.csci603.chain_of_responsibility;

public class AutoFactory {

    public static void main(String[] args) {
        // Car to build
        Car car = new Car();

        // Job performers
        TireCenter tireCenter = new TireCenter();
        BodyShop bodyShop = new BodyShop();
        PaintShop paintShop = new PaintShop();
        InspectionCenter inspectionCenter = new InspectionCenter();

        // Setup process
        tireCenter.setNextJob(bodyShop);
        bodyShop.setNextJob(paintShop);
        paintShop.setNextJob(inspectionCenter);

        System.out.println("Starting process. " + car.toString());

        // Start the process
        tireCenter.performJob(car);
    }
}
