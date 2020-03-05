package edu.citadel.csci603.bridge;

public class Amazon {
    public static void main(String[] args) {
        Vehicle car = new Car(new Produce(), new AddHeadlights(), new Assemble());
        car.manufacture();

        Vehicle bike = new Bike(new Produce(), new AddChain(), new Assemble());
        bike.manufacture();
    }
}
