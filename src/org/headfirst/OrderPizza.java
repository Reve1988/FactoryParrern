package org.headfirst;

import org.headfirst.model.CheesePizza;
import org.headfirst.model.ClamPizza;
import org.headfirst.model.Pizza;

public class OrderPizza implements Order {

	@Override
	public Pizza order(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("clam")){
			pizza = new ClamPizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
