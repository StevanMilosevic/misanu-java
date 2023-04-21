package UUP;

// Napisati program za ispisivanje sume brojeva od k do zadatog broja n.

import java.util.Scanner;

public class Zadatak6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za k: ");
		int k = input.nextInt();
		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		int i = k;
		int suma = 0; // predstavlja neutral prilikom sabiranja

		while (i <= n) {
			suma += i++; // skracena sintaksa
		}
		System.out.println("Zbir brojeva od broja " + k + " do broja " + n + " je: " + suma);
		input.close();
	}
}
