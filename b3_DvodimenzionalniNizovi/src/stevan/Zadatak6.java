package stevan;

import java.util.Scanner;

public class Zadatak6 {

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
		int max = a[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (max < a[i][j])
					max = a[i][j];
			}
		}
		System.out.println("Najveci element niza je: " + max);

		int min = a[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (min > a[i][j])
					min = a[i][j];
			}
		}
		System.out.println("Najmanji element niza je: " + min);
		input.close();

	}

}
