package edu.citadel.csci603.flyweight;

import lombok.Data;

@Data
public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private Uniform uniform;
}
