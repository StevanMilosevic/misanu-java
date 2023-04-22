package stevan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ucitavanje podataka
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj redova: ");
		int red = input.nextInt();
		System.out.print("Unesite broj kolona: ");
		int kolona = input.nextInt();

		// "matrica" - naziv naseg dvodimenzionalnog niza
		int matrica[][] = new int[red][kolona];

		System.out.println("Unesite elemente: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("Matrica[" + i + ", " + j + "] = ");
				matrica[i][j] = input.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
