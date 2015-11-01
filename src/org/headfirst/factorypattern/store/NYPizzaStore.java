package org.headfirst.factorypattern.store;

import org.headfirst.factorypattern.model.CheesePizza;
import org.headfirst.factorypattern.model.ChicagoStyleVeggiePizza;
import org.headfirst.factorypattern.model.ClamPizza;
import org.headfirst.factorypattern.model.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("ChicagoVeggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		}

		return pizza;
	}

}
