package zadatak8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0, b0, b1, y;

		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		double[] x = new double[n + 1];
		double[] f = new double[n + 1];

		System.out.println("Unesite elemente niza x: ");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextDouble();
		}

		System.out.println("Unesite elemente niza f: ");
		for (int i = 0; i < n; i++) {
			System.out.print("f[" + i + "] = ");
			f[i] = input.nextDouble();
		}
		input.close();

		for (int i = 1; i <= n; i++) {
			s1 += Math.log(x[i]);
			s2 += Math.log(f[i]);
			s3 += Math.log(x[i]) * Math.log(f[i]);
			s4 += Math.pow(Math.log(x[i]), 2.0);
		}

		System.out.println("X\t Y(X)");
		for (int i = 1; i <= n; i++) {
			b1 = (s1 * s2 - n * s3) / (s1 * s1 - n * s4);
			b0 = Math.pow(10, (s2 - b1 * s4) / n);
			y = b0 * Math.pow(x[i], b1);
			System.out.println(x[i] + "\t" + df.format(y));
		}
	}
}
