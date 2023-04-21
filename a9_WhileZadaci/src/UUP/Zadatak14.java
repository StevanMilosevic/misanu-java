package UUP;

import java.text.DecimalFormat;

public class Zadatak14 {
	public static void main(String[] args) {
		double x, F, y = 1.0, G;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\tX\tF(X)");

		for (x = 1.0; x <= 2.0; x += 0.2) {
			F = 41.926 * Math.sqrt(1 + x * x * x) + Math.pow(x, 1.0 / 3.0) * Math.exp(x);
			System.out.println("\t" + df.format(x) + "\t" + df.format(F));
		}
		System.out.println();
		System.out.println("\tY\tG(Y)");
		while (y <= 2.0) {
			G = 41.926 * Math.sqrt(1 + Math.pow(y, 3)) + Math.pow(y, 1.0 / 3.0) * Math.exp(y);
			System.out.println("\t" + df.format(y) + "\t" + df.format(G));
			y += 0.2;
		}
	}
}
