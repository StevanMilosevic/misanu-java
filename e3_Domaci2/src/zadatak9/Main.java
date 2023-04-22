package zadatak9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double F = 0, G = 0, f, g;

		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();

		// Zadatku nedostaju vrednosti za f(0) i g(0)
		// Unesimo ih kao fiksne vrednosti
		System.out.print("F(0) = ");
		f = input.nextInt();
		System.out.print("G(0) = ");
		g = input.nextInt();

		for (int i = 0; i < n; i++) {
			F = f * g + 3 * i - 1;
			G = i * i * f + 2 * g;
			f = F;
			g = G;
		}

		System.out.println("F(" + n + ") = " + F);
		input.close();
	}
}