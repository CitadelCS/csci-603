package edu.citadel.csci603.facade;

public class Aaron implements Receptionist {
    private John john;
    private Jane jane;
    private JimmyJohns jimmyJohns;

    public Aaron() {
        john = new John();
        john.setFirstName("John");
        john.setLastName("Ravan");
        john.setPhoneNumber("843-284-6446");
        john.setEmail("ravanj1@citadel.edu");
        john.setAddress("1234 Cool Place Way, Mount Pleasant, SC 29466");

        jane = new Jane();
        jane.setFirstName("Jane");
        jane.setLastName("Doe");
        jane.setPhoneNumber("843-123-4567");
        jane.setEmail("jane.doe@citadel.edu");
        jane.setAddress("5678 Cool Place Way, Mount Pleasant, SC 29466");

        jimmyJohns = new JimmyJohns();
        jimmyJohns.setPhoneNumber("843-123-9876");
        jimmyJohns.setBusinessName("Jimmy Johns");
        jimmyJohns.setAddress("7890 Cool Place Way, Mount Pleasant, SC 29466");
    }
    @Override
    public void textJohn(String message) {
        if (john.getPhoneNumber() != null) {
            System.out.println("Texted John this message: \"" + message + "\"");
        } else {
            System.out.println("John's number is disconnected");
        }
    }

    @Override
    public void callJohn() {
        if (john.getPhoneNumber() != null) {
            System.out.println("Called John!");
        } else {
            System.out.println("John's number is disconnected");
        }
    }

    @Override
    public void orderJimmyJohns(String order) {
        if (jimmyJohns.getPhoneNumber() != null) {
            System.out.println("Ordered Jimmy Johns with this order: \"" + order + "\"");
        } else if (jimmyJohns.getAddress() != null) {
            System.out.println("Ordered Jimmy Johns with this order: \"" + order + "\". Had to drive to their location at " + jimmyJohns.getAddress());
        } else {
            System.out.println("Couldn't order Jimmy Johns. No way to get in contact");
        }
    }

    @Override
    public void textJane(String message) {
        if (jane.getPhoneNumber() != null) {
            System.out.println("Texted Jane this message: \"" + message + "\"");
        } else {
            System.out.println("Jane's number is disconnected");
        }
    }

    @Override
    public void callJane() {
        if (jane.getPhoneNumber() != null) {
            System.out.println("Called Jane!");
        } else {
            System.out.println("Jane's number is disconnected");
        }
    }
}

