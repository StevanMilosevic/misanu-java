package zadatak4;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double z;
		int rBr = 1;
		System.out.println("R.BR \tX \tA \tY \tZ");
		for (double x = 1.0; x <= 4.0; x += 1.0) {
			for (double a = 0.1; a <= 0.5; a += 0.1) {
				for (double y = 0.5; y >= 0.2; y -= 0.05) {
					z = Math.pow((x + a + y) / (x - y), 2) - x / (x + a);
					System.out.println(rBr + ".\t" + df.format(x) + "\t" + df.format(a) + "\t" + df.format(y) + "\t"
							+ df.format(z));
					rBr++;
				}
			}
		}
	}
}