package edu.citadel.csci603.decorator;

public class FreshTomato extends ToppingsDecorator {

    public FreshTomato(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }

    public int getCost() { return 40 + pizza.getCost(); }
}
