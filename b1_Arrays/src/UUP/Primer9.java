package UUP;

import java.io.*;

public class Primer9 {
	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double s, s1 = 0, s2 = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite broj elemenata n niza x: ");
		int n = Integer.parseInt(input.readLine());

		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(input.readLine());
		}

		for (int i = 1; i <= n; i++) {
			s1 += x[i] * x[i];
			s2 += x[i];
		}
		// devijacija
		s = Math.sqrt((s1 / n) - (Math.pow(s2 / n, 2)));
		double sr = s2 / n;
		System.out.println("Standardna devijacija je: " + s);
		System.out.println("Srednja vrednost: " + sr);
	}
}