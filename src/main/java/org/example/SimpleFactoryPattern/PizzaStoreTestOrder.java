package org.example.SimpleFactoryPattern;

public class PizzaStoreTestOrder {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("clam");
    }
}
