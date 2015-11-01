package org.headfirst.factorypattern.model.pizza;

import java.util.ArrayList;
import java.util.List;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		super.setName("Chicago Style Veggie Pizza");
		super.setDough("Thin Crust Dough");
		super.setSauch("Marinara Sauce");

		List<String> toppings = new ArrayList<String>();
		toppings.add("toppingA");
		toppings.add("toppingB");
		super.setToppings(toppings);
	}
}
