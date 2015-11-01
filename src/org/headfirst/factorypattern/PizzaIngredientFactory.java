package org.headfirst.factorypattern;

import org.headfirst.factorypattern.product.Ingredient.Cheese;
import org.headfirst.factorypattern.product.Ingredient.Clams;
import org.headfirst.factorypattern.product.Ingredient.Dough;
import org.headfirst.factorypattern.product.Ingredient.Pepperoni;
import org.headfirst.factorypattern.product.Ingredient.Sauce;
import org.headfirst.factorypattern.product.Ingredient.Veggie;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggie[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
}
