package zadatak5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		int n, a;
		double eps;

		System.out.print("Unesite vrednost za n: ");
		n = input.nextInt();
		System.out.print("Unesite vrednost za a: ");
		a = input.nextInt();
		System.out.print("Unesite vrednost za epsilon: ");
		eps = input.nextDouble();

		double x0 = (a + n - 1) / n;
		double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;

		/*
		 * zbog jednostavnosti pregleda svih zadataka, WHILE i DO-WHILE ostavljam u
		 * istoj klasi zbog toga vrednosti X0 i X1 kopiram u X2 i X3
		 */
		double x2 = x0;
		double x3 = x1;

		while (Math.abs(x1 - x0) > eps) {
			x0 = x1;
			x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
		}

		// do-while petlja sa X2 (kao zamenom za X0) i X3 (umesto X1 iz zadatka)
		do {
			x2 = x3;
			x3 = ((n - 1) * x2 + a / Math.pow(x2, n - 1)) / n;
		} while (Math.abs(x2 - x0) > eps);

		System.out.println("x = " + df.format(x1));
		System.out.println("x = " + df.format(x3));

		input.close();
	}
}