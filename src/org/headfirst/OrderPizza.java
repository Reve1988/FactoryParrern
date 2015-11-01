package org.headfirst;

import org.headfirst.model.Pizza;

public class OrderPizza implements Order {

	@Override
	public Pizza order(String type) {
		Pizza pizza = new Pizza();
		
		return pizza;
	}

}
