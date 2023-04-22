package zadatak7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite broj članova niza: ");
		int n = input.nextInt();
		int m = 2 * n;

		double[] a = new double[m];
		double[] b = new double[n];

		System.out.print("Unesite članove niza a: ");
		for (int i = 0; i < m; i++) {
			System.out.print("a[" + (i + 1) + "] = ");
			a[i] = input.nextDouble();
		}
		input.close();

		for (int i = 0; i < n; i++) {
			b[i] = (a[i] + a[2 * n + 1 - (i + 2)]) / 2; // posto smestamo elemente niza od 0 indeksa,
														// (i+2) da bi se izbeglo ArrayIndexOutOfBounds
		}

		System.out.println("Clanovi niza b su: ");
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");

		}
	}
}
