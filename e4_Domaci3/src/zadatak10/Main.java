package zadatak10;

import java.util.Scanner;

// Napisati program koji omogućuje unos 10 brojeva unutar niza, traženog broja, 
// a zatim je potrebno ispisati koliko puta se traženi broj pojavljuje u nizu.

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int broj, brojac = 0;
		System.out.println("Unesite 10 brojeva: ");
		int[] niz = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Broj " + (i + 1) + ": ");
			niz[i] = input.nextInt();
		}
		System.out.print("Koji broj ispitujemo?");
		broj = input.nextInt();
		input.close();

		for (int i = 0; i < 10; i++) {
			if (niz[i] == broj)
				brojac++;
		}
		System.out.println("Trazeni broj se pojavljuje " + brojac + " puta u nizu");
	}
}
