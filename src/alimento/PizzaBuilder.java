package alimento;

import java.util.ArrayList;

public class PizzaBuilder {
	private Boolean queijo;
	private Boolean tomate;
	private Massa massa;
	private ArrayList<Topping> toppings = new ArrayList<Topping>();
	
	public PizzaBuilder setQueijo(Boolean queijo) {
		this.queijo = queijo;
		return this;
	}
	
	public PizzaBuilder setTomate(Boolean tomate) {
		this.tomate = tomate;
		return this;
	}
	
	public PizzaBuilder setMassa(Massa massa) {
		this.massa = massa;
		return this;
	}
	
	public PizzaBuilder addTopping(Topping topping) {
		this.toppings.add(topping);
		return this;
	}
	
	public Pizza buildPizza() {
		Pizza pizza = new Pizza();
		pizza.setQueijo(this.queijo);
		pizza.setTomate(this.tomate);
		pizza.setMassa(this.massa);
		for (int i = 0; i <= 4; i++) {
			pizza.setToppings(this.toppings.get(i));
		}
		return pizza;
	}
}
