
import alimento.Pizza;
import facade.FacadePizza;

public class Main {

	public static void main(String[] args) {
		Pizza cliente = FacadePizza.criarPizzaAle(5);
		FacadePizza.descreverPizzaCliente(cliente);
		System.out.println();
		Pizza player = FacadePizza.criarPizza(5);
		FacadePizza.compararPizza(player, cliente);
		
	}

}
