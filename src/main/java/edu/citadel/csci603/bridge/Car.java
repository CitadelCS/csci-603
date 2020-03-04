package edu.citadel.csci603.bridge;

public class Car extends Vehicle {

    public Car(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
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
