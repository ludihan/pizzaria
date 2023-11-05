package facade;

import java.util.Random;
import java.util.Scanner;

import alimento.Massa;
import alimento.Pizza;
import alimento.PizzaBuilder;
import alimento.Topping;
import cliente.ClienteGenerator;

public abstract class FacadePizza {
	public static Pizza criarPizzaAle(int numToppings){
		PizzaBuilder builder = new PizzaBuilder();
		Random random = new Random();
		builder.setQueijo(random.nextBoolean())
			   .setTomate(random.nextBoolean())
			   .setMassa(Massa.randomMassa());
		for (int i = 0; i < numToppings; i++) {
			builder.addTopping(Topping.randomTopping());
		}
		return builder.buildPizza();
	}
	
	 
	 
	public static Pizza criarPizza() {
		PizzaBuilder builder = new PizzaBuilder();
		Scanner scn = new Scanner(System.in);
		String input;
		while (true) {
			System.out.print("Adicionar queijo [y/n]: ");
			input = scn.nextLine();
			if (input.equals("y") || input.equals("n")) {
				if (input.equals("y")) {
					builder.setQueijo(true); 
				} else {
					builder.setQueijo(false);
				}
				break;
			}
		}
		
		while (true) {
			System.out.print("Adicionar molho de tomate [y/n]: ");
			input = scn.nextLine().trim();
			if (input.equals("y") || input.equals("n")) {
				if (input.equals("y")) {
					builder.setTomate(true); 
				} else {
					builder.setTomate(false);
				}
				break;
			}
		}
		
		while (true) {
			System.out.print("Tipo de massa [grossa/fina]: ");
			input = scn.nextLine().trim();
			if (input.equals("grossa") || input.equals("fina")) {
				if (input.equals("grossa")) {
					builder.setMassa(Massa.GROSSA); 
				} else {
					builder.setMassa(Massa.FINA);
				}
				break;
			}
		}
		
		int i = 5;
		
		while (true) {
			if (i == 0) {
				break;
			}
			System.out.println("Toppings faltando: " + i);
			System.out.print("Adicione os toppings: ");
			input = scn.nextLine().trim();
			if (Topping.isTopping(input)) {
				i--;
				builder.addTopping(Topping.getToppingFromString(input));
			}
		}
		scn.close();
		return builder.buildPizza();
	}
	
	
	
	
	public static void descreverPizzaCliente(Pizza pizza) {
		System.out.println("Meu nome é " + ClienteGenerator.criarClienteAle() + ".");
		System.out.print("Eu gostaria de uma pizza ");
		if (pizza.temQueijo()) {
			System.out.print("com queijo ");
		} else {
			System.out.print("sem queijo ");
		}
		
		if (pizza.temTomate()) {
			System.out.println("e com molho de tomate.");
		} else {
			System.out.println("e sem molho de tomate.");
		}
		
		System.out.println("A massa tem que ser " + pizza.getMassa().toString().toLowerCase() + ".");
		System.out.print("Os toppings que eu vou querer são: ");
		for (int i = 0; i <= 3; i++) {
			System.out.print(pizza.getToppings().get(i).toString().toLowerCase() + ", ");
		}
		System.out.println("e " + pizza.getToppings().get(4).toString().toLowerCase() + ".");
		
	}
	
	public static void compararPizza(Pizza playerPizza, Pizza npcPizza) {
		if (playerPizza.equals(npcPizza)) {
			System.out.println("Você fez a pizza corretamente.");
		} else {
			System.out.println("Você errou o procedimento da pizza.");
		}
	}
}
