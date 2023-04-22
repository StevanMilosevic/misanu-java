package stevan;

import java.util.Scanner;

public class Zadatak3 {

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
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if((i + 1) % 2 == 0) // red
				if (i % 2 == 0) // index
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		input.close();
	}
}
