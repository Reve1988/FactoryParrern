package org.headfirst;

import org.headfirst.model.CheesePizza;
import org.headfirst.model.ClamPizza;
import org.headfirst.model.Pizza;
import org.headfirst.model.VeggiePizza;

public class ChicagoPizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}

		return pizza;
	}
}
