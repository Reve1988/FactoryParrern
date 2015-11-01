package org.headfirst.factorypattern;

import org.headfirst.factorypattern.product.Ingredient.Cheese;
import org.headfirst.factorypattern.product.Ingredient.Clams;
import org.headfirst.factorypattern.product.Ingredient.Dough;
import org.headfirst.factorypattern.product.Ingredient.Freshclams;
import org.headfirst.factorypattern.product.Ingredient.Garlic;
import org.headfirst.factorypattern.product.Ingredient.MarinaraSauce;
import org.headfirst.factorypattern.product.Ingredient.Mushroom;
import org.headfirst.factorypattern.product.Ingredient.Onion;
import org.headfirst.factorypattern.product.Ingredient.Pepperoni;
import org.headfirst.factorypattern.product.Ingredient.ReggianoCheese;
import org.headfirst.factorypattern.product.Ingredient.Sauce;
import org.headfirst.factorypattern.product.Ingredient.SlicedPepperoni;
import org.headfirst.factorypattern.product.Ingredient.ThinCrustDough;
import org.headfirst.factorypattern.product.Ingredient.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		Veggie veggies[] = { new Garlic(), new Onion(), new Mushroom() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new Freshclams();
	}

}
