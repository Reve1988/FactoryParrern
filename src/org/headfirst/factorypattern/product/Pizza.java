package org.headfirst.factorypattern.product;

import org.headfirst.factorypattern.product.Ingredient.Cheese;
import org.headfirst.factorypattern.product.Ingredient.Clams;
import org.headfirst.factorypattern.product.Ingredient.Dough;
import org.headfirst.factorypattern.product.Ingredient.Pepperoni;
import org.headfirst.factorypattern.product.Ingredient.Sauce;
import org.headfirst.factorypattern.product.Ingredient.Veggie;

public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggie[] veggies;
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clams;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25min at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Veggie[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggie[] veggies) {
		this.veggies = veggies;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clams) {
		this.clams = clams;
	}
}
