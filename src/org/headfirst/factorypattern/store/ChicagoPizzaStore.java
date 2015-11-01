package org.headfirst.factorypattern.store;

import org.headfirst.factorypattern.NYPizzaIngredientFactory;
import org.headfirst.factorypattern.PizzaIngredientFactory;
import org.headfirst.factorypattern.product.CheesePizza;
import org.headfirst.factorypattern.product.ClamPizza;
import org.headfirst.factorypattern.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
	private Pizza pizza;
	private PizzaIngredientFactory ingredientFactory; 
	
	@Override
	public Pizza createPizza(String type) {
		ingredientFactory = new NYPizzaIngredientFactory();

		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("ChicagoStyle Cheese Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("ChicagoStyle Clam Pizza");
		}
		
		return pizza;
	}

}
