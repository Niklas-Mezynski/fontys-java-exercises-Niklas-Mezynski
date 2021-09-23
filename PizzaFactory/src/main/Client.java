package main;

public class Client {
    private final AbstractPizzaFac fac;

    public Client(AbstractPizzaFac fac) {
        this.fac = fac;
    }

    public void doSomethingCool() {
        Pizza pizzaHam = fac.createPizzaHam();
        Pizza pizzaSalami = fac.createPizzaSalami();
        pizzaHam.pizzaComment();
        pizzaSalami.pizzaComment();
    }
}
