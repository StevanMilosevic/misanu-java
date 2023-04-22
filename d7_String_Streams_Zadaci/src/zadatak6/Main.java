package zadatak6;

import java.util.Scanner;

// Brojanje koliko puta se određena cifra pojavljuje u unetom broju.

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Koju cifru proveravamo?");
		int n = input.nextInt();

		System.out.println("Unesite broj koji ispitujemo");
		int broj = input.nextInt();

		int cifra, brojac = 0;
		while (broj != 0) {
			cifra = broj % 10;
			if (cifra == n) {
				brojac++;
			}
			broj /= 10;
		}
		System.out.println("Broj " + n + " se ponavlja " + brojac);
	}

}
