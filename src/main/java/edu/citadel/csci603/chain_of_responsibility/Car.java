package edu.citadel.csci603.chain_of_responsibility;

import lombok.Data;

@Data
public class Car {
    private String paintColor;
    private String tireSize;
    private String tireType;
    private boolean hasPassedInspection;
    private String bodyStyle;
}
