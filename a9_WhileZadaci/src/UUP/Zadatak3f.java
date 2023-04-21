package UUP;

// Napisati program za ispis sume recipročnih vrednosti prvih n prirodnih brojeva
// (harmonijski niz: 1 + 1/2 + 1/3 +...+ 1/n).
// FOR petlja

import java.util.Scanner;

public class Zadatak3f {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		double suma = 0; // predstavlja neutral prilikom sabiranja

		for (int i = 1; i <= n; i++)
			suma += (double) 1 / i;
		System.out.println(suma);
		input.close();
	}
}
