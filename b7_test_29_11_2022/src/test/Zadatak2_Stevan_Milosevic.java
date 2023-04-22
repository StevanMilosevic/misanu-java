package test;

import java.io.*;
import java.text.DecimalFormat;

public class Zadatak2_Stevan_Milosevic {
	public static void main(String[] args) throws Exception {
		double suma1 = 0, suma2 = 0, devijacija;

		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite broj elemenata N u nizu X: ");
		int n = Integer.parseInt(input.readLine());
		double[] x = new double[n];

		// Unos elemenata niza
		System.out.print("Unesite elemente niza x: \n");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(input.readLine());
		}

		// Izracunavanje odgovarajucih suma
		for (int i = 0; i < n; i++) {
			suma1 += x[i] * x[i];
			suma2 += x[i];
		}

		// Izracunavanje standardne devijacije
		devijacija = Math.sqrt(suma1 / n - Math.pow(suma2 / n, 2));

		// Stampanje rezultata
		System.out.println("Standardna devijacija je " + df.format(devijacija));
	}
}
