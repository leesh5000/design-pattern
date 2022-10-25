package builder.director;

import builder.builder.PizzaBuilder;
import builder.product.Pizza;

/** Director */
public class Cook {

    private PizzaBuilder pizzaBuilder;

    public Cook(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructPizza() {
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
