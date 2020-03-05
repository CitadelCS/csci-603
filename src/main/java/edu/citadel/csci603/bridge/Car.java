package edu.citadel.csci603.bridge;

public class Car extends Vehicle {

    public Car(Workshop... workshops) {
        super(workshops);
    }

    @Override
    public void manufacture() {
        String printString = "Car -> [";
        for (Workshop workshop : workshops) {
            printString += workshop.work();
            printString += ",";
        }
        printString = printString.substring(0, printString.length() - 1);
        printString += "]";
        System.out.println(printString);
    }
}
