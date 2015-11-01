package org.headfirst.factorypattern.product;

import org.headfirst.factorypattern.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("PreParing " + getName());
		super.setDough(ingredientFactory.createDough());
		super.setSauce(ingredientFactory.createSauce());
		super.setCheese(ingredientFactory.createCheese());
	}
}
