package stevan;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				niz[i][j] = input.nextInt();
			}
		}

		// ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi prvog reda su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println("\nElementi druge kolone su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) { // promenljiva j sluzi za prolazak kroz kolone
				if (j == 1) // ispitivanje indeksa kolone dvodimenzionalnog niza
					System.out.print(niz[i][j] + " ");
			}
		}
		input.close();
	}
}
