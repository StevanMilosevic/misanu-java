package zadatak2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 1; i < 6; i++) {
			System.out.println("Broj " + i + " = " + rand.nextInt());
		}
	}
}