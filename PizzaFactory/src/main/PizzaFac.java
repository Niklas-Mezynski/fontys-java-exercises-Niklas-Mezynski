package main;

public class PizzaFac implements AbstractPizzaFac {
    @Override
    public Pizza createPizzaSalami() {
        return new SalamiPizza();
    }

    @Override
    public Pizza createPizzaHam() {
        return new HamPizza();
    }
}
