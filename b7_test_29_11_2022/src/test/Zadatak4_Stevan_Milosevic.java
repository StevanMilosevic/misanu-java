package test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak4_Stevan_Milosevic {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite dimenziju matrica: ");
		int n = input.nextInt();

		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		double[][] c = new double[n][n];

		System.out.println("Upis elemenata matrica: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("a[" + i + "] = ");
				a[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("b[" + i + "] = ");
				b[i][j] = input.nextInt();
			}
		}

		// racunanje elemenata za matricu C
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < j)
					c[i][j] = (a[i][j] * a[i][j]) - (b[i][j] * b[i][j]);
				else if (i == j)
					c[i][j] = Math.abs(a[i][j]) + Math.abs(b[i][j]) + 1;
				else if (i > j)
					c[i][j] = Math.sqrt(Math.pow(a[i][j], 2) + Math.pow(b[i][j], 2));
			}
		}
		// stampanje matrica A, B i C
		System.out.println("A");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("B");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("C");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(df.format(c[i][j]) + " ");
			}
			System.out.println();
		}
		input.close();
	}
}