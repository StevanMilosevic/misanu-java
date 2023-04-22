package stevan;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();
		int[][] a = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				a[i][j] = 1;
			}
		}
		System.out.println("Pocetni izgled");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Novi izgled");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i >= j)
					System.out.print(a[i][j] + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		input.close();
	}
}