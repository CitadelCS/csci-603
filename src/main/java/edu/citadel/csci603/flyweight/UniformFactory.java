package edu.citadel.csci603.flyweight;

import java.util.LinkedList;
import java.util.List;

public class UniformFactory {

    private static List<Uniform> uniformList = new LinkedList<>();

    public static Uniform getUniform(String tshirtSize, String sex) {

        // Return cached object if available
        for (Uniform uniform : uniformList) {
            if (uniform.getSex().equals(sex)
                    && uniform.getTShirtSize().equals(tshirtSize)) {
                System.out.println("Retrieved uniform from cache. " + uniform.toString());
                return uniform;
            }
        }

        // Create new object, cache it, and return it
        Uniform uniform = new Uniform();
        uniform.setSex(sex);
        uniform.setTShirtSize(tshirtSize);
        uniformList.add(uniform);

        System.out.println("Creating a new uniform that wasn't available in the cache. " + uniform.toString());
        return uniform;
    }
}
