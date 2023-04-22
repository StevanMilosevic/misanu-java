package zadatak1;

import java.util.Random;

// Napisati program koji će generisati i ispisati po jedan broj sledećih tipova:
// Int, Float, Boolean, Double, Byte.

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("Primer za int: " + rand.nextInt());
		System.out.println("Primer za float: " + rand.nextFloat());
		System.out.println("Primer za boolean: " + rand.nextBoolean());
		System.out.println("Primer za double: " + rand.nextDouble());

		byte[] bajt = new byte[1];
		rand.nextBytes(bajt);
		System.out.println("Primer za byte: " + bajt[0]);

	}
}