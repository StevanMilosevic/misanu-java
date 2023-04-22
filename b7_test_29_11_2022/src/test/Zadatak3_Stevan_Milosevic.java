package test;

import java.util.Scanner;

public class Zadatak3_Stevan_Milosevic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite dimenziju matrice: ");
		int n = input.nextInt();
		int[][] a = new int[n][n];

		// upisujemo 0 i 1 na odgovarajuca mesta u matrici
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || j == (n - 1 - i))
					a[i][j] = 1;
				else
					a[i][j] = 0;
			}
		}

		// stampanje matrice
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}