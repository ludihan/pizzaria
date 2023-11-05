package cliente;

import java.util.Random;

public abstract class ClienteGenerator {
	private static String LetraOpcoes = "bcdfghjklmnpqrstvwxyz";
	
	private static final Random random = new Random();
	
	public static String criarClienteAle() {
		String nome = "";
		nome = nome + ClienteGenerator.getInicialAle();
		for (int i = 0; i < 5; i++) {
			nome = nome + ClienteGenerator.getLetraAle();
		}
		nome = nome + " ";
		nome = nome + ClienteGenerator.getInicialAle();
		for (int i = 0; i < 5; i++) {
			nome = nome + ClienteGenerator.getLetraAle();
		}
		return nome;
		
	}
	
	public static char getInicialAle() {
		return ClienteGenerator.
				LetraOpcoes.
				toUpperCase().
				charAt(random.nextInt(ClienteGenerator.
						LetraOpcoes.
						length()));
	}
	
	public static char getLetraAle() {
		return ClienteGenerator.
				LetraOpcoes.
				charAt(random.nextInt(ClienteGenerator.
						LetraOpcoes.
						length()));
	}
}
