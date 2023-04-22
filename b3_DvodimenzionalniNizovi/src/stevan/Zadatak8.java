package stevan;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Stampanje pocetnog dvodimenzionalnog niza");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				b[i][j] = a[j][i];
			}
		}
		System.out.println("Stampanje transponovanog dvodimenzionalnog niza");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}