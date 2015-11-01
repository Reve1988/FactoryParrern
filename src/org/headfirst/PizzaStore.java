package org.headfirst;

import org.headfirst.model.Pizza;

public class PizzaStore {
	SimplePizzaFactory simplePizzaFactory;

	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}

	public Pizza order(String type) {
		Pizza pizza = simplePizzaFactory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
