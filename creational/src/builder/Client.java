package builder;

import builder.concretebuilder.HawaiianPizzaBuilder;
import builder.concretebuilder.PepperoniPizzaBuilder;
import builder.director.Cook;
import builder.product.Pizza;

public class Client {

    public static void main(String[] args) {
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        Cook cook = new Cook(hawaiianPizzaBuilder);
        cook.constructPizza();
        Pizza hawaiianPizza = cook.getPizza();

        PepperoniPizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
        cook = new Cook(pepperoniPizzaBuilder);
        cook.constructPizza();
        Pizza pepperoniPizza = cook.getPizza();

        // 동일한 생성 절차를 걸쳤지만, 서로 다른 표현 결과를 만들어 냄
        // 제품이 어떻게 생성되는지는 은닉화되어 드러나지 않음
        System.out.println(hawaiianPizza);
        System.out.println(pepperoniPizza);
    }

}
