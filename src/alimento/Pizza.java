package alimento;

import java.util.ArrayList;

public class Pizza {
	private Boolean queijo;
	private Boolean tomate;
	private Massa massa;
	private ArrayList<Topping> toppings = new ArrayList<Topping>();
	
	public boolean equals(Pizza pizza) {
		if (
			this.temQueijo() == pizza.temQueijo() &&
			this.temTomate() == pizza.temTomate() &&
			this.getMassa() == pizza.getMassa() &&
			this.getToppings().containsAll(pizza.getToppings())
		) return true;
		else return false;
	}
	
	public Boolean temQueijo() {
		return queijo;
	}

	public void setQueijo(Boolean queijo) {
		this.queijo = queijo;
	}

	public Boolean temTomate() {
		return tomate;
	}

	public void setTomate(Boolean tomate) {
		this.tomate = tomate;
	}

	public Massa getMassa() {
		return massa;
	}

	public void setMassa(Massa massa) {
		this.massa = massa;
	}

	public ArrayList<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(Topping topping) {
		this.toppings.add(topping);
	}
}
