package org.headfirst.factorypattern;

import org.headfirst.factorypattern.model.pizza.Pizza;
import org.headfirst.factorypattern.store.ChicagoPizzaStore;
import org.headfirst.factorypattern.store.NYPizzaStore;
import org.headfirst.factorypattern.store.PizzaStore;

public class Client {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.order("cheese");
		System.out.println("ordered : " + pizza.getName());
		
		pizza = chicagoStore.order("ChicagoVeggie");
		System.out.println("ordered : " + pizza.getName());
	}
}
