package org.headfirst.factorypattern.product;

import org.headfirst.factorypattern.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("PreParing " + getName());
		super.setDough(ingredientFactory.createDough());
		super.setSauce(ingredientFactory.createSauce());
		super.setCheese(ingredientFactory.createCheese());
		super.setClams(ingredientFactory.createClam());
	}
}
