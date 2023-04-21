package UUP;

import java.text.DecimalFormat;

public class Vezba3 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\tR.BR\tX\tY(X)");
		double x, y = 0;
		int i = 1;
		for (x = 1; x <= 5.0; x += 0.5) {
			y += x - 0.8 * Math.pow(x, 2);
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
			i++;
		}
	}
}
