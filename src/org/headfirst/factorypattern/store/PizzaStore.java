package org.headfirst.factorypattern.store;

import org.headfirst.factorypattern.model.Pizza;

public abstract class PizzaStore {
	public Pizza order(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
}
