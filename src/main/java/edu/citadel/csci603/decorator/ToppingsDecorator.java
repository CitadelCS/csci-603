package edu.citadel.csci603.decorator;

public abstract class ToppingsDecorator extends Pizza {

    protected Pizza pizza;

    public ToppingsDecorator(Pizza pizza) {
        if (pizza == null) {
            this.pizza = new SimplePizza();
        } else {
            this.pizza = pizza;
        }
    }

    public abstract String getDescription();
}
