package tasks;

import java.io.*;
import java.text.DecimalFormat;

public class Primer3 {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.##");
		double[] a = new double[20];
		double[] x = new double[20];
		double[] y = new double[20];
		double A = 0, X = 0, Y = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite broj elemenata nizova: ");
		int n = Integer.parseInt(input.readLine());

		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite elemente niza a: ");
			a[i] = Double.parseDouble(input.readLine());
		}
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite elemente niza x: ");
			x[i] = Double.parseDouble(input.readLine());
		}
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite elemente niza y: ");
			y[i] = Double.parseDouble(input.readLine());
		}
		for (int i = 1; i <= n; i++) {
			A += a[i];
			X += a[i] * x[i];
			Y += a[i] * y[i];
		}
		X = X / A;
		Y = Y / A;

		System.out.println("A = " + df.format(A));
		System.out.println("X = " + df.format(X));
		System.out.println("Y = " + df.format(Y));
	}
}