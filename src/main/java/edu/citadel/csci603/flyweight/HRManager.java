package edu.citadel.csci603.flyweight;

import edu.citadel.csci603.flyweight.Employee;

public class HRManager {

    public static void main(String[] args) {

        // New employee, John
        Employee john = new Employee();
        john.setId("1234");
        john.setFirstName("John");
        john.setLastName("Smith");
        john.setPhoneNumber("123-456-7890");
        john.setAddress("123 Cool Way");
        john.setUniform(UniformFactory.getUniform("XL", "Male"));

        // New employee, Jane
        Employee jane = new Employee();
        jane.setId("5678");
        jane.setFirstName("Jane");
        jane.setLastName("Smith");
        jane.setPhoneNumber("123-456-7890");
        jane.setAddress("123 Cool Way");
        jane.setUniform(UniformFactory.getUniform("S", "Female"));

        // New employee, Jim
        Employee jim = new Employee();
        jim.setId("7493");
        jim.setFirstName("Jim");
        jim.setLastName("Potato");
        jim.setPhoneNumber("555-555-9887");
        jim.setAddress("3456 Potato Garden Lane");
        jim.setUniform(UniformFactory.getUniform("XL", "Male"));
    }
}
