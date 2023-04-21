package UUP;

import java.text.DecimalFormat;

public class Zadatak15 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double x, y;
		int iterator = 1;
		System.out.println("\tR.BR\tX\tY(X)");

		for (x = 1.0; x <= 10; x += 0.5) {
			y = x - 0.3 * (Math.pow(x, 2) / (x + 1.2));
			System.out.println("\t" + iterator + "\t" + df.format(x) + "\t" + df.format(y));
			iterator++;
		}
	}
}
