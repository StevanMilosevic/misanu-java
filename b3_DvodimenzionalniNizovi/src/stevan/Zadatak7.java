package stevan;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Stampanje glavne dijagonale: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == j)
					System.out.print(a[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("Stampanje sporedne dijagonale: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == ((red - 1) - j))
					System.out.print(a[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		input.close();
	}
}
