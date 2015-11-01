package org.headfirst.factorypattern.store;

import org.headfirst.factorypattern.NYPizzaIngredientFactory;
import org.headfirst.factorypattern.PizzaIngredientFactory;
import org.headfirst.factorypattern.product.CheesePizza;
import org.headfirst.factorypattern.product.Pizza;

public class NYPizzaStore extends PizzaStore {
	private Pizza pizza;
	private PizzaIngredientFactory ingredientFactory; 
	
	@Override
	public Pizza createPizza(String type) {
		ingredientFactory = new NYPizzaIngredientFactory();

		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NYStyle Cheese Pizza");
		}

		return pizza;
	}

}
