package edu.citadel.csci603.decorator;

public class Barbeque extends ToppingsDecorator {

    public Barbeque(Pizza pizza) { super(pizza);  }

    public String getDescription() {
        return pizza.getDescription() + ", Barbeque";
    }

    public int getCost() { return 90 + pizza.getCost(); }
}
