package stevan;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int niz[][] = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				niz[i][j] = input.nextInt();
			}
		}
		// svaki element ima svoju poziciju koja se odredjuje
		// vrednoscu reda i kolone

		System.out.println("Parni elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println("\nNeparni elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		input.close();
	}
}
