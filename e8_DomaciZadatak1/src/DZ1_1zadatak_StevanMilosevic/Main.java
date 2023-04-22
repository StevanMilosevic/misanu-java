package DZ1_1zadatak_StevanMilosevic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Broj elemenata niza: ");
		int n = input.nextInt();

		Vektor v1 = new Vektor(n);
		Vektor v2 = new Vektor(n);

		System.out.println("Unesite elemente prvog niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			v1.niz[i] = input.nextDouble();
		}

		for (int i = 0; i < 3; i++)
			System.out.print(v1.niz[i] + " ");

		System.out.println("Unesite elemente drugog niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			v2.niz[i] = input.nextDouble();
		}

		System.out.println("Skalarni proizvod dva vektora je: " + v1.proizvod(v2.niz));
	}
}
