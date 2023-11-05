package alimento;

import java.util.Random;

public enum Massa {
	GROSSA,
	FINA;
	
	private static final Random random = new Random();
	
	public static Massa randomMassa() {
		Massa[] massas = values();
		return massas[random.nextInt(massas.length)];
	}
}
