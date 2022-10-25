package builder.concretebuilder;

import builder.builder.PizzaBuilder;

/** ConcreteBuilder 2 */
public class PepperoniPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni");
    }

}
