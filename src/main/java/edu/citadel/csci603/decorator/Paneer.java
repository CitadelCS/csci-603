package edu.citadel.csci603.decorator;

public class Paneer extends ToppingsDecorator {

    public Paneer(Pizza pizza)  {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    public int getCost()  {  return 70 + pizza.getCost(); }
}
