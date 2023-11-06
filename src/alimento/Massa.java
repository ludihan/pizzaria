package alimento;

import java.util.Random;

public enum Massa {
	GROSSA,
	FINA;
	
	private static final Random random = new Random();
	
	public static Massa getRandomMassa() {
		Massa[] massas = values();
		return massas[random.nextInt(massas.length)];
	}
	
	public static boolean isMassa(String input) {
		Massa[] massas = values();
		for (int i = 0; i < massas.length; i++) {
			if (massas[i].toString().toLowerCase().equals(input)) {
				return true;
			}
		}
		return false;
	}
	
	public static Massa getToppingFromString(String input) {
		Massa[] massas = values();
		for (int i = 0; i < massas.length; i++) {
			if (massas[i].toString().toLowerCase().equals(input)) {
				return massas[i];
			}
		}
		return null;
	}
}
