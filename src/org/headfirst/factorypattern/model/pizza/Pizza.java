package org.headfirst.factorypattern.model.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	private String name;
	private String dough;
	private String sauch;
	private List<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("PreParing " + getName());
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.print("adding toppings : ");
		for (String topping : toppings) {
			System.out.print(topping.toString());
		}
		System.out.println("");
	}

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

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauch() {
		return sauch;
	}

	public void setSauch(String sauch) {
		this.sauch = sauch;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
}
