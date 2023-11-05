package alimento;

import java.util.Random;

public enum Topping {
	ABACAXI,
	PRESUNTO,
	CALABRESA,
	TOMATE,
	MANJERICAO,
	SALAME,
	PICLES,
	AZEITONA,
	CEBOLA,
	OREGANO;
	
	private static final Random random = new Random();
	
	public static Topping randomTopping() {
		Topping[] toppings = values();
		return toppings[random.nextInt(toppings.length)];
	}
	
	public static boolean isTopping(String input) {
		Topping[] toppings = values();
		for (int i = 0; i < toppings.length; i++) {
			if (toppings[i].toString().toLowerCase().equals(input)) {
				return true;
			}
		}
		return false;
	}
	
	public static Topping getToppingFromString(String input) {
		Topping[] toppings = values();
		for (int i = 0; i < toppings.length; i++) {
			if (toppings[i].toString().toLowerCase().equals(input)) {
				return toppings[i];
			}
		}
		return null;
	}
}
