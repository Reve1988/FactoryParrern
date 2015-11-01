package org.headfirst.factorypattern.store;

import org.headfirst.factorypattern.model.CheesePizza;
import org.headfirst.factorypattern.model.ClamPizza;
import org.headfirst.factorypattern.model.NYStyleVeggiePizza;
import org.headfirst.factorypattern.model.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("NYVeggie")) {
			pizza = new NYStyleVeggiePizza();
		}

		return pizza;
	}

}
