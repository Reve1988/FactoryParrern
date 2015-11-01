package org.headfirst.factorypattern.model.pizza;

import java.util.ArrayList;
import java.util.List;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		super.setName("Cheese Pizza");
		super.setDough("Thin Crust Dough");
		super.setSauch("Marinara Sauce");
		
		List<String> toppings = new ArrayList<String>();
		toppings.add("toppingA");
		toppings.add("toppingB");
		super.setToppings(toppings);
	}
}
